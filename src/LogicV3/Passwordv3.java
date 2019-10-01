package LogicV3;

import LogicV2.Encode;

public class Passwordv3 {

    private String service;
    private String user;
    private String email;
    private String password;
    private String notes;
    private String ID;
    private String favorite;

    public Passwordv3() {
    }

    public Passwordv3(String service, String user, String mail, String password, String notes, String favorite) {
        this.service = service;
        this.user = user;
        this.email = mail;
        this.password = password;
        this.notes = notes;
        this.ID = "" + ((int) (Math.random() * 99999999));
        this.favorite = favorite;
    }

//    @Override
//    public String toString() {
//        String str = Encode.Decode_Base64(service) + ". ";
//        if (!user.equals("")) {
//            str += "User: " + user + " , ";
//        }
//        if (!mail.equals("")) {
//            str += "mail: " + mail + " , ";
//        }
//        if (!notes.equals("")) {
//            str += "description: " + notes + " , ";
//        }
//        if (favorite.equals("true")) {
//            str += "password: *** , FAVORITE";
//        } else {
//            str += "password: *** , ";
//        }
//        return str;
//    }
    @Override
    public String toString() {
        return "Passwordv3{" + "service=" + service + ", user=" + user + ", mail=" + email + ", password=" + password + ", notes=" + notes + ", ID=" + ID + ", favorite=" + favorite + '}';
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getNotes() {
        return notes;
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
            if (!Encode.Decode_Base64(email).equals("")) {
                str += "Mail: " + Encode.Decode_Base64(email) + "\n";
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
            if (!Encode.Decode_Base64(email).equals("")) {
                str += "Mail: " + Encode.Decode_Base64(email) + ", ";
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
