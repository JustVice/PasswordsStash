package OldLogicV2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {

    private final DateFormat dateFormat;
    private final Date date;
    private final String ID;
    private String description, log_type;

    public Log() {
        this.date = new Date();
        this.dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        this.ID = generateID(false);
    }

    public Log(String description, String log_type) {
        this.date = new Date();
        this.dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        this.ID = generateID(false);
        this.description = description;
        this.log_type = log_type;
    }

    public String to_string() {
        String this_dot_message = "[" + this.dateFormat.format(this.date) + "]" + this.ID + ";" + this.log_type + ": " + this.description;
        return this_dot_message;
    }

    //<editor-fold desc="GET & SET">
    public String getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLog_type() {
        return log_type;
    }

    public void setLog_type(String log_type) {
        this.log_type = log_type;
    }
    //</editor-fold>

    //<editor-fold desc="ID generator">
    private String generateID(boolean onlyNumbersID) {
        String str = "";
        if (!onlyNumbersID) {
            str = "" + ((int) (Math.random() * 10)) + randomLetter() + (int) (Math.random() * 10);
        } else {
            str = "" + ((int) (Math.random() * 10)) + ((int) (Math.random() * 10));
        }
        //System.out.println("Random generated: " + str);
        return str;
    }

    private String randomLetter() {
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "O", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Z", "X", "Y"};
        String result = "";
        int randomLetterIndex = 0;
        while (true) {
            randomLetterIndex = ((int) (Math.random() * 100));
            if (randomLetterIndex <= 25) {
                break;
            }
        }
        result = alfabeto[randomLetterIndex];
        return result;
    }
    //</editor-fold>

}
