package UI;

import LogicV3.Memory;
import Objects.Passwordv3;

public class SeePasswordInformation extends javax.swing.JFrame {

    public SeePasswordInformation(Passwordv3 TEMPORAL_PASSWORD) {
        setUndecorated(rootPaneCheckingEnabled);
        initComponents();
        setLocationRelativeTo(null);
        UI_SETTINGS(TEMPORAL_PASSWORD);
    }

    private void UI_SETTINGS(Passwordv3 TEMPORAL_PASSWORD) {
        text.setEditable(false);
        text.setText(TEMPORAL_PASSWORD.SEE_ALL_PASSWORD_INFORMATION_FRAME_CONTENT());
        this.setTitle(Memory.title + " " + Memory.version);
        this.setResizable(false);
        setIconImage(Memory.getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DONEBOT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DONEBOT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DONEBOT.setText("DONE");
        DONEBOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DONEBOTMouseClicked(evt);
            }
        });

        text.setColumns(20);
        text.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(DONEBOT)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(DONEBOT)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DONEBOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DONEBOTMouseClicked
        this.dispose();
    }//GEN-LAST:event_DONEBOTMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DONEBOT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
