package UI;

import Logic.ItemCopied;
import Logic.StaticOld;
import Logic.ThreadClass;
import LogicV2.Static;
import LogicV2.TextKeeper;
import LogicV2.UserData;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Start extends javax.swing.JFrame {

    public Start() {
        initComponents();
        setLocationRelativeTo(null);
        settings();
        this.setResizable(false);
    }

    private void settings() {
        this.setTitle(Static.title + " " + Static.version);
        if (!Static.data.getUserData().getPasswordsList().isEmpty()) {
            totalPw.setText("There are a total of " + Static.data.getUserData().getPasswordsList().size() + " password(s) recorded.");
        } else {
            totalPw.setText("There are no passwords registered.");
            seePasswords.setEnabled(false);
            DeletePasswords.setEnabled(false);
            EDITPasswords.setEnabled(false);
            printPasswords.setEnabled(false);
            DELETEALLDATA.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        createNew = new javax.swing.JButton();
        seePasswords = new javax.swing.JButton();
        DeletePasswords = new javax.swing.JButton();
        EDITPasswords = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        printPasswords = new javax.swing.JButton();
        totalPw = new javax.swing.JLabel();
        aboutButton = new javax.swing.JButton();
        changeLog = new javax.swing.JButton();
        howToUse = new javax.swing.JButton();
        DELETEALLDATA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PASSWORDS STASH");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        createNew.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        createNew.setText("CREATE NEW PASSWORD");
        createNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createNewMouseClicked(evt);
            }
        });
        getContentPane().add(createNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, -1, -1));

        seePasswords.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        seePasswords.setText("SEE PASSWORDS");
        seePasswords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seePasswordsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seePasswordsMouseEntered(evt);
            }
        });
        getContentPane().add(seePasswords, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, 339, -1));

        DeletePasswords.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DeletePasswords.setText("DELETE PASSWORDS");
        DeletePasswords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletePasswordsMouseClicked(evt);
            }
        });
        getContentPane().add(DeletePasswords, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 243, 339, -1));

        EDITPasswords.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EDITPasswords.setText("EDIT PASSWORDS");
        EDITPasswords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EDITPasswordsMouseClicked(evt);
            }
        });
        getContentPane().add(EDITPasswords, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, 339, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 298, 339, 10));

        printPasswords.setText("Print passwords");
        printPasswords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printPasswordsMouseClicked(evt);
            }
        });
        getContentPane().add(printPasswords, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 339, -1));

        totalPw.setText("Total passwords label");
        getContentPane().add(totalPw, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(aboutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 339, -1));

        changeLog.setText("Change log");
        changeLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeLogMouseClicked(evt);
            }
        });
        getContentPane().add(changeLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 150, -1));

        howToUse.setText("HOW TO USE / README");
        howToUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howToUseActionPerformed(evt);
            }
        });
        getContentPane().add(howToUse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 180, -1));

        DELETEALLDATA.setText("DELETE ALL DATA");
        DELETEALLDATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEALLDATAActionPerformed(evt);
            }
        });
        getContentPane().add(DELETEALLDATA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 339, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNewMouseClicked
        Static.run.openCreate();
        this.dispose();
    }//GEN-LAST:event_createNewMouseClicked

    private void seePasswordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seePasswordsMouseClicked
        if (!Static.data.getUserData().getPasswordsList().isEmpty()) {
            Static.run.openSeeP();
            this.dispose();
        }
    }//GEN-LAST:event_seePasswordsMouseClicked

    private void DeletePasswordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletePasswordsMouseClicked
        if (!Static.data.getUserData().getPasswordsList().isEmpty()) {
            Static.run.openDelete();
            this.dispose();
        }
    }//GEN-LAST:event_DeletePasswordsMouseClicked

    private void EDITPasswordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDITPasswordsMouseClicked
        if (!Static.data.getUserData().getPasswordsList().isEmpty()) {
            Static.run.openEdit();
            this.dispose();
        }
    }//GEN-LAST:event_EDITPasswordsMouseClicked

    private void printPasswordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printPasswordsMouseClicked
        if (!Static.data.getUserData().getPasswordsList().isEmpty()) {
            Static.run.openPrintPasswords();
            this.dispose();
        }
    }//GEN-LAST:event_printPasswordsMouseClicked

    private void changeLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeLogMouseClicked
        TextKeeper textKeeper = new TextKeeper();
        String changeLog = textKeeper.getChangelog();
        System.out.println(changeLog);
        Static.run.message(changeLog, "ChangeLog", 1);
    }//GEN-LAST:event_changeLogMouseClicked

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        Static.run.openAbout();
        this.dispose();
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void seePasswordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seePasswordsMouseEntered
        //You are not supposed to be reading this.
        if (Static.easterEgg) {
            int n = (int) (Math.random() * 100000);
            if (n < 2000) {
                Inki inki = new Inki();
                Static.easterEgg = false;
            }
        }
    }//GEN-LAST:event_seePasswordsMouseEntered

    private void howToUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howToUseActionPerformed
        Static.run.openUseGuideLines();
        this.dispose();
    }//GEN-LAST:event_howToUseActionPerformed

    private void DELETEALLDATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEALLDATAActionPerformed
        String option = JOptionPane.showInputDialog(null, "Type \"Delete\" and accept to confirm all passwords deletion.", "Delete all data", 2);
        if (option != null) {
            option = option.toLowerCase();
            if (option.equals("delete")) {
                Static.data.setUserData(new UserData());
                Static.data.getUserData().setFirstRun(false);
                Static.data.updateInfo();
                Static.run.openStart();
                this.dispose();
            } else {
                ThreadClass threadClass = new ThreadClass(800, (byte) 4);
                threadClass.start();
            }
            if (option.toLowerCase().equals("inki")) {
                Inki inki = new Inki();
            }
        } else {
            ThreadClass threadClass = new ThreadClass(800, (byte) 4);
            threadClass.start();
        }
    }//GEN-LAST:event_DELETEALLDATAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETEALLDATA;
    private javax.swing.JButton DeletePasswords;
    private javax.swing.JButton EDITPasswords;
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton changeLog;
    private javax.swing.JButton createNew;
    private javax.swing.JButton howToUse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton printPasswords;
    private javax.swing.JButton seePasswords;
    private javax.swing.JLabel totalPw;
    // End of variables declaration//GEN-END:variables

}
