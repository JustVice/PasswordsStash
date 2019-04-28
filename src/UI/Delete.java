package UI;

import Logic.StaticOld;

import Logic.Passwordv2;
import LogicV2.Static;
import javax.swing.JOptionPane;

public class Delete extends javax.swing.JFrame {

    public Delete() {
        initComponents();
        setLocationRelativeTo(null);
        settings();
        setIconImage(Static.getIconImage());
    }

    private void settings() {
        this.setTitle(Static.title + " " + Static.version);
        j_list.setModel(Static.run.setModelAndGet());
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeleteBOT = new javax.swing.JButton();
        backBot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_list = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DeleteBOT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteBOT.setText("DELETE");
        DeleteBOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBOTMouseClicked(evt);
            }
        });

        backBot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBot.setText("BACK");
        backBot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBotMouseClicked(evt);
            }
        });

        j_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j_list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBOT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteBOT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBOTMouseClicked
        deleteToDo();
    }//GEN-LAST:event_DeleteBOTMouseClicked

    private void deleteToDo() {
        try {
            Passwordv2 password = j_list.getSelectedValue();
            if (deleteYes(password)) {
                for (int i = 0; i < Static.data.getUserData().getPasswordsList().size(); i++) {
                    if (Static.data.getUserData().getPasswordsList().get(i).getID() == password.getID()) {
                        Static.data.getUserData().getPasswordsList().remove(i);
                        Static.data.updateInfo();
                        j_list.setModel(Static.run.setModelAndGet());
                    }
                }
            } else {
                System.out.println("Action cancelled");
            }
        } catch (Exception e) {
            System.out.println("User hasnt selected any password.");
        }
    }

    private void backBotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBotMouseClicked
        Static.run.openStart();
        this.dispose();
    }//GEN-LAST:event_backBotMouseClicked

    private void j_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_listMouseClicked
        if (evt.getClickCount() == 2) {
            deleteToDo();
        }
    }//GEN-LAST:event_j_listMouseClicked

    /**
     * Makes the user confirm his selection of deleting the selected password
     *
     * @param password
     * @return
     */
    private boolean deleteYes(Passwordv2 password) {
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this " + password.getService(Static.return_encoded) + " password? \n"
                + "This action cannot be undone.", "DELETE", 0);
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
    private javax.swing.JList<Logic.Passwordv2> j_list;
    // End of variables declaration//GEN-END:variables
}
