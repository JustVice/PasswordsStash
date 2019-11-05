package LogicV3;

import Objects.Passwordv3;
import LogicV2.Data;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;

public class Memory {

    public static Run run;
    public static String DataPath = "datav2PS.dat", title = "Passwords Stash", version = "3.0";
    public static Data data = new Data();
    public static boolean return_encoded = true;
    public static int mpr = 12;
    public final static String SQLiteDBName = System.getProperty("user.dir") + "//pwsdata.db";
    public final static String AES_KEY_PASSWORD = "JUSTVICESKEYPASSWORDFORPASSWORDSSTASHV3";
    public final static SQLite sqlite = new SQLite(SQLiteDBName);
    public final static DataVSQLite dataVSQL = new DataVSQLite();
    public static LinkedList<Passwordv3> passwordsV3LinkedList = new LinkedList<Passwordv3>();
    public static UserDataV3 userDataV3 = new UserDataV3();
    public static boolean DATA_IS_ENCRYPTED = true;

    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }

}
