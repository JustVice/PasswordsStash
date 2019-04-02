package UI.MasterPassword;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MPMessages extends javax.swing.JFrame implements Runnable {


    public MPMessages(String message) {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel1_status.setText(message);
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
            this.setVisible(true);
            try {
                Thread.sleep(1150);
            } catch (InterruptedException ex) {
                Logger.getLogger(MPMessages.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1_status.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1_status.setText("STATUS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_status)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_status)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1_status;
    // End of variables declaration//GEN-END:variables

}
