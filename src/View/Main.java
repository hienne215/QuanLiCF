package View;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Conf.Database;
public class Main {
    public static void main(String[] args) throws SQLException {
        Database.connect(
                "localhost",
                3306,
                "root",
                "",
                "dbcafe"
        );
        PreparedStatement stmt = Database.getConnection().prepareStatement("SELECT * FROM `menus`");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println( rs.getString("name"));


        }
        Database.close();
    }
}
