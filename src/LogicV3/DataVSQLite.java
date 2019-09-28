package LogicV3;

public class DataVSQLite {

    public void loadData() {
        loadPasswordsFromDataBase();
        loadUserDataFromDataBase();
    }

    private void loadPasswordsFromDataBase() {
        System.out.println("Loading passwords...");
        Memory.passwordsLinkedList = Memory.sqlite.getPasswordsFromDataBase("SELECT * FROM PASSS");
        if (Memory.passwordsLinkedList != null) {
            System.out.println("Success");
        } else {
            String message = "Critical error at loading passwords\n"
                    + "Error 001";
            LogicV3.Run.message(message, "Error 001", 0);
            System.exit(0);
        }
    }

    private void loadUserDataFromDataBase() {
        System.out.println("Loading user data...");
        Memory.userDataV3 = Memory.sqlite.getUserDataV3ParamettersFromDataBase("SELECT * FROM USERDATAV3");
        if (Memory.userDataV3 != null) {
            System.out.println("Success");
        } else {
            String message = "Critical error at loading user data\n"
                    + "Error 002";
            LogicV3.Run.message(message, "Error 002", 0);
            System.exit(0);
        }
    }

    public void deleteALLData() {
    }

}
