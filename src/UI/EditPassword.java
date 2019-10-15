package UI;

import LogicV3.Memory;
import LogicV3.Passwordv3;
import LogicV3.Run;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class EditPassword extends javax.swing.JFrame {

    private DefaultListModel<Passwordv3> PASSWORDS_MODEL
            = new DefaultListModel<>();
    private Passwordv3 SELECTED_PASSWORD_TO_EDIT;

    public EditPassword() {
        initComponents();
        setLocationRelativeTo(null);
        settings();
    }

    private void settings() {
        SET_DEFAULT_JLIST_PASSWORDS();
        UI_SETTINGS();
    }

    private void SET_DEFAULT_JLIST_PASSWORDS() {
        this.PASSWORDS_MODEL.clear();
        for (Passwordv3 p : Memory.passwordsV3LinkedList) {
            if (p.getInTrashCan().equals("0")) {
            this.PASSWORDS_MODEL.add(0, p);}
        }
        this.jList_passwrods.setModel(this.PASSWORDS_MODEL);
    }

    private void UI_SETTINGS() {
        this.setTitle(Memory.title + " " + Memory.version);
        jTextPanel_notesTxt.setLineWrap(true);
        jTextPanel_notesTxt.setCaretPosition(0);
        jTextPanel_notesTxt.setWrapStyleWord(true);
        this.setResizable(false);
        setIconImage(Memory.getIconImage());
        TOGGLE_TEXT_FIELDS_AND_COMBOBOX_AND_UPDATE_BUTTON_ENABLE_OR_DISABLED(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList_passwrods = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jComboBoxfavRadio = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton_UPDATEPASSWORD = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPanel_notesTxt = new javax.swing.JTextArea();
        jTextField_passwordtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_servicetxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_mailtxt = new javax.swing.JTextField();
        jTextField_usertxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList_passwrods.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jList_passwrods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_passwrodsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList_passwrods);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Service");

        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setText("BACK");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        jComboBoxfavRadio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxfavRadio.setText("Favorite");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Edit passwords");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User");

        jButton_UPDATEPASSWORD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_UPDATEPASSWORD.setText("UPDATE PASSWORD");
        jButton_UPDATEPASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATEPASSWORDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mail");

        jTextPanel_notesTxt.setColumns(20);
        jTextPanel_notesTxt.setRows(5);
        jScrollPane2.setViewportView(jTextPanel_notesTxt);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        jTextField_servicetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_servicetxtKeyTyped(evt);
            }
        });

        jLabel7.setText("*optional");

        jTextField_mailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_mailtxtKeyTyped(evt);
            }
        });

        jTextField_usertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_usertxtKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Notes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(15, 15, 15)
                                .addComponent(jTextField_servicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(19, 19, 19)
                                .addComponent(jTextField_mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(15, 15, 15)
                                .addComponent(jTextField_usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(16, 16, 16)
                                .addComponent(jTextField_passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxfavRadio))
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancel)
                        .addGap(29, 29, 29)
                        .addComponent(jButton_UPDATEPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_servicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jComboBoxfavRadio))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_UPDATEPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        Memory.run.openStart();
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void jList_passwrodsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_passwrodsMouseClicked
        SELECTED_PASSWORD_TO_EDIT = jList_passwrods.getSelectedValue();
        if (SELECTED_PASSWORD_TO_EDIT != null) {
            SET_SELECTED_PASSWORD_PARAMETERS_INTO_FIELDS_AND_COMBOBOX();
            TOGGLE_TEXT_FIELDS_AND_COMBOBOX_AND_UPDATE_BUTTON_ENABLE_OR_DISABLED(true);
        } else {
            TOGGLE_TEXT_FIELDS_AND_COMBOBOX_AND_UPDATE_BUTTON_ENABLE_OR_DISABLED(false);
            CLEAR_TEXT_FIELDS_AND_COMBOBOX();
        }
    }//GEN-LAST:event_jList_passwrodsMouseClicked

    private void SET_SELECTED_PASSWORD_PARAMETERS_INTO_FIELDS_AND_COMBOBOX() {
        jTextField_servicetxt.setText(SELECTED_PASSWORD_TO_EDIT.getService_LEGIBLE());
        jTextField_mailtxt.setText(SELECTED_PASSWORD_TO_EDIT.getEmail_LEGIBLE());
        jTextField_usertxt.setText(SELECTED_PASSWORD_TO_EDIT.getUser_LEGIBLE());
        jTextField_passwordtxt.setText(SELECTED_PASSWORD_TO_EDIT.getPassword_LEGIBLE());
        jTextPanel_notesTxt.setText(SELECTED_PASSWORD_TO_EDIT.getNotes_LEGIBLE());

        if (SELECTED_PASSWORD_TO_EDIT.getFavorite_LEGIBLE().equals("1")) {
            jComboBoxfavRadio.setSelected(true);
        } else {
            jComboBoxfavRadio.setSelected(false);
        }
    }

    private void jTextField_servicetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_servicetxtKeyTyped
        char c = evt.getKeyChar();
        if (NOT_ALLOWED_CHARACTER_TYPED(c)) {
            evt.consume();
            NOT_ALLOWED_CHARACTER_MESSAGE(c);
        }
        if (c == KeyEvent.VK_ENTER) {
            UPDATE_PASSWORD();
        }
    }//GEN-LAST:event_jTextField_servicetxtKeyTyped

    private void jTextField_mailtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_mailtxtKeyTyped
        char c = evt.getKeyChar();
        if (NOT_ALLOWED_CHARACTER_TYPED(c)) {
            evt.consume();
            NOT_ALLOWED_CHARACTER_MESSAGE(c);
        }
        if (c == KeyEvent.VK_ENTER) {
            UPDATE_PASSWORD();
        }
    }//GEN-LAST:event_jTextField_mailtxtKeyTyped

    private void jTextField_usertxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_usertxtKeyTyped
        char c = evt.getKeyChar();
        if (NOT_ALLOWED_CHARACTER_TYPED(c)) {
            evt.consume();
            NOT_ALLOWED_CHARACTER_MESSAGE(c);
        }
        if (c == KeyEvent.VK_ENTER) {
            UPDATE_PASSWORD();
        }
    }//GEN-LAST:event_jTextField_usertxtKeyTyped

    private void NOT_ALLOWED_CHARACTER_MESSAGE(char c) {
        JOptionPane.showMessageDialog(null, "It's not allowed to type " + c + " at this field.\n"
                + "If you need to save an information with this character you can on Description field.");
    }

    private boolean NOT_ALLOWED_CHARACTER_TYPED(char c) {
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            return true;
        } else {
            return false;
        }
    }

    private void jButton_UPDATEPASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATEPASSWORDActionPerformed
        if (this.SELECTED_PASSWORD_TO_EDIT != null) {
            UPDATE_PASSWORD();
            UPDATE_PASSWORD_UI_CHANGES_AND_MESSAGES(this.SELECTED_PASSWORD_TO_EDIT);
        }
    }//GEN-LAST:event_jButton_UPDATEPASSWORDActionPerformed

    private void UPDATE_PASSWORD() {
        Passwordv3 UPDATED_PASSWORD = BUILD_UPDATED_PASSWORD(this.SELECTED_PASSWORD_TO_EDIT);
        UPDATE_PASSWORD_IN_PROGRAM_MEMORY(UPDATED_PASSWORD);
        UPDATE_PASSWORD_IN_DATABASE(UPDATED_PASSWORD);
        SET_DEFAULT_JLIST_PASSWORDS();
    }

    private Passwordv3 BUILD_UPDATED_PASSWORD(Passwordv3 ORIGINAL_PASSWORD) {
        Passwordv3 UPDATED_PASSWORD = new Passwordv3();
        UPDATED_PASSWORD.setService_AUTO_ENCRYPTED_OR_NOT(jTextField_servicetxt.getText().toUpperCase());
        UPDATED_PASSWORD.setUser_AUTO_ENCRYPTED_OR_NOT(jTextField_usertxt.getText());
        UPDATED_PASSWORD.setEmail_AUTO_ENCRYPTED_OR_NOT(jTextField_mailtxt.getText());
        UPDATED_PASSWORD.setPassword_AUTO_ENCRYPTED_OR_NOT(jTextField_passwordtxt.getText());
        UPDATED_PASSWORD.setNotes_AUTO_ENCRYPTED_OR_NOT(jTextPanel_notesTxt.getText());
        UPDATED_PASSWORD.setID(ORIGINAL_PASSWORD.getID());
        UPDATED_PASSWORD.setFavorite_AUTO_ENCRYPTED_OR_NOT(UPDATE_PASSWORD_RETURN_1_TOFAV_0_TONOTFAV());
        return UPDATED_PASSWORD;
    }

    private String UPDATE_PASSWORD_RETURN_1_TOFAV_0_TONOTFAV() {
        if (this.jComboBoxfavRadio.isSelected()) {
            return "1";
        } else {
            return "0";
        }
    }

    private void UPDATE_PASSWORD_IN_PROGRAM_MEMORY(Passwordv3 password_updated) {
        for (int i = 0; i < Memory.passwordsV3LinkedList.size(); i++) {
            if (Memory.passwordsV3LinkedList.get(i).getID().equals(password_updated.getID())) {
                Memory.passwordsV3LinkedList.set(i, password_updated);
                System.out.println("Password on memory updated.");
                break;
            }
        }
    }

    private void UPDATE_PASSWORD_IN_DATABASE(Passwordv3 password_updated) {
        String query = "UPDATE PASSS\n"
                + "SET Service = '" + password_updated.getService()+ "'"
                + ", User = '" + password_updated.getUser() + "'"
                + ", Mail = '" + password_updated.getEmail() + "'"
                + ", Password = '" + password_updated.getPassword() + "'"
                + ", Notes = '" + password_updated.getNotes() + "'"
                + ", Favorite = '" + password_updated.getFavorite() + "'"
                + "WHERE ID = " + password_updated.getID() + ";";
        Memory.sqlite.Query(query, "Password on database updated");
    }

    private void UPDATE_PASSWORD_UI_CHANGES_AND_MESSAGES(Passwordv3 temporalPassword) {
        CLEAR_TEXT_FIELDS_AND_COMBOBOX();
        TOGGLE_TEXT_FIELDS_AND_COMBOBOX_AND_UPDATE_BUTTON_ENABLE_OR_DISABLED(false);
        String message = "Password " + temporalPassword.getService_LEGIBLE() + " updated.";
        Run.message(message, "Password updated", 1);
    }

    private void CLEAR_TEXT_FIELDS_AND_COMBOBOX() {
        jTextField_servicetxt.setText("");
        jTextField_mailtxt.setText("");
        jTextField_usertxt.setText("");
        jTextField_passwordtxt.setText("");
        jTextPanel_notesTxt.setText("");
        jComboBoxfavRadio.setSelected(false);
    }

    private void TOGGLE_TEXT_FIELDS_AND_COMBOBOX_AND_UPDATE_BUTTON_ENABLE_OR_DISABLED(boolean STATUS) {
        jTextField_servicetxt.setEnabled(STATUS);
        jTextField_mailtxt.setEnabled(STATUS);
        jTextField_usertxt.setEnabled(STATUS);
        jTextField_passwordtxt.setEnabled(STATUS);
        jTextPanel_notesTxt.setEnabled(STATUS);
        jComboBoxfavRadio.setEnabled(STATUS);
        jButton_UPDATEPASSWORD.setEnabled(STATUS);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton_UPDATEPASSWORD;
    private javax.swing.JRadioButton jComboBoxfavRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<LogicV3.Passwordv3> jList_passwrods;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_mailtxt;
    private javax.swing.JTextField jTextField_passwordtxt;
    private javax.swing.JTextField jTextField_servicetxt;
    private javax.swing.JTextField jTextField_usertxt;
    private javax.swing.JTextArea jTextPanel_notesTxt;
    // End of variables declaration//GEN-END:variables

}
