package UI;

import Logic.StaticOld;
import LogicV2.Static;
import LogicV2.TextKeeper;
import javax.swing.JOptionPane;

public class Start extends javax.swing.JFrame {

    public Start() {
        initComponents();
        setLocationRelativeTo(null);
        settings();
    }

    private void settings() {
        this.setTitle(Static.title + " " + Static.version);
        versionLabel.setText(Static.version);
        if (!Static.data.getUserData().getPasswordsList().isEmpty()) {
            totalPw.setText("There are a total of " + Static.data.getUserData().getPasswordsList().size() + " password(s) recorded.");
        } else {
            totalPw.setText("There are no passwords registered.");
            seePasswords.setEnabled(false);
            DeletePasswords.setEnabled(false);
            EDITPasswords.setEnabled(false);
            printPasswords.setEnabled(false);
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
        versionLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        printPasswords = new javax.swing.JButton();
        totalPw = new javax.swing.JLabel();
        aboutButton = new javax.swing.JButton();
        changeLog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PASSWORDS BY JV");

        createNew.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        createNew.setText("CREATE NEW PASSWORD");
        createNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createNewMouseClicked(evt);
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
        DeletePasswords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletePasswordsMouseClicked(evt);
            }
        });

        EDITPasswords.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EDITPasswords.setText("EDIT PASSWORDS");
        EDITPasswords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EDITPasswordsMouseClicked(evt);
            }
        });

        versionLabel.setText("version");

        printPasswords.setText("Print passwords");
        printPasswords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printPasswordsMouseClicked(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(versionLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(aboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(createNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(seePasswords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeletePasswords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EDITPasswords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(totalPw)))
                    .addComponent(printPasswords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(versionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalPw)
                .addGap(18, 18, 18)
                .addComponent(createNew)
                .addGap(18, 18, 18)
                .addComponent(seePasswords)
                .addGap(18, 18, 18)
                .addComponent(EDITPasswords)
                .addGap(18, 18, 18)
                .addComponent(DeletePasswords)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printPasswords)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aboutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        JOptionPane.showMessageDialog(null, changeLog);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletePasswords;
    private javax.swing.JButton EDITPasswords;
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton changeLog;
    private javax.swing.JButton createNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton printPasswords;
    private javax.swing.JButton seePasswords;
    private javax.swing.JLabel totalPw;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables
}
