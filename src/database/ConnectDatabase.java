package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Nov 18, 2016 10:41:23 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class ConnectDatabase {

    public static final String DATABASE = 
            "jdbc:mysql://localhost:3306/QuanLySinhVien";
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mysqldatabase";
    private static Connection connection;

    public static Connection getConnection() {
        connectToDatabase();
        return connection;
    }

    private static void connectToDatabase() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(DATABASE, USERNAME, PASSWORD);
            System.out.println("Connect success");
        } catch (ClassNotFoundException e) {
            System.out.println("Database not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connecting to the database unsuccessful");
            e.printStackTrace();
        }
    }

    public void disconnectToDatabase() {
        try {
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
