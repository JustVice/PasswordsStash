package UI.MasterPassword;

import LogicV3.Memory;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class MPSettings extends javax.swing.JFrame {

    public MPSettings() {
        setIconImage(Memory.getIconImage());
        initComponents();
        settings();
    }

    private void settings() {
        this.setTitle(Memory.title + " " + Memory.version);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        labelmps_status_set("", "black");
        jTextField1_new_mp.setEnabled(false);
        jTextField1_repeat_new_mp.setEnabled(false);
        attempts_settings();
    }

    private void labelmps_status_set(String text, String color) {
        switch (color) {
            case "black":
                jLabel8_mps_status.setForeground(Color.black);
                break;
            case "red":
                jLabel8_mps_status.setForeground(Color.red);
                break;
            case "green":
                jLabel8_mps_status.setForeground(Color.green);
                break;
            default:
                throw new AssertionError();
        }
        jLabel8_mps_status.setText(text);
    }

    private void attempts_settings() {
        String mpa = Memory.data.getUserData().getMpa();
        if (!mpa.equals("null")) {
            jRadioButton1_change_mpa.setSelected(true);
            jSpinner1_attempts.setValue(Integer.parseInt(Memory.data.getUserData().getMpa()));
        } else {
            jRadioButton1_change_mpa.setSelected(false);
            jLabel8_attempts_label.setVisible(false);
            jSpinner1_attempts.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5_status = new javax.swing.JLabel();
        jButton1_enable_master_password = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1_curret_mp = new javax.swing.JTextField();
        jTextField1_repeat_new_mp = new javax.swing.JTextField();
        jTextField1_new_mp = new javax.swing.JTextField();
        jButton1_delete_master_password = new javax.swing.JButton();
        jButton1_save_changes = new javax.swing.JButton();
        jButton1_back = new javax.swing.JButton();
        jLabel8_mps_status = new javax.swing.JLabel();
        jRadioButton1_change_mpa = new javax.swing.JRadioButton();
        jLabel8_attempts_label = new javax.swing.JLabel();
        jSpinner1_attempts = new javax.swing.JSpinner();
        jRadioButton1_change_mp = new javax.swing.JRadioButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("The master password is a password you must type to launch the program.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Master Password: ");

        jLabel5_status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5_status.setText("STATUS");

        jButton1_enable_master_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_enable_master_password.setText("ENABLE MASTER PASSWORD");
        jButton1_enable_master_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_enable_master_passwordActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MASTER PASSWORD");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Edit Master Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Current master password: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Repeat new master pass:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("New master password:");

        jTextField1_curret_mp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1_curret_mp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1_curret_mpFocusLost(evt);
            }
        });
        jTextField1_curret_mp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_curret_mpKeyTyped(evt);
            }
        });

        jTextField1_repeat_new_mp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1_repeat_new_mp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1_repeat_new_mpFocusLost(evt);
            }
        });
        jTextField1_repeat_new_mp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_repeat_new_mpKeyTyped(evt);
            }
        });

        jTextField1_new_mp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1_new_mp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1_new_mpFocusLost(evt);
            }
        });
        jTextField1_new_mp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_new_mpKeyTyped(evt);
            }
        });

        jButton1_delete_master_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_delete_master_password.setText("DELETE MASTER PASSWORD");
        jButton1_delete_master_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_delete_master_passwordActionPerformed(evt);
            }
        });

        jButton1_save_changes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_save_changes.setText("SAVE CHANGES");
        jButton1_save_changes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_save_changesActionPerformed(evt);
            }
        });

        jButton1_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_back.setText("Back");
        jButton1_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_backActionPerformed(evt);
            }
        });

        jLabel8_mps_status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8_mps_status.setText("STATUS_MPSETTINGS");

        jRadioButton1_change_mpa.setText("Attempts");
        jRadioButton1_change_mpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_change_mpaActionPerformed(evt);
            }
        });

        jLabel8_attempts_label.setText("Data will be deleted after this number of attempts:");

        jSpinner1_attempts.setModel(new javax.swing.SpinnerNumberModel(3, 1, 9, 1));

        jRadioButton1_change_mp.setText("Change Master Password");
        jRadioButton1_change_mp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_change_mpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1_delete_master_password)
                            .addComponent(jRadioButton1_change_mp)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(11, 11, 11)
                                .addComponent(jTextField1_curret_mp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(41, 41, 41)
                                .addComponent(jTextField1_new_mp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1_change_mpa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8_attempts_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1_attempts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8_mps_status)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(22, 22, 22)
                                .addComponent(jTextField1_repeat_new_mp, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1_save_changes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1_back)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1))
                    .addComponent(jButton1_delete_master_password))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1_change_mp)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(jTextField1_curret_mp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addComponent(jTextField1_new_mp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1_repeat_new_mp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1_change_mpa)
                    .addComponent(jLabel8_attempts_label)
                    .addComponent(jSpinner1_attempts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8_mps_status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_save_changes)
                    .addComponent(jButton1_back))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_curret_mpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_curret_mpKeyTyped
        type_action(evt);
    }//GEN-LAST:event_jTextField1_curret_mpKeyTyped

    private void jTextField1_repeat_new_mpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_repeat_new_mpKeyTyped
        type_action_new_mp(evt);
    }//GEN-LAST:event_jTextField1_repeat_new_mpKeyTyped

    private void jTextField1_new_mpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_new_mpKeyTyped
        type_action_new_mp(evt);
    }//GEN-LAST:event_jTextField1_new_mpKeyTyped

    private void jButton1_enable_master_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_enable_master_passwordActionPerformed

    }//GEN-LAST:event_jButton1_enable_master_passwordActionPerformed

    private void jButton1_delete_master_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_delete_master_passwordActionPerformed
        labelmps_status_set("", "red");
        String c_mp = JOptionPane.showInputDialog("Type the current master password first");
        if (c_mp.equals(Memory.data.getUserData().getMp())) {
            int option = Memory.run.askMessage("Are you sure you want to disable the Master Password?", "Delete Master Password", 0, 3);
            if (option == 0) {
                Memory.data.getUserData().setMp("null");
                Memory.data.getUserData().setMpa("null");
                Memory.data.getUserData().setMpa_original("null");
                Memory.data.updateInfo();
                Memory.run.openStart();
                this.dispose();
            }
        } else {
            labelmps_status_set("Incorrect master password!", "red");
        }
    }//GEN-LAST:event_jButton1_delete_master_passwordActionPerformed

    private void jButton1_save_changesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_save_changesActionPerformed
        save_settings_to_do();
    }//GEN-LAST:event_jButton1_save_changesActionPerformed

    private void save_settings_to_do(){
        if (jTextField1_curret_mp.getText().equals("")) {
            labelmps_status_set("You must type the current Master Password to save changes!", "red");
//            Static.run.message("You must type the current Master Password to save changes!", "Enter Current Master Password", 2);
        } else {
            if (jTextField1_curret_mp.getText().equals(Memory.data.getUserData().getMp())) {
                if (jTextField1_new_mp.getText().equals(jTextField1_repeat_new_mp.getText())) {
                    //Static.data.getUserData().setMp(jTextField1_new_mp.getText());
                    if(jRadioButton1_change_mp.isSelected()){
                        Memory.data.getUserData().setMp(jTextField1_new_mp.getText());
                    }
                    if(jRadioButton1_change_mpa.isSelected()){
                        Memory.data.getUserData().setMpa(("" + ((int) jSpinner1_attempts.getValue())));
                        Memory.data.getUserData().setMpa_original(("" + ((int) jSpinner1_attempts.getValue())));
                    }else{
                        Memory.data.getUserData().setMpa("null");
                        Memory.data.getUserData().setMpa_original("null");
                    }
                    Memory.data.updateInfo();
                    Memory.run.openStart_and_show_message("MASTER PASSWORD EDITED");
                    this.dispose();
                    //System.out.println("save changes");
                } else {
                    labelmps_status_set("New password fields don't match!", "red");
                }
            } else {
                labelmps_status_set("Incorrect master password!", "red");
            }
        }
    }
    
    private void jButton1_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_backActionPerformed
        Memory.run.openStart();
        this.dispose();
    }//GEN-LAST:event_jButton1_backActionPerformed

    private void jTextField1_curret_mpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_curret_mpFocusLost
        if (!jTextField1_curret_mp.getText().equals(Memory.data.getUserData().getMp())) {
            labelmps_status_set("Incorrect master password!", "red");
        }
    }//GEN-LAST:event_jTextField1_curret_mpFocusLost

    private void jTextField1_new_mpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_new_mpFocusLost
        if (!jTextField1_new_mp.getText().equals("") && !jTextField1_repeat_new_mp.getText().equals("")) {

        } else {

        }
    }//GEN-LAST:event_jTextField1_new_mpFocusLost

    private void jTextField1_repeat_new_mpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_repeat_new_mpFocusLost
        if (!jTextField1_new_mp.getText().equals("") && !jTextField1_repeat_new_mp.getText().equals("")) {

        } else {

        }
    }//GEN-LAST:event_jTextField1_repeat_new_mpFocusLost

    private void jRadioButton1_change_mpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_change_mpaActionPerformed
        if (jRadioButton1_change_mpa.isSelected()) {
            jLabel8_attempts_label.setVisible(true);
            jSpinner1_attempts.setVisible(true);
        } else {
            jLabel8_attempts_label.setVisible(false);
            jSpinner1_attempts.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton1_change_mpaActionPerformed

    private void jRadioButton1_change_mpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_change_mpActionPerformed
        if (jRadioButton1_change_mp.isSelected()) {
            jTextField1_new_mp.setEnabled(true);
            jTextField1_repeat_new_mp.setEnabled(true);
        } else {
            jTextField1_new_mp.setEnabled(false);
            jTextField1_repeat_new_mp.setEnabled(false);
            jTextField1_new_mp.setText("");
            jTextField1_repeat_new_mp.setText("");
            labelmps_status_set("", "black");
        }
    }//GEN-LAST:event_jRadioButton1_change_mpActionPerformed

    private void type_action(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            save_settings_to_do();
        }
        if (jTextField1_curret_mp.getText().equals("nul")) {
            jTextField1_curret_mp.setText("");
        }
        if (jTextField1_new_mp.getText().equals("nul")) {
            jTextField1_new_mp.setText("");
        }
        if (jTextField1_repeat_new_mp.getText().equals("nul")) {
            jTextField1_repeat_new_mp.setText("");
        }
        labelmps_status_set("", "black");
    }

    private void type_action_new_mp(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            save_settings_to_do();
        }
        if (!jTextField1_new_mp.getText().equals("") || !jTextField1_repeat_new_mp.getText().equals("")) {

        } else {

        }
        labelmps_status_set("", "black");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_back;
    private javax.swing.JButton jButton1_delete_master_password;
    private javax.swing.JButton jButton1_enable_master_password;
    private javax.swing.JButton jButton1_save_changes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel5_status;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8_attempts_label;
    private javax.swing.JLabel jLabel8_mps_status;
    private javax.swing.JRadioButton jRadioButton1_change_mp;
    private javax.swing.JRadioButton jRadioButton1_change_mpa;
    private javax.swing.JSpinner jSpinner1_attempts;
    private javax.swing.JTextField jTextField1_curret_mp;
    private javax.swing.JTextField jTextField1_new_mp;
    private javax.swing.JTextField jTextField1_repeat_new_mp;
    // End of variables declaration//GEN-END:variables
}
