package UI;

import Logic.StaticOld;
import Logic.Passwordv2;
import LogicV2.Static;
import javax.swing.JOptionPane;

public class EditPassword extends javax.swing.JFrame {

    public EditPassword() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle(StaticOld.programTab + StaticOld.currentVersion);
        settings();
    }

    private void settings() {
        j_list.setModel(Static.run.setModelAndGet());
        notesTxt.setLineWrap(true);
        notesTxt.setCaretPosition(0);
        notesTxt.setWrapStyleWord(true);
    }

    private Passwordv2 tempPassword;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        j_list = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        UPDATEPASSWORD = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        passwordtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mailtxt = new javax.swing.JTextField();
        servicetxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notesTxt = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        favRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        j_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j_list);

        UPDATEPASSWORD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UPDATEPASSWORD.setText("UPDATE PASSWORD");
        UPDATEPASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEPASSWORDActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setText("BACK");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        usertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usertxtKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mail");

        mailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mailtxtKeyTyped(evt);
            }
        });

        servicetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                servicetxtKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Service");

        notesTxt.setColumns(20);
        notesTxt.setRows(5);
        jScrollPane2.setViewportView(notesTxt);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Notes");

        jLabel7.setText("*optional");

        favRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        favRadio.setText("Favorite");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(favRadio)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(316, 316, 316))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UPDATEPASSWORD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(357, 357, 357)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(passwordtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(servicetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mailtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addComponent(usertxt, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))))
                    .addContainerGap(439, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(favRadio)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UPDATEPASSWORD)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(servicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(106, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        Static.run.openStart();
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void j_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_listMouseClicked
        tempPassword = j_list.getSelectedValue();
        if (tempPassword != null) {
            setSelectedPasswordInfoToDo();
            comboControl(tempPassword);
        }
    }//GEN-LAST:event_j_listMouseClicked

    private void comboControl(Passwordv2 temp) {
        if (temp.isFavorite()) {
            favRadio.setSelected(true);
        } else {
            favRadio.setSelected(false);
        }
    }

    private void setSelectedPasswordInfoToDo() {
        servicetxt.setText(tempPassword.getService());
        mailtxt.setText(tempPassword.getMail());
        usertxt.setText(tempPassword.getUser());
        passwordtxt.setText(tempPassword.getPassword());
        notesTxt.setText(tempPassword.getNotes());
    }

    private void servicetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_servicetxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            JOptionPane.showMessageDialog(null, "It's not allowed to type " + c + " at this field.\nIf you need to save an information with this character you can on Description field.");
        }
    }//GEN-LAST:event_servicetxtKeyTyped

    private void mailtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailtxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            JOptionPane.showMessageDialog(null, "It's not allowed to type " + c + " at this field.\nIf you need to save an information with this character you can on Description field.");
        }
    }//GEN-LAST:event_mailtxtKeyTyped

    private void usertxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            JOptionPane.showMessageDialog(null, "It's not allowed to type " + c + " at this field.\nIf you need to save an information with this character you can on Description field.");
        }
    }//GEN-LAST:event_usertxtKeyTyped

    private void UPDATEPASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEPASSWORDActionPerformed
        if (tempPassword != null) {
            for (int i = 0; i < Static.data.getUserData().getPasswordsList().size(); i++) {
                if (Static.data.getUserData().getPasswordsList().get(i).getID() == tempPassword.getID()) {
                    int option = Static.run.askMessage("Are you sure that you want to update this " + Static.data.getUserData().getPasswordsList().get(i).getService() + " info?\nThis action cannot be undone.", "Change password info?", 0, 3);
                    if (option == 0) {

                        Passwordv2 passwordUpdate = new Passwordv2(servicetxt.getText(), usertxt.getText(), mailtxt.getText(), passwordtxt.getText(), notesTxt.getText(), giveFavOrNot());
                        Static.data.getUserData().getPasswordsList().set(i, passwordUpdate);
                        Static.data.updateInfo();
                        j_list.setModel(Static.run.setModelAndGet());
                    } else {
                        System.out.println("cancelled");
                    }
                    break;
                }
            }
        } else {
            System.out.println("User does not selected a password.");
        }
    }//GEN-LAST:event_UPDATEPASSWORDActionPerformed

    private boolean giveFavOrNot() {
        if (favRadio.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Fill all the textfields with the information of the password you have
     * selected
     */
    private void fillTextBoxes(Passwordv2 password) {
        servicetxt.setText(password.getService());
        passwordtxt.setText(password.getPassword());
        if (!password.getUser().equals("")) {
            usertxt.setText(password.getUser());
        } else {
            usertxt.setText("");
        }
        if (!password.getMail().equals("")) {
            mailtxt.setText(password.getMail());
        } else {
            mailtxt.setText("");
        }
        if (!password.getDescription().equals("")) {
            notesTxt.setText(password.getDescription());
        } else {
            notesTxt.setText("");
        }
    }

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
     * Clean all the Textboxes text
     */
    private void clean() {
        servicetxt.setText("");
        mailtxt.setText("");
        usertxt.setText("");
        passwordtxt.setText("");
        notesTxt.setText("");

    }

    /**
     * Makes sure that the user wants to update the current selected password.
     *
     * @return
     */
    private boolean UptadeYes(Passwordv2 password) {
        int option = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO UPDATE THIS " + password.getService() + " password? THIS CAN'T BE UNDONE", "DELETE", 0);
        if (option == 0) {
            return true;
            /*0 = yes*/
        } else {
            return false;
            /*1 = no*/
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UPDATEPASSWORD;
    private javax.swing.JButton cancel;
    private javax.swing.JRadioButton favRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Logic.Passwordv2> j_list;
    private javax.swing.JTextField mailtxt;
    private javax.swing.JTextArea notesTxt;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTextField servicetxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables

}
