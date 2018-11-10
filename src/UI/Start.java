package UI;

import Logic.Static;
import javax.swing.JOptionPane;

public class Start extends javax.swing.JFrame {

    public Start() {
        initComponents();
        setLocationRelativeTo(null);
        if (Static.pw_dir.isEmpty()) {
            totalPw.setText("There are no passwords registered.");
            buttonsAvaibles();
        } else {
            totalPw.setText("There are a total of " + Static.pw_dir.size() + " password(s) recorded.");
        }
        this.setTitle(Static.programTab + Static.currentVersion);
        versionLabel.setText(Static.currentVersion);
    }

    /**
     * Sets some of the buttons to administer passwords grey meaning that they
     * are not available to use.
     */
    private void buttonsAvaibles() {
        seePasswords.setEnabled(false);
        DeletePasswords.setEnabled(false);
        EDITPasswords.setEnabled(false);
        printPasswords.setEnabled(false);
    }

    /**
     * Returns true if there are no passwords, else false.
     *
     * @return
     */
    private boolean pw_dirEmpty() {
        return Static.pw_dir.isEmpty();
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
        jButton1 = new javax.swing.JButton();

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

        versionLabel.setText("v 1.6.0");

        printPasswords.setText("Print passwords");
        printPasswords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printPasswordsMouseClicked(evt);
            }
        });

        totalPw.setText("Total passwords label");

        aboutButton.setText("About");
        aboutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutButtonMouseClicked(evt);
            }
        });

        jButton1.setText("Change log");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(createNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(seePasswords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeletePasswords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EDITPasswords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1)
                                .addComponent(printPasswords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(totalPw)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(versionLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addComponent(DeletePasswords)
                .addGap(18, 18, 18)
                .addComponent(EDITPasswords)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printPasswords)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aboutButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNewMouseClicked
        Static.admin.openCreate();
        this.dispose();
    }//GEN-LAST:event_createNewMouseClicked

    private void seePasswordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seePasswordsMouseClicked
        if (!pw_dirEmpty()) {
            Static.admin.openSeeP();
            this.dispose();
        }
    }//GEN-LAST:event_seePasswordsMouseClicked

    private void DeletePasswordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletePasswordsMouseClicked
        if (!pw_dirEmpty()) {
            Static.admin.openDelete();
            this.dispose();
        }
    }//GEN-LAST:event_DeletePasswordsMouseClicked

    private void EDITPasswordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDITPasswordsMouseClicked
        if (!pw_dirEmpty()) {
            Static.admin.openEdit();
            this.dispose();
        }
    }//GEN-LAST:event_EDITPasswordsMouseClicked

    private void printPasswordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printPasswordsMouseClicked
        if (!pw_dirEmpty()) {
            Static.admin.openPrintPasswords();
            this.dispose();
        }
    }//GEN-LAST:event_printPasswordsMouseClicked

    private void aboutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutButtonMouseClicked
        JOptionPane.showMessageDialog(null, "NOT WORKING YET.");
    }//GEN-LAST:event_aboutButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       String changeLog = "-1.6.1\n" +
"Bug related to print passwords fixed.\n" +
"\n" +
"- 1.6.0\n" +
"Now you can add items to a favorite list,\n" +
"only at the \"See Passwords\" panel for now.\n" +
"\n" +
"- 1.5.2\n" +
"Added more features to print passwords.\n" +
"Change log button added at the start of the program.\n" +
"\"beta\" has been removed.\n" +
"Bug fixes at the moment of seek for a password.\n" +
"Added a list box to seek your passwords.\n" +
"\n" +
"- v 1.3\n" +
"Posibility to change variables at password class.\n" +
"Also, password class has renamed as password v2.\n" +
"\n" +
"- v 1.2.1:\n" +
"Posibility to print passwords in a txt file.\n" +
"\n" +
"- v 1.1.1:\n" +
"Bug related to password's ID fixed.\n" +
"\n" +
"- v 1.1: \n" +
"Added function to search services.\n" +
"Optimisation fixes.\n" +
"ID password issue optimised.";
       System.out.println(changeLog);
       JOptionPane.showMessageDialog(null, changeLog);
        
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletePasswords;
    private javax.swing.JButton EDITPasswords;
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton createNew;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton printPasswords;
    private javax.swing.JButton seePasswords;
    private javax.swing.JLabel totalPw;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables
}
