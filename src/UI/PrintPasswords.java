package UI;

import Logic.StaticOld;
import Logic.Passwordv2;
import LogicV2.Static;
import java.io.File;
import javax.swing.JOptionPane;

public class PrintPasswords extends javax.swing.JFrame {

    public PrintPasswords() {
        initComponents();
        setLocationRelativeTo(null);
        j_list.setModel(Static.run.setModelAndGet());
        PrintSelected.setEnabled(false);
        this.setTitle(Static.title + " " + Static.version);
        this.setResizable(false);
        setIconImage(Static.getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        PrintAllInASingleTxtFile = new javax.swing.JButton();
        PrintSelected = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_list = new javax.swing.JList<>();
        printOnTheirOwnTxtFile = new javax.swing.JButton();
        Help = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        PrintAllInASingleTxtFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PrintAllInASingleTxtFile.setText("Print all passwords in a single txt file");
        PrintAllInASingleTxtFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintAllInASingleTxtFileActionPerformed(evt);
            }
        });

        PrintSelected.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PrintSelected.setText("Print selected items");
        PrintSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintSelectedActionPerformed(evt);
            }
        });

        label1.setText("CTRL + click on the items to select multiple password");

        j_list.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        j_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j_list);

        printOnTheirOwnTxtFile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        printOnTheirOwnTxtFile.setText("PRINT EVERY PASSWORD ON ITS OWN TXT FILE");
        printOnTheirOwnTxtFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printOnTheirOwnTxtFileActionPerformed(evt);
            }
        });

        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Help, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290)
                        .addComponent(label1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PrintAllInASingleTxtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(PrintSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(printOnTheirOwnTxtFile)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Help)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label1)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrintAllInASingleTxtFile)
                            .addComponent(PrintSelected))
                        .addGap(19, 19, 19)
                        .addComponent(printOnTheirOwnTxtFile))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        StaticOld.admin.openStart();
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void j_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_listMouseClicked
        if (!j_list.isSelectionEmpty()) {
            PrintSelected.setEnabled(true);
        }
    }//GEN-LAST:event_j_listMouseClicked

    private void PrintAllInASingleTxtFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintAllInASingleTxtFileActionPerformed
        if (!Static.data.getUserData().getPasswordsList().isEmpty()) {
            int id = (int) (Math.random() * 9999);
            Static.run.printAllPasswords(id);
            JOptionPane.showMessageDialog(null, "PASSWORD(S) PRINTED AS \"Passwords " + id + "\"" + ".");
            System.out.println("PASSWORD(S) PRINTED AS \"Passwords " + id + "\"" + ".");
            System.out.println("PASSWORD(S) PRINTED AS \"Passwords " + id + "\"" + ".");
        } else {
            Static.run.message("There are no passwords yet.", "No passwords", 2);
        }
    }//GEN-LAST:event_PrintAllInASingleTxtFileActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        Static.run.message("This buttons will create txt files IN THE SAME FOLDER\nwhere the program is located.", "Print Passwords", 3);
    }//GEN-LAST:event_HelpActionPerformed

    private void printOnTheirOwnTxtFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printOnTheirOwnTxtFileActionPerformed
        if (!Static.data.getUserData().getPasswordsList().isEmpty()) {
            int ID = (int) (Math.random() * 9999);
            String path = "Passwords " + ID;
            File file = new File(path);
            file.mkdir();
            for (Passwordv2 pass : Static.data.getUserData().getPasswordsList()) {
                Static.run.BuildTxtFile(path, pass.getService(Static.return_encoded) + " " + pass.getID(), ".txt", pass.getObjectForSeePasswords(Static.return_encoded));
            }
            JOptionPane.showMessageDialog(null, "PASSWORD(S) PRINTED INSIDE THE FOLDER: \"Passwords "+ID+"\".");
        } else {
            Static.run.message("There are no passwords yet.", "No passwords", 2);
        }
    }//GEN-LAST:event_printOnTheirOwnTxtFileActionPerformed

    private void PrintSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintSelectedActionPerformed
        if (!Static.data.getUserData().getPasswordsList().isEmpty()) {
            int id = (int) (Math.random() * 9999);
            File file = new File("Passwords " + id);
            file.mkdir();
            int[] indices = j_list.getSelectedIndices();
            Passwordv2 password;
            String str = "";
            for (int i : indices) {
                password = Static.modeloPasswords.get(i);
                str += "Service: " + password.getService(Static.return_encoded) + "\r\n";
                if (!password.getUser(Static.return_encoded).equals("")) {
                    str += "User: " + password.getUser(Static.return_encoded) + "\r\n";
                }
                if (!password.getMail(Static.return_encoded).equals("")) {
                    str += "Mail: " + password.getMail(Static.return_encoded) + "\r\n";
                }
                str += "Password: " + password.getPassword(Static.return_encoded) + "\r\n";
                if (!password.getNotes(Static.return_encoded).equals("")) {
                    str += "Notes:\n" + password.getNotes(Static.return_encoded) + "\r\n";
                }
                str+= "Password ID: " + password.getID() + "\r\n";
                str += "\r\n";
                Static.run.BuildTxtFile("Passwords " + id, password.getService(Static.return_encoded) + " " + password.getID(), ".txt", str);
                str = "";
            }
            JOptionPane.showMessageDialog(null, "PASSWORD PRINTED AS \"Passwords " + id + "\"" + ".");
            System.out.println("PASSWORD PRINTED AS \"Passwords " + id + "\"" + ".");
        } else {
            System.out.println("No password selected");
        }
    }//GEN-LAST:event_PrintSelectedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Help;
    private javax.swing.JButton PrintAllInASingleTxtFile;
    private javax.swing.JButton PrintSelected;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Logic.Passwordv2> j_list;
    private javax.swing.JLabel label1;
    private javax.swing.JButton printOnTheirOwnTxtFile;
    // End of variables declaration//GEN-END:variables
}
