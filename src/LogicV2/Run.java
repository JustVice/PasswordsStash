package LogicV2;

import Logic.Passwordv2;
import UI.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Run {

    public Run() {
        Static.data.LoadData();
        Logo logo = new Logo();
        openStartMenu();
    }

    public void openStartMenu() {
        Start start = new Start();
        start.setVisible(true);
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
        Static.modeloPasswords.clear();
        for (Passwordv2 item : Static.data.getUserData().getPasswordsList()) {
            Static.modeloPasswords.addElement(item);
        }
        return Static.modeloPasswords;
    }

    public void setModel() {
        Static.modeloPasswords.clear();
        for (Passwordv2 item : Static.data.getUserData().getPasswordsList()) {
            Static.modeloPasswords.addElement(item);
        }
    }
    
    /**
 * options:
 * 0: Yes, no. Yes=0. No=1. X=-1.
 * 1: Yes, no, cancel. Yes=0. No=1. Cancel:2. X=-1.
 * 2: Accept, cancel. Accept=0. Cancel:2. X=-1.
 * 
 * simbol:
 * 0: Error
 * 1: Info
 * 2: Alert
 * 3: Ask
 */
    public int askMessage(String message, String title, int option,int simbol) {
        return JOptionPane.showConfirmDialog(null, message,title,option,simbol);
    }

}
