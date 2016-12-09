package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Nov 30, 2016 2:48:06 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class QueryDatabase {
    
    private static Statement statement;
    private static Connection connection = ConnectDatabase.getConnection();
    
    private static ArrayList<String> getAll(String query) throws SQLException {
        ArrayList<String> list = new ArrayList<>();
        
        statement = connection.createStatement();

        ResultSet rs = statement.executeQuery(query);
        
        while (rs.next()) {
            list.add(rs.getString(1));
        }

        return list;
    }
}
