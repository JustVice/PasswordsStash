package UI;

import Logic.StaticOld;
import Logic.Passwordv2;
import LogicV2.Static;
import java.awt.event.KeyEvent;

public class CreateNewP extends javax.swing.JFrame {

    public CreateNewP() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle(Static.title + " " + Static.version);
        this.setResizable(false);
        panelSettings();
    }

    private void panelSettings() {
        notesPanel.setLineWrap(true);
        notesPanel.setCaretPosition(0);
        notesPanel.setWrapStyleWord(true);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Service --");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mail -----");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User ----");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Notes/Comments/Additional info");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        servicetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                servicetxtKeyTyped(evt);
            }
        });
        getContentPane().add(servicetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 440, -1));

        mailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mailtxtKeyTyped(evt);
            }
        });
        getContentPane().add(mailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 440, -1));

        usertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usertxtKeyTyped(evt);
            }
        });
        getContentPane().add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 440, -1));

        passwordtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordtxtKeyTyped(evt);
            }
        });
        getContentPane().add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 440, -1));

        create.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create.setText("CREATE");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        getContentPane().add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 371, -1));

        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setText("BACK");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 124, -1));

        jLabel7.setText("*optional");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        favCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        favCombo.setText("Add to favorites");
        getContentPane().add(favCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        notesPanel.setColumns(20);
        notesPanel.setRows(5);
        jScrollPane1.setViewportView(notesPanel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 523, 240));

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(helpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel6.setText("*You can also press \"Enter\" to create the password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Create new Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notAllowedChar(char c) {
        Static.run.message("It's not allowed to type " + c + " at this field.\nIf you need to save an information with this character you can on Description field.", "Not allowed char.", 0);
    }

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        Static.run.openStart();
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void servicetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_servicetxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            notAllowedChar(c);
        }
        if (c == KeyEvent.VK_ENTER) {
            createNewPasswordToDo();
        }
    }//GEN-LAST:event_servicetxtKeyTyped

    private void mailtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailtxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            notAllowedChar(c);
        }
        if (c == KeyEvent.VK_ENTER) {
            createNewPasswordToDo();
        }
    }//GEN-LAST:event_mailtxtKeyTyped

    private void usertxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            notAllowedChar(c);
        }
        if (c == KeyEvent.VK_ENTER) {
            createNewPasswordToDo();
        }
    }//GEN-LAST:event_usertxtKeyTyped

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        createNewPasswordToDo();
    }//GEN-LAST:event_createActionPerformed
    private void createNewPasswordToDo() {
        if (verify()) {
            boolean fav = false;
            if (favCombo.isSelected()) {
                fav = true;
            }
            Static.data.getUserData().getPasswordsList().add(new Passwordv2(servicetxt.getText().toUpperCase(), usertxt.getText(), mailtxt.getText(), passwordtxt.getText(), notesPanel.getText(), fav));
            Static.data.updateInfo();
            Static.run.message("Password " + servicetxt.getText() + " recorded", "Recorded", 1);
            cleanFields();
        } else {
            Static.run.message("YOU HAVE TO PROVIDE AT LEAST THE NAME OF THE SERVICE, PASSWORD AND EITHER USER OR EMAIL INFORMATION TO CREATE A NEW PASSWORD INFO", "Missing info", 2);
        }
    }
    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        Static.run.message(
                "Service: Service carrier associated to the password, example: Facebook or fb (refering Facebook).\n"
                + "Mail: Field to type your mail. You can type it as \"null\" if you know your mail and want to keep it hidden.\n"
                + "User: Field to type you user. Example: \"anon01\" if it is your Twitter username."
                + "Password: Field to type the password. Keep in mind that it will be shown as you type it.\n"
                + "Notes: Field to type notes. It can stash any other information whether you want to.",
                "Help",
                1);
    }//GEN-LAST:event_helpButtonActionPerformed

    private void passwordtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordtxtKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            createNewPasswordToDo();
        }
    }//GEN-LAST:event_passwordtxtKeyTyped

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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mailtxt;
    private javax.swing.JTextArea notesPanel;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTextField servicetxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
