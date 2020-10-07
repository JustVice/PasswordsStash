// ===========================================================================
// Passwords Stash v3 by JUST VICE.
// MIT Licence.
// ===========================================================================
package Objects;

import Logic.Base64Encode;

public class Password {

    private String service;
    private String user;
    private String email;
    private String password;
    private String notes;
    private int ID;
    private boolean favorite;

    public Password() {
    }

    public Password(String service,
            String user,
            String email,
            String password,
            String notes,
            boolean favorite) {
        this.service = service;
        this.user = user;
        this.email = email;
        this.password = password;
        this.notes = notes;
        this.ID = (int) (Math.random() * 99999999);
        this.favorite = favorite;
    }
    
    // ===========================================================================
    // Info return. To read info on the application.
    // ===========================================================================

    @Override
    public String toString() {
        String str = Base64Encode.Decode_Base64(service) + ". ";
        if (!Base64Encode.Decode_Base64(user).equals("")) {
            str += "User: " + Base64Encode.Decode_Base64(user) + " , ";
        }
        if (!Base64Encode.Decode_Base64(email).equals("")) {
            str += "email: " + Base64Encode.Decode_Base64(email) + " , ";
        }
        if (!Base64Encode.Decode_Base64(notes).equals("")) {
            str += "description: " + Base64Encode.Decode_Base64(notes) + " , ";
        }
        if (favorite) {
            str += "password: *** , FAVORITE";
        } else {
            str += "password: *** , ";
        }
        return str;
    }

    public String getObjectForSeePasswords(boolean encoded) {
        if (encoded) {
            String str = "Service: " + Base64Encode.Decode_Base64(service) + "\n";
            if (!Base64Encode.Decode_Base64(user).equals("")) {
                str += "User: " + Base64Encode.Decode_Base64(user) + "\n";
            }
            if (!Base64Encode.Decode_Base64(email).equals("")) {
                str += "Email: " + Base64Encode.Decode_Base64(email) + "\n";
            }
            str += "Password: " + Base64Encode.Decode_Base64(password) + "\n";
            if (!Base64Encode.Decode_Base64(notes).equals("")) {
                str += "Notes: " + Base64Encode.Decode_Base64(notes) + "\n";
            }
            str += "password ID: " + ID;
            return str + "\n";
        } else {
            return "!!!!!";
        }
    }

    public String getObjectForSeePasswords2(boolean encoded) {
        if (encoded) {
            String str = "Service: " + Base64Encode.Decode_Base64(service) + ", ";
            if (!Base64Encode.Decode_Base64(user).equals("")) {
                str += "User: " + Base64Encode.Decode_Base64(user) + ", ";
            }
            if (!Base64Encode.Decode_Base64(email).equals("")) {
                str += "Email: " + Base64Encode.Decode_Base64(email) + ", ";
            }
            str += "Password: " + Base64Encode.Decode_Base64(password) + ", ";
            if (!Base64Encode.Decode_Base64(notes).equals("")) {
                str += "Description: " + Base64Encode.Decode_Base64(notes) + ", ";
            }
            return str + "\n";
        } else {
            return "!!!!!!!";
        }
    }

    // ===========================================================================
    // GET & SET.
    // ===========================================================================
    public String getService(boolean uncoded) {
        if (uncoded) {
            return Base64Encode.Decode_Base64(service);
        } else {
            return service;
        }
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getUser(boolean uncoded) {
        if (uncoded) {
            return Base64Encode.Decode_Base64(user);
        } else {
            return user;
        }
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail(boolean uncoded) {
        if (uncoded) {
            return Base64Encode.Decode_Base64(email);
        } else {
            return email;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(boolean uncoded) {
        if (uncoded) {
            return Base64Encode.Decode_Base64(password);
        } else {
            return password;
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription(boolean uncoded) {
        if (uncoded) {
            return Base64Encode.Decode_Base64(notes);
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
            return Base64Encode.Decode_Base64(notes);
        } else {
            return notes;
        }
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}
