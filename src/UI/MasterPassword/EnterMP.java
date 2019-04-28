package UI.MasterPassword;

import LogicV2.Static;
import LogicV2.UserData;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class EnterMP extends javax.swing.JFrame {

    private int attempts = -1;
    private int original_attempts = -1;
    private boolean attempts_active = false;

    public EnterMP() {
        setIconImage(Static.getIconImage());
        initComponents();
        settings();
    }

    private void settings() {
        this.setTitle(Static.title + " " + Static.version);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        set_attemps();
    }

    private void set_attemps() {
        String mpa = Static.data.getUserData().getMpa();
        if (!mpa.equals("null")) {
            this.attempts_active = true;
            this.attempts = Integer.parseInt(Static.data.getUserData().getMpa());
            set_label_status("Attempts left: " + this.attempts, "black");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1_password = new javax.swing.JPasswordField();
        jButton1_verify = new javax.swing.JButton();
        jLabel3_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("PasswordsStash");

        jLabel2.setText("Please, enter the master password:");

        jPasswordField1_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1_passwordKeyTyped(evt);
            }
        });

        jButton1_verify.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1_verify.setText("VERIFY");
        jButton1_verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_verifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1_password)
                    .addComponent(jButton1_verify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3_status)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1_verify)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_verifyActionPerformed
        verify();
    }//GEN-LAST:event_jButton1_verifyActionPerformed

    private void jPasswordField1_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1_passwordKeyTyped
        key_event(evt);
    }//GEN-LAST:event_jPasswordField1_passwordKeyTyped

    private void key_event(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            verify();
        }
    }

    private void verify() {
        if (!get_jPasswordField_value().equals("")) {
            if (!get_jPasswordField_value().equals(Static.data.getUserData().getMp())) {
                set_label_status("Incorrect", "red");
                jPasswordField1_password.setText("");
                if (this.attempts_active) {
                    this.attempts--;
                    Static.data.getUserData().setMpa("" + this.attempts);
                    Static.data.updateInfo();
                    set_label_status("Incorrect. Attempts left: " + this.attempts, "red");
                }
                if (this.attempts == 0) {
                    System.out.println("DELETE DATA");
                    Static.data.setUserData(new UserData());
                    Static.data.getUserData().setFirstRun(false);
                    Static.data.updateInfo();
                    Static.run.openStart();
                    this.dispose();
                }
            } else {
                set_label_status("CORRECT", "green");
                Static.data.getUserData().setMpa(Static.data.getUserData().getMpa_original());
                Static.data.updateInfo();
                Static.run.openStart();
                this.dispose();
            }

        }
    }

    private String get_jPasswordField_value() {
        char[] jpasswordStash = jPasswordField1_password.getPassword();
        return new String(jpasswordStash);
    }

    private void set_label_status(String message, String color) {
        switch (color) {
            case "red":
                jLabel3_status.setForeground(Color.red);
                break;
            case "black":
                jLabel3_status.setForeground(Color.black);
                break;
            case "green":
                jLabel3_status.setForeground(Color.green);
                break;
            default:
                throw new AssertionError();
        }
        jLabel3_status.setText(message);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_verify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3_status;
    private javax.swing.JPasswordField jPasswordField1_password;
    // End of variables declaration//GEN-END:variables
}
