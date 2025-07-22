package com.bullet.service;

import com.bullet.dao.UserDAO;
import com.bullet.dao.UserDAOMySQL;
import com.bullet.model.User;

import java.util.Scanner;

import static com.bullet.utils.Print.printnb;

/**
 * @author brilliant
 * @author com.bullet
 * @since 15-07-2025
 * */

public class UserServiceMYSQL extends UserService {
    private static final Scanner scanner = new Scanner(System.in);
    UserDAO userDAO = new UserDAOMySQL();
    public UserServiceMYSQL(UserDAO userDAO) {
        super(userDAO);
    }
    @Override
    protected void updateUser() {
        printnb("    Enter the ID of the user to update: ");
        long id = scanner.nextInt();
        User user = data.get(id);
        if (user != null) {
            User updatedUser = super.collectUpdateDetails(user);
            userDAO.update(updatedUser);
        } else {
            System.out.println("User not found");
        }

    }


}
