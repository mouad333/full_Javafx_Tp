package ma.enset.full_javafx.dao.connectiondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnectionDB {
    private static final String database_Name = "db_stocks";
    private static final String host = "jdbc:mysql://localhost:3306/"+database_Name;
    private static final String username = "root";
    private static final String pass = "";
    private static Connection connection;

    private SingletonConnectionDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(host, username, pass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        try {
            if(connection==null || connection.isClosed())
                new SingletonConnectionDB();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }
}
