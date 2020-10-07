package UI.MasterPassword;

import Logic.Memory;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class SetMP extends javax.swing.JFrame implements Runnable {

    public SetMP() {
        setIconImage(Memory.getIconImage());
        initComponents();
        settings();
    }

    @Override
    public void run() {
    }

    private void ENABLE() {
        String m1 = jTextField1_master1.getText();
        String m2 = jTextField2_master2.getText();
        if (!m1.equals("") && !m2.equals("")) {
            if (m1.equals(m2)) {
                if (!jTextField1_master1.getText().equals("null")) {
                    PROCEED_MP();
                    PROCEED_MPA();
                    Memory.data.updateInfo();
                    //Memory.tasks.openStart_and_show_message("MASTER PASSWORD SAVED!");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "The world \"null\" is not allowed as a Master Password.", "NOT ALLOWED WORD", 0);
                }
            } else {
                this.label_status_set("Passwords do not match", "red");
            }
        } else {
            this.label_status_set("There are/is a empty field/s", "red");
        }
    }

    private void PROCEED_MP() {
        Memory.data.getUserData().setMp(jTextField1_master1.getText());
    }

    private void PROCEED_MPA() {
        if (jRadioButton1_limit_attempts.isSelected()) {
            Memory.data.getUserData().setMpa(("" + ((int) jSpinner1.getValue())));
            Memory.data.getUserData().setMpa_original(("" + ((int) jSpinner1.getValue())));
        } else {
            Memory.data.getUserData().setMpa("null");
            Memory.data.getUserData().setMpa_original("null");
        }
    }

    private void settings() {
        this.setTitle(Memory.title + " " + Memory.version);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        label_status_set("", "black");
        jRadioButton1_limit_attempts.setSelected(false);
        jLabel5_attempts.setVisible(false);
        jSpinner1.setVisible(false);
    }

    private void label_status_set(String text, String color) {
        switch (color) {
            case "black":
                jLabel5_status.setForeground(Color.black);
                break;
            case "red":
                jLabel5_status.setForeground(Color.red);
                break;
            case "green":
                jLabel5_status.setForeground(Color.green);
                break;
            default:
                throw new AssertionError();
        }
        jLabel5_status.setText(text);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1_master1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2_master2 = new javax.swing.JTextField();
        jLabel5_status = new javax.swing.JLabel();
        jButton1_enable_master_password = new javax.swing.JButton();
        jRadioButton1_limit_attempts = new javax.swing.JRadioButton();
        jLabel5_attempts = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MASTER PASSWORD");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("The master password is a password you must type to launch the program.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Master Password: ");

        jTextField1_master1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1_master1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_master1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Retype Master Pass:");

        jTextField2_master2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2_master2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_master2KeyTyped(evt);
            }
        });

        jLabel5_status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5_status.setText("STATUS");

        jButton1_enable_master_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_enable_master_password.setText("ENABLE MASTER PASSWORD");
        jButton1_enable_master_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_enable_master_passwordActionPerformed(evt);
            }
        });

        jRadioButton1_limit_attempts.setText("Attempts");
        jRadioButton1_limit_attempts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_limit_attemptsActionPerformed(evt);
            }
        });

        jLabel5_attempts.setText("Data will be deleted after this number of attempts:");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jButton1_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_back.setText("Back");
        jButton1_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_backActionPerformed(evt);
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
                        .addComponent(jButton1_enable_master_password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1_back))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5_status)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1_master1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(jTextField2_master2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1_limit_attempts)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5_attempts)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1_master1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2_master2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1_limit_attempts)
                    .addComponent(jLabel5_attempts)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jLabel5_status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_enable_master_password)
                    .addComponent(jButton1_back))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_master1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_master1KeyTyped
        label_status_set("", "black");
        type_action(evt);
    }//GEN-LAST:event_jTextField1_master1KeyTyped

    private void jButton1_enable_master_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_enable_master_passwordActionPerformed
        ENABLE();
    }//GEN-LAST:event_jButton1_enable_master_passwordActionPerformed

    private void jTextField2_master2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_master2KeyTyped
        label_status_set("", "black");
        type_action(evt);
    }//GEN-LAST:event_jTextField2_master2KeyTyped

    private void jRadioButton1_limit_attemptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_limit_attemptsActionPerformed
        label_status_set("", "black");
        if (jRadioButton1_limit_attempts.isSelected()) {
            jLabel5_attempts.setVisible(true);
            jSpinner1.setVisible(true);
            jSpinner1.setValue(3);
        } else {
            jLabel5_attempts.setVisible(false);
            jSpinner1.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton1_limit_attemptsActionPerformed

    private void jButton1_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_backActionPerformed
        //Memory.tasks.openStart();
        this.dispose();
    }//GEN-LAST:event_jButton1_backActionPerformed

    private void type_action(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            ENABLE();
        }
        if (jTextField1_master1.getText().equals("nul")) {
            jTextField1_master1.setText("");
        }
        if (jTextField2_master2.getText().equals("nul")) {
            jTextField2_master2.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_back;
    private javax.swing.JButton jButton1_enable_master_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5_attempts;
    private javax.swing.JLabel jLabel5_status;
    private javax.swing.JRadioButton jRadioButton1_limit_attempts;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1_master1;
    private javax.swing.JTextField jTextField2_master2;
    // End of variables declaration//GEN-END:variables

}
