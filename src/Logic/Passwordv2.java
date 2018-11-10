package Logic;

import java.io.Serializable;

public class Passwordv2 implements Serializable {

    private static final long serialVersionUID = 8018321155622116147L;

    private String service;
    private String user;
    private String mail;
    private String password;
    private String description;
    private String otherInstrucctions;
    private int ID;
    private boolean favorite;

    public Passwordv2(String service, String user, String mail, String password, String description, String otherInstrucctions, boolean favorite) {
        this.service = service;
        this.user = user;
        this.mail = mail;
        this.password = password;
        this.description = description;
        this.otherInstrucctions = otherInstrucctions;
        this.ID = randomIDFIX();
        this.favorite = favorite;
    }

    private int randomID() {/*DEFECTIVE*/
        int n = 0;
        boolean keep = true;
        while (keep) {
            n += Math.random() * 9999999;
            n += Math.random() * 8363220;
            n += Math.random() * 2209;
            for (int i = 0; i < Static.pw_dir.size(); i++) {
                if (Static.pw_dir.get(i).getID() == n) {
                    keep = true;
                    break;
                } else {
                    keep = false;
                }
            }
        }
        return n;
    }

    private int randomINT() {
        int n = 0;
        n += Math.random() * 9999999;
        n += Math.random() * 8363220;
        n += Math.random() * 2209;
        return n;
    }

    private int randomIDFIX() {
        int n = 0;
        if (Static.pw_dir.isEmpty()) {
            n = randomINT();
            return n;
        } else {
            boolean keep = true;
            while (keep) {
                n = randomINT();
                for (int i = 0; i < Static.pw_dir.size(); i++) {
                    if (Static.pw_dir.get(i).getID() == n) {
                        System.out.println("ID repeat");
                        keep = true;
                        break;
                    } else {
                        keep = false;
                    }
                }
            }
            return n;
        }
    }

    public Passwordv2(String service, String user, String mail, String password, String description, String otherInstrucctions, int ID) {
        this.service = service;
        this.user = user;
        this.mail = mail;
        this.password = password;
        this.description = description;
        this.otherInstrucctions = otherInstrucctions;
        this.ID = ID;
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

        if (!description.equals("")) {
            str += "description: " + description + " , ";
        }
        if (!otherInstrucctions.equals("")) {
            str += "Other sign up instrucctions: " + otherInstrucctions;
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
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOtherInstrucctions() {
        return otherInstrucctions;
    }

    public void setOtherInstrucctions(String otherInstrucctions) {
        this.otherInstrucctions = otherInstrucctions;
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

    public String getObjectForSeePasswords() {

        String str = "Service: " + service + "\n";
        if (!user.equals("")) {
            str += "User: " + user + "\n";
        }
        if (!mail.equals("")) {
            str += "Mail: " + mail + "\n";
        }
        str += "Password: " + password + "\n";
        if (!description.equals("")) {
            str += "Description: " + description + "\n";
        }
        if (!otherInstrucctions.equals("")) {
            str += "Other sign up instrucctions: " + otherInstrucctions + "\n";
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
        if (!description.equals("")) {
            str += "Description: " + description + ", ";
        }
        if (!otherInstrucctions.equals("")) {
            str += "Other sign up instrucctions: " + otherInstrucctions + ", ";
        }
        return str + "\n";
    }

}
