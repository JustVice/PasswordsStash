package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLiteController {
    
    // ===========================================================================
    // THIS IS A TEMPLATE CLASS.
    // ===========================================================================

    private String database_uri;
    private Connection con;
    ResultSet rs;

    public SQLiteController(String database_uri) {
        this.database_uri = database_uri;
    }

    /**
     * Executes a SQLite querys such as INSERT, DELETE and Update.
     *
     * @param query Query statement. Such as SELECT * from TABLE;
     * @param console_log Message that will be shown on console when the
     * function ends.
     */
    public void Query(String query, String console_log) {
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + database_uri);
            Statement stmt = this.con.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException e) {
            // e.printStackTrace();
        } finally {
            System.out.println(console_log);
            Close_connection();
        }
    }

    /**
     * This is a template query to request values from database. The user must
     * copy, paste and edit this method to accomplish the desire behaviour.
     *
     * @param select_statement variable that contents the SELECT query
     * statement.
     * @param console_output console output when the function ends.
     */
    public void template_query_request_object(String select_statement, String console_output) {
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + database_uri);
            Statement stmt = this.con.createStatement();
            this.rs = stmt.executeQuery(select_statement);
            while (rs.next()) {
                System.out.println(rs.getString("TABLENAME"));
                System.out.println(rs.getInt("TABLENAME"));
            }
        } catch (SQLException e) {
            //e.printStackTrace();
        } finally {
            System.out.println(console_output);
            Close_connection();
        }
    }

    /**
     * Closes connection of Database.
     */
    private void Close_connection() {
        try {
            this.con.close();
            System.out.println("** SQL connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(SQLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
