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

public class UserServiceCSV extends UserService {
    private static final Scanner scanner = new Scanner(System.in);

    public UserServiceCSV(UserDAO userDAO) {
        super(userDAO);
    }

    @Override
    protected void updateUser() {
        Map<Long, User> users = getAllUsers();
        printnb("    Enter the ID of the user to update: ");
        long id = scanner.nextInt();
        if (users.containsKey(id)) {
            User user = users.get(id);
            User updatedUser = super.collectUpdateDetails(user);
            data.update(updatedUser);
        } else print("User does not exist");
    }
}
