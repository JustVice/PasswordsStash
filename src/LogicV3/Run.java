package LogicV3;

import Objects.Passwordv3;
import Logic.Passwordv2;
import LogicV2.Message_V2;
import UI.*;
import UI.MasterPassword.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class Run {

    public Run() {
        v3Run();
        TESTS();
    }

    private void TESTS() {
    }

    private void v3Run() {
        CHECK_IF_SQLITE_LIBRARY_EXISTS();
        SQLITE_CREATE_DATABASE_AND_TABLES_IF_NOT_EXIST();
        Memory.dataVSQL.loadData();
        openStart();
    }

    private void CHECK_IF_SQLITE_LIBRARY_EXISTS() {
        File file = new File(System.getProperty("user.dir") + "\\lib\\sqlite-jdbc-3.27.2.1.jar");
        if (!file.exists()) {
            System.out.println("ERROR 005: LIBRARY sqlite-jdbc-3.27.2.1.jar NOT FOUND");
            String message = "Library sqlite-jdbc-3.27.2.1.jar was not found.\n\n"
                    + "Passwords Stash Version 3+ needs that library inside the folder\n"
                    + "\"lib\" inside the same directory where the program is located.\n"
                    + "Please, download Passwords Stash again to fix the problem.\n"
                    + "To prevent data loss make a copy of the file \"pwsdata.db\".\n\n"
                    + "ERROR 005";
            message(message, "ERROR 005", 0);
            System.exit(0);
        }else{
            System.out.println("Library sqlite-jdbc-3.27.2.1.jar: OK!");
        }
    }

    private void SQLITE_CREATE_DATABASE_AND_TABLES_IF_NOT_EXIST() {
        //Creates the database if it does not exist. If it exists, checks if the tables
        //exist.
        SQLiteDBController sqliteController = new SQLiteDBController(Memory.SQLiteDBName);
        sqliteController.createNewDatabase();
        Boolean PASSS_TABLE = Memory.sqlite.check_if_table_exists("PASSS");
        Boolean USERDATAV3_TABLE = Memory.sqlite.check_if_table_exists("USERDATAV3");
        if (!PASSS_TABLE) {
            System.out.println("Creating table PASSS");
            sqliteController.createNewTable("CREATE TABLE `PASSS` (\n"
                    + "	`PasssID`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n"
                    + "	`Service`	TEXT,\n"
                    + "	`User`	TEXT,\n"
                    + "	`Mail`	TEXT,\n"
                    + "	`Password`	TEXT,\n"
                    + "	`Notes`	TEXT,\n"
                    + "	`ID`	TEXT,\n"
                    + "	`Favorite`	INTEGER\n"
                    + ");");
        }
        if (!USERDATAV3_TABLE) {
            System.out.println("Creating table USERDATA");
            sqliteController.createNewTable("CREATE TABLE \"USERDATAV3\" (\n"
                    + "	\"ProgramDataID\"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n"
                    + "	\"firstRun\"	TEXT,\n"
                    + "	\"masterPassword\"	TEXT,\n"
                    + "	\"masterPasswordAttempts\"	TEXT,\n"
                    + "	\"masterPasswordAttemptsOriginal\"	TEXT,\n"
                    + "	\"inki\"	TEXT\n"
                    + ");");
            Memory.sqlite.Query("INSERT INTO USERDATAV3 (firstRun "
                    + ",masterPassword"
                    + ",masterPasswordAttempts"
                    + ",masterPasswordAttemptsOriginal"
                    + ",inki)"
                    + "VALUES "
                    + "('true'"
                    + ",'null'"
                    + ",'null'"
                    + ",'null'"
                    + ",'false');", "USERDATAV3 info inserted");
        }
    }

    private void normalRun() {
        Memory.data.LoadData();
        loadLogo();
        //Master Password Update
        try {
            if (Memory.data.getUserData().getMp().equals("null")) {
                openStart();
            } else {
                EnterMP e = new EnterMP();
            }
        } catch (Exception e) {
            openStart();
        }
        //Master Password Update
    }

    private void readMeStartVersion() {
        Memory.data.LoadData();
        if (Memory.data.getUserData().isFirstRun()) {
            Logo logo = new Logo();
            Memory.data.getUserData().setFirstRun(false);
            Memory.data.updateInfo();
            ProgramUseGuideLines e = new ProgramUseGuideLines();
            e.setVisible(true);
        } else {
            openStart();
        }
    }

    private void loadLogo() {
//        if (Memory.dataVSQL.getUserData().isFirstRun()) {
//            Logo logo = new Logo();
//            Memory.data.getUserData().setFirstRun(false);
//            Memory.data.updateInfo();
//        }
    }

    // <editor-fold desc="OPEN FRAMES">
    public static void openMasterPasswordSet() {
        SetMP s = new SetMP();
    }

    public static void openCreate() {
        CreateNewP c = new CreateNewP();
        c.setVisible(true);
    }

    public static void openSeeP() {
        SeePasswords c = new SeePasswords();
        c.setVisible(true);
    }

    public static void openStart() {
        Start c = new Start();
        c.setVisible(true);
    }

    public static void openStart_and_show_message(String message) {
        Start c = new Start();
        c.setVisible(true);
        Message_V2 message_V2 = new Message_V2(message);
    }

    public static void openDelete() {
        Delete c = new Delete();
        c.setVisible(true);
    }

    public static void openEdit() {
        EditPassword c = new EditPassword();
        c.setVisible(true);
    }

    public static void openPrintPasswords() {
        PrintPasswords pp = new PrintPasswords();
        pp.setVisible(true);
    }

    public static void openAbout() {
        AboutFrame abf = new AboutFrame();
        abf.setVisible(true);
    }

    public static void openUseGuideLines() {
        ProgramUseGuideLines f = new ProgramUseGuideLines();
        f.setVisible(true);
    }

    public void openEditMasterPassword() {
        MPSettings m = new MPSettings();
    }

    // </editor-fold>
    public static void SAVE_PASSV3_IN_MEMORY_PASS_LIST(Passwordv3 new_password) {
        //Saves the new passwords added inside the LinkedList PassV3 static list.
        Memory.passwordsV3LinkedList.add(new_password);
    }

    /**
     * 0=Error 1=Message 2=Alert 3=What
     *
     * @param type
     * @param message
     * @param title
     */
    public static void message(String message, String title, int type) {
        switch (type) {
            case 0:/*Error*/
                JOptionPane.showMessageDialog(null, message, title, 0);
                break;
            case 1:/*Message*/
                JOptionPane.showMessageDialog(null, message, title, 1);
                break;
            case 2:/*What*/
                JOptionPane.showMessageDialog(null, message, title, 2);
                break;
            case 3:/*Alert*/
                JOptionPane.showMessageDialog(null, message, title, 3);
                break;

            default:
                throw new AssertionError();
        }
    }

    /**
     * options: 0: Yes, no. Yes=0. No=1. X=-1. 1: Yes, no, cancel. Yes=0. No=1.
     * Cancel:2. X=-1. 2: Accept, cancel. Accept=0. Cancel:2. X=-1.
     *
     * simbol: 0: Error 1: Info 2: Alert 3: Ask
     */
    public int askMessage(String message, String title, int option, int simbol) {
        return JOptionPane.showConfirmDialog(null, message, title, option, simbol);
    }

    public void printAllPasswords(int id) {
        String content = "";
        for (Passwordv2 password : Memory.data.getUserData().getPasswordsList()) {
            content += "Service: " + password.getService(Memory.return_encoded) + "\n";
            if (!password.getMail(Memory.return_encoded).equals("")) {
                content += "Mail: " + password.getMail(Memory.return_encoded) + "\n";
            }
            if (!password.getUser(Memory.return_encoded).equals("")) {
                content += "User: " + password.getUser(Memory.return_encoded) + "\n";
            }
            content += "Password: " + password.getPassword(Memory.return_encoded) + "\n";
            if (!password.getNotes(Memory.return_encoded).equals("")) {
                content += "Notes: \n" + password.getNotes(Memory.return_encoded) + "\n";
            }
            content += "Password ID: " + password.getID();
            content += "\n\n";
        }
        BuildTxtFile("here", "Passwords " + id, ".txt", content);
    }

    public void BuildTxtFile(String path, String txtFileName, String extension, String content) {
        /*"\r\n" to jump between lines*/
        System.out.print("writing...");
        File file;
        if (!path.equals("here")) {
            file = new File(path + "\\" + txtFileName + extension);
        } else {
            file = new File(txtFileName + extension);
        }
        try {
            String frase = content;
            if (frase.equals("")) {
                frase = "No content.";
            }
            FileWriter escritura = new FileWriter(file.getPath());
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            System.out.print("done");
            escritura.close();
        } catch (IOException ex) {
            System.out.println("Error\n" + ex);
        }
    }

    public static void COPY_CONTENT_TO_CLIPBOARD(String textToSaveIntoClipBoard) {
        StringSelection selection = new StringSelection(textToSaveIntoClipBoard);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }

}
