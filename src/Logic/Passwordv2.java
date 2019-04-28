package Logic;

import java.io.Serializable;
import LogicV2.Encode;

public class Passwordv2 implements Serializable {

    private static final long serialVersionUID = 8018321155622116147L;

    private String service;
    private String user;
    private String mail;
    private String password;
    private String notes;
    private int ID;
    private boolean favorite;

    public Passwordv2() {
    }

    public Passwordv2(String service, String user, String mail, String password, String notes, boolean favorite) {
        this.service = service;
        this.user = user;
        this.mail = mail;
        this.password = password;
        this.notes = notes;
        this.ID = (int) (Math.random() * 99999999);
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        String str = Encode.Decode_Base64(service) + ". ";
        if (!Encode.Decode_Base64(user).equals("")) {
            str += "User: " + Encode.Decode_Base64(user) + " , ";
        }
        if (!Encode.Decode_Base64(mail).equals("")) {
            str += "mail: " + Encode.Decode_Base64(mail) + " , ";
        }
        if (!Encode.Decode_Base64(notes).equals("")) {
            str += "description: " + Encode.Decode_Base64(notes) + " , ";
        }
        if (favorite) {
            str += "password: *** , FAVORITE";
        } else {
            str += "password: *** , ";
        }
        return str;
    }

    public String getService(boolean uncoded) {
        if (uncoded) {
            return Encode.Decode_Base64(service);
        } else {
            return service;
        }

    }

    public void setService(String service) {
        this.service = service;
    }

    public String getUser(boolean uncoded) {
        if (uncoded) {
            return Encode.Decode_Base64(user);
        } else {
            return user;
        }
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMail(boolean uncoded) {
        if (uncoded) {
            return Encode.Decode_Base64(mail);
        } else {
            return mail;
        }
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword(boolean uncoded) {
        if (uncoded) {
            return Encode.Decode_Base64(password);
        } else {
            return password;
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription(boolean uncoded) {
        if (uncoded) {
            return Encode.Decode_Base64(notes);
        } else {
            return notes;
        }
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

    public String getNotes(boolean uncoded) {
        if (uncoded) {
            return Encode.Decode_Base64(notes);
        } else {
            return notes;
        }
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getObjectForSeePasswords(boolean encoded) {
        if (encoded) {
            String str = "Service: " + Encode.Decode_Base64(service) + "\n";
            if (!Encode.Decode_Base64(user).equals("")) {
                str += "User: " + Encode.Decode_Base64(user) + "\n";
            }
            if (!Encode.Decode_Base64(mail).equals("")) {
                str += "Mail: " + Encode.Decode_Base64(mail) + "\n";
            }
            str += "Password: " + Encode.Decode_Base64(password) + "\n";
            if (!Encode.Decode_Base64(notes).equals("")) {
                str += "Notes: " + Encode.Decode_Base64(notes) + "\n";
            }
            str += "password ID: " + ID;
            return str + "\n";
        } else {
            return "!!!!!";
        }
    }

    public String getObjectForSeePasswords2(boolean encoded) {
        if (encoded) {
            String str = "Service: " + Encode.Decode_Base64(service) + ", ";
            if (!Encode.Decode_Base64(user).equals("")) {
                str += "User: " + Encode.Decode_Base64(user) + ", ";
            }
            if (!Encode.Decode_Base64(mail).equals("")) {
                str += "Mail: " + Encode.Decode_Base64(mail) + ", ";
            }
            str += "Password: " + Encode.Decode_Base64(password) + ", ";
            if (!Encode.Decode_Base64(notes).equals("")) {
                str += "Description: " + Encode.Decode_Base64(notes) + ", ";
            }
            return str + "\n";
        } else {
            return "!!!!!!!";
        }
    }

}
