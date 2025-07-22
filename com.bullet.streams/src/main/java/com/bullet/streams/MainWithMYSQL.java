package com.bullet.streams;

import com.bullet.dao.UserDAO;
import com.bullet.dao.UserDAOMySQL;
import com.bullet.service.UserServiceMYSQL;

public class MainWithMYSQL {
    public static void main(String[] args) {
        UserDAO dao = new UserDAOMySQL();
        UserServiceMYSQL program = new UserServiceMYSQL(dao);
        program.run();
    }



}
