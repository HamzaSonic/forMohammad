package org.example;

public class DbConnection {

    private static DbConnection dbConnection =new DbConnection();
    public static DbConnection getInstance() {
        return dbConnection;
    }
    private DbConnection() {
    }
}
