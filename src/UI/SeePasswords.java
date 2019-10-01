package UI;

import Logic.StaticOld;
import Logic.Passwordv2;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import Logic.ThreadClass_Message;
import LogicV3.Memory;
import LogicV3.Passwordv3;
import javax.swing.DefaultListModel;

public class SeePasswords extends javax.swing.JFrame {

    private Passwordv2 generalPassword;
    private DefaultListModel<Passwordv3> PASSWORDS_MODEL = new DefaultListModel();
    private boolean searchPerformed = false;
    private boolean showFavoritesPerformed = false;
    private boolean SearchEnganched = false;
    private int timeThread = 1200;
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
        saveFavB.setEnabled(false);
        setIconImage(Memory.getIconImage());
        PASSWORD.setEnabled(false);
        User.setEnabled(false);
        MAIL.setEnabled(false);
        seePasswordInfo.setEnabled(false);
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
        MAIL = new javax.swing.JButton();
        User = new javax.swing.JButton();
        PASSWORD = new javax.swing.JButton();
        SEARCHBUTTON = new javax.swing.JButton();
        seePasswordInfo = new javax.swing.JButton();
        jCombobox_serviceSearch = new javax.swing.JComboBox<>();
        serviceTxt = new javax.swing.JTextField();
        saveFavB = new javax.swing.JButton();
        showFavButton = new javax.swing.JButton();
        back = new javax.swing.JButton();
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

        MAIL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MAIL.setText("MAIL");
        MAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAILActionPerformed(evt);
            }
        });

        User.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        User.setText("USER");
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        PASSWORD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PASSWORD.setText("PASSWORD");
        PASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSWORDActionPerformed(evt);
            }
        });

        SEARCHBUTTON.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SEARCHBUTTON.setText("SEARCH SERVICE");
        SEARCHBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHBUTTONActionPerformed(evt);
            }
        });

        seePasswordInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        seePasswordInfo.setText("SEE ALL INFORMATION");
        seePasswordInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seePasswordInfoMouseClicked(evt);
            }
        });

        jCombobox_serviceSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCombobox_serviceSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombobox_serviceSearchItemStateChanged(evt);
            }
        });

        serviceTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        saveFavB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveFavB.setText("Add/remove favorite");
        saveFavB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFavBActionPerformed(evt);
            }
        });

        showFavButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showFavButton.setText("Show favorite passwords");
        showFavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFavButtonActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
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
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(seePasswordInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showFavButton)
                    .addComponent(saveFavB, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serviceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCombobox_serviceSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEARCHBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PASSWORD)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MAIL)
                            .addComponent(User))
                        .addGap(3, 3, 3)
                        .addComponent(seePasswordInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showFavButton)
                        .addGap(9, 9, 9)
                        .addComponent(saveFavB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(serviceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCombobox_serviceSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(SEARCHBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if (SearchEnganched) {
            StaticOld.LoadData();
            StaticOld.setModelsItems();
        }
        StaticOld.admin.openStart();
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void passwordCopyToDo() {
        saveFavB.setEnabled(false);
        try {
            Clipboard clip = getToolkit().getSystemClipboard();
            Passwordv2 toClipBoardPassword = jList_SEEPASSWORDS.getSelectedValue();
            StringSelection stringClip = new StringSelection(toClipBoardPassword.getPassword(Memory.return_encoded));
            clip.setContents(stringClip, stringClip);
            ThreadClass_Message threadClass = new ThreadClass_Message(timeThread, password);/*action 0 to change button text*/
            threadClass.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void seePasswordInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seePasswordInfoMouseClicked
        try {
            Passwordv2 password = jList_SEEPASSWORDS.getSelectedValue();
            if (password != null) {
                FrameSeePasswordText f = new FrameSeePasswordText(password);
                f.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_seePasswordInfoMouseClicked

    private void showFavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFavButtonActionPerformed
        if (!showFavoritesPerformed) {
            Boolean thereAreFavPasswords = showFavorites();
            if (thereAreFavPasswords) {
                showFavButton.setText("RESET VIEW");
                showFavoritesPerformed = true;
            }
        } else {
            jList_SEEPASSWORDS.setModel(Memory.passwords_model);
            showFavButton.setText("Show favorite passwords");
            showFavoritesPerformed = false;
        }
    }//GEN-LAST:event_showFavButtonActionPerformed

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

    private void saveFavBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFavBActionPerformed
        Passwordv2 tempPassword = jList_SEEPASSWORDS.getSelectedValue();
        try {
            if (tempPassword != null) {
                for (int i = 0; i < Memory.data.getUserData().getPasswordsList().size(); i++) {
                    if (Memory.data.getUserData().getPasswordsList().get(i).getID() == tempPassword.getID()) {
                        if (Memory.data.getUserData().getPasswordsList().get(i).isFavorite()) {
                            Memory.data.getUserData().getPasswordsList().get(i).setFavorite(false);
                            System.out.println("Password fav = false");
                            break;
                        } else {
                            Memory.data.getUserData().getPasswordsList().get(i).setFavorite(true);
                            System.out.println("Password fav = true");
                            break;
                        }
                    }
                }
                Memory.data.updateInfo();
                jList_SEEPASSWORDS.setModel(Memory.run.setModelAndGet());
            } else {
                System.out.println("User does not selected any password.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveFavBActionPerformed

    private void SEARCHBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHBUTTONActionPerformed
        if (!searchPerformed) {
            searchService();
            SEARCHBUTTON.setText("RESET VIEW");
            searchPerformed = true;
        } else {
            jList_SEEPASSWORDS.setModel(Memory.passwords_model);
            SEARCHBUTTON.setText("SEARCH SERVICE");
            searchPerformed = false;
        }


    }//GEN-LAST:event_SEARCHBUTTONActionPerformed

    private void jCombobox_serviceSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombobox_serviceSearchItemStateChanged
        serviceTxt.setText(jCombobox_serviceSearch.getSelectedItem().toString());
    }//GEN-LAST:event_jCombobox_serviceSearchItemStateChanged

    private void jList_SEEPASSWORDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_SEEPASSWORDSMouseClicked
        Passwordv2 pass = jList_SEEPASSWORDS.getSelectedValue();
        if (pass != null) {
            PASSWORD.setEnabled(true);
            saveFavB.setEnabled(true);
            seePasswordInfo.setEnabled(true);
            if (!pass.getMail(Memory.return_encoded).equals("")) {
                MAIL.setEnabled(true);
            } else {
                MAIL.setEnabled(false);
            }
            if (!pass.getUser(Memory.return_encoded).equals("")) {
                User.setEnabled(true);
            } else {
                User.setEnabled(false);
            }
            if (evt.getClickCount() == 2) {
                passwordCopyToDo();
            }
        }
    }//GEN-LAST:event_jList_SEEPASSWORDSMouseClicked

    private void PASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASSWORDActionPerformed
        passwordCopyToDo();
    }//GEN-LAST:event_PASSWORDActionPerformed

    private void MAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAILActionPerformed
        saveFavB.setEnabled(false);
        try {
            Clipboard clip = getToolkit().getSystemClipboard();
            Passwordv2 toClipBoardPassword = jList_SEEPASSWORDS.getSelectedValue();
            StringSelection stringClip = new StringSelection(toClipBoardPassword.getMail(Memory.return_encoded));
            clip.setContents(stringClip, stringClip);
            ThreadClass_Message t = new ThreadClass_Message(timeThread, mail);
            t.start();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_MAILActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        saveFavB.setEnabled(false);
        try {
            Clipboard clip = getToolkit().getSystemClipboard();
            Passwordv2 toClipBoardPassword = jList_SEEPASSWORDS.getSelectedValue();
            StringSelection stringClip = new StringSelection(toClipBoardPassword.getUser(Memory.return_encoded));
            clip.setContents(stringClip, stringClip);
            ThreadClass_Message t = new ThreadClass_Message(timeThread, user);
            t.start();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_UserActionPerformed

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
    public static javax.swing.JButton MAIL;
    private javax.swing.JButton PASSWORD;
    private javax.swing.JButton SEARCHBUTTON;
    public static javax.swing.JButton User;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> jCombobox_serviceSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<LogicV3.Passwordv3> jList_SEEPASSWORDS;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton saveFavB;
    private javax.swing.JButton seePasswordInfo;
    private javax.swing.JTextField serviceTxt;
    private javax.swing.JButton showFavButton;
    // End of variables declaration//GEN-END:variables

}
