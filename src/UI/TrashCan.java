package UI;

import LogicV3.Memory;
import Objects.Passwordv3;
import LogicV3.Run;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

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
        ENABLE_OR_DISABLE_BOTH_CONTROL_BUTTONS(false, false);
        ENABLE_OR_DISABLE_DELETE_ALL_BUTTON_IF_THERE_ARE_OR_NOT_A_PASSWORD_IN_TRASH_CAN();
    }

    private void SET_JLIST_DEFAULT_LIST() {
        DefaultListModel<Passwordv3> PASSWORDS_MODEL
                = new DefaultListModel<>();
        PASSWORDS_MODEL.clear();
        for (Passwordv3 p : Memory.passwordsV3LinkedList) {
            if (p.getInTrashCan().equals("1")) {
                PASSWORDS_MODEL.add(0, p);
                System.out.println("dajajajaJAAA");
            }
        }
        this.jList_passwords.setModel(PASSWORDS_MODEL);
    }

    private boolean IS_THERE_A_PASSWORD_SELECTED() {
        Passwordv3 p = this.jList_passwords.getSelectedValue();
        return p != null;
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

    private void ENABLE_OR_DISABLE_DELETE_ALL_BUTTON(boolean status) {
        this.jButton_delete_all.setEnabled(status);
    }

    private void ENABLE_OR_DISABLE_DELETE_ALL_BUTTON_IF_THERE_ARE_OR_NOT_A_PASSWORD_IN_TRASH_CAN() {
        ENABLE_OR_DISABLE_DELETE_ALL_BUTTON(IS_THERE_A_PASSWORD_INSIDE_TRASH_CAN());
    }

    private boolean IS_THERE_A_PASSWORD_INSIDE_TRASH_CAN() {
        for (int i = 0; i < Memory.passwordsV3LinkedList.size(); i++) {
            if (Memory.passwordsV3LinkedList.get(i).getInTrashCan().equals("1")) {
                return true;
            }
        }
        return false;
    }

    private void BUTTONS_ENABLE_OR_DISABLED(boolean status) {
        jButton_delete_password_permanently.setEnabled(status);
        jButton_recover_password.setEnabled(status);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_back = new javax.swing.JButton();
        jButton_delete_password_permanently = new javax.swing.JButton();
        jButton_recover_password = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_passwords = new javax.swing.JList<>();
        jButton_delete_all = new javax.swing.JButton();

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

        jList_passwords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_passwordsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList_passwords);

        jButton_delete_all.setText("Delete all");
        jButton_delete_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delete_allActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_delete_password_permanently)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_recover_password)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_delete_all)
                        .addGap(0, 222, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_back)
                    .addComponent(jButton_delete_password_permanently)
                    .addComponent(jButton_recover_password)
                    .addComponent(jButton_delete_all))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        Run.openDelete();
        dispose();
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_delete_password_permanentlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete_password_permanentlyActionPerformed
        DELETE_PASSWORD();
    }//GEN-LAST:event_jButton_delete_password_permanentlyActionPerformed

    private void DELETE_PASSWORD() {
        Passwordv3 passwordToDelete = this.jList_passwords.getSelectedValue();
        if (ASK_IF_USER_IS_SURE_ABOUT_DELETE_PASSWORD(passwordToDelete)) {
            if (IS_THERE_A_PASSWORD_SELECTED()) {
                DELETE_PASSWORD_FROM_PROGRAM_MEMORY(passwordToDelete);
                DELETE_PASSWORD_FROM_DATABASE(passwordToDelete);
                UI_CHANGES_AFTER_DELETE_PASSWORD();
            }
        }
    }

    private boolean ASK_IF_USER_IS_SURE_ABOUT_DELETE_PASSWORD(Passwordv3 passwordToDelete) {
        String message = "Deleting password " + passwordToDelete.getService_LEGIBLE() + "\n"
                + "Are you sure?";
        int option = JOptionPane.showConfirmDialog(null, message, "Delete password", 0, 3);
        return option == 0;
    }

    private void DELETE_PASSWORD_FROM_PROGRAM_MEMORY(Passwordv3 passwordToDelete) {
        for (int i = 0; i < Memory.passwordsV3LinkedList.size(); i++) {
            if (Memory.passwordsV3LinkedList.get(i).getID().equals(passwordToDelete.getID())) {
                Memory.passwordsV3LinkedList.remove(i);
                System.out.println("Password deleted from program memory.");
                break;
            }
        }
    }

    private void DELETE_PASSWORD_FROM_DATABASE(Passwordv3 passwordToDelete) {
        String query = "DELETE FROM PASSS WHERE ID = '" + passwordToDelete.getID() + "';";
        Memory.sqlite.Query(query, "Password deleted from Database.");
    }

    private void UI_CHANGES_AFTER_DELETE_PASSWORD() {
        SET_JLIST_DEFAULT_LIST();
        BUTTONS_ENABLE_OR_DISABLED(false);
    }


    private void jButton_recover_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_recover_passwordActionPerformed
        RECOVER_SELECTED_PASSWORD();
    }//GEN-LAST:event_jButton_recover_passwordActionPerformed

    private void RECOVER_SELECTED_PASSWORD() {
        boolean IS_THERE_A_PASSWORD_SELECTED = IS_THERE_A_PASSWORD_SELECTED();
        if (IS_THERE_A_PASSWORD_SELECTED) {
            Passwordv3 temp_password = jList_passwords.getSelectedValue();
            RECOVER_SELECTED_PASSWORD_IN_MEMORY(temp_password);
            RECOVER_SELECTED_PASSWORD_IN_DATABASE(temp_password);
            SET_JLIST_DEFAULT_LIST();
        }
    }

    private void RECOVER_SELECTED_PASSWORD_IN_MEMORY(Passwordv3 password_to_recover) {
        for (int i = 0; i < Memory.passwordsV3LinkedList.size(); i++) {
            if (Memory.passwordsV3LinkedList.get(i).getID().equals(password_to_recover.getID())) {
                Memory.passwordsV3LinkedList.get(i).setInTrashCan("0");
                System.out.println("Password recovered from program memory.");
                break;
            }
        }
    }

    private void RECOVER_SELECTED_PASSWORD_IN_DATABASE(Passwordv3 password_to_recover) {
        String new_query = "UPDATE PASSS\n"
                + "SET InTrashCan = '0'"
                + "WHERE ID = " + password_to_recover.getID() + ";";
        Memory.sqlite.Query(new_query, "Password recovered from DataBase.");
    }

    private void jList_passwordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_passwordsMouseClicked
        BUTTONS_ENABLE_OR_DISABLED(IS_THERE_A_PASSWORD_SELECTED());
    }//GEN-LAST:event_jList_passwordsMouseClicked

    private void jButton_delete_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete_allActionPerformed
        DELETE_ALL_PASS_IN_TRASHCAN();
    }//GEN-LAST:event_jButton_delete_allActionPerformed

    private void DELETE_ALL_PASS_IN_TRASHCAN() {
        boolean IS_USER_SURE_ABOUT_DELETING_ALL_PASSWORDS_IN_TRASH_CAN = ASK_IF_USER_IS_SURE_ABOUT_DELETE_ALL_PASS();
        if (IS_USER_SURE_ABOUT_DELETING_ALL_PASSWORDS_IN_TRASH_CAN) {
            DELETE_ALL_PASS_IN_TRASHCAN_FROM_MEMORY();
            DELETE_ALL_PASS_IN_TRASHCAN_FROM_DATABASE();
            ENABLE_OR_DISABLE_BOTH_CONTROL_BUTTONS(false, false);
            UI_CHANGES_AFTER_DELETE_PASSWORD();
            ENABLE_OR_DISABLE_DELETE_ALL_BUTTON(false);
        }
    }

    private void DELETE_ALL_PASS_IN_TRASHCAN_FROM_MEMORY() {
        LinkedList<Passwordv3> temp_linkedList = new LinkedList();
        for (int i = 0; i < Memory.passwordsV3LinkedList.size(); i++) {
            if (!Memory.passwordsV3LinkedList.get(i).getInTrashCan().equals("1")) {
                temp_linkedList.add(Memory.passwordsV3LinkedList.get(i));
            }
        }
        Memory.passwordsV3LinkedList = temp_linkedList;
        System.out.println("Passwords in trashcan permanently deleted from memory");
    }

    private void DELETE_ALL_PASS_IN_TRASHCAN_FROM_DATABASE() {
        String new_query = "DELETE FROM PASSS WHERE InTrashCan = '1'";
        Memory.sqlite.Query(new_query, "Passwords in trashcan permanently deleted from database");
    }

    private boolean ASK_IF_USER_IS_SURE_ABOUT_DELETE_ALL_PASS() {
        String message = "Delete all passwords in tash can\n"
                + "Are you sure?\n"
                + "This action cannot be undone.";
        int option = JOptionPane.showConfirmDialog(null, message, "Delete all passwords in Trash Can", 0, 3);
        return option == 0;
    }

    private void DELETE_ALL_PASS_IN_MEMORY() {
    }

    private void DELETE_ALL_PASS_IN_DATABASE() {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_delete_all;
    private javax.swing.JButton jButton_delete_password_permanently;
    private javax.swing.JButton jButton_recover_password;
    private javax.swing.JList<Objects.Passwordv3> jList_passwords;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
