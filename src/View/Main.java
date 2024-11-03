package View;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Conf.Database;
import Model.Menu;

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
        while (rs.next()){
            Menu m = new Menu(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("loai_do_uong"),
                    rs.getDouble("gia")
            );
            System.out.println(m);
        }
        Database.close();
    }
}
