package Logic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadClass extends Thread {

    private final int time;
    private final byte action;

    public ThreadClass(int time, byte action) {
        this.time = time;
        this.action = action;
    }

    /*
    0 = PASSWORDS
    1 = MAIL
    2 = USER
    3 = ITEM NOT FOUND
     */
    @Override
    public void run() {
        try {
            switch (action) {
                case 0:
                    ItemCopied password = new ItemCopied("Password Copied");
                    password.setVisible(true);
                    Thread.sleep(time);
                    password.dispose();
                    break;
                case 1:
                    ItemCopied mail = new ItemCopied("Mail Copied");
                    mail.setVisible(true);
                    Thread.sleep(time);
                    mail.dispose();
                    break;
                case 2:
                    ItemCopied user = new ItemCopied("User Copied");
                    user.setVisible(true);
                    Thread.sleep(time);
                    user.dispose();
                    break;
                case 3:
                    ItemCopied NotFound = new ItemCopied("Item not found");
                    NotFound.setVisible(true);
                    Thread.sleep(time);
                    NotFound.dispose();
                    break;
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
