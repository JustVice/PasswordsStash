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

        String RETURN_STRING = service + ". ";
        if (!user.equals("")) {
            RETURN_STRING += "User: " + user + ".";
        } else {
            RETURN_STRING += "E-Mail: " + email + ".";
        }
        if (!notes.equals("")) {
            RETURN_STRING += " Additional notes included.";
        }
        return RETURN_STRING;
    }

    private String TO_STRING_ENCRYPTED_DATA() {
        String service = AES.decrypt(this.service, Memory.AES_KEY_PASSWORD);
        String user = AES.decrypt(this.user, Memory.AES_KEY_PASSWORD);
        String email = AES.decrypt(this.email, Memory.AES_KEY_PASSWORD);
        String notes = AES.decrypt(this.notes, Memory.AES_KEY_PASSWORD);

        String RETURN_STRING = service + ". ";
        if (!user.equals("")) {
            RETURN_STRING += "User: " + user + ".";
        } else {
            RETURN_STRING += "E-Mail: " + email + ".";
        }
        if (!notes.equals("")) {
            RETURN_STRING += " Additional notes included.";
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

    // <editor-fold desc="ENCRYPT GET AND SET">
    public String getService_ENCRYPTED() {
        return AES.decrypt(service, Memory.AES_KEY_PASSWORD);
    }

    public void setService_ENCRYPTED(String service) {
        this.service = AES.encrypt(service, Memory.AES_KEY_PASSWORD);
    }

    public String getUser_ENCRYPTED() {
        return AES.decrypt(user, Memory.AES_KEY_PASSWORD);
    }

    public void setUser_ENCRYPTED(String user) {
        this.user = AES.encrypt(user, Memory.AES_KEY_PASSWORD);
    }

    public String getEmail_ENCRYPTED() {
        return AES.decrypt(email, Memory.AES_KEY_PASSWORD);
    }

    public void setEmail_ENCRYPTED(String email) {
        this.email = AES.encrypt(email, Memory.AES_KEY_PASSWORD);
    }

    public String getPassword_ENCRYPTED() {
        return AES.decrypt(password, Memory.AES_KEY_PASSWORD);
    }

    public void setPassword_ENCRYPTED(String password) {
        this.password = AES.encrypt(password, Memory.AES_KEY_PASSWORD);
    }

    public String getID_ENCRYPTED() {
        return AES.decrypt(ID, Memory.AES_KEY_PASSWORD);
    }

    public void setID_ENCRYPTED(String ID) {
        this.ID = AES.encrypt(ID, Memory.AES_KEY_PASSWORD);
    }

    public String getFavorite_ENCRYPTED() {
        return AES.decrypt(favorite, Memory.AES_KEY_PASSWORD);
    }

    public void setFavorite_ENCRYPTED(String favorite) {
        this.favorite = AES.encrypt(favorite, Memory.AES_KEY_PASSWORD);
    }

    public String getNotes_ENCRYPTED() {
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
}
