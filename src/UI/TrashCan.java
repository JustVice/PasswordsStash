package UI;

import LogicV3.Memory;
import Objects.Passwordv3;
import LogicV3.Run;
import javax.swing.DefaultListModel;

public class TrashCan extends javax.swing.JFrame {

    public TrashCan() {
        initComponents();
        settings();
    }

    private void settings() {
        UI_SETTINGS();
    }

    private void UI_SETTINGS() {
        setLocationRelativeTo(null);
        setIconImage(Memory.getIconImage());
        this.setTitle(Memory.title + " " + Memory.version);
        this.setResizable(false);
        this.setVisible(true);
        SET_JLIST_DEFAULT_LIST();
        ENABLE_OR_DISABLE_BOTH_CONTROL_BUTTONS(false,false);
    }
    
    private void SET_JLIST_DEFAULT_LIST() {
        DefaultListModel<Passwordv3> PASSWORDS_MODEL
                = new DefaultListModel<>();
        PASSWORDS_MODEL.clear();
        for (Passwordv3 p : Memory.passwordsV3LinkedList) {
            PASSWORDS_MODEL.add(0, p);
        }
        this.jList_passwords.setModel(PASSWORDS_MODEL);
    }
    
    private boolean IS_THERE_A_PASSWORD_SELECTED() {
        Passwordv3 p = this.jList_passwords.getSelectedValue();
        if (p != null) {
            return true;
        } else {
            return false;
        }
    }
    
    private void ENABLE_OR_DISABLE_BOTH_CONTROL_BUTTONS(boolean deleteButton, boolean recoverButton) {
        jButton_delete_password_permanently.setEnabled(deleteButton);
        jButton_recover_password.setEnabled(recoverButton);
    }

    private void ENABLE_OR_DISABLE_DELETE_BUTTON(boolean deleteButton) {
        jButton_delete_password_permanently.setEnabled(deleteButton);

    }

    private void ENABLE_OR_DISABLE_RECOVER_BUTTON(boolean recoverButton) {
        jButton_recover_password.setEnabled(recoverButton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_back = new javax.swing.JButton();
        jButton_delete_password_permanently = new javax.swing.JButton();
        jButton_recover_password = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_passwords = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jButton_delete_password_permanently.setText("Delete password permanently");
        jButton_delete_password_permanently.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delete_password_permanentlyActionPerformed(evt);
            }
        });

        jButton_recover_password.setText("Recover password");
        jButton_recover_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_recover_passwordActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList_passwords);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_delete_password_permanently)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_recover_password)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_back)
                    .addComponent(jButton_delete_password_permanently)
                    .addComponent(jButton_recover_password))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        Run.openDelete();
        dispose();
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_delete_password_permanentlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete_password_permanentlyActionPerformed
        
    }//GEN-LAST:event_jButton_delete_password_permanentlyActionPerformed

    private void jButton_recover_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_recover_passwordActionPerformed
        
    }//GEN-LAST:event_jButton_recover_passwordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_delete_password_permanently;
    private javax.swing.JButton jButton_recover_password;
    private javax.swing.JList<Objects.Passwordv3> jList_passwords;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
