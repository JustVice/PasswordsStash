package LogicV3;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteController {

    private String url;

    public SQLiteController(String url) {
        this.url = url;
    }

    //Method to create a new database
    public void createNewDatabase() {
        String url = "jdbc:sqlite:" + this.url;
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Create table to databases
    public void createNewTable(String table_specs) {
        // SQLite connection string
        String url = "jdbc:sqlite:" + this.url;
        // SQL statement for creating a new table
        String sql = table_specs;
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
