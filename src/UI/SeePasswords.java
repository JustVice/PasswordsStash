package UI;

import Logic.Static;
import Logic.Passwordv2;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import Logic.ThreadClass;
import java.awt.HeadlessException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class SeePasswords extends javax.swing.JFrame {

    private Passwordv2 passwordv2;

    public SeePasswords() {
        initComponents();
        setLocationRelativeTo(null);
        RESETVIEWBUTTON.setVisible(false);
        j_list.setModel(Static.modelo);
        SearchEnganched = false;
        setComboBox();
        this.setTitle(Static.programTab + Static.currentVersion);
        saveFavB.setEnabled(false);
    }

    private boolean SearchEnganched;
    private int timeThread = 1200;
    private byte password = 0, mail = 1, user = 2;

    /**
     * Fills the combobox for seek passwords with the services that exist.
     */
    private void setComboBox() {
        serviceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(Static.servicesRegistered));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        j_list = new javax.swing.JList<>();
        Copy = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MAIL = new javax.swing.JButton();
        User = new javax.swing.JButton();
        PASSWORD = new javax.swing.JButton();
        backAndReset = new javax.swing.JPanel();
        RESETVIEWBUTTON = new javax.swing.JButton();
        back = new javax.swing.JButton();
        searchFeatures = new javax.swing.JPanel();
        SEARCHBUTTON = new javax.swing.JButton();
        SEEPASSWORD = new javax.swing.JButton();
        serviceTxt = new javax.swing.JTextField();
        serviceCombo = new javax.swing.JComboBox<>();
        FavPasswordsPanel = new javax.swing.JPanel();
        FavRadio = new javax.swing.JRadioButton();
        showFavButton = new javax.swing.JButton();
        saveFavB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        j_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                j_listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(j_list);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Copy to clipboard");

        MAIL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MAIL.setText("MAIL");
        MAIL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MAILMouseClicked(evt);
            }
        });

        User.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        User.setText("USER");
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });

        PASSWORD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PASSWORD.setText("PASSWORD");
        PASSWORD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PASSWORDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CopyLayout = new javax.swing.GroupLayout(Copy);
        Copy.setLayout(CopyLayout);
        CopyLayout.setHorizontalGroup(
            CopyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CopyLayout.createSequentialGroup()
                .addGroup(CopyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CopyLayout.createSequentialGroup()
                        .addComponent(MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CopyLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(PASSWORD))
                    .addGroup(CopyLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CopyLayout.setVerticalGroup(
            CopyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CopyLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CopyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MAIL)
                    .addComponent(User))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PASSWORD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RESETVIEWBUTTON.setText("RESET VIEW");
        RESETVIEWBUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RESETVIEWBUTTONMouseClicked(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backAndResetLayout = new javax.swing.GroupLayout(backAndReset);
        backAndReset.setLayout(backAndResetLayout);
        backAndResetLayout.setHorizontalGroup(
            backAndResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backAndResetLayout.createSequentialGroup()
                .addGroup(backAndResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RESETVIEWBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backAndResetLayout.setVerticalGroup(
            backAndResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backAndResetLayout.createSequentialGroup()
                .addComponent(RESETVIEWBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        SEARCHBUTTON.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SEARCHBUTTON.setText("SEARCH SERVICE");
        SEARCHBUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SEARCHBUTTONMouseClicked(evt);
            }
        });

        SEEPASSWORD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SEEPASSWORD.setText("SEE ALL INFORMATION");
        SEEPASSWORD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SEEPASSWORDMouseClicked(evt);
            }
        });

        serviceTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        serviceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not supported yet", "a", "b", "c", "d" }));
        serviceCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                serviceComboItemStateChanged(evt);
            }
        });

        FavRadio.setText("Add selected password to favorites");
        FavRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavRadioActionPerformed(evt);
            }
        });

        showFavButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showFavButton.setText("Show favorite passwords");
        showFavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFavButtonActionPerformed(evt);
            }
        });

        saveFavB.setText("SAVE");
        saveFavB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFavBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FavPasswordsPanelLayout = new javax.swing.GroupLayout(FavPasswordsPanel);
        FavPasswordsPanel.setLayout(FavPasswordsPanelLayout);
        FavPasswordsPanelLayout.setHorizontalGroup(
            FavPasswordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FavPasswordsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FavPasswordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showFavButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FavPasswordsPanelLayout.createSequentialGroup()
                        .addComponent(FavRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveFavB)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FavPasswordsPanelLayout.setVerticalGroup(
            FavPasswordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FavPasswordsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FavPasswordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FavRadio)
                    .addComponent(saveFavB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showFavButton))
        );

        javax.swing.GroupLayout searchFeaturesLayout = new javax.swing.GroupLayout(searchFeatures);
        searchFeatures.setLayout(searchFeaturesLayout);
        searchFeaturesLayout.setHorizontalGroup(
            searchFeaturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchFeaturesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchFeaturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SEEPASSWORD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(searchFeaturesLayout.createSequentialGroup()
                        .addComponent(SEARCHBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchFeaturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(serviceTxt)
                            .addComponent(serviceCombo, 0, 254, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FavPasswordsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        searchFeaturesLayout.setVerticalGroup(
            searchFeaturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchFeaturesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchFeaturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchFeaturesLayout.createSequentialGroup()
                        .addGroup(searchFeaturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SEARCHBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(searchFeaturesLayout.createSequentialGroup()
                                .addComponent(serviceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(serviceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SEEPASSWORD))
                    .addGroup(searchFeaturesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FavPasswordsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backAndReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Copy, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchFeatures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backAndReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Copy, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFeatures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if (SearchEnganched) {
            Static.LoadData();
            Static.setModelsItems();
        }
        Static.admin.openStart();
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void PASSWORDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PASSWORDMouseClicked
        saveFavB.setEnabled(false);
        try {
            Clipboard clip = getToolkit().getSystemClipboard();
            Passwordv2 toClipBoardPassword = j_list.getSelectedValue();
            StringSelection stringClip = new StringSelection(toClipBoardPassword.getPassword());
            clip.setContents(stringClip, stringClip);
            ThreadClass threadClass = new ThreadClass(timeThread, password);/*action 0 to change button text*/
            threadClass.start();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_PASSWORDMouseClicked

    private void SEEPASSWORDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SEEPASSWORDMouseClicked
        saveFavB.setEnabled(false);
        try {
            Passwordv2 password = j_list.getSelectedValue();
            FrameSeePasswordText f = new FrameSeePasswordText(password);
            f.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_SEEPASSWORDMouseClicked

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        saveFavB.setEnabled(false);
        try {
            Clipboard clip = getToolkit().getSystemClipboard();
            Passwordv2 toClipBoardPassword = j_list.getSelectedValue();
            StringSelection stringClip = new StringSelection(toClipBoardPassword.getUser());
            clip.setContents(stringClip, stringClip);
            ThreadClass t = new ThreadClass(timeThread, user);
            t.start();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_UserMouseClicked

    private void MAILMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAILMouseClicked
        saveFavB.setEnabled(false);
        try {
            Clipboard clip = getToolkit().getSystemClipboard();
            Passwordv2 toClipBoardPassword = j_list.getSelectedValue();
            StringSelection stringClip = new StringSelection(toClipBoardPassword.getMail());
            clip.setContents(stringClip, stringClip);
            ThreadClass t = new ThreadClass(timeThread, mail);
            t.start();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_MAILMouseClicked

    private void SEARCHBUTTONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SEARCHBUTTONMouseClicked
        saveFavB.setEnabled(false);
        try {
            if (!NullText(serviceTxt.getText())) {
                String txt = serviceTxt.getText().toUpperCase();
                serviceTxt.setText(txt);
                DefaultListModel<Passwordv2> tempModel = new DefaultListModel<>();
                int cont = 0;
                for (int i = 0; i < Static.pw_dir.size(); i++) {
                    if (Static.pw_dir.get(i).getService().equals(txt)) {
                        tempModel.add(cont, Static.pw_dir.get(i));
                        cont++;
                    }
                }
                if (!tempModel.isEmpty()) {
                    j_list.setModel(tempModel);
                    serviceTxt.setText("");
                    RESETVIEWBUTTON.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Password(s) with service called " + txt + " no found.");
                }

            } else {
                System.out.println("nothing writen");
            }
        } catch (HeadlessException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_SEARCHBUTTONMouseClicked

    private void RESETVIEWBUTTONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RESETVIEWBUTTONMouseClicked
        saveFavB.setEnabled(false);
        j_list.setModel(Static.modelo);
        RESETVIEWBUTTON.setVisible(false);
    }//GEN-LAST:event_RESETVIEWBUTTONMouseClicked

    private void serviceComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_serviceComboItemStateChanged
        saveFavB.setEnabled(false);
        serviceTxt.setText(serviceCombo.getSelectedItem().toString());
    }//GEN-LAST:event_serviceComboItemStateChanged

    private void showFavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFavButtonActionPerformed
//        JOptionPane.showMessageDialog(null, "Not Working yet");
        saveFavB.setEnabled(false);
        j_list.setModel(Static.getFavPasswordsToShow());
        RESETVIEWBUTTON.setVisible(true);
    }//GEN-LAST:event_showFavButtonActionPerformed

    private void j_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_j_listValueChanged
        saveFavB.setEnabled(false);
        try {
            passwordv2 = j_list.getSelectedValue();
            if (passwordv2.isFavorite()) {
                FavRadio.setSelected(true);
            } else {
                FavRadio.setSelected(false);
            }
        } catch (Exception e) {
            FavRadio.setSelected(false);
        }
    }//GEN-LAST:event_j_listValueChanged

    private void FavRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavRadioActionPerformed
        if(!j_list.isSelectionEmpty()){
        saveFavB.setEnabled(true);
        }
    }//GEN-LAST:event_FavRadioActionPerformed

    private void saveFavBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFavBActionPerformed
        if (!j_list.isSelectionEmpty()) {
            if (saveFavB.isEnabled()) {
                boolean favStatus;
                if (FavRadio.isSelected()) {
                    favStatus = true;
                } else {
                    favStatus = false;
                }
                int cont = 0;
                passwordv2 = j_list.getSelectedValue();
                if (passwordv2.isFavorite() != favStatus) {
                    while (true) {
                        if (Static.pw_dir.get(cont).getID() == passwordv2.getID()) {
                            System.out.println("favStatus status: " + favStatus);
                            Static.pw_dir.get(cont).setFavorite(favStatus);
                            Static.UpdateData();
                            Static.LoadData();
                            Static.setModelsItems();
                            System.out.println("ITEM SUCCESSFULLY UPDATE.");
                            System.out.println(Static.pw_dir.get(cont).getService());
                            saveFavB.setEnabled(false);
                            break;
                        }
                        if (cont > Static.pw_dir.size()) {
                            System.out.println("PASSWORD NOT FOUND. ERROR 000033 AT EDITPASSWORD FRAME.");
                            break;
                        }
                        cont++;
                    }
                } else {
                    System.out.println("Already has that status. ");
                    saveFavB.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_saveFavBActionPerformed

    /**
     * Method that makes sure you typed something
     */
    private boolean NullText(String str) {
        if (str.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Copy;
    private javax.swing.JPanel FavPasswordsPanel;
    private javax.swing.JRadioButton FavRadio;
    public static javax.swing.JButton MAIL;
    private javax.swing.JButton PASSWORD;
    private javax.swing.JButton RESETVIEWBUTTON;
    private javax.swing.JButton SEARCHBUTTON;
    private javax.swing.JButton SEEPASSWORD;
    public static javax.swing.JButton User;
    private javax.swing.JButton back;
    private javax.swing.JPanel backAndReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Logic.Passwordv2> j_list;
    private javax.swing.JButton saveFavB;
    private javax.swing.JPanel searchFeatures;
    private javax.swing.JComboBox<String> serviceCombo;
    private javax.swing.JTextField serviceTxt;
    private javax.swing.JButton showFavButton;
    // End of variables declaration//GEN-END:variables
}
