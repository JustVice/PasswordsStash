
package LogicV2;

import Logic.Passwordv2;
import javax.swing.DefaultListModel;

public class Static {

    public static Run run;
    public static String DataPath = "datav2.dat",title="Passwords Stash",version="2.0";
    public static Data data = new Data();
    public static DefaultListModel<Passwordv2> modeloPasswords = new DefaultListModel();
    public static boolean easterEgg = true;

}
