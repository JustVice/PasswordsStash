package LogicV3;

public class DataVSQLite {

    public void loadData() {
        try {
            LOAD_PASSWORDS_FROM_DATABASE();
            LOAD_USERDATA_FROM_DATABASE();
        } catch (Exception e) {
            String message = "Critical error at loading data\n"
                    + "Error 004";
            LogicV3.Run.message(message, "Error 004", 0);
            System.exit(0);
        }

    }

    private void LOAD_PASSWORDS_FROM_DATABASE() {
        System.out.print("Loading passwords...");
        Memory.passwordsV3LinkedList = Memory.sqlite.getPasswordsFromDataBase("SELECT * FROM PASSS");
        if (Memory.passwordsV3LinkedList != null) {
        } else {
            String message = "Critical error at loading passwords\n"
                    + "Error 001";
            LogicV3.Run.message(message, "Error 001", 0);
            System.exit(0);
        }
    }

    private void LOAD_USERDATA_FROM_DATABASE() {
        System.out.print("Loading user data...");
        Memory.userDataV3 = Memory.sqlite.getUserDataV3ParamettersFromDataBase("SELECT * FROM USERDATAV3");
        if (Memory.userDataV3 != null) {
        } else {
            String message = "Critical error at loading user data\n"
                    + "Error 002";
            LogicV3.Run.message(message, "Error 002", 0);
            System.exit(0);
        }
    }
    
}
