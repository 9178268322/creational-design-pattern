package com.ip.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Single ton db class.
 */
public final class DbSingletonDerby {

    private static volatile DbSingletonDerby instance;
    private static volatile Connection conn;

    private DbSingletonDerby() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        if (conn != null) {
            throw new IllegalArgumentException("Use getConnection() method to create");
        }

        if (instance != null) {
            throw new IllegalArgumentException("Use getInstance() method to create");
        }
    }

    public static DbSingletonDerby getInstance() {
        if (instance == null) {
            synchronized (DbSingletonDerby.class) {
                if (instance == null) {
                    instance = new DbSingletonDerby();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (conn == null) {
            synchronized (DbSingletonDerby.class) {
                if (conn == null) {
                    try {
                        String username = "root";
                        String password = "root";
                        String dbUrl = "jdbc:mysql://localhost:3306/training";
                        conn = DriverManager.getConnection(dbUrl, username, password);
                    } catch (SQLException e) {
                        System.out.println(e);
                    }
                }
            }
        }
        return conn;
    }
}
