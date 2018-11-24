package Logic;

import java.io.Serializable;

public class Passwordv2 implements Serializable {

    private static final long serialVersionUID = 8018321155622116147L;

    private String service;
    private String user;
    private String mail;
    private String password;
    private String notes;
    private int ID;
    private boolean favorite;

    public Passwordv2(String service, String user, String mail, String password, String notes, boolean favorite) {
        this.service = service;
        this.user = user;
        this.mail = mail;
        this.password = password;
        this.notes = notes;
        this.ID = (int)(Math.random()*99999999);
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        String str = service + ". ";
        if (!user.equals("")) {
            str += "User: " + user + " , ";
        }
        if (!mail.equals("")) {
            str += "mail: " + mail + " , ";
        }
        if (favorite) {
            str += "password: *** , FAVORITE";
        } else {
            str += "password: *** , ";
        }

        if (!notes.equals("")) {
            str += "description: " + notes + " , ";
        }
        return str;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return notes;
    }

    public void setDescription(String description) {
        this.notes = description;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getObjectForSeePasswords() {

        String str = "Service: " + service + "\n";
        if (!user.equals("")) {
            str += "User: " + user + "\n";
        }
        if (!mail.equals("")) {
            str += "Mail: " + mail + "\n";
        }
        str += "Password: " + password + "\n";
        if (!notes.equals("")) {
            str += "Description: " + notes + "\n";
        }
        str += "password ID: " + ID;
        return str + "\n";
    }

    public String getObjectForSeePasswords2() {
        String str = "Service: " + service + ", ";
        if (!user.equals("")) {
            str += "User: " + user + ", ";
        }
        if (!mail.equals("")) {
            str += "Mail: " + mail + ", ";
        }
        str += "Password: " + password + ", ";
        if (!notes.equals("")) {
            str += "Description: " + notes + ", ";
        }
        return str + "\n";
    }

}
