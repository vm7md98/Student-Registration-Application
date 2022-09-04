package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() throws SQLException {
        String dbURL = "jdbc:sqlite:C:/Users/Clown/Desktop/Adv OOP/Student Registration Application/Registeration.db";
        Connection conn = DriverManager.getConnection(dbURL);
        return conn;
    }
}
