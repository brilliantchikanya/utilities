package com.bullet.streams;

import com.bullet.dao.UserDAO;
import com.bullet.dao.UserDAOMySQL;
import com.bullet.service.UserServiceMYSQL;

/**
 * @author brilliant
 * @author com.bullet
 * @since 15-07-2025
 * */
/*
 * This class is the entry-point for the console application based on the
 * MYSQL database server
 * */
public class MainWithMYSQL {
    public static void main(String[] args) {
        // Use the MySQL database implementation of the DAO interface
        UserServiceMYSQL program = new UserServiceMYSQL(new UserDAOMySQL());
        program.run();
    }



}
