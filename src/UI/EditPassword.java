package UI;

import Logic.Passwordv2;
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j_list);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, 778, 260));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Service");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setText("BACK");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, 50));

        favRadio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        favRadio.setText("Favorite");
        getContentPane().add(favRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Edit passwords");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        UPDATEPASSWORD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UPDATEPASSWORD.setText("UPDATE PASSWORD");
        UPDATEPASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEPASSWORDActionPerformed(evt);
            }
        });
        getContentPane().add(UPDATEPASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 690, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mail");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        notesTxt.setColumns(20);
        notesTxt.setRows(5);
        jScrollPane2.setViewportView(notesTxt);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 430, 200));
        getContentPane().add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 237, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        servicetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                servicetxtKeyTyped(evt);
            }
        });
        getContentPane().add(servicetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 256, -1));

        jLabel7.setText("*optional");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, -1));

        mailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mailtxtKeyTyped(evt);
            }
        });
        getContentPane().add(mailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 276, -1));

        usertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usertxtKeyTyped(evt);
            }
        });
        getContentPane().add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 276, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Notes/Comments/Additional info");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

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
                    int option = Static.run.askMessage("Are you sure that you want to update this " + Static.data.getUserData().getPasswordsList().get(i).getService() + " info?\nThis action cannot be undone.", "Change password info?", 0, 3);
                    if (option == 0) {
                        
                        Passwordv2 passwordUpdate = new Passwordv2(servicetxt.getText().toUpperCase(), usertxt.getText(), mailtxt.getText(), passwordtxt.getText(), notesTxt.getText(), giveFavOrNot());
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
