package Logic;

import OldLogicV2.Message_V2;
import UI.AboutFrame;
import UI.CreateNewPassword;
import UI.Delete;
import UI.EditPassword;
import UI.MasterPassword.SetMP;
import UI.PrintPasswords;
import UI.ProgramUseGuideLines;
import UI.SeePasswords;
import UI.Home;

public class Window {
    // This class mannages the Windows to be open.
    
    public void openMasterPasswordSet() {
        SetMP s = new SetMP();
    }

    public void openCreate() {
        CreateNewPassword c = new CreateNewPassword();
        c.setVisible(true);
    }

    public void openSeeP() {
        SeePasswords c = new SeePasswords();
        c.setVisible(true);
    }

    public void openHome() {
        Home c = new Home();
        c.setVisible(true);
    }

    public void openStart_and_show_message(String message) {
        Home c = new Home();
        c.setVisible(true);
        Message_V2 message_V2 = new Message_V2(message);
    }

    public void openDelete() {
        Delete c = new Delete();
        c.setVisible(true);
    }

    public void openEdit() {
        EditPassword c = new EditPassword();
        c.setVisible(true);
    }

    public void openPrintPasswords() {
        PrintPasswords pp = new PrintPasswords();
        pp.setVisible(true);
    }

    public void openAbout() {
        AboutFrame abf = new AboutFrame();
        abf.setVisible(true);
    }

    public void openUseGuideLines() {
        ProgramUseGuideLines f = new ProgramUseGuideLines();
        f.setVisible(true);
    }
}
