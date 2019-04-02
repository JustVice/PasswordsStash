package UI.MasterPassword;

import LogicV2.Static;
import java.awt.Color;
import javax.swing.JOptionPane;

public class MPSettings extends javax.swing.JFrame {

    public MPSettings() {
        setIconImage(Static.getIconImage());
        initComponents();
        settings();
    }

    private void settings() {
        this.setTitle(Static.title + " " + Static.version);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        label_status_set("", "black");
    }

    private void label_status_set(String text, String color) {
        switch (color) {
            case "black":
                jLabel5_status1.setForeground(Color.black);
                break;
            case "red":
                jLabel5_status1.setForeground(Color.red);
                break;
            case "green":
                jLabel5_status1.setForeground(Color.green);
                break;
            default:
                throw new AssertionError();
        }
        jLabel5_status.setText(text);
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
        jLabel5_status1 = new javax.swing.JLabel();
        jButton1_delete_master_password = new javax.swing.JButton();
        jButton1_save_changes = new javax.swing.JButton();
        jButton1_back = new javax.swing.JButton();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MASTER PASSWORD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Change master password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Current master password: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Repeat new master pass:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("New master password:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, -1));

        jTextField1_curret_mp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1_curret_mp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_curret_mpKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1_curret_mp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 230, -1));

        jTextField1_repeat_new_mp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1_repeat_new_mp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_repeat_new_mpKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1_repeat_new_mp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 229, -1));

        jTextField1_new_mp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1_new_mp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_new_mpKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1_new_mp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 230, -1));

        jLabel5_status1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5_status1.setText("STATUS");
        getContentPane().add(jLabel5_status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jButton1_delete_master_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_delete_master_password.setText("DELETE MASTER PASSWORD");
        jButton1_delete_master_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_delete_master_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_delete_master_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jButton1_save_changes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_save_changes.setText("SAVE CHANGES");
        jButton1_save_changes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_save_changesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_save_changes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jButton1_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_back.setText("Back");
        jButton1_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_backActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_curret_mpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_curret_mpKeyTyped

    }//GEN-LAST:event_jTextField1_curret_mpKeyTyped

    private void jTextField1_repeat_new_mpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_repeat_new_mpKeyTyped

    }//GEN-LAST:event_jTextField1_repeat_new_mpKeyTyped

    private void jTextField1_new_mpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_new_mpKeyTyped

    }//GEN-LAST:event_jTextField1_new_mpKeyTyped

    private void jButton1_enable_master_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_enable_master_passwordActionPerformed

    }//GEN-LAST:event_jButton1_enable_master_passwordActionPerformed

    private void jButton1_delete_master_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_delete_master_passwordActionPerformed
        String c_mp = JOptionPane.showInputDialog("Type the current master password first");
        if (c_mp.equals(Static.data.getUserData().getMp())) {
            int option = Static.run.askMessage("Are you sure you want to disable the Master Password?", "Delete Master Password", 0, 3);
            if (option == 0) {
                Static.data.getUserData().setMp("null");
                Static.data.getUserData().setMpa("null");
                Static.data.updateInfo();
                Static.run.openStart();
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton1_delete_master_passwordActionPerformed

    private void jButton1_save_changesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_save_changesActionPerformed

    }//GEN-LAST:event_jButton1_save_changesActionPerformed

    private void jButton1_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_backActionPerformed
        Static.run.openStart();
        this.dispose();
    }//GEN-LAST:event_jButton1_backActionPerformed


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
    private javax.swing.JLabel jLabel5_status1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1_curret_mp;
    private javax.swing.JTextField jTextField1_new_mp;
    private javax.swing.JTextField jTextField1_repeat_new_mp;
    // End of variables declaration//GEN-END:variables
}
