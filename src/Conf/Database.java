package Conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Connection connection;

    private Database() {
    }

    public static Connection getConnection() {
        return connection;
    }
    public static void connect(String host, int port, String user, String password, String dbname) {
        Database.connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://" + host + ":" + port +"/" + dbname;
            Database.connection = DriverManager.getConnection(dbURL, user, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void close() throws SQLException {
        if (Database.connection != null){
            Database.connection.close();
        }
    }
}