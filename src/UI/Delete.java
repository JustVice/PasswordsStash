package UI;

import Logic.StaticOld;

import Logic.Passwordv2;
import javax.swing.JOptionPane;

public class Delete extends javax.swing.JFrame {

    public Delete() {
        initComponents();
        setLocationRelativeTo(null);
        j_list.setModel(StaticOld.modelo);
        this.setTitle(StaticOld.programTab + StaticOld.currentVersion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeleteBOT = new javax.swing.JButton();
        backBot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_list = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DeleteBOT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        DeleteBOT.setText("DELETE");
        DeleteBOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBOTMouseClicked(evt);
            }
        });

        backBot.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        backBot.setText("BACK");
        backBot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBotMouseClicked(evt);
            }
        });

        j_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(j_list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBot, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(DeleteBOT, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteBOT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBOTMouseClicked
        try {
            int SelectedIndex = j_list.getSelectedIndex();
            Passwordv2 password = StaticOld.modelo.getElementAt(SelectedIndex);
            if (deleteYes(password)) {
                Boolean found = false;
                for (int i = 0; i < StaticOld.pw_dir.size(); i++) {
                    if (StaticOld.pw_dir.get(i).getID() == password.getID()) {
                        StaticOld.pw_dir.remove(i);
                        System.out.println("PASSWORD DELETED");
                        found = true;
                    }
                }
                if (found) {
                    StaticOld.UpdateData();
                    StaticOld.setModelsItems();
                    j_list.setModel(StaticOld.modelo);
                } else {
                    JOptionPane.showMessageDialog(null, "ITEM HASN'T BEEN FOUND. THERE'S AN UNKNOW ISSUE WITH THE PROGRAM. PLEASE, RESTART THE PROGRAM.");
                }
            } else {
                System.out.println("Action cancelled");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "YOU MUST SELECT SOMETHING BEFORE DELETING");
        }
    }//GEN-LAST:event_DeleteBOTMouseClicked

    private void backBotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBotMouseClicked
        StaticOld.admin.openStart();
        this.dispose();
    }//GEN-LAST:event_backBotMouseClicked

    /**
     * Makes the user confirm his selection of deleting the selected password
     *
     * @param password
     * @return
     */
    private boolean deleteYes(Passwordv2 password) {
        int option = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO DELETE THIS " + password.getService() + " password? THIS CAN'T BE UNDONE", "DELETE", 0);
        if (option == 0) {
            return true;
            /*0 = yes*/
        } else {
            return false;
            /*1 = no*/
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBOT;
    private javax.swing.JButton backBot;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Passwordv2> j_list;
    // End of variables declaration//GEN-END:variables
}
