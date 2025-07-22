package com.bullet.streams;

import com.bullet.dao.UserCsvDAOImpl;
import com.bullet.dao.UserDAO;
import com.bullet.service.UserService;
import com.bullet.service.UserServiceCSV;

/**
 * @author brilliant
 * @author com.bullet
 * @since 15-07-2025
 * */

/*
* This class is the entry-point for the console application based on the
* CSV format data storage -  a text file database implementation
* */
public class MainWithCSV {
    static String path = "com.bullet.streams/src/main/resources/employees.txt";

    public static void main(String[] args) {

        UserDAO dao = new UserCsvDAOImpl(path);
        UserService program = new UserServiceCSV(dao);
        program.run();

    }
















}
