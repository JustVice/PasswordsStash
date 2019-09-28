package LogicV2;

import LogicV3.Memory;
import Logic.Passwordv2;
import java.io.Serializable;
import java.util.LinkedList;

public class UserData implements Serializable {

    private static final long serialVersionUID = 2883991000023476147L;

    private LinkedList<Passwordv2> passwordsList = new LinkedList<Passwordv2>();
    private boolean firstRun = true;
    private String mp = TextKeeper.nullB64();
    private String mpa = TextKeeper.nullB64();
    private String mpa_original = TextKeeper.nullB64();
    private boolean inki = true;

    public UserData() {
    }

    public LinkedList<Passwordv2> getPasswordsList() {
        return passwordsList;
    }

    public void setPasswordsList(LinkedList<Passwordv2> passwordsList) {
        this.passwordsList = passwordsList;
    }

    public boolean isFirstRun() {
        return firstRun;
    }

    public void setFirstRun(boolean firstRun) {
        this.firstRun = firstRun;
    }

    public String getMp() {
        String mp_temp = this.mp;
        for (int i = 0; i < Memory.mpr; i++) {
            mp_temp = Encode.Decode_Base64(mp_temp);
        }
        return mp_temp;
    }

    public void setMp(String mp) {
        String mp_temp = mp;
        for (int i = 0; i < Memory.mpr; i++) {
            mp_temp = Encode.Encode_Base64(mp_temp);
        }
        this.mp = mp_temp;
    }

    public String getMpa() {
        String mpa_temp = this.mpa;
        for (int i = 0; i < Memory.mpr; i++) {
            mpa_temp = Encode.Decode_Base64(mpa_temp);
        }
        return mpa_temp;
    }

    public void setMpa(String mpa) {
        String mpa_temp = mpa;
        for (int i = 0; i < Memory.mpr; i++) {
            mpa_temp = Encode.Encode_Base64(mpa_temp);
        }
        this.mpa = mpa_temp;
    }

    public boolean isInki() {
        return inki;
    }

    public void setInki(boolean inki) {
        this.inki = inki;
    }

    public String getMpa_original() {
        String mpa_o_temp = mpa_original;
        for (int i = 0; i < Memory.mpr; i++) {
            mpa_o_temp = Encode.Decode_Base64(mpa_o_temp);
        }
        return mpa_o_temp;
    }

    public void setMpa_original(String mpa_original) {
        String mpa_temp = mpa_original;
        for (int i = 0; i < Memory.mpr; i++) {
            mpa_temp = Encode.Encode_Base64(mpa_temp);
        }
        this.mpa_original = mpa_temp;
    }

}
