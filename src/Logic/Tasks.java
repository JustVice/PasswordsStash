package Logic;

import OldLogic.Passwordv2;
import UI.*;
import UI.MasterPassword.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Tasks {

    public Tasks() {
    }
    
    public void v3Run(){
        Window window = new Window();
        window.openHome();
    }

    private void normalRun() {
        Memory.data.LoadData();
        loadLogo();
        //Master Password Update
        try {
            if (Memory.data.getUserData().getMp().equals("null")) {
                //openStart();
            } else {
                EnterMP e = new EnterMP();
            }
        } catch (Exception e) {
            //openStart();
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
//            openStart();
        }
    }

    private void loadLogo() {
        if (Memory.data.getUserData().isFirstRun()) {
            Logo logo = new Logo();
            Memory.data.getUserData().setFirstRun(false);
            Memory.data.updateInfo();
        }
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
        Memory.modeloPasswords.clear();
        for (Passwordv2 item : Memory.data.getUserData().getPasswordsList()) {
            Memory.modeloPasswords.addElement(item);
        }
        return Memory.modeloPasswords;
    }

    public void setModel() {
        Memory.modeloPasswords.clear();
        for (Passwordv2 item : Memory.data.getUserData().getPasswordsList()) {
            Memory.modeloPasswords.addElement(item);
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

    public void openEditMasterPassword() {
        MPSettings m = new MPSettings();
    }

}
