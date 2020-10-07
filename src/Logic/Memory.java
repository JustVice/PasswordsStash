package Logic;

import OldLogic.Passwordv2;
import OldLogicV2.Data;
import javax.swing.DefaultListModel;
import java.awt.Image;
import java.awt.Toolkit;

public class Memory {

    // ===========================================================================
    // V3-a2
    public static Tasks tasks = new Tasks();
    public static Window window = new Window();
    public static String database_uri = "data.db";
    
    // ===========================================================================
    // ===========================================================================
    // ===========================================================================
    
    public static String DataPath = "datav2PS.dat",title="Passwords Stash",version="2.3";
    public static Data data = new Data();
    public static DefaultListModel<Passwordv2> modeloPasswords = new DefaultListModel();
    public static boolean return_encoded = true;
    public static int mpr = 12;
    
    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }

}
