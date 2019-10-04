package UI;

import Logic.StaticOld;
import Logic.Passwordv2;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import Logic.FrameMessageThreadClass;
import LogicV3.Memory;
import LogicV3.Passwordv3;
import LogicV3.Run;

import javax.swing.DefaultListModel;

public class SeePasswords extends javax.swing.JFrame {

    private Passwordv2 generalPassword;
    private DefaultListModel<Passwordv3> PASSWORDS_MODEL = new DefaultListModel();
    private boolean searchPerformed = false;
    private boolean showFavoritesPerformed = false;
    private boolean SearchEnganched = false;
    private int MESSAGES_TIME_BEFORE_DISPOSE = 1200;
    private byte password = 0, mail = 1, user = 2;

    public SeePasswords() {
        initComponents();
        setLocationRelativeTo(null);
        settings();
    }

    private void settings() {
        SET_JLIST_SETTINGS();
        SET_SEARCH_COMBOBOX();
        UI_VISUALS();
    }

    private void UI_VISUALS() {
        this.setTitle(Memory.title + " " + Memory.version);
        this.setResizable(false);
        jButton_saveFavB.setEnabled(false);
        setIconImage(Memory.getIconImage());
        jButton_PASSWORD.setEnabled(false);
        jButton_User.setEnabled(false);
        jButton_MAIL.setEnabled(false);
        jButton_seePasswordInfo.setEnabled(false);
    }

    private void SET_JLIST_SETTINGS() {
        this.PASSWORDS_MODEL.clear();
        for (Passwordv3 p : Memory.passwordsV3LinkedList) {
            this.PASSWORDS_MODEL.add(0, p);
        }
        this.jList_SEEPASSWORDS.setModel(this.PASSWORDS_MODEL);
    }

    private void SET_SEARCH_COMBOBOX() {
        jCombobox_serviceSearch.removeAllItems();
        boolean DATA_IS_ENCRYPTED = Memory.DATA_IS_ENCRYPTED;
        for (Passwordv3 p : Memory.passwordsV3LinkedList) {
            if (DATA_IS_ENCRYPTED) {
                jCombobox_serviceSearch.addItem(p.getService_ENCRYPTED());
            } else {
                jCombobox_serviceSearch.addItem(p.getService());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList_SEEPASSWORDS = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton_MAIL = new javax.swing.JButton();
        jButton_User = new javax.swing.JButton();
        jButton_PASSWORD = new javax.swing.JButton();
        jButton_SEARCHBUTTON = new javax.swing.JButton();
        jButton_seePasswordInfo = new javax.swing.JButton();
        jCombobox_serviceSearch = new javax.swing.JComboBox<>();
        serviceTxt = new javax.swing.JTextField();
        jButton_saveFavB = new javax.swing.JButton();
        jButton_showFavButton = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList_SEEPASSWORDS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jList_SEEPASSWORDS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_SEEPASSWORDSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList_SEEPASSWORDS);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Search:");

        jButton_MAIL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_MAIL.setText("MAIL");
        jButton_MAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MAILActionPerformed(evt);
            }
        });

        jButton_User.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_User.setText("USER");
        jButton_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UserActionPerformed(evt);
            }
        });

        jButton_PASSWORD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_PASSWORD.setText("PASSWORD");
        jButton_PASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PASSWORDActionPerformed(evt);
            }
        });

        jButton_SEARCHBUTTON.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_SEARCHBUTTON.setText("SEARCH SERVICE");
        jButton_SEARCHBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SEARCHBUTTONActionPerformed(evt);
            }
        });

        jButton_seePasswordInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_seePasswordInfo.setText("SEE ALL INFORMATION");
        jButton_seePasswordInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_seePasswordInfoActionPerformed(evt);
            }
        });

        jCombobox_serviceSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCombobox_serviceSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombobox_serviceSearchItemStateChanged(evt);
            }
        });

        serviceTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton_saveFavB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_saveFavB.setText("Add/remove favorite");
        jButton_saveFavB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveFavBActionPerformed(evt);
            }
        });

        jButton_showFavButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_showFavButton.setText("Show favorite passwords");
        jButton_showFavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_showFavButtonActionPerformed(evt);
            }
        });

        jButton_back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_back.setText("Back");
        jButton_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_backMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Favorites");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Copy to clipboard:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel3)
                .addGap(153, 153, 153)
                .addComponent(jLabel2)
                .addGap(187, 187, 187)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton_User, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_seePasswordInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_showFavButton)
                    .addComponent(jButton_saveFavB, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serviceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCombobox_serviceSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SEARCHBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_PASSWORD)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_MAIL)
                            .addComponent(jButton_User))
                        .addGap(3, 3, 3)
                        .addComponent(jButton_seePasswordInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_showFavButton)
                        .addGap(9, 9, 9)
                        .addComponent(jButton_saveFavB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(serviceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCombobox_serviceSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jButton_SEARCHBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_backMouseClicked
        if (SearchEnganched) {
            StaticOld.LoadData();
            StaticOld.setModelsItems();
        }
        StaticOld.admin.openStart();
        this.dispose();
    }//GEN-LAST:event_jButton_backMouseClicked

    // <editor-fold desc="COPY TO CLIPBOARD METHODS (PASSWORD, EMAIL AND USER)">
    private void COPY_PASSWORD_TO_CLIPBOARD() {
        Passwordv3 TEMPORAL_PASSWORD = jList_SEEPASSWORDS.getSelectedValue();
        if (TEMPORAL_PASSWORD != null) {
            if (Memory.DATA_IS_ENCRYPTED) {
                Run.COPY_CONTENT_TO_CLIPBOARD(TEMPORAL_PASSWORD.getPassword_ENCRYPTED());
                FrameMessageThreadClass th
                        = new FrameMessageThreadClass(this.MESSAGES_TIME_BEFORE_DISPOSE, (byte) 0);
            } else {
                Run.COPY_CONTENT_TO_CLIPBOARD(TEMPORAL_PASSWORD.getPassword());
            }
        }
    }

    private void COPY_EMAIL_TO_CLIPBOARD() {
        Passwordv3 TEMPORAL_PASSWORD = jList_SEEPASSWORDS.getSelectedValue();
        if (TEMPORAL_PASSWORD != null) {
            if (Memory.DATA_IS_ENCRYPTED) {
                Run.COPY_CONTENT_TO_CLIPBOARD(TEMPORAL_PASSWORD.getEmail_ENCRYPTED());
                FrameMessageThreadClass th
                        = new FrameMessageThreadClass(this.MESSAGES_TIME_BEFORE_DISPOSE, (byte) 1);
            } else {
                Run.COPY_CONTENT_TO_CLIPBOARD(TEMPORAL_PASSWORD.getEmail());
            }
        }
    }

    private void COPY_USER_TO_CLIPBOARD() {
        Passwordv3 TEMPORAL_PASSWORD = jList_SEEPASSWORDS.getSelectedValue();
        if (TEMPORAL_PASSWORD != null) {
            if (Memory.DATA_IS_ENCRYPTED) {
                Run.COPY_CONTENT_TO_CLIPBOARD(TEMPORAL_PASSWORD.getUser_ENCRYPTED());
                FrameMessageThreadClass th
                        = new FrameMessageThreadClass(this.MESSAGES_TIME_BEFORE_DISPOSE, (byte) 2);
            } else {
                Run.COPY_CONTENT_TO_CLIPBOARD(TEMPORAL_PASSWORD.getUser());
            }
        }
    }

    // </editor-fold>

    private void jButton_showFavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_showFavButtonActionPerformed
        if (!showFavoritesPerformed) {
            Boolean thereAreFavPasswords = showFavorites();
            if (thereAreFavPasswords) {
                jButton_showFavButton.setText("RESET VIEW");
                showFavoritesPerformed = true;
            }
        } else {
            jList_SEEPASSWORDS.setModel(Memory.passwords_model);
            jButton_showFavButton.setText("Show favorite passwords");
            showFavoritesPerformed = false;
        }
    }//GEN-LAST:event_jButton_showFavButtonActionPerformed

    private boolean showFavorites() {
        boolean thereAreFavPasswords = true;
        DefaultListModel<Passwordv2> tempModel = new DefaultListModel();
        for (Passwordv2 password : Memory.data.getUserData().getPasswordsList()) {
            if (password.isFavorite()) {
                tempModel.addElement(password);
            }
        }
        if (!tempModel.isEmpty()) {
            jList_SEEPASSWORDS.setModel(tempModel);
        } else {
            Memory.run.message("There are not any password setted as favorite", "No fav passwords", 1);
            thereAreFavPasswords = false;
        }
        return thereAreFavPasswords;
    }

    private void jButton_saveFavBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveFavBActionPerformed
        if (jList_SEEPASSWORDS.getSelectedValue() != null) {
            TOGGLE_PASSWORD_FAVORITE();
        }
    }//GEN-LAST:event_jButton_saveFavBActionPerformed

    private void TOGGLE_PASSWORD_FAVORITE() {
        Passwordv3 TEMPORAL_PASSWORD = jList_SEEPASSWORDS.getSelectedValue();
        boolean PASSWORD_CURRENT_FAV_STATUS
                = TOGGLE_PASSWORD_FAVORITE_IS_PASSWORD_FAVORITE(TEMPORAL_PASSWORD);
        boolean FAV_VALUE_TOGGLE;
        if (PASSWORD_CURRENT_FAV_STATUS) {
            FAV_VALUE_TOGGLE = false;
        } else {
            FAV_VALUE_TOGGLE = true;
        }
        String QUERY = "UPDATE PASSS\n"
                + " SET "
                + "Favorite = "
                + TOGGLE_PASSWORD_FAVORITE_INT_VALUE_FOR_SQLITE_COLUMN(FAV_VALUE_TOGGLE)
                + " WHERE "
                + "ID = " + TEMPORAL_PASSWORD.getID();

        Memory.sqlite.Query(QUERY, "");
        System.out.println("DONE!");
    }

    private boolean TOGGLE_PASSWORD_FAVORITE_IS_PASSWORD_FAVORITE(Passwordv3 TEMPORAL_PASSWORD) {
        if (Memory.DATA_IS_ENCRYPTED) {
            if (TEMPORAL_PASSWORD.getFavorite_ENCRYPTED().equals("0")) {
                return false;
            } else {
                return true;
            }
        } else {
            if (TEMPORAL_PASSWORD.getFavorite().equals("0")) {
                return false;
            } else {
                return true;
            }
        }
    }

    private int TOGGLE_PASSWORD_FAVORITE_INT_VALUE_FOR_SQLITE_COLUMN(boolean FAV_VALUE_TOGGLE) {
        //The database works with 0 or 1 at its bol Favorite column.
        if (FAV_VALUE_TOGGLE) {
            return 1;
        } else {
            return 0;
        }
    }

    private void jButton_SEARCHBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCHBUTTONActionPerformed
        if (!searchPerformed) {
            searchService();
            jButton_SEARCHBUTTON.setText("RESET VIEW");
            searchPerformed = true;
        } else {
            jList_SEEPASSWORDS.setModel(Memory.passwords_model);
            jButton_SEARCHBUTTON.setText("SEARCH SERVICE");
            searchPerformed = false;
        }


    }//GEN-LAST:event_jButton_SEARCHBUTTONActionPerformed

    private void jCombobox_serviceSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombobox_serviceSearchItemStateChanged
        serviceTxt.setText(jCombobox_serviceSearch.getSelectedItem().toString());
    }//GEN-LAST:event_jCombobox_serviceSearchItemStateChanged

    private void jList_SEEPASSWORDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_SEEPASSWORDSMouseClicked
        if (Memory.DATA_IS_ENCRYPTED) {
            UI_CHANGES_WHEN_JLIST_CLICKED_ENCRYPTED();
        } else {

        }
        UI_CHANGES_WHEN_JLIST_CLICKED_ENCRYPTED();
        COPY_PASSWORD_TO_CLIPBOARD_WHEN_DOBLE_CLICK(evt);
    }//GEN-LAST:event_jList_SEEPASSWORDSMouseClicked

    private void UI_CHANGES_WHEN_JLIST_CLICKED_ENCRYPTED() {
        Passwordv3 TEMPORAL_PASSWORD = jList_SEEPASSWORDS.getSelectedValue();
        if (TEMPORAL_PASSWORD != null) {
            jButton_PASSWORD.setEnabled(true);
            jButton_saveFavB.setEnabled(true);
            jButton_seePasswordInfo.setEnabled(true);
            if (!TEMPORAL_PASSWORD.getEmail_ENCRYPTED().equals("")) {
                jButton_MAIL.setEnabled(true);
            } else {
                jButton_MAIL.setEnabled(false);
            }
            if (!TEMPORAL_PASSWORD.getUser_ENCRYPTED().equals("")) {
                jButton_User.setEnabled(true);
            } else {
                jButton_User.setEnabled(false);
            }

        }
    }

    private void UI_CHANGES_WHEN_JLIST_CLICKED_NOT_ENCRYPTED() {
        Passwordv3 TEMPORAL_PASSWORD = jList_SEEPASSWORDS.getSelectedValue();
        if (TEMPORAL_PASSWORD != null) {
            jButton_PASSWORD.setEnabled(true);
            jButton_saveFavB.setEnabled(true);
            jButton_seePasswordInfo.setEnabled(true);
            if (!TEMPORAL_PASSWORD.getEmail().equals("")) {
                jButton_MAIL.setEnabled(true);
            } else {
                jButton_MAIL.setEnabled(false);
            }
            if (!TEMPORAL_PASSWORD.getUser().equals("")) {
                jButton_User.setEnabled(true);
            } else {
                jButton_User.setEnabled(false);
            }
        }
    }

    private void COPY_PASSWORD_TO_CLIPBOARD_WHEN_DOBLE_CLICK(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            COPY_PASSWORD_TO_CLIPBOARD();
        }
    }

    private void jButton_PASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PASSWORDActionPerformed
        COPY_PASSWORD_TO_CLIPBOARD();
    }//GEN-LAST:event_jButton_PASSWORDActionPerformed

    private void jButton_MAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MAILActionPerformed
        COPY_EMAIL_TO_CLIPBOARD();
    }//GEN-LAST:event_jButton_MAILActionPerformed

    private void jButton_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UserActionPerformed
        COPY_USER_TO_CLIPBOARD();
    }//GEN-LAST:event_jButton_UserActionPerformed

    private void jButton_seePasswordInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_seePasswordInfoActionPerformed
        try {
            Passwordv3 TEMPORAL_PASSWORD = jList_SEEPASSWORDS.getSelectedValue();
            if (TEMPORAL_PASSWORD != null) {
                SeePasswordInformation f = new SeePasswordInformation(TEMPORAL_PASSWORD);
                f.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_seePasswordInfoActionPerformed

    private void searchService() {
        if (!serviceTxt.getText().equals("")) {
            DefaultListModel<Passwordv2> tempModel = new DefaultListModel();
            for (Passwordv2 password : Memory.data.getUserData().getPasswordsList()) {
                if (password.getService(Memory.return_encoded).equals(serviceTxt.getText())) {
                    tempModel.addElement(password);
                }
            }
            if (!tempModel.isEmpty()) {
                jList_SEEPASSWORDS.setModel(tempModel);

            } else {
                Memory.run.message("There is not any password associated with the service name \"" + serviceTxt.getText() + "\"", "Not found", 0);
            }
        } else {
            System.out.println("Empty field");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton_MAIL;
    private javax.swing.JButton jButton_PASSWORD;
    private javax.swing.JButton jButton_SEARCHBUTTON;
    public static javax.swing.JButton jButton_User;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_saveFavB;
    private javax.swing.JButton jButton_seePasswordInfo;
    private javax.swing.JButton jButton_showFavButton;
    private javax.swing.JComboBox<String> jCombobox_serviceSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<LogicV3.Passwordv3> jList_SEEPASSWORDS;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField serviceTxt;
    // End of variables declaration//GEN-END:variables

}
