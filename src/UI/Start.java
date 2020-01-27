package UI;

import Logic.FrameMessageThreadClass;
import LogicV3.Memory;
import LogicV2.TextKeeper;
import LogicV2.UserData;
import LogicV3.Run;
import javax.swing.JOptionPane;

public class Start extends javax.swing.JFrame {

    public Start() {
        initComponents();
        UI_SETTINGS();
        DISPLAY_FRAME();
    }

    private void DISPLAY_FRAME() {
        setIconImage(Memory.getIconImage());
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    private void UI_SETTINGS() {
        this.setTitle(Memory.title + " " + Memory.version);
        UI_SETTINGS_BUTTONS_AND_LABEL();
        UI_SETTINGS_MASTER_PASSWORD_BUTTON();
    }

    private void UI_SETTINGS_BUTTONS_AND_LABEL() {
        if (!Memory.passwordsV3LinkedList.isEmpty()) {
            totalPw.setText("There is/are a total of " + Memory.passwordsV3LinkedList.size() + " password/s recorded.");
        } else {
            totalPw.setText("There are no passwords registered.");
            seePasswords.setEnabled(false);
            DeletePasswords.setEnabled(false);
            EDITPasswords.setEnabled(false);
            printPasswords.setEnabled(false);
            DELETEALLDATA.setEnabled(false);
        }
    }

    private void UI_SETTINGS_MASTER_PASSWORD_BUTTON() {
        if (Memory.userDataV3.getMasterPassword().equals("null")) {
            MASTER_PASSWORD_BUTTON.setText("ENABLE MASTER PASSWORD");
        } else {
            MASTER_PASSWORD_BUTTON.setText("Edit Master Password");
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
        MASTER_PASSWORD_BUTTON = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PASSWORDS STASH");

        createNew.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        createNew.setText("CREATE NEW PASSWORD");
        createNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewActionPerformed(evt);
            }
        });

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

        DeletePasswords.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DeletePasswords.setText("DELETE PASSWORDS");
        DeletePasswords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePasswordsActionPerformed(evt);
            }
        });

        EDITPasswords.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EDITPasswords.setText("EDIT PASSWORDS");
        EDITPasswords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EDITPasswordsMouseClicked(evt);
            }
        });
        EDITPasswords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITPasswordsActionPerformed(evt);
            }
        });

        printPasswords.setText("Print passwords");
        printPasswords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printPasswordsActionPerformed(evt);
            }
        });

        totalPw.setText("Total passwords label");

        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        changeLog.setText("Change log");
        changeLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeLogMouseClicked(evt);
            }
        });

        howToUse.setText("HOW TO USE / README");
        howToUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howToUseActionPerformed(evt);
            }
        });

        DELETEALLDATA.setText("DELETE ALL DATA");
        DELETEALLDATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEALLDATAActionPerformed(evt);
            }
        });

        MASTER_PASSWORD_BUTTON.setText("MASTER PASSWORD");
        MASTER_PASSWORD_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASTER_PASSWORD_BUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(totalPw))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(createNew))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(seePasswords, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(EDITPasswords, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(DeletePasswords, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(printPasswords, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(changeLog, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(howToUse, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(MASTER_PASSWORD_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(aboutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(DELETEALLDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(totalPw)
                .addGap(14, 14, 14)
                .addComponent(createNew)
                .addGap(18, 18, 18)
                .addComponent(seePasswords)
                .addGap(18, 18, 18)
                .addComponent(EDITPasswords)
                .addGap(18, 18, 18)
                .addComponent(DeletePasswords)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(printPasswords)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeLog)
                    .addComponent(howToUse))
                .addGap(6, 6, 6)
                .addComponent(MASTER_PASSWORD_BUTTON)
                .addGap(6, 6, 6)
                .addComponent(aboutButton)
                .addGap(7, 7, 7)
                .addComponent(DELETEALLDATA))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seePasswordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seePasswordsMouseClicked

        Memory.run.openSeeP();
        this.dispose();

    }//GEN-LAST:event_seePasswordsMouseClicked

    private void EDITPasswordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDITPasswordsMouseClicked
        if (!Memory.data.getUserData().getPasswordsList().isEmpty()) {
            Memory.run.openEdit();
            this.dispose();
        }
    }//GEN-LAST:event_EDITPasswordsMouseClicked

    private void changeLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeLogMouseClicked
        TextKeeper textKeeper = new TextKeeper();
        String changeLog = textKeeper.getChangelog();
        System.out.println(changeLog);
        Memory.run.message(changeLog, "ChangeLog", 1);
    }//GEN-LAST:event_changeLogMouseClicked

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        Memory.run.openAbout();
        this.dispose();
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void seePasswordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seePasswordsMouseEntered
        //You are not supposed to be reading this.
//        System.out.println("?");
        int n = (int) (Math.random() * 100000);
        if (n < 1100) {
            System.out.println("???");
            Inki inki = new Inki();
        }
    }//GEN-LAST:event_seePasswordsMouseEntered

    private void howToUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howToUseActionPerformed
        Memory.run.openUseGuideLines();
        this.dispose();
    }//GEN-LAST:event_howToUseActionPerformed

    private void DELETEALLDATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEALLDATAActionPerformed
//        String option = JOptionPane.showInputDialog(null, "Type \"delete\" and accept to confirm all data deletion.", "Delete all data", 2);
//        if (option != null) {
//            option = option.toLowerCase();
//            if (option.equals("delete")) {
//                Memory.data.setUserData(new UserData());
//                Memory.data.getUserData().setFirstRun(false);
//                Memory.data.updateInfo();
//                Memory.run.openStart();
//                this.dispose();
//            } else {
//                FrameMessageThreadClass threadClass = new FrameMessageThreadClass(800, (byte) 4);
//                threadClass.start();
//            }
//            if (option.toLowerCase().equals("inki")) {
//                Inki inki = new Inki();
//            }
//        } else {
//            FrameMessageThreadClass threadClass = new FrameMessageThreadClass(800, (byte) 4);
//            threadClass.start();
//        }
    }//GEN-LAST:event_DELETEALLDATAActionPerformed

    private void MASTER_PASSWORD_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASTER_PASSWORD_BUTTONActionPerformed
        if (Memory.data.getUserData().getMp().equals("null")) {
            Memory.run.openMasterPasswordSet();
            this.dispose();
        } else {
            Memory.run.openEditMasterPassword();
            this.dispose();
        }
    }//GEN-LAST:event_MASTER_PASSWORD_BUTTONActionPerformed

    private void createNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewActionPerformed
        CreateNewP createNewP = new CreateNewP();
        this.dispose();
    }//GEN-LAST:event_createNewActionPerformed

    private void EDITPasswordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITPasswordsActionPerformed
        Run.openEdit();
        this.dispose();
    }//GEN-LAST:event_EDITPasswordsActionPerformed

    private void DeletePasswordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePasswordsActionPerformed
        Run.openDelete();
        dispose();
    }//GEN-LAST:event_DeletePasswordsActionPerformed

    private void printPasswordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printPasswordsActionPerformed
//        if (!Memory.data.getUserData().getPasswordsList().isEmpty()) {
            Memory.run.openPrintPasswords();
            this.dispose();
//        }
    }//GEN-LAST:event_printPasswordsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETEALLDATA;
    private javax.swing.JButton DeletePasswords;
    private javax.swing.JButton EDITPasswords;
    private javax.swing.JButton MASTER_PASSWORD_BUTTON;
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
