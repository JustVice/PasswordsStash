package LogicV2;

import Logic.Passwordv2;
import LogicV3.DataVSQLite;
import LogicV3.SQLite;
import javax.swing.DefaultListModel;
import java.awt.Image;
import java.awt.Toolkit;

public class Static {

    public static Run run;
    public static String DataPath = "datav2PS.dat", title = "Passwords Stash", version = "3.0";
    public static Data data = new Data();
    public static DefaultListModel<Passwordv2> passwords_model = new DefaultListModel();
    public static boolean return_encoded = true;
    public static int mpr = 12;
    public final static String SQLiteDBName = System.getProperty("user.dir") + "//pwsdata.db";
    public final static String KeyPassword = "JUSTVICESKEYPASSWORDFORPASSWORDSSTASHV3";
    public final static SQLite sqLite = new SQLite(SQLiteDBName);
    public final static DataVSQLite dataVSQL = new DataVSQLite();

    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }

}
