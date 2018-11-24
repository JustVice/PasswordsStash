package UI;

import Logic.StaticOld;
import Logic.Passwordv2;
import LogicV2.Static;

public class CreateNewP extends javax.swing.JFrame {

    public CreateNewP() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle(Static.title + " " + Static.version);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        servicetxt = new javax.swing.JTextField();
        mailtxt = new javax.swing.JTextField();
        usertxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        favCombo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesPanel = new javax.swing.JTextArea();
        helpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Service --");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mail -----");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User ----");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Notes");

        servicetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                servicetxtKeyTyped(evt);
            }
        });

        mailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mailtxtKeyTyped(evt);
            }
        });

        usertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usertxtKeyTyped(evt);
            }
        });

        create.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create.setText("CREATE");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setText("BACK");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        jLabel7.setText("*optional");

        favCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        favCombo.setText("Add to favorites");

        notesPanel.setColumns(20);
        notesPanel.setRows(5);
        jScrollPane1.setViewportView(notesPanel);

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(helpButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(passwordtxt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(servicetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                                    .addComponent(mailtxt)
                                    .addComponent(usertxt)))))
                    .addComponent(favCombo))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(servicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(favCombo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpButton)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancel))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notAllowedChar(char c) {
        Static.run.message("It's not allowed to type " + c + " at this field.\nIf you need to save an information with this character you can on Description field.", "Not allowed char.", 0);
    }

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        StaticOld.admin.openStart();
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void servicetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_servicetxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            notAllowedChar(c);
        }
    }//GEN-LAST:event_servicetxtKeyTyped

    private void mailtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailtxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            notAllowedChar(c);
        }
    }//GEN-LAST:event_mailtxtKeyTyped

    private void usertxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            notAllowedChar(c);
        }
    }//GEN-LAST:event_usertxtKeyTyped

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        if (verify()) {
            boolean fav = false;
            if (favCombo.isSelected()) {
                fav = true;
            }
            Static.data.getUserData().getPasswordsList().add(new Passwordv2(servicetxt.getText().toUpperCase(), usertxt.getText(), mailtxt.getText(), passwordtxt.getText(), notesPanel.getText(), fav));
            Static.data.updateInfo();
            cleanFields();
        } else {
            Static.run.message("YOU HAVE TO PROVIDE THE NAME OF THE SERVICE, PASSWORD AND EITHER USER OR EMAIL INFORMATION TO CREATE A PASSWORD INFO.", "Missing info", 2);
        }
    }//GEN-LAST:event_createActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        Static.run.message(
                "Service: Service carrier associated to the password, example: Facebook or fb (refering Facebook).\n"
                + "Mail: Field to type your mail. You can type it as \"null\" if you know your mail and want to keep it hidden.\n"
                        + "User: Field to type you user. Example: \"anon01\" if it is your Twitter username."
                        + "Password: Field to type the password. Keep in mind that it will be shown as you type it.\n"
                        + "Notes: Field to type notes. It can stash any other information whether you want to."
                , "Help"
                , 1);
    }//GEN-LAST:event_helpButtonActionPerformed

    /**
     * Makes sure that you provide all the neccesary information to make a new
     * password
     */
    private boolean verify() {
        if (servicetxt.getText().equals("") || passwordtxt.getText().equals("")) {
            return false;
        } else if (usertxt.getText().equals("") && mailtxt.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Clean all that the user typed and did in the frame.
     */
    private void cleanFields() {
        servicetxt.setText("");
        mailtxt.setText("");
        usertxt.setText("");
        passwordtxt.setText("");
        notesPanel.setText("");
        favCombo.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton create;
    private javax.swing.JRadioButton favCombo;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mailtxt;
    private javax.swing.JTextArea notesPanel;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTextField servicetxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
