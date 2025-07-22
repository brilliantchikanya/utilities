package com.bullet.dao;

import com.bullet.database.MYSQLDB;
import com.bullet.model.User;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author brilliant
 * @author com.bullet
 * @since 15-07-2025
 * */

public class UserDAOMySQL implements UserDAO {
    private final String url = "jdbc:mysql://localhost:3306/demo";
    private final String db_User = "bullet";
    private final String passwd = "tatenda3C";
    public MYSQLDB mysqldb = new MYSQLDB(url, db_User, passwd);
    private static final String INSERT_USER_SQL = "INSERT INTO users" +
            "  (username, passwd) VALUES " +
            " (?, ?);";

    private static final String SELECT_USER_BY_ID = "select userID,username,passwd" +
            " from users where userID =?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USER_SQL = "delete from users where userID = ?;";
    private static final String UPDATE_USER_SQL = "update users set username = ?," +
            "passwd= ? where userID = ?;";


    public UserDAOMySQL() {}

    public MYSQLDB getMysqldb() {
        return mysqldb;
    }

    public void setMysqldb(MYSQLDB mysqldb) {
        this.mysqldb = mysqldb;
    }

    @Override
    public void add(User user) {
        try (Connection connection = mysqldb.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     INSERT_USER_SQL, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPasswd());
            preparedStatement.executeUpdate();

            // Get the generated ID
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                user.setUserID(rs.getLong(1));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

        @Override
    public User get(long id) {
        User user = new User();
        try (Connection connection = mysqldb.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(
                SELECT_USER_BY_ID)){
            preparedStatement.setLong(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                return new User(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3)
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Map<Long, User> getAllUsers() {
        Map<Long,User> users = new HashMap<>();
        try (Connection connection = mysqldb.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SELECT_ALL_USERS))
        {
            while (rs.next()) {
                User user = new User(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3)
                );
                users.put(user.getUserID(), user);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    @Override
    public void update(User user) {
        try (Connection connection = mysqldb.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_SQL)){
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPasswd());
            preparedStatement.setLong(3, user.getUserID());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

        }

    }

    @Override
    public void delete(long id) {
        try (Connection connection = mysqldb.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_SQL)){
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Could not delete user");
            System.out.println(e.getMessage());
        }

    }

    @Override
    public Connection getDatabaseConnection() {
        return mysqldb.getConnection();
    }
}
