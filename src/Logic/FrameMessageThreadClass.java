package Logic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FrameMessageThreadClass implements Runnable {

    private final int time;
    private final byte action;

    public FrameMessageThreadClass(int time, byte action) {
        this.time = time;
        this.action = action;
        Thread thread = new Thread(this);
        thread.start();
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
                    FrameMessage password_copied = new FrameMessage("Password Copied");
                    password_copied.setVisible(true);
                    Thread.sleep(time);
                    password_copied.dispose();
                    break;
                case 1:
                    FrameMessage mail = new FrameMessage("Mail Copied");
                    mail.setVisible(true);
                    Thread.sleep(time);
                    mail.dispose();
                    break;
                case 2:
                    FrameMessage user = new FrameMessage("User Copied");
                    user.setVisible(true);
                    Thread.sleep(time);
                    user.dispose();
                    break;
                case 3:
                    FrameMessage NotFound = new FrameMessage("Item not found");
                    NotFound.setVisible(true);
                    Thread.sleep(time);
                    NotFound.dispose();
                    break;
                    case 4:
                    FrameMessage Cancelled = new FrameMessage("Cancelled");
                    Cancelled.setVisible(true);
                    Thread.sleep(time);
                    Cancelled.dispose();
                    break;
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(FrameMessageThreadClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
