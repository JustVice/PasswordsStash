package UI;

import LogicV3.Memory;
import java.awt.Desktop;
import java.awt.Frame;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AboutFrame extends javax.swing.JFrame {

    public AboutFrame() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle(Memory.title + " " + Memory.version);
        this.setResizable(false);
        setIconImage(Memory.getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ALLLINKS = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TWITTER = new javax.swing.JLabel();
        GITHUB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 209, 255));

        jPanel1.setBackground(new java.awt.Color(240, 216, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(563, 410));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/jvMask.png"))); // NOI18N

        back.setBackground(new java.awt.Color(255, 224, 255));
        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(204, 0, 204));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/StartLogoSmall.png"))); // NOI18N

        ALLLINKS.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        ALLLINKS.setText("<html><a href=\"http://www.google.com\">ALL LINKS</a></html>");
        ALLLINKS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ALLLINKSMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        jLabel2.setText("Program made for fun");

        TWITTER.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        TWITTER.setText("<html><a href=\"http://www.google.com\">TWITTER</a></html>");
        TWITTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TWITTERMouseClicked(evt);
            }
        });

        GITHUB.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        GITHUB.setText("<html><a href=\"http://www.google.com\">GITHUB</a></html>");
        GITHUB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GITHUBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(TWITTER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(GITHUB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(ALLLINKS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(back)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TWITTER, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GITHUB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALLLINKS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(back)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Memory.run.openStart();
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void TWITTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TWITTERMouseClicked
        openLink("https://twitter.com/JustVice1");
    }//GEN-LAST:event_TWITTERMouseClicked

    private void GITHUBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GITHUBMouseClicked
        openLink("https://github.com/JustVice?tab=repositories");
    }//GEN-LAST:event_GITHUBMouseClicked

    private void ALLLINKSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALLLINKSMouseClicked
        openLink("https://justvice.wixsite.com/info");
    }//GEN-LAST:event_ALLLINKSMouseClicked

    private void openLink(String link) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(link));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALLLINKS;
    private javax.swing.JLabel GITHUB;
    private javax.swing.JLabel TWITTER;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
