package LogicV3;

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

    @Override
    public String toString() {
        String return_string = "";
        if (Memory.DATA_IS_ENCRYPTED) {
            return_string = TO_STRING_ENCRYPTED_DATA();
        } else {
            return_string = TO_STRING_NON_ENCRYPTED_DATA();
        }
        return return_string;
    }

    private String TO_STRING_NON_ENCRYPTED_DATA() {
        String service = this.service;
        String user = this.user;
        String email = this.email;
        String notes = this.notes;
        String favorite = this.favorite;

        String RETURN_STRING = service + ". ";
        if (!user.equals("")) {
            RETURN_STRING += "User: " + user + ". ";
        } else {
            RETURN_STRING += "E-Mail: " + email + ". ";
        }
        if (!notes.equals("")) {
            RETURN_STRING += "Additional notes included. ";
        }
        if (favorite.equals("1")) {
            RETURN_STRING += "Favorite password. ";
        }
        return RETURN_STRING;
    }

    private String TO_STRING_ENCRYPTED_DATA() {
        String service = AES.decrypt(this.service, Memory.AES_KEY_PASSWORD);
        String user = AES.decrypt(this.user, Memory.AES_KEY_PASSWORD);
        String email = AES.decrypt(this.email, Memory.AES_KEY_PASSWORD);
        String notes = AES.decrypt(this.notes, Memory.AES_KEY_PASSWORD);
        String favorite = AES.decrypt(this.favorite, Memory.AES_KEY_PASSWORD);

        String RETURN_STRING = service + ". ";
        if (!user.equals("")) {
            RETURN_STRING += "User: " + user + ". ";
        } else {
            RETURN_STRING += "E-Mail: " + email + ". ";
        }
        if (!notes.equals("")) {
            RETURN_STRING += "Additional notes included. ";
        }
        if (favorite.equals("1")) {
            RETURN_STRING += "Favorite password.";
        }
        return RETURN_STRING;
    }

    public int getFavorite_FOR_DATABASE_INTEGER_BOL() {
        //Used to save the favorite value inside database.
        if (this.favorite.equals("1")) {
            return 1;
        } else {
            return 0;
        }
    }

    // <editor-fold desc="SEE ALL PASSWORD INFORMATION FRAME CONTENT METHODS">
    //Gives the information displayed inside the freme: SeePasswordInformation
    public String SEE_ALL_PASSWORD_INFORMATION_FRAME_CONTENT() {
        if (Memory.DATA_IS_ENCRYPTED) {
            return SEE_ALL_PASSWORD_INFORMATION_FRAME_CONTENT_GIVER_ENCRYPTED();
        } else {
            return SEE_ALL_PASSWORD_INFORMATION_FRAME_CONTENT_GIVER_NOT_ENCRYPTED();
        }
    }

    private String SEE_ALL_PASSWORD_INFORMATION_FRAME_CONTENT_GIVER_ENCRYPTED() {
        String STRING_RETURN
                = "Service: " + this.getService_DECRYPTED() + "\n"
                + "User: " + this.getUser_DECRYPTED() + "\n"
                + "EMail: " + this.getEmail_DECRYPTED() + "\n"
                + "Password: " + this.getPassword_DECRYPTED() + "\n";
        return STRING_RETURN;
    }

    private String SEE_ALL_PASSWORD_INFORMATION_FRAME_CONTENT_GIVER_NOT_ENCRYPTED() {
        String STRING_RETURN
                = "Service: " + this.getService() + "\n"
                + "User: " + this.getUser() + "\n"
                + "EMail: " + this.getEmail() + "\n"
                + "Password: " + this.getPassword() + "\n";
        return STRING_RETURN;
    }

    // </editor-fold>
    // <editor-fold desc="ENCRYPT GET AND SET">
    //GET AND SET IF THE PROGRAM IS WORKING WITH ENCRYPTED PASSWORDS.
    //THE SET METHODS WILL SAVE THE INFORMATION ENCRYPTED. THE DECRYPTED METHODS
    //WILL RETURN THE INFORMATION DECRYPTED.
    public String getService_DECRYPTED() {
        return AES.decrypt(service, Memory.AES_KEY_PASSWORD);
    }

    public void setService_ENCRYPTED(String service) {
        this.service = AES.encrypt(service, Memory.AES_KEY_PASSWORD);
    }

    public String getUser_DECRYPTED() {
        return AES.decrypt(user, Memory.AES_KEY_PASSWORD);
    }

    public void setUser_ENCRYPTED(String user) {
        this.user = AES.encrypt(user, Memory.AES_KEY_PASSWORD);
    }

    public String getEmail_DECRYPTED() {
        return AES.decrypt(email, Memory.AES_KEY_PASSWORD);
    }

    public void setEmail_ENCRYPTED(String email) {
        this.email = AES.encrypt(email, Memory.AES_KEY_PASSWORD);
    }

    public String getPassword_DECRYPTED() {
        return AES.decrypt(password, Memory.AES_KEY_PASSWORD);
    }

    public void setPassword_ENCRYPTED(String password) {
        this.password = AES.encrypt(password, Memory.AES_KEY_PASSWORD);
    }

    public String getFavorite_DECRYPTED() {
        return AES.decrypt(favorite, Memory.AES_KEY_PASSWORD);
    }

    public void setFavorite_ENCRYPTED(String favorite) {
        this.favorite = AES.encrypt(favorite, Memory.AES_KEY_PASSWORD);
    }

    public String getNotes_DECRYPTED() {
        return AES.decrypt(notes, Memory.AES_KEY_PASSWORD);
    }

    public void setNotes_ENCRYPTED(String notes) {
        this.notes = AES.encrypt(notes, Memory.AES_KEY_PASSWORD);
    }

    // </editor-fold>
    // <editor-fold desc="COMMON GET AND SET">
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

    // </editor-fold>
    // <editor-fold desc="SPECIAL GET AND SET">
    //SPECIAL GET AND SET WILL SET OR RETURN THE VALUES DEPENDING IF THE
    //DATA IS ENCRYPTED OR NOT ENCRYPTED AUTOMATICALLY.
    public String getService_SPECIAL() {
        if (Memory.DATA_IS_ENCRYPTED) {
            return AES.decrypt(service, Memory.AES_KEY_PASSWORD);
        } else {
            return service;
        }
    }

    public void setService_SPECIAL(String service) {
        if (Memory.DATA_IS_ENCRYPTED) {
            this.service = AES.encrypt(service, Memory.AES_KEY_PASSWORD);
        } else {
            this.service = service;
        }
    }

    public String getUser_SPECIAL() {
        if (Memory.DATA_IS_ENCRYPTED) {
            return AES.decrypt(user, Memory.AES_KEY_PASSWORD);
        } else {
            return user;
        }
    }

    public void setUser_SPECIAL(String user) {
        if (Memory.DATA_IS_ENCRYPTED) {
            this.user = AES.encrypt(user, Memory.AES_KEY_PASSWORD);
        } else {
            this.user = user;
        }
    }

    public String getEmail_SPECIAL() {
        if (Memory.DATA_IS_ENCRYPTED) {
            return AES.decrypt(email, Memory.AES_KEY_PASSWORD);
        } else {
            return email;
        }
    }

    public void setEmail_SPECIAL(String email) {
        if (Memory.DATA_IS_ENCRYPTED) {
            this.email = AES.encrypt(email, Memory.AES_KEY_PASSWORD);
        } else {
            this.email = email;
        }
    }

    public String getPassword_SPECIAL() {
        if (Memory.DATA_IS_ENCRYPTED) {
            return AES.decrypt(password, Memory.AES_KEY_PASSWORD);
        } else {
            return password;
        }
    }

    public void setPassword_SPECIAL(String password) {
        if (Memory.DATA_IS_ENCRYPTED) {
            this.password = AES.encrypt(password, Memory.AES_KEY_PASSWORD);
        } else {
            this.password = password;
        }
    }

    public String getNotes_SPECIAL() {
        if (Memory.DATA_IS_ENCRYPTED) {
            return AES.decrypt(notes, Memory.AES_KEY_PASSWORD);
        } else {
            return notes;
        }
    }

    public void setNotes_SPECIAL(String notes) {
        if (Memory.DATA_IS_ENCRYPTED) {
            this.notes = AES.encrypt(notes, Memory.AES_KEY_PASSWORD);
        } else {
            this.notes = notes;
        }
    }

    public String getID_SPECIAL() {
        if (Memory.DATA_IS_ENCRYPTED) {
            return AES.decrypt(ID, Memory.AES_KEY_PASSWORD);
        } else {
            return ID;
        }
    }

    public void setID_SPECIAL(String ID) {
        if (Memory.DATA_IS_ENCRYPTED) {
            this.ID = AES.encrypt(ID, Memory.AES_KEY_PASSWORD);
        } else {
            this.ID = ID;
        }
    }

    public String getFavorite_SPECIAL() {
        if (Memory.DATA_IS_ENCRYPTED) {
            return AES.decrypt(favorite, Memory.AES_KEY_PASSWORD);
        } else {
            return favorite;
        }
    }

    public void setFavorite_SPECIAL(String favorite) {
        if (Memory.DATA_IS_ENCRYPTED) {
            this.favorite = AES.encrypt(favorite, Memory.AES_KEY_PASSWORD);
        } else {
            this.favorite = favorite;
        }
    }
    // </editor-fold>
}
