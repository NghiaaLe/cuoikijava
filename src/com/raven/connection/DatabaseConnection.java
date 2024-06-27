package com.raven.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private DatabaseConnection() {

    }

    public void connectToDatabase() throws SQLException {
        String sever = "localhost";
        String port = "3306";
        String database = "chat_application";
        String userName = "root";
        String passWord = "";
        connection = java.sql.DriverManager.getConnection("jdbc:mysql://" + sever + ":" + port + "/" + database, userName, passWord);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
