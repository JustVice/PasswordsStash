package Logic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadClass_Message extends Thread {

    private final int time;
    private final byte action;

    public ThreadClass_Message(int time, byte action) {
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
                    Message password = new Message("Password Copied");
                    password.setVisible(true);
                    Thread.sleep(time);
                    password.dispose();
                    break;
                case 1:
                    Message mail = new Message("Mail Copied");
                    mail.setVisible(true);
                    Thread.sleep(time);
                    mail.dispose();
                    break;
                case 2:
                    Message user = new Message("User Copied");
                    user.setVisible(true);
                    Thread.sleep(time);
                    user.dispose();
                    break;
                case 3:
                    Message NotFound = new Message("Item not found");
                    NotFound.setVisible(true);
                    Thread.sleep(time);
                    NotFound.dispose();
                    break;
                    case 4:
                    Message Cancelled = new Message("Cancelled");
                    Cancelled.setVisible(true);
                    Thread.sleep(time);
                    Cancelled.dispose();
                    break;
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadClass_Message.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
