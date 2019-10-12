package com.olba.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseWrapper {
    private Connection connection;

    public Connection createConnection (String url, String user, String password) throws SQLException {
        connection = DriverManager.getConnection(url,user,password);
        return connection;
    }
}
