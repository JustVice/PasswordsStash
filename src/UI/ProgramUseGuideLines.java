package UI;

import LogicV2.Static;

public class ProgramUseGuideLines extends javax.swing.JFrame {

    public ProgramUseGuideLines() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Ok");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setText("<html>\n<head>\n\n<style>\n\nh3{\ntext-align:center;\n}\n\n</style>\n\n\n</head>\n\n<h1 style=\"text-align:center;\">How this program is meant to be used:</h1>\n\n<h3>Sometimes you need to log in into 1, 2, 3, etc.. accounts on a </h3> \n<h3>foreign computer and be as quick as possible. This program helps to do so.</h3>\n<h3> It is meant to store your passwords and give them to you by a click on</h3>\n<h3>a button to copy it into the clipboard. At the end of the day it is supposed </h3>\n<h3>that you will delete the \"data\" file. Quick password giver and disposable</h3>\n<h3>sensitive data is the slogan of this program. You can store all your</h3>\n<h3>passwords and use the program as a password keeper, but it is not </h3>\n<h3>recomended because the \"data\" file can be readed easily with </h3>\n<h3>any txt editor. So be aware of the \"data\"; delete it or hide the </h3>\n<h3>program into a safety and discrete place as you need it.</h3>\n<h3>Responsibility disclaimer: I am not responsable for any password</h3>\n<h3>or sensitive data stolen. It's up to you to protect this program.</h3>\n<h3>Note: No, I am not using computer magic tricks to steal your</h3>\n<h3>passwords, you can be completely calm with that.</h3>\n\n</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(back))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Static.run.openStart();
        this.dispose();
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
