package UI;

import Logic.Passwordv2;
import LogicV3.Memory;

public class FrameSeePasswordText extends javax.swing.JFrame {

    public FrameSeePasswordText(Passwordv2 password) {
        setUndecorated(rootPaneCheckingEnabled);
        initComponents();
        setLocationRelativeTo(null);
        text.setEditable(false);
        text.setText(password.getObjectForSeePasswords(Memory.return_encoded));
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
