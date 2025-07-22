package com.bullet.service;

import com.bullet.dao.UserDAO;
import com.bullet.model.User;

import java.util.Map;
import java.util.Scanner;

import static com.bullet.utils.Print.print;
import static com.bullet.utils.Print.printnb;

/**
 * @author brilliant
 * @author com.bullet
 * @since 15-07-2025
 * */
public abstract class UserService {
    private static final String path = "com.bullet.streams/src/main/resources/employees.txt";
    protected UserDAO data;  // = new UserCsvDAOImpl(path);
    private static final Scanner scanner = new Scanner(System.in);
    static boolean done = false;

    protected UserService(UserDAO userDAO) {
        this.data = userDAO;

    }


    protected void addUser() {
        printnb("    Enter the name of the user: ");
        String username = scanner.next();
        printnb("    Enter the password for the user: ");
        String passwd = scanner.next();
        printnb("    Enter the ID of the user: ");
        long id = scanner.nextInt();
        data.add(new User(username, passwd));
    }

    protected void printAllUsers() {
        Map<Long, User> users = getAllUsers();
        for (long id: users.keySet()) {
            User user = users.get(id);
            print(user);
        }
    }

    protected void deleteUser() {
        printnb("Enter the ID of the user: ");
        long id = scanner.nextInt();
        data.delete(id);
    }

    protected void getUser() {
        printnb("Enter the ID of the user: ");
        long id = scanner.nextInt();
        User user = data.get(id);
        print(user);
    }

    protected Map<Long, User> getAllUsers() {
        return data.getAllUsers();
    }


    protected abstract void updateUser();

    protected User collectUpdateDetails(User user) {
        String name;
        String passwd;
        print("        Do you wish to change the username?: ");
        printnb("            Enter y if yes, or n for no: ");
        String value = scanner.next();
        if (value.equalsIgnoreCase("y")) {
            printnb("            Enter the new username: ");
            name = scanner.next();
            user.setUserName(name);
            print("    Do you also wish to change the password?: ");
            printnb("        Enter y if yes, or n for no: ");
            String another = scanner.next();
            if (another.equalsIgnoreCase("y")) {
                printnb("            Enter the new password: ");
                passwd = scanner.next();
                user.setPasswd(passwd);
            }
        } else {
            print("    Do you wish to change the password?: ");
            printnb("        Enter y if yes, or n for no: ");
            String another = scanner.next();
            if (another.equalsIgnoreCase("y")) {
                printnb("    Enter the new password: ");
                passwd = scanner.next();
                user.setPasswd(passwd);
            }
        }
        return user;
    }

    protected void exit() {
        done = true;
        print("Thank you for using this application......");
    }

    public void run() {
        print("**********************************************");
        print();
        print("Welcome to our simple application...");
        print("Please select one option from above: ");
        print();

        do {print("**********************************************");
            print("*    1. Add a new user ");
            print("*    2. Update a user from database ");
            print("*    3. Get all users from database ");
            print("*    4. Delete a user ");
            print("*    5. Exit the application ");
            print("*    6. Get a single user from the database ");
            print();
            printnb("Select an option: ");
            int value = scanner.nextInt();
            switch (value) {
                case 1:
                    addUser();
                    break;
                case 2:
                    updateUser();
                    break;
                case 3:
                    printAllUsers();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    exit();
                    break;
                case 6:
                default:
                    getUser();
                    break;
            }
        } while (!done);
    }
}
