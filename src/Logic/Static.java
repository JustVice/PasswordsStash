package Logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Static {

    public static LinkedList<Passwordv2> pw_dir = new LinkedList();
    public static DefaultListModel<Passwordv2> modelo = new DefaultListModel<>();
    public static Admin admin = new Admin();
    public static String TruePath = "data.dat", PathPrintPasswords = "Passwords.txt", servicesRegistered[];
    public static String currentVersion = "v1.6.1", programTab = "JV Passwords. ";

    /**
     * Method that loads the information contained on the data file. If it does
     * not exist, it will be created.
     */
    public static void LoadData() {
        File path = new File(TruePath);
        if (!path.exists()) {
            try {
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(TruePath));
                writeFile.writeObject(pw_dir);
                writeFile.close();
            } catch (IOException e) {
                System.out.println("Error creating data file.");
                e.printStackTrace();
            }
        } else {
            try {
                ObjectInputStream getFile = new ObjectInputStream(new FileInputStream(TruePath));
                pw_dir = (LinkedList) getFile.readObject();
            } catch (IOException localIOException1) {
            } catch (ClassNotFoundException e) {
                System.out.println("Error loading data.");
                e.printStackTrace();
            }
        }
    }

    /**
     * Updates the data file with a new password that user provided and stored
     * on the LinkedList.
     */
    public static void NewPassword() {
        File path = new File(TruePath);
        if (path.exists()) {
            try {
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(TruePath));
                writeFile.writeObject(pw_dir);
                writeFile.close();
            } catch (IOException e) {
                System.out.println("Error loading data");
            }
        } else {
            JOptionPane.showMessageDialog(null, "DATA DIRECTORY DELETED. THE PROGRAM WILL CLOSE");
            System.exit(0);
        }
    }

    /**
     * Re-writes data file with the current information stored on the LinkedList
     */
    public static void UpdateData() {
        File path = new File(TruePath);
        if (path.exists()) {
            try {
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(TruePath));
                writeFile.writeObject(pw_dir);
                writeFile.close();
            } catch (IOException e) {
                System.out.println("Error at UpdateData Method in Data class");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "DATA DIRECTORY DELETED. THE PROGRAM WILL CLOSE");
            System.exit(0);
        }
    }

    /**
     * Sets DefaultListModel static variable with all the information stored in
     * data file.
     */
    public static void setModelsItems() {
        modelo.clear();
        servicesRegistered = new String[pw_dir.size()];
        for (int i = 0; i < pw_dir.size(); i++) {
            modelo.add(i, Static.pw_dir.get(i));
            servicesRegistered[i] = Static.pw_dir.get(i).getService();
        }
        try {
            servicesRegistered = whiteListServicesRegistered(servicesRegistered);
        } catch (Exception e) {
        }

    }

    /**
     * Gets a list of Strings and returns the same list but without duplicated
     * values.
     *
     * @param stringList
     * @return
     */
    public static String[] whiteListServicesRegistered(String[] stringList) {
        String[] input = stringList;
        boolean duplicate = false;
        ArrayList<String> whiteList = new ArrayList<String>();
        whiteList.add(input[0]);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < whiteList.size(); j++) {
                if (input[i].equals(whiteList.get(j))) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                whiteList.add(input[i]);
            } else {
                duplicate = false;
            }
        }
        return whiteList.toArray(new String[whiteList.size()]);
    }

    /**
     * Prints all the passwords in a txt file at the same path where the program
     * is.
     */
    public static void printAllPasswords() {
        if (!pw_dir.isEmpty()) {
            try {
                String str = "";
                Passwordv2 password;
                for (int i = 0; i < pw_dir.size(); i++) {
                    password = pw_dir.get(i);
                    str += password.getService() + "\r\n";
                    if (!password.getUser().equals("")) {
                        str += "User: " + password.getUser() + "\r\n";
                    }
                    if (!password.getMail().equals("")) {
                        str += "Mail: " + password.getMail() + "\r\n";
                    }
                    str += "Password: " + password.getPassword() + "\r\n";
                    if (!password.getDescription().equals("")) {
                        str += "Description: " + password.getDescription() + "\r\n";
                    }
                    if (!password.getOtherInstrucctions().equals("")) {
                        str += "Other sign up instrucctions: " + password.getOtherInstrucctions() + "\r\n";
                    }
                    str += "\r\n";
                }
                System.out.println(str);
                FileWriter escritura = new FileWriter(PathPrintPasswords);
                for (int i = 0; i < str.length(); i++) {
                    escritura.write(str.charAt(i));
                }
                escritura.close();
            } catch (Exception e) {
                System.out.println("Error at printAllPasswords method in Data Class.");
            }
        }
    }

    /**
     * Prints all the passwords in his own txt file with the name of the service
     * and either user or mail provided.
     */
    public static void printAllPasswordsOnHisOwnTxtFile() {
        if (!pw_dir.isEmpty()) {
            try {
                File file = new File("Passwords");
                file.mkdir();
                String str = "";
                Passwordv2 password;
                for (int i = 0; i < pw_dir.size(); i++) {
                    password = pw_dir.get(i);
                    str += password.getService() + "\r\n";
                    if (!password.getUser().equals("")) {
                        str += "User: " + password.getUser() + "\r\n";
                    }
                    if (!password.getMail().equals("")) {
                        str += "Mail: " + password.getMail() + "\r\n";
                    }
                    str += "Password: " + password.getPassword() + "\r\n";
                    if (!password.getDescription().equals("")) {
                        str += "Description: " + password.getDescription() + "\r\n";
                    }
                    if (!password.getOtherInstrucctions().equals("")) {
                        str += "Other sign up instrucctions: " + password.getOtherInstrucctions() + "\r\n";
                    }
                    str += "\r\n";
                    String fileName = "Passwords\\" + password.getService() + ". ";
                    if (!password.getUser().equals("")) {
                        fileName += password.getUser();
                    } else {
                        fileName += password.getMail();
                    }
                    fileName += ".txt";
                    FileWriter escritura = new FileWriter(fileName);
                    for (int j = 0; j < str.length(); j++) {
                        escritura.write(str.charAt(j));
                    }
                    str = "";
                    escritura.close();
                }
                System.out.println(str);
            } catch (Exception e) {
                System.out.println("Error at printAllPasswordsOnHisOwnTxtFile method on Static Class.\n"+e);
            }
        }
    }

    /**
     * Prints the passwords selected by the user on Jlist in his own txt file
     * with the name of the service and either user or mail provided.
     */
    public static void printSelectedPasswords(int[] indices) {
        if (!pw_dir.isEmpty()) {
            try {
                String str = "";
                Passwordv2 password;
                File file = new File("Passwords");
                file.mkdir();
                for (int i = 0; i < indices.length; i++) {
                    password = modelo.get(indices[i]);
                    str += password.getService() + "\r\n";
                    if (!password.getUser().equals("")) {
                        str += "User: " + password.getUser() + "\r\n";
                    }
                    if (!password.getMail().equals("")) {
                        str += "Mail: " + password.getMail() + "\r\n";
                    }
                    str += "Password: " + password.getPassword() + "\r\n";
                    if (!password.getDescription().equals("")) {
                        str += "Description: " + password.getDescription() + "\r\n";
                    }
                    if (!password.getOtherInstrucctions().equals("")) {
                        str += "Other sign up instrucctions: " + password.getOtherInstrucctions() + "\r\n";
                    }
                    str += "\r\n";
                    String fileName = "Passwords\\" + password.getService() + ". ";
                    if (!password.getUser().equals("")) {
                        fileName += password.getUser();
                    } else {
                        fileName += password.getMail();
                    }
                    fileName += ".txt";
                    FileWriter escritura = new FileWriter(fileName);
                    for (int j = 0; j < str.length(); j++) {
                        escritura.write(str.charAt(j));
                    }
                    str = "";
                    escritura.close();
                }
                System.out.println(str);
            } catch (Exception e) {
                System.out.println("Error at printAllPasswordsOnHisOwnTxtFile method in Data Class.");
            }
        }
    }

    public static DefaultListModel getFavPasswordsToShow() {
        DefaultListModel<Passwordv2> tempModel = new DefaultListModel<>();
        int cont = 0;
        for (int i = 0; i < pw_dir.size(); i++) {
            if (pw_dir.get(i).isFavorite()) {
                tempModel.add(cont, pw_dir.get(i));
                cont++;
            }
        }
        return tempModel;
    }

}
