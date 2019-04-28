package UI;

import Logic.StaticOld;
import Logic.Passwordv2;
import LogicV2.Encode;
import LogicV2.Static;
import java.awt.event.KeyEvent;

public class CreateNewP extends javax.swing.JFrame {

    public CreateNewP() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle(Static.title + " " + Static.version);
        this.setResizable(false);
        panelSettings();
        setIconImage(Static.getIconImage());
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Service --");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mail -----");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User ----");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Notes/Comments/Additional info");

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

        passwordtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordtxtKeyTyped(evt);
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

        favCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

        jLabel6.setText("*You can also press \"Enter\" to create the password");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Create new Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel8)
                .addGap(23, 23, 23)
                .addComponent(helpButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(servicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(favCombo))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel6))
                    .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(helpButton))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(servicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(favCombo)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6))
                    .addComponent(create)))
        );

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
            Passwordv2 new_password = new Passwordv2(Encode.Encode_Base64(servicetxt.getText().toUpperCase()), Encode.Encode_Base64(usertxt.getText()), Encode.Encode_Base64(mailtxt.getText()), Encode.Encode_Base64(passwordtxt.getText()), Encode.Encode_Base64(notesPanel.getText()), fav);
            Static.data.getUserData().getPasswordsList().add(new_password);
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
