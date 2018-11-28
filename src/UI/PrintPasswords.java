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
//        j_list.setModel(Static.run.setModelAndGet());
        PrintSelected.setEnabled(false);
        this.setTitle(Static.title + " " + Static.version);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        PrintAll = new javax.swing.JButton();
        PrintSelected = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_list = new javax.swing.JList<>();
        printOnTheirOwnTxtFile = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, 80, 100));

        PrintAll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PrintAll.setText("Print all passwords in a single txt file");
        PrintAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintAllActionPerformed(evt);
            }
        });
        getContentPane().add(PrintAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 340, -1));

        PrintSelected.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PrintSelected.setText("Print selected items");
        PrintSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintSelectedMouseClicked(evt);
            }
        });
        getContentPane().add(PrintSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 220, -1));

        label1.setText("CTRL + click on the items to select multiple password");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        j_list.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        j_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j_list);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 670, 248));

        printOnTheirOwnTxtFile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        printOnTheirOwnTxtFile.setText("PRINT EVERY PASSWORD ON HIS OWN TXT FILE");
        printOnTheirOwnTxtFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printOnTheirOwnTxtFileMouseClicked(evt);
            }
        });
        getContentPane().add(printOnTheirOwnTxtFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jButton1.setText("Help");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        StaticOld.admin.openStart();
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void PrintSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintSelectedMouseClicked
        if (!Static.data.getUserData().getPasswordsList().isEmpty()) {
            System.out.println("hello");
            int id = (int) (Math.random() * 10000);
            Passwordv2 password = j_list.getSelectedValue();
            Static.run.BuildTxtFile("here", password.getService() + " " + password.getID(), ".txt", password.getObjectForSeePasswords());
            JOptionPane.showMessageDialog(null, "PASSWORD PRINTED AS \"Passwords " + id + "\"" + ".");
        } else {
            System.out.println("No password selected");
        }
    }//GEN-LAST:event_PrintSelectedMouseClicked

    private void printOnTheirOwnTxtFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printOnTheirOwnTxtFileMouseClicked
        if (!Static.data.getUserData().getPasswordsList().isEmpty()) {
            String path = "Passwords " + (int) (Math.random() * 10000);
            File file = new File(path);
            file.mkdir();
            for (Passwordv2 pass : Static.data.getUserData().getPasswordsList()) {
                Static.run.BuildTxtFile(path, pass.getService() + " " + pass.getID(), ".txt", pass.getObjectForSeePasswords());
            }
            JOptionPane.showMessageDialog(null, "PASSWORD(S) PRINTED.");
        } else {
            Static.run.message("There are no passwords yet.", "No passwords", 2);
        }
    }//GEN-LAST:event_printOnTheirOwnTxtFileMouseClicked

    private void j_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_listMouseClicked
        if (!j_list.isSelectionEmpty()) {
            PrintSelected.setEnabled(true);
        }
    }//GEN-LAST:event_j_listMouseClicked

    private void PrintAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintAllActionPerformed
        if (!Static.data.getUserData().getPasswordsList().isEmpty()) {
            int id = (int) (Math.random() * 10000);
            Static.run.printAllPasswords(id);
            JOptionPane.showMessageDialog(null, "PASSWORD(S) PRINTED AS \"Passwords " + id + "\"" + ".");
        } else {
            Static.run.message("There are no passwords yet.", "No passwords", 2);
        }
    }//GEN-LAST:event_PrintAllActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Static.run.message("This buttons will create txt files IN THE SAME FOLDER\nwhere the program is located.", "Print Passwords", 3);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton PrintAll;
    private javax.swing.JButton PrintSelected;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Logic.Passwordv2> j_list;
    private javax.swing.JLabel label1;
    private javax.swing.JButton printOnTheirOwnTxtFile;
    // End of variables declaration//GEN-END:variables
}
