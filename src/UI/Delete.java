package UI;

import Logic.StaticOld;

import Logic.Passwordv2;
import LogicV3.Memory;
import Objects.Passwordv3;
import LogicV3.Run;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Delete extends javax.swing.JFrame {

    public Delete() {
        initComponents();
        settings();
    }

    private void UI_SETTINGS() {
        setLocationRelativeTo(null);
        setIconImage(Memory.getIconImage());
        this.setTitle(Memory.title + " " + Memory.version);
        this.setResizable(false);
    }

    private void settings() {
        UI_SETTINGS();
        SET_JLIST_DEFAULT_LIST();
        ENABLE_OR_DISABLE_BOTH_DELETE_BUTTONS(false, true);
    }

    private void SET_JLIST_DEFAULT_LIST() {
        DefaultListModel<Passwordv3> PASSWORDS_MODEL
                = new DefaultListModel<>();
        PASSWORDS_MODEL.clear();
        for (Passwordv3 p : Memory.passwordsV3LinkedList) {
            if (!p.getInTrashCan().equals("1")) {
                PASSWORDS_MODEL.add(0, p);
            }
        }
        this.jList_PASSWORDS_LIST.setModel(PASSWORDS_MODEL);
    }

    private void ENABLE_OR_DISABLE_BOTH_DELETE_BUTTONS(boolean deleteButton, boolean trashCanButton) {
        jButton_DeleteBOT.setEnabled(deleteButton);
        jButton_trashCan.setEnabled(trashCanButton);
    }

    private void ENABLE_OR_DISABLE_DELETE_BUTTON(boolean deleteButton) {
        jButton_DeleteBOT.setEnabled(deleteButton);
    }

    private void ENABLE_OR_DISABLE_TRASH_CAN(boolean trashCanButton) {
        jButton_trashCan.setEnabled(trashCanButton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_DeleteBOT = new javax.swing.JButton();
        backBot = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_PASSWORDS_LIST = new javax.swing.JList<>();
        jButton_trashCan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_DeleteBOT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_DeleteBOT.setText("Delete password");
        jButton_DeleteBOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteBOTActionPerformed(evt);
            }
        });

        backBot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backBot.setText("Back");
        backBot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBotMouseClicked(evt);
            }
        });

        jScrollPane2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jList_PASSWORDS_LIST.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jList_PASSWORDS_LIST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_PASSWORDS_LISTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList_PASSWORDS_LIST);

        jButton_trashCan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_trashCan.setText("Trash can");
        jButton_trashCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_trashCanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_trashCan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_DeleteBOT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_DeleteBOT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_trashCan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean IS_THERE_A_PASSWORD_SELECTED() {
        Passwordv3 p = this.jList_PASSWORDS_LIST.getSelectedValue();
        if (p != null) {
            ENABLE_OR_DISABLE_DELETE_BUTTON(true);
            return true;
        } else {
            ENABLE_OR_DISABLE_DELETE_BUTTON(false);
            return false;
        }
    }


    private void backBotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBotMouseClicked
        Memory.run.openStart();
        this.dispose();
    }//GEN-LAST:event_backBotMouseClicked

    private void jList_PASSWORDS_LISTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_PASSWORDS_LISTMouseClicked
        IS_THERE_A_PASSWORD_SELECTED();
    }//GEN-LAST:event_jList_PASSWORDS_LISTMouseClicked

    private void jButton_trashCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_trashCanActionPerformed
        TrashCan trashCan = new TrashCan();
        dispose();
    }//GEN-LAST:event_jButton_trashCanActionPerformed

    private void jButton_DeleteBOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteBOTActionPerformed
        if (IS_THERE_A_PASSWORD_SELECTED()) {
            Passwordv3 passwordToDelete = this.jList_PASSWORDS_LIST.getSelectedValue();
            SEND_PASSWORD_TO_TRASH_CAN(passwordToDelete);
        }
    }//GEN-LAST:event_jButton_DeleteBOTActionPerformed

    private void SEND_PASSWORD_TO_TRASH_CAN(Passwordv3 passwordToSendToTrashCan) {
        SEND_PASSWORD_TO_TRASH_CAN_FROM_PROGRAM_MEMORY(passwordToSendToTrashCan);
        SEND_PASSWORD_TO_TRASH_CAN_FROM_DATABASE(passwordToSendToTrashCan);
        DELETE_PASSWORD_UI_CHANGES_AND_MESSAGES();
    }

    private void SEND_PASSWORD_TO_TRASH_CAN_FROM_PROGRAM_MEMORY(Passwordv3 passwordToSendToTrashCan) {
        for (int i = 0; i < Memory.passwordsV3LinkedList.size(); i++) {
            if (Memory.passwordsV3LinkedList.get(i).getID().equals(passwordToSendToTrashCan.getID())) {
                Memory.passwordsV3LinkedList.get(i).setInTrashCan("1");
                System.out.println("Password sent to trash can from program memory.");
                break;
            }
        }
    }

    private void SEND_PASSWORD_TO_TRASH_CAN_FROM_DATABASE(Passwordv3 passwordToSendToTrashCan) {
        String query = "UPDATE PASSS SET InTrashCan = '1' WHERE ID = '" + passwordToSendToTrashCan.getID() + "';";
        Memory.sqlite.Query(query, "Password sent to trash can from Database.");
    }

    private void DELETE_PASSWORD(Passwordv3 passwordToDelete) {
        DELETE_PASSWORD_FROM_PROGRAM_MEMORY(passwordToDelete);
        DELETE_PASSWORD_FROM_DATABASE(passwordToDelete);
        DELETE_PASSWORD_UI_CHANGES_AND_MESSAGES();
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

    private void DELETE_PASSWORD_UI_CHANGES_AND_MESSAGES() {
        ENABLE_OR_DISABLE_DELETE_BUTTON(true);
        SET_JLIST_DEFAULT_LIST();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBot;
    private javax.swing.JButton jButton_DeleteBOT;
    private javax.swing.JButton jButton_trashCan;
    private javax.swing.JList<Objects.Passwordv3> jList_PASSWORDS_LIST;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
