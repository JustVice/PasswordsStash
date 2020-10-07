package Data;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLite {

    private String database_uri = "";
    private Connection con;
    ResultSet rs;

    //Connection example:
    //public static SQLite sqlite = new SQLite(SQLiteDB.db");
    //To get program path System.getProperty("user.dir")
    public SQLite(String data_source_path) {
        this.database_uri = data_source_path;
    }

    /**
     * Checks if database exists using Java.io File.
     *
     * @param db_path Path to database.
     * @return Returns true if .db file is found.
     */
    public Boolean check_if_db_exists(String db_path) {
        java.io.File file = new java.io.File(db_path);
        if (file.exists()) {
            System.out.println("Database exists.");
            return true;
        } else {
            System.out.println("*** Database does not exists! ***");
            return false;
        }
    }

    public Boolean check_if_table_exists(String table_name) {
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + database_uri);
            DatabaseMetaData dbm = this.con.getMetaData();
            ResultSet rs = dbm.getTables(null, null, table_name, null);
            if (rs.next()) {
                System.out.println("Table " + table_name + " exists");
                return true;
            } else {
                System.out.println("*** Table " + table_name + " does not exist! ***");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            // System.out.println("Query finished");
            Close_connection();
        }
    }

    //Method to create a new database
    public void create_database() {
        String url = "jdbc:sqlite:" + this.database_uri;
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + database_uri);
            if (this.con != null) {
                DatabaseMetaData meta = this.con.getMetaData();
            }
            Close_connection();
            System.out.println("*** Database has been created ***");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Close_connection();
        }
    }
    
    /**
     * Creates Master Password table on database.
     */
    private void create_master_password_table() {
        String sqlQuery = "CREATE TABLE \"MasterPassword\" (\n" +
                    "	\"ID\"	INTEGER NOT NULL UNIQUE,\n" +
                    "	\"hash\"	TEXT,\n" +
                    "	\"salt\"	TEXT,\n" +
                    "	\"enabled\"	INTEGER,\n" +
                    "	PRIMARY KEY(\"ID\" AUTOINCREMENT)\n" +
                    ")";
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + database_uri);
            Statement stmt = this.con.createStatement();
            // create a new table
            stmt.execute(sqlQuery);
            Close_connection();
            System.out.println("*** Master Password table created. ***");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Close_connection();
        }
    }
    
    /**
     * Creates Master Password table on database.
     */
    private void create_password_table() {
        String sqlQuery = "CREATE TABLE \"Password\" (\n" +
                    "	\"ID\"	INTEGER NOT NULL UNIQUE,\n" +
                    "	\"service\"	TEXT,\n" +
                    "	\"user\"	TEXT,\n" +
                    "	\"email\"	TEXT,\n" +
                    "	\"password\"	TEXT,\n" +
                    "	\"notes\"	TEXT,\n" +
                    "	\"favorite\"	TEXT,\n" +
                    "	PRIMARY KEY(\"ID\" AUTOINCREMENT)\n" +
                    ")";
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + database_uri);
            Statement stmt = this.con.createStatement();
            // create a new table
            stmt.execute(sqlQuery);
            Close_connection();
            System.out.println("*** Master Password table created. ***");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Close_connection();
        }
    }
    
    public void create_database_tables(){
        create_master_password_table();
        create_password_table();
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

    public String getData_source_path() {
        return database_uri;
    }

    public void setData_source_path(String data_source_path) {
        this.database_uri = data_source_path;
    }

}
