package dbUtil;

import java.sql.*;

public class dbConnection {

    private static final String SQCONN = "jdbc:sqlite:src/szkola.sqlite";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQCONN);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}