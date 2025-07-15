package com.bullet.service;

import com.bullet.dao.UserCsvDAOImpl;
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
public class UserService {
    private static final String path = "com.bullet.streams/src/main/resources/employees.txt";
    private static final UserCsvDAOImpl data = new UserCsvDAOImpl(path);
    private static final Scanner scanner = new Scanner(System.in);
    static boolean done = false;


    public static void addUser() {
        printnb("    Enter the name of the user: ");
        String username = scanner.next();
        printnb("    Enter the password for the user: ");
        String passwd = scanner.next();
        printnb("    Enter the ID of the user: ");
        long id = scanner.nextInt();
        data.add(new User(id, username, passwd));
    }

    public static void printAllUsers() {
        Map<Long, User> users = getAllUsers();
        for (long id: users.keySet()) {
            User user = users.get(id);
            print(user);
        }
    }

    public static void deleteUser() {
        printnb("Enter the ID of the user: ");
        long id = scanner.nextInt();
        data.delete(id);
    }

    public static void getUser() {
        printnb("Enter the ID of the user: ");
        long id = scanner.nextInt();
        User user = data.get(id);
        print(user);
    }

    private static Map<Long, User> getAllUsers() {
        return data.getAllUsers();
    }


    public static void updateUser() {
        Map<Long, User> users = getAllUsers();
        printnb("    Enter the ID of the user to update: ");
        long id = scanner.nextInt();
        if (users.containsKey(id)) {
            User user = users.get(id);
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
            data.update(user);
        } else print("User does not exist");

    }

    public static void exit() {
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
            print();
            printnb("Select an option: ");
            int value = scanner.nextInt();
            switch (value) {
                case 1:
                    UserService.addUser();
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
                default:
                    getUser();
                    break;
            }
        } while (!done);
    }
}
