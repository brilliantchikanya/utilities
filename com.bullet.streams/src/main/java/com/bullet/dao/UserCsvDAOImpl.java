package com.bullet.dao;

import com.bullet.io.MyFileReader;
import com.bullet.io.MyFileWriter;
import com.bullet.model.User;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.bullet.utils.Print.print;

/**
 * @author brilliant
 * @author com.bullet
 * @since 15-07-2025

 * This is a class that is responsible for saving user related data to a text
 * file in the comma separated values(CSV) format.
 *
 * */
public class UserCsvDAOImpl implements UserDAO{
    private static String path;

    public UserCsvDAOImpl(String path) {
        this.path = path;
    }


    @Override
    public void add(User user) {
        MyFileWriter.write(createUserCsvLine(user), path, true);
    }

    @Override
    public User get(long id) {
        return getAllUsers().get(id);
    }

    @Override
    public Map<Long, User> getAllUsers() {
        Map<Long, User> users = new HashMap<>();
        List<String> lines = MyFileReader.readFile(path);
        for (String line: lines) {
            User user = createUserFromCSV(line);
            users.put(user.getUserID(), user);
        }
        return users;
    }

    @Override
    public void update(User user) {
        Map<Long, User> users = getAllUsers();
        users.put(user.getUserID(), user);
        reloadDB(users);

    }

    @Override
    public void delete(long id) {
        Map<Long, User> users = getAllUsers();
        if (users.containsKey(id)) {
            if (users.remove(id) != null) {
                reloadDB(users);
                print("User deleted successfully");
            } else print("Could not delete the user");
        } else print("The user does not exist");

    }

    @Override
    public Connection getDatabaseConnection() {
        return getDatabaseConnection();
    }

    // generate a user string object to store in the text file
    private static String createUserCsvLine(User user) {
        return user.getUserID() + "," + user.getUserName() + "," + user.getPasswd();
    }


    private static void reloadDB(Map<Long, User> users) {
        List<String> userList = new ArrayList<>();
        for (long key: users.keySet()) {
            User user = users.get(key);
            long userID = user.getUserID();
            String username = user.getUserName();
            String passwd = user.getPasswd();
            String userString = userID + "," + username + "," + passwd;
            userList.add(userString);
        }
        // write(and clear contents or lines) the first user string to database
        String userString = userList.removeFirst();
        MyFileWriter.write(userString, path, false);
        // add the rest of the user strings
        for (String line: userList) {
            MyFileWriter.write(line, path, true);
        }
    }

    // get a user object from a CSV format line
    public static User createUserFromCSV(String line) {
        String[] values = line.split(",");
        long id = Long.parseLong(values[0]);
        String username = values[1];
        String passwd = values[2];
        return new User(id, username, passwd);
    }
}
