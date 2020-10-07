package Logic;

import Data.SQLite;

public class Main {

    public static void main(String[] args) {
        Memory.tasks.v3Run();
        
        SQLite sqLite = new SQLite(Memory.database_uri);
        sqLite.create_database();
        sqLite.create_database_tables();
    }
}
