package UI;

import Logic.Passwordv2;
import LogicV2.Encode;
import LogicV3.AES;
import LogicV3.Memory;
import LogicV3.Passwordv3;
import LogicV3.Run;
import java.awt.event.KeyEvent;

public class CreateNewP extends javax.swing.JFrame {

    public CreateNewP() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle(Memory.title + " " + Memory.version);
        this.setResizable(false);
        panelSettings();
        setIconImage(Memory.getIconImage());
    }

    private void panelSettings() {
        jpanel_notesPanel.setLineWrap(true);
        jpanel_notesPanel.setCaretPosition(0);
        jpanel_notesPanel.setWrapStyleWord(true);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtext_servicetxt = new javax.swing.JTextField();
        jtext_mailtxt = new javax.swing.JTextField();
        jtext_usertxt = new javax.swing.JTextField();
        jtext_passwordtxt = new javax.swing.JTextField();
        jButton_create = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton_favCombo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpanel_notesPanel = new javax.swing.JTextArea();
        jButton_helpButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Service --");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("E-Mail ---");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User ----");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Notes/Comments/Additional info");

        jtext_servicetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtext_servicetxtKeyTyped(evt);
            }
        });

        jtext_mailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtext_mailtxtKeyTyped(evt);
            }
        });

        jtext_usertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtext_usertxtKeyTyped(evt);
            }
        });

        jtext_passwordtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtext_passwordtxtKeyTyped(evt);
            }
        });

        jButton_create.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_create.setText("CREATE");
        jButton_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_createActionPerformed(evt);
            }
        });

        jButton_cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_cancel.setText("BACK");
        jButton_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_cancelMouseClicked(evt);
            }
        });
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        jLabel7.setText("*optional");

        jRadioButton_favCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_favCombo.setText("Add to favorites");

        jpanel_notesPanel.setColumns(20);
        jpanel_notesPanel.setRows(5);
        jScrollPane1.setViewportView(jpanel_notesPanel);

        jButton_helpButton.setText("Help");
        jButton_helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_helpButtonActionPerformed(evt);
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
                .addComponent(jButton_helpButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jtext_servicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jtext_mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addComponent(jtext_usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addComponent(jtext_passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jRadioButton_favCombo))
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
                .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel6))
                    .addComponent(jButton_create, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(jButton_helpButton))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtext_servicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtext_mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtext_usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtext_passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jRadioButton_favCombo)
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
                    .addComponent(jButton_cancel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6))
                    .addComponent(jButton_create)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notAllowedChar(char c) {
        Memory.run.message("It's not allowed to type " + c + " at this field.\nIf you need to save an information with this character you can on Description field.", "Not allowed char.", 0);
    }

    private void jButton_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_cancelMouseClicked
        Memory.run.openStart();
        this.dispose();
    }//GEN-LAST:event_jButton_cancelMouseClicked

    private void jtext_servicetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtext_servicetxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            notAllowedChar(c);
        }
        if (c == KeyEvent.VK_ENTER) {
//            createNewPasswordToDo();
            CREATE_NEW_PASSWORD();
        }
    }//GEN-LAST:event_jtext_servicetxtKeyTyped

    private void jtext_mailtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtext_mailtxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            notAllowedChar(c);
        }
        if (c == KeyEvent.VK_ENTER) {
//            createNewPasswordToDo();
            CREATE_NEW_PASSWORD();
        }
    }//GEN-LAST:event_jtext_mailtxtKeyTyped

    private void jtext_usertxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtext_usertxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            notAllowedChar(c);
        }
        if (c == KeyEvent.VK_ENTER) {
//            createNewPasswordToDo();
            CREATE_NEW_PASSWORD();
        }
    }//GEN-LAST:event_jtext_usertxtKeyTyped

    private void jButton_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_createActionPerformed
//        createNewPasswordToDo();
        CREATE_NEW_PASSWORD();
    }//GEN-LAST:event_jButton_createActionPerformed

    private void CREATE_NEW_PASSWORD() {
        if (ARE_NECESSARY_INFORMATION_FILLED()) {
            Passwordv3 passwordv3_TO_INSERT_INTO_DATABASE = BUILD_PASSWORDV3_OBJECT();
            SAVE_NEW_PASSWORD_INSIDE_DATABASE(passwordv3_TO_INSERT_INTO_DATABASE);
        } else {
            String message = "YOU HAVE TO PROVIDE AT LEAST THE NAME OF THE "
                    + "SERVICE, PASSWORD AND EITHER USER OR EMAIL "
                    + "INFORMATION TO CREATE A NEW PASSWORD INFO";
            Memory.run.message(message, "Missing info", 2);
        }
    }

    private Passwordv3 BUILD_PASSWORDV3_OBJECT() {
        if (Memory.DATA_IS_ENCRYPTED) {
            return BUILD_PASSWORDV3_OBJECT_ENCRYPTED();
        } else {
            return BUILD_PASSWORDV3_OBJECT_NOT_ENCRYPTED();
        }
    }

    private Passwordv3 BUILD_PASSWORDV3_OBJECT_NOT_ENCRYPTED() {
        String service = jtext_servicetxt.getText().toUpperCase();
        String user = jtext_usertxt.getText();
        String mail = jtext_mailtxt.getText();
        String password = jtext_passwordtxt.getText();
        String notes = jpanel_notesPanel.getText();
        String ID = "" + ((int) (Math.random() * 99999999));;
        String favorite = "";
        if (jRadioButton_favCombo.isSelected()) {
            favorite = "1";
        } else {
            favorite = "0";
        }
        Passwordv3 passwordv3_OBJECT = new Passwordv3(service, user, mail, password, notes, favorite);
        return passwordv3_OBJECT;
    }

    private Passwordv3 BUILD_PASSWORDV3_OBJECT_ENCRYPTED() {
        String service = jtext_servicetxt.getText().toUpperCase();
        String user = jtext_usertxt.getText();
        String mail = jtext_mailtxt.getText();
        String password = jtext_passwordtxt.getText();
        String notes = jpanel_notesPanel.getText();
        String ID = "" + ((int) (Math.random() * 99999999));;
        String favorite = "";
        if (jRadioButton_favCombo.isSelected()) {
            favorite = "1";
        } else {
            favorite = "0";
        }
        Passwordv3 passwordv3_OBJECT = new Passwordv3(
                AES.encrypt(service, Memory.AES_KEY_PASSWORD),
                AES.encrypt(user, Memory.AES_KEY_PASSWORD),
                AES.encrypt(mail, Memory.AES_KEY_PASSWORD),
                AES.encrypt(password, Memory.AES_KEY_PASSWORD),
                AES.encrypt(notes, Memory.AES_KEY_PASSWORD),
                AES.encrypt(favorite, Memory.AES_KEY_PASSWORD));
        return passwordv3_OBJECT;
    }

    private boolean ARE_NECESSARY_INFORMATION_FILLED() {
        //It is necessary that the user at least fill the Service, password and
        //either user or email text fields.
        if (jtext_servicetxt.getText().equals("")
                || jtext_passwordtxt.getText().equals("")) {
            return false;
        } else if (jtext_usertxt.getText().equals("")
                && jtext_mailtxt.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    private void SAVE_NEW_PASSWORD_INSIDE_DATABASE(Passwordv3 PASS_TO_SAVE) {
        if (Memory.DATA_IS_ENCRYPTED) {
            SAVE_NEW_PASSWORD_INSIDE_DATABASE_ENCRYPTED(PASS_TO_SAVE);
        } else {
            SAVE_NEW_PASSWORD_INSIDE_DATABASE_NOT_ENCRYPTED(PASS_TO_SAVE);
        }
    }

    private void SAVE_NEW_PASSWORD_INSIDE_DATABASE_ENCRYPTED(Passwordv3 PASS_TO_SAVE) {
        String CONSOLE_QUERY_MESSAGE = "PASSWORD INSERTED SUCCESSFULLY.";
        Memory.sqlite.Query("INSERT INTO PASSS\n"
                + "(Service"
                + ", User"
                + ", Mail"
                + ", Password"
                + ", Notes"
                + ", ID"
                + ", Favorite)"
                + "VALUES ('" + PASS_TO_SAVE.getService() + "'"
                + ", '" + PASS_TO_SAVE.getUser() + "'"
                + ", '" + PASS_TO_SAVE.getEmail() + "'"
                + ", '" + PASS_TO_SAVE.getPassword() + "'"
                + ", '" + PASS_TO_SAVE.getNotes() + "'"
                + ", '" + PASS_TO_SAVE.getID() + "'"
                + ", " + PASS_TO_SAVE.getFavorite_FOR_DATABASE_INTEGER_BOL() + ""
                + ");", CONSOLE_QUERY_MESSAGE);
        UI_AND_MEMORY_CHANGES_AFTER_SAVING_A_NEW_PASSWORD(PASS_TO_SAVE);
    }

    private void SAVE_NEW_PASSWORD_INSIDE_DATABASE_NOT_ENCRYPTED(Passwordv3 PASS_TO_SAVE) {
        String CONSOLE_QUERY_MESSAGE = "PASSWORD INSERTED SUCCESSFULLY.";
        Memory.sqlite.Query("INSERT INTO PASSS\n"
                + "(Service"
                + ", User"
                + ", Mail"
                + ", Password"
                + ", Notes"
                + ", ID"
                + ", Favorite)"
                + "VALUES ('" + PASS_TO_SAVE.getService() + "'"
                + ", '" + PASS_TO_SAVE.getUser() + "'"
                + ", '" + PASS_TO_SAVE.getEmail() + "'"
                + ", '" + PASS_TO_SAVE.getPassword() + "'"
                + ", '" + PASS_TO_SAVE.getNotes() + "'"
                + ", '" + PASS_TO_SAVE.getID() + "'"
                + ", " + PASS_TO_SAVE.getFavorite_FOR_DATABASE_INTEGER_BOL() + ""
                + ");", CONSOLE_QUERY_MESSAGE);
        UI_AND_MEMORY_CHANGES_AFTER_SAVING_A_NEW_PASSWORD(PASS_TO_SAVE);
    }

    private void UI_AND_MEMORY_CHANGES_AFTER_SAVING_A_NEW_PASSWORD(Passwordv3 PASS_TO_SAVE) {
        Run.SAVE_PASSV3_IN_MEMORY_PASS_LIST(PASS_TO_SAVE);
        MESSAGE_ABOUT_SAVED_PASSWORD(PASS_TO_SAVE);
        CLEAN_JTEXTFIELDS();
    }

    private void MESSAGE_ABOUT_SAVED_PASSWORD(Passwordv3 PASS_TO_SAVE) {
        String UI_Message = "";
        if (Memory.DATA_IS_ENCRYPTED) {
            UI_Message = "Password " + PASS_TO_SAVE.getService_ENCRYPTED() + " saved.";
        } else {
            UI_Message = "Password " + PASS_TO_SAVE.getService() + " saved.";
        }
        Run.message(UI_Message, UI_Message, 1);
    }

    private void CLEAN_JTEXTFIELDS() {
        jtext_servicetxt.setText("");
        jtext_mailtxt.setText("");
        jtext_usertxt.setText("");
        jtext_passwordtxt.setText("");
        jpanel_notesPanel.setText("");
        jRadioButton_favCombo.setSelected(false);
    }

    private void createNewPasswordToDo_OLD_CODE() {
        if (ARE_NECESSARY_INFORMATION_FILLED()) {
            boolean fav = false;
            if (jRadioButton_favCombo.isSelected()) {
                fav = true;
            }
            Passwordv2 new_password = new Passwordv2(Encode.Encode_Base64(jtext_servicetxt.getText().toUpperCase()), Encode.Encode_Base64(jtext_usertxt.getText()), Encode.Encode_Base64(jtext_mailtxt.getText()), Encode.Encode_Base64(jtext_passwordtxt.getText()), Encode.Encode_Base64(jpanel_notesPanel.getText()), fav);
            Memory.data.getUserData().getPasswordsList().add(new_password);
            Memory.data.updateInfo();
            Memory.run.message("Password " + jtext_servicetxt.getText() + " recorded", "Recorded", 1);
            CLEAN_JTEXTFIELDS();
        } else {
            Memory.run.message("YOU HAVE TO PROVIDE AT LEAST THE NAME OF THE SERVICE, PASSWORD AND EITHER USER OR EMAIL INFORMATION TO CREATE A NEW PASSWORD INFO", "Missing info", 2);
        }
    }

    private void jButton_helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_helpButtonActionPerformed
        Memory.run.message(
                "Service: Service carrier associated to the password, example: Facebook or fb (refering Facebook).\n"
                + "Mail: Field to type your mail. You can type it as \"null\" if you know your mail and want to keep it hidden.\n"
                + "User: Field to type you user. Example: \"anon01\" if it is your Twitter username."
                + "Password: Field to type the password. Keep in mind that it will be shown as you type it.\n"
                + "Notes: Field to type notes. It can stash any other information whether you want to.",
                "Help",
                1);
    }//GEN-LAST:event_jButton_helpButtonActionPerformed

    private void jtext_passwordtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtext_passwordtxtKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            //createNewPasswordToDo();
            CREATE_NEW_PASSWORD();
        }
    }//GEN-LAST:event_jtext_passwordtxtKeyTyped

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_create;
    private javax.swing.JButton jButton_helpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton_favCombo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jpanel_notesPanel;
    private javax.swing.JTextField jtext_mailtxt;
    private javax.swing.JTextField jtext_passwordtxt;
    private javax.swing.JTextField jtext_servicetxt;
    private javax.swing.JTextField jtext_usertxt;
    // End of variables declaration//GEN-END:variables
}
