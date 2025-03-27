package com.bullet.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLITEDB {
    // This is a utility class for database connections
    private static final String DB_URL = "jdbc:sqlite:employee_database.db";

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL);
        connection.setAutoCommit(false);
        return connection;
    }


}
