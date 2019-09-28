package LogicV3;

public class UserDataV3 {

    private String firstRun = "true";
    private String masterPassword = "null";
    private String masterPasswordAttempts = "null";
    private String masterPasswordAttemptsOriginal = "null";
    private String inki = "true";

    public String getFirstRun() {
        return firstRun;
    }

    public void setFirstRun(String firstRun) {
        this.firstRun = firstRun;
    }

    public String getMasterPassword() {
        return masterPassword;
    }

    public void setMasterPassword(String masterPassword) {
        this.masterPassword = masterPassword;
    }

    public String getMasterPasswordAttempts() {
        return masterPasswordAttempts;
    }

    public void setMasterPasswordAttempts(String masterPasswordAttempts) {
        this.masterPasswordAttempts = masterPasswordAttempts;
    }

    public String getMasterPasswordAttemptsOriginal() {
        return masterPasswordAttemptsOriginal;
    }

    public void setMasterPasswordAttemptsOriginal(String masterPasswordAttemptsOriginal) {
        this.masterPasswordAttemptsOriginal = masterPasswordAttemptsOriginal;
    }

    public String getInki() {
        return inki;
    }

    public void setInki(String inki) {
        this.inki = inki;
    }

    @Override
    public String toString() {
        return "UserDataV3{" + "firstRun=" + firstRun + ", masterPassword=" + masterPassword + ", masterPasswordAttempts=" + masterPasswordAttempts + ", masterPasswordAttemptsOriginal=" + masterPasswordAttemptsOriginal + ", inki=" + inki + '}';
    }

}
