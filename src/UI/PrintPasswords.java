package UI;

import Logic.Static;
import Logic.Passwordv2;
import javax.swing.JOptionPane;

public class PrintPasswords extends javax.swing.JFrame {

    public PrintPasswords() {
        initComponents();
        setLocationRelativeTo(null);
        j_list.setModel(Static.modelo);
        PrintSelected.setEnabled(false);
        this.setTitle(Static.programTab + Static.currentVersion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        PrintAll = new javax.swing.JButton();
        PrintSelected = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_list = new javax.swing.JList<>();
        printOnTheirOwnTxtFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        PrintAll.setText("Print all passwords in a single txt file");
        PrintAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintAllMouseClicked(evt);
            }
        });

        PrintSelected.setText("Print selected items");
        PrintSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintSelectedMouseClicked(evt);
            }
        });

        label1.setText("CTRL + click on the items");

        j_list.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        j_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j_list);

        printOnTheirOwnTxtFile.setText("PRINT EVERY PASSWORD ON HIS OWN TXT FILE");
        printOnTheirOwnTxtFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printOnTheirOwnTxtFileMouseClicked(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PrintAll, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PrintSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label1)
                                .addGap(29, 29, 29)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printOnTheirOwnTxtFile)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Back)
                        .addComponent(PrintAll)
                        .addComponent(PrintSelected))
                    .addComponent(printOnTheirOwnTxtFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        Static.admin.openStart();
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void PrintAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintAllMouseClicked
        if (!Static.pw_dir.isEmpty()) {
            Static.printAllPasswords();
            JOptionPane.showMessageDialog(null, "PASSWORD(S) PRINTED.");
        } else {
            JOptionPane.showMessageDialog(null, "THERE ARE NO PASSWORDS YET");
        }
    }//GEN-LAST:event_PrintAllMouseClicked

    private void PrintSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintSelectedMouseClicked
        try {
            if (!Static.pw_dir.isEmpty() && !j_list.isSelectionEmpty()) {
                int indices[] = j_list.getSelectedIndices();
                Static.printSelectedPasswords(indices);
                JOptionPane.showMessageDialog(null, "PASSWORD(S) PRINTED.");
            } else {
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_PrintSelectedMouseClicked

    private void printOnTheirOwnTxtFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printOnTheirOwnTxtFileMouseClicked
        if (!Static.pw_dir.isEmpty()) {
            Static.printAllPasswordsOnHisOwnTxtFile();
            JOptionPane.showMessageDialog(null, "PASSWORD(S) PRINTED.");
        } else {
            JOptionPane.showMessageDialog(null, "THERE ARE NO PASSWORDS YET");
        }
    }//GEN-LAST:event_printOnTheirOwnTxtFileMouseClicked

    private void j_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_listMouseClicked
        if (!j_list.isSelectionEmpty()) {
            PrintSelected.setEnabled(true);
        }
    }//GEN-LAST:event_j_listMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton PrintAll;
    private javax.swing.JButton PrintSelected;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Logic.Passwordv2> j_list;
    private javax.swing.JLabel label1;
    private javax.swing.JButton printOnTheirOwnTxtFile;
    // End of variables declaration//GEN-END:variables
}
