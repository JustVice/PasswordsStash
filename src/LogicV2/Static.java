
package LogicV2;

import Logic.Passwordv2;
import javax.swing.DefaultListModel;
import java.awt.Image;
import java.awt.Toolkit;

public class Static {

    public static Run run;
    public static String DataPath = "datav2PS.dat",title="Passwords Stash",version="2.2";
    public static Data data = new Data();
    public static DefaultListModel<Passwordv2> modeloPasswords = new DefaultListModel();
    public static boolean easterEgg = true;
    
    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }

}
