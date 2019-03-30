package UI;

import Logic.Passwordv2;
import LogicV2.Encode;
import LogicV2.Static;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class EditPassword extends javax.swing.JFrame {
    
    public EditPassword() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle(Static.title + " " + Static.version);
        settings();
    }
    
    private void settings() {
        j_list.setModel(Static.run.setModelAndGet());
        notesTxt.setLineWrap(true);
        notesTxt.setCaretPosition(0);
        notesTxt.setWrapStyleWord(true);
        this.setResizable(false);
        setIconImage(Static.getIconImage());
    }
    
    private Passwordv2 tempPassword;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        j_list = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        favRadio = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UPDATEPASSWORD = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notesTxt = new javax.swing.JTextArea();
        passwordtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        servicetxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mailtxt = new javax.swing.JTextField();
        usertxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        j_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j_list);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Service");

        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setText("BACK");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        favRadio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        favRadio.setText("Favorite");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Edit passwords");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User");

        UPDATEPASSWORD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UPDATEPASSWORD.setText("UPDATE PASSWORD");
        UPDATEPASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEPASSWORDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mail");

        notesTxt.setColumns(20);
        notesTxt.setRows(5);
        jScrollPane2.setViewportView(notesTxt);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        servicetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                servicetxtKeyTyped(evt);
            }
        });

        jLabel7.setText("*optional");

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Notes/Comments/Additional info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel5)
                .addGap(90, 90, 90)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(servicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)
                        .addComponent(mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(favRadio))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cancel)
                .addGap(29, 29, 29)
                .addComponent(UPDATEPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(servicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(favRadio))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UPDATEPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        servicetxt.setText(tempPassword.getService(Static.return_encoded));
        mailtxt.setText(tempPassword.getMail(Static.return_encoded));
        usertxt.setText(tempPassword.getUser(Static.return_encoded));
        passwordtxt.setText(tempPassword.getPassword(Static.return_encoded));
        notesTxt.setText(tempPassword.getNotes(Static.return_encoded));
    }

    private void servicetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_servicetxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            JOptionPane.showMessageDialog(null, "It's not allowed to type " + c + " at this field.\nIf you need to save an information with this character you can on Description field.");
        }
        if (c == KeyEvent.VK_ENTER) {
            updatePassword();
        }
    }//GEN-LAST:event_servicetxtKeyTyped

    private void mailtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailtxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            JOptionPane.showMessageDialog(null, "It's not allowed to type " + c + " at this field.\nIf you need to save an information with this character you can on Description field.");
        }
        if (c == KeyEvent.VK_ENTER) {
            updatePassword();
        }
    }//GEN-LAST:event_mailtxtKeyTyped

    private void usertxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertxtKeyTyped
        char c = evt.getKeyChar();
        if (c == '/' || c == ':' || c == '*' || c == '?' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            JOptionPane.showMessageDialog(null, "It's not allowed to type " + c + " at this field.\nIf you need to save an information with this character you can on Description field.");
        }
        if (c == KeyEvent.VK_ENTER) {
            updatePassword();
        }
    }//GEN-LAST:event_usertxtKeyTyped

    private void UPDATEPASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEPASSWORDActionPerformed
        updatePassword();
    }//GEN-LAST:event_UPDATEPASSWORDActionPerformed
    
    private void updatePassword() {
        if (tempPassword != null) {
            for (int i = 0; i < Static.data.getUserData().getPasswordsList().size(); i++) {
                if (Static.data.getUserData().getPasswordsList().get(i).getID() == tempPassword.getID()) {
                    int option = Static.run.askMessage("Are you sure that you want to update this " + Static.data.getUserData().getPasswordsList().get(i).getService(Static.return_encoded) + " info?\nThis action cannot be undone.", "Change password info?", 0, 3);
                    if (option == 0) {
                        
                        Passwordv2 passwordUpdate = new Passwordv2(Encode.Encode_Base64(servicetxt.getText().toUpperCase()), Encode.Encode_Base64(usertxt.getText()), Encode.Encode_Base64(mailtxt.getText()), Encode.Encode_Base64(passwordtxt.getText()), Encode.Encode_Base64(notesTxt.getText()), giveFavOrNot());
                        Static.data.getUserData().getPasswordsList().set(i, passwordUpdate);
                        Static.data.updateInfo();
                        j_list.setModel(Static.run.setModelAndGet());
                        clearFields();
                    } else {
                        System.out.println("cancelled");
                    }
                    break;
                }
            }
        } else {
            System.out.println("User does not selected a password.");
        }
    }
    
    private void clearFields() {
        servicetxt.setText("");
        mailtxt.setText("");
        usertxt.setText("");
        passwordtxt.setText("");
        notesTxt.setText("");        
        favRadio.setSelected(false);
    }
    
    private boolean giveFavOrNot() {
        if (favRadio.isSelected()) {
            return true;
        } else {
            return false;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
