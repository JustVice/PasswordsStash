package LogicV2;

import Logic.Passwordv2;
import LogicV3.AES;
import LogicV3.SQLite;
import LogicV3.SQLiteController;
import UI.*;
import UI.MasterPassword.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Run {

    public Run() {
//        readMeStartVersion();
//        normalRun();
        v3Run();
    }

    private void v3Run() {
        createCompleteDataBase();
        Static.dataVSQL.loadData();
//        loadLogo();
    }

    private void normalRun() {
        Static.data.LoadData();
        loadLogo();
        //Master Password Update
        try {
            if (Static.data.getUserData().getMp().equals("null")) {
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
        Static.data.LoadData();
        if (Static.data.getUserData().isFirstRun()) {
            Logo logo = new Logo();
            Static.data.getUserData().setFirstRun(false);
            Static.data.updateInfo();
            ProgramUseGuideLines e = new ProgramUseGuideLines();
            e.setVisible(true);
        } else {
            openStart();
        }
    }

    private void loadLogo() {
        if (Static.dataVSQL.getUserData().isFirstRun()) {
            Logo logo = new Logo();
            Static.data.getUserData().setFirstRun(false);
            Static.data.updateInfo();
        }
    }

    public void openMasterPasswordSet() {
        SetMP s = new SetMP();
    }

    public void openCreate() {
        CreateNewP c = new CreateNewP();
        c.setVisible(true);
    }

    public void openSeeP() {
        SeePasswords c = new SeePasswords();
        c.setVisible(true);
    }

    public void openStart() {
        Start c = new Start();
        c.setVisible(true);
    }

    public void openStart_and_show_message(String message) {
        Start c = new Start();
        c.setVisible(true);
        Message_V2 message_V2 = new Message_V2(message);
    }

    public void openDelete() {
        Delete c = new Delete();
        c.setVisible(true);
    }

    public void openEdit() {
        EditPassword c = new EditPassword();
        c.setVisible(true);
    }

    public void openPrintPasswords() {
        PrintPasswords pp = new PrintPasswords();
        pp.setVisible(true);
    }

    public void openAbout() {
        AboutFrame abf = new AboutFrame();
        abf.setVisible(true);
    }

    public void openUseGuideLines() {
        ProgramUseGuideLines f = new ProgramUseGuideLines();
        f.setVisible(true);
    }

    /**
     * 0=Error 1=Message 2=Alert 3=What
     *
     * @param type
     * @param message
     * @param title
     */
    public void message(String message, String title, int type) {
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

    public DefaultListModel setModelAndGet() {
        Static.passwords_model.clear();
        for (Passwordv2 item : Static.data.getUserData().getPasswordsList()) {
            Static.passwords_model.addElement(item);
        }
        return Static.passwords_model;
    }

    public void setModel() {
        Static.passwords_model.clear();
        for (Passwordv2 item : Static.data.getUserData().getPasswordsList()) {
            Static.passwords_model.addElement(item);
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
        for (Passwordv2 password : Static.data.getUserData().getPasswordsList()) {
            content += "Service: " + password.getService(Static.return_encoded) + "\n";
            if (!password.getMail(Static.return_encoded).equals("")) {
                content += "Mail: " + password.getMail(Static.return_encoded) + "\n";
            }
            if (!password.getUser(Static.return_encoded).equals("")) {
                content += "User: " + password.getUser(Static.return_encoded) + "\n";
            }
            content += "Password: " + password.getPassword(Static.return_encoded) + "\n";
            if (!password.getNotes(Static.return_encoded).equals("")) {
                content += "Notes: \n" + password.getNotes(Static.return_encoded) + "\n";
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

    public void openEditMasterPassword() {
        MPSettings m = new MPSettings();
    }

    private void createCompleteDataBase() {
        SQLiteController sqlitec = new SQLiteController(Static.SQLiteDBName);
        sqlitec.createNewDatabase();
        Boolean mp_table = Static.sqLite.check_if_table_exists("MP");
        Boolean PASSS = Static.sqLite.check_if_table_exists("PASSS");
        Boolean PROGRAMDATA = Static.sqLite.check_if_table_exists("PROGRAMDATA");
        if (!mp_table) {
            sqlitec.createNewTable("CREATE TABLE `MP` (\n"
                    + "	`MPID`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n"
                    + "	`Mp`	TEXT,\n"
                    + "	`Mpa`	TEXT,\n"
                    + "	`MpaOriginal`	TEXT\n"
                    + ");");
            Static.sqLite.Query("INSERT INTO MP (Mp,Mpa,MpaOriginal)VALUES"
                    + "('" + AES.encrypt("null", Static.KeyPassword) + "','"
                    + "" + AES.encrypt("null", Static.KeyPassword) + "','"
                    + "" + AES.encrypt("null", Static.KeyPassword) + "');");
        }
        if (!PASSS) {
            sqlitec.createNewTable("CREATE TABLE `PASSS` (\n"
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
        if (!PROGRAMDATA) {
            sqlitec.createNewTable("CREATE TABLE `PROGRAMDATA` (\n"
                    + "	`ProgramDataID`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n"
                    + "	`FirstRun`	INTEGER\n"
                    + ");");
            Static.sqLite.Query("INSERT INTO PROGRAMDATA (FirstRun)VALUES ('0');");
        }
    }

}
