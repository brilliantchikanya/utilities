package com.bullet.dao;

import com.bullet.model.User;

import java.sql.Connection;
import java.util.Map;

/**
 * @author brilliant
 * @author com.bullet
 * @since 15-07-2025

 * This interface is responsible for specifying how data must be saved and or
 * retrieved from a database
 * */
public interface UserDAO {
    void add(User user);
    User get(long id);
    Map<Long, User> getAllUsers();
    void update(User user);
    void delete(long id);

    Connection getDatabaseConnection();
}
