package UI;

import Logic.StaticOld;
import Logic.Passwordv2;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import Logic.FrameMessageThreadClass;
import LogicV3.Memory;
import Objects.Passwordv3;
import LogicV3.Run;

import javax.swing.DefaultListModel;

public class SeePasswords extends javax.swing.JFrame {

    private DefaultListModel<Passwordv3> PASSWORDS_MODEL = new DefaultListModel();
    private int MESSAGES_TIME_BEFORE_DISPOSE = 1200;

    public SeePasswords() {
        initComponents();
        setLocationRelativeTo(null);
        settings();
    }

    private void settings() {
        SET_JLIST_DEFAULT_CONTENT();
        UI_VISUALS();
    }

    private void UI_VISUALS() {
        this.setTitle(Memory.title + " " + Memory.version);
        this.setResizable(false);
        setIconImage(Memory.getIconImage());
        TOGGLE_ACTION_BUTTONS_ENABLED_OR_DISABLED(false);
        TOGGLE_RESET_SEARCH_BUTTON_ENABLE_DISABLED(false);
    }

    private void TOGGLE_ACTION_BUTTONS_ENABLED_OR_DISABLED(boolean STATUS) {
        jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORD.setEnabled(STATUS);
        jButton_PASSWORD.setEnabled(STATUS);
        jButton_User.setEnabled(STATUS);
        jButton_MAIL.setEnabled(STATUS);
        jButton_seePasswordInfo.setEnabled(STATUS);
    }

    private void SET_JLIST_DEFAULT_CONTENT() {
        this.PASSWORDS_MODEL.clear();
        for (Passwordv3 p : Memory.passwordsV3LinkedList) {
            if (p.getInTrashCan().equals("0")) {
                this.PASSWORDS_MODEL.add(0, p);
            }
        }
        this.jList_SEEPASSWORDS.setModel(this.PASSWORDS_MODEL);
    }

    private void SET_CUSTOM_PASSWORDS_LIST_TO_JLIST(DefaultListModel<Passwordv3> PASSWORDS_LIST) {
        this.jList_SEEPASSWORDS.setModel(PASSWORDS_LIST);
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
        jButton_seePasswordInfo = new javax.swing.JButton();
        jtextField_serviceTxt = new javax.swing.JTextField();
        jButton_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDS = new javax.swing.JButton();
        jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORD = new javax.swing.JButton();
        jLabel_MESSAGE_DOUBLE_CLICK_PASSWORDS = new javax.swing.JLabel();
        jButton_reset_search = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        jButton_seePasswordInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_seePasswordInfo.setText("SEE ALL INFORMATION");
        jButton_seePasswordInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_seePasswordInfoActionPerformed(evt);
            }
        });

        jtextField_serviceTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtextField_serviceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtextField_serviceTxtKeyReleased(evt);
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

        jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDS.setText("Show favorite passwords");
        jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDSActionPerformed(evt);
            }
        });

        jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORD.setText("Add/remove favorite");
        jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel_MESSAGE_DOUBLE_CLICK_PASSWORDS.setText("Note: you can copy a password on clipboard by making double click on a password!");

        jButton_reset_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_reset_search.setText("Reset search");
        jButton_reset_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reset_searchActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel3)
                .addGap(153, 153, 153)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton_User, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton_seePasswordInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtextField_serviceTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(jButton_reset_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(60, 60, 60))))
                            .addComponent(jLabel_MESSAGE_DOUBLE_CLICK_PASSWORDS))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_MESSAGE_DOUBLE_CLICK_PASSWORDS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtextField_serviceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_reset_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_backMouseClicked
        StaticOld.admin.openStart();
        this.dispose();
    }//GEN-LAST:event_jButton_backMouseClicked

    // <editor-fold desc="COPY TO CLIPBOARD METHODS (PASSWORD, EMAIL AND USER)">
    private void COPY_PASSWORD_TO_CLIPBOARD() {
        Passwordv3 TEMPORAL_PASSWORD = jList_SEEPASSWORDS.getSelectedValue();
        if (TEMPORAL_PASSWORD != null) {
            if (Memory.DATA_IS_ENCRYPTED) {
                Run.COPY_CONTENT_TO_CLIPBOARD(TEMPORAL_PASSWORD.getPassword_DECRYPTED());
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
                Run.COPY_CONTENT_TO_CLIPBOARD(TEMPORAL_PASSWORD.getEmail_DECRYPTED());
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
                Run.COPY_CONTENT_TO_CLIPBOARD(TEMPORAL_PASSWORD.getUser_DECRYPTED());
                FrameMessageThreadClass th
                        = new FrameMessageThreadClass(this.MESSAGES_TIME_BEFORE_DISPOSE, (byte) 2);
            } else {
                Run.COPY_CONTENT_TO_CLIPBOARD(TEMPORAL_PASSWORD.getUser());
            }
        }
    }

    // </editor-fold>

    private void jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDSActionPerformed
        if (ARE_THERE_FAVORITE_PASSWORDS()) {
            SHOW_OR_HIDE_FAVORITE_PASSWORDS();
            TOGGLE_ACTION_BUTTONS_ENABLED_OR_DISABLED(false);
            jtextField_serviceTxt.setText("");
            TOGGLE_RESET_SEARCH_BUTTON_ENABLE_DISABLED(false);
        } else {
            NO_FAVORITE_PASSWORDS_FOUND_UI_MESSAGE();
        }
    }//GEN-LAST:event_jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDSActionPerformed

    // <editor-fold desc="SHOW OR HIDE FAVORITE PASSWORDS METHODS.">
    private void SHOW_OR_HIDE_FAVORITE_PASSWORDS() {
        if (this.jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDS.getText().equals("Show favorite passwords")) {
            SHOW_FAVORITE_PASSWORDS();
        } else {
            HIDE_FAVORITE_PASSWORDS();
        }
    }

    private boolean ARE_THERE_FAVORITE_PASSWORDS() {
        if (Memory.DATA_IS_ENCRYPTED) {
            return ARE_THERE_FAVORITE_PASSWORDS_ENCRYPTED();
        } else {
            return ARE_THERE_FAVORITE_PASSWORDS_NOT_ENCRYPTED();
        }
    }

    private boolean ARE_THERE_FAVORITE_PASSWORDS_ENCRYPTED() {
        for (int i = 0; i < this.PASSWORDS_MODEL.size(); i++) {
            if (this.PASSWORDS_MODEL.get(i).getFavorite().equals("1")) {
                return true;
            }
        }
        return false;
    }

    private boolean ARE_THERE_FAVORITE_PASSWORDS_NOT_ENCRYPTED() {
        for (int i = 0; i < this.PASSWORDS_MODEL.size(); i++) {
            if (this.PASSWORDS_MODEL.get(i).getFavorite().equals("1")) {
                return true;
            }
        }
        return false;
    }

    private void SHOW_FAVORITE_PASSWORDS() {
        //BUILDS A DefaultListModel WITH ALL THE PASSWORDS MARKED AS FAVORITE
        DefaultListModel<Passwordv3> FAVORITE_PASSWORDS_MODEL_LIST
                = BUILD_FAVORITE_PASSWORDS_MODEL_LIST();

        //SETS THE DefaultListModel WITH ALL THE PASSWORDS MARKED AS FAVORITE
        //INTO THE JLIST
        SET_CUSTOM_PASSWORDS_LIST_TO_JLIST(FAVORITE_PASSWORDS_MODEL_LIST);

        //CHANGES THE TEXT OF THE JBUTTON. THIS IS USED TO KNOW WHAT ACTION
        //MUST BE DONE WHEN THE BUTTON IS CLICKED.
        this.jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDS.setText("Show all passwords");
    }

    private void HIDE_FAVORITE_PASSWORDS() {
        SET_JLIST_DEFAULT_CONTENT();

        //CHANGES THE TEXT OF THE JBUTTON. THIS IS USED TO KNOW WHAT ACTION
        //MUST BE DONE WHEN THE BUTTON IS CLICKED.
        this.jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDS.setText("Show favorite passwords");
    }

    private DefaultListModel<Passwordv3> BUILD_FAVORITE_PASSWORDS_MODEL_LIST() {
        DefaultListModel<Passwordv3> FAVORITE_PASSWORDS_MODEL_LIST
                = new DefaultListModel();
        for (Passwordv3 p : Memory.passwordsV3LinkedList) {
            if (p.getFavorite().equals("1")
                    || p.getFavorite().equals("1")) {
                FAVORITE_PASSWORDS_MODEL_LIST.add(0, p);
            }
        }
        return FAVORITE_PASSWORDS_MODEL_LIST;
    }

    private void NO_FAVORITE_PASSWORDS_FOUND_UI_MESSAGE() {
        FrameMessageThreadClass th
                = new FrameMessageThreadClass(this.MESSAGES_TIME_BEFORE_DISPOSE, (byte) 5);
    }
    // </editor-fold>

    private void jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORDActionPerformed
        if (jList_SEEPASSWORDS.getSelectedValue() != null) {
            TOGGLE_PASSWORD_FAVORITE_MARK();
            TOGGLE_ACTION_BUTTONS_ENABLED_OR_DISABLED(false);
        }
    }//GEN-LAST:event_jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORDActionPerformed

    // <editor-fold desc="ADD REMOVE FAVORITE MARK TO PASSWORD METHODS">
    /**
     * DEPENDING IF THE PASSWORD IS MARKED AS FAVORITE OR NOT THIS METHOD WILL
     * DO EITHER MARK IT AS FAVORITE IF IT IS NOT MARKED AS SO OR DISMARK IT AS
     * FAVORITE IF IT IS MARKED AS FAVORITE.
     */
    private void TOGGLE_PASSWORD_FAVORITE_MARK() {
        Passwordv3 TEMPORAL_PASSWORD = jList_SEEPASSWORDS.getSelectedValue();
        boolean IS_PASSWORD_MARKED_AS_FAVORITE
                = TOGGLE_PASSWORD_FAVORITE_MARK_IS_PASSWORD_FAVORITE_NON_OR_ENCRYPTED_HANDLER(TEMPORAL_PASSWORD);
        TOOGLE_PASSWORD_FAVORITE_MARK_MAKE_CHANGES_INSIDE_DATABASE(TEMPORAL_PASSWORD.getID(), IS_PASSWORD_MARKED_AS_FAVORITE);
        TOOGLE_PASSWORD_FAVORITE_MARK_MAKE_CHANGES_INSIDE_PROGRAM_MEMORY(TEMPORAL_PASSWORD.getID(), IS_PASSWORD_MARKED_AS_FAVORITE);
        if (IS_THERE_TEXT_INSIDE_THE_SEARCH_TEXT_FIELD()) {
            SEARCH_FOR_SERVICES_AND_SET_INTO_JLIST();
        } else {
            SET_JLIST_DEFAULT_CONTENT();
        }
    }

    /**
     * GETS THE CURRENT STATUS OF THE PASSWORD GIVEN TO SEE IF IT IS MARKED AS
     * FAVORITE OR NOT. DOES THE WORK OF CHECKING IF THE DATABASE IS ENCRYPTED
     * OR NOT.
     *
     * @param TEMPORAL_PASSWORD THE PASSWORD THAT IS GOING TO BE EVALUATED.
     * @return RETURNS TRUE IF THIS PASSWORD IS MARKED AS FAVORITE, OTHERWISE
     * FALSE.
     */
    private boolean TOGGLE_PASSWORD_FAVORITE_MARK_IS_PASSWORD_FAVORITE_NON_OR_ENCRYPTED_HANDLER(Passwordv3 TEMPORAL_PASSWORD) {
        if (Memory.DATA_IS_ENCRYPTED) {
            if (TEMPORAL_PASSWORD.getFavorite().equals("0")) {
                return true;
            } else {
                return false;
            }
        } else {
            if (TEMPORAL_PASSWORD.getFavorite().equals("0")) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * MAKES THE CHANGES INSIDE THE DATABASE.
     *
     * @param TEMPORAL_PASSWORD THE PASSWORD THAT WILL BE CHANGED. IT IS ASKED
     * TO KNOW PASSWORD'S ID.
     * @param IS_PASSWORD_MARKED_AS_FAVORITE BOOLEAN THAT LETS KNOW THE PROGRAM
     * WHETER THE PASSWORD IS MARKED AS FAVORITE OR NOT.
     */
    private void TOOGLE_PASSWORD_FAVORITE_MARK_MAKE_CHANGES_INSIDE_DATABASE(String TEMPORAL_PASSWORD_ID, boolean IS_PASSWORD_MARKED_AS_FAVORITE) {
        String QUERY = "UPDATE PASSS\n"
                + " SET "
                + "Favorite = "
                + TOGGLE_PASSWORD_FAVORITE_MARK_CONVERT_BOOLEAN_TO_INT_BOOLEAN(IS_PASSWORD_MARKED_AS_FAVORITE)
                + " WHERE "
                + "ID = " + TEMPORAL_PASSWORD_ID;

        Memory.sqlite.Query(QUERY, "Password updated");
    }

    private void TOOGLE_PASSWORD_FAVORITE_MARK_MAKE_CHANGES_INSIDE_PROGRAM_MEMORY(String PASSWORD_ID, boolean IS_PASSWORD_FAVORITE) {
        for (Passwordv3 p : Memory.passwordsV3LinkedList) {
            if (p.getID().equals(PASSWORD_ID)) {
                if (Memory.DATA_IS_ENCRYPTED) {
                    p.setFavorite("" + TOGGLE_PASSWORD_FAVORITE_MARK_CONVERT_BOOLEAN_TO_INT_BOOLEAN(IS_PASSWORD_FAVORITE));
                } else {
                    p.setFavorite("" + TOGGLE_PASSWORD_FAVORITE_MARK_CONVERT_BOOLEAN_TO_INT_BOOLEAN(IS_PASSWORD_FAVORITE));
                }
            }
        }
    }

    /**
     * CONVERTS TRUE/FALSE BOOLEAN TO 1/0 INT BOOLEAN. INSIDE THE DATABASE, THE
     * FAVORITE MARK WORKS WITH 0=FALSE OR 1=TRUE.
     *
     * @param IS_PASSWORD_MARKED_AS_FAVORITE THE BOOLEAN VALUE TO BE CONVERTED
     * INTO INT BOOLEAN.
     * @return RETURNS INT BOLEAN. 1=TRUE. 0=FALSE.
     */
    private int TOGGLE_PASSWORD_FAVORITE_MARK_CONVERT_BOOLEAN_TO_INT_BOOLEAN(boolean IS_PASSWORD_MARKED_AS_FAVORITE) {
        if (IS_PASSWORD_MARKED_AS_FAVORITE) {
            return 1;
        } else {
            return 0;
        }
    }
    // </editor-fold>

    private void jList_SEEPASSWORDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_SEEPASSWORDSMouseClicked
        if (Memory.DATA_IS_ENCRYPTED) {
            UI_CHANGES_WHEN_JLIST_CLICKED_ENCRYPTED();
        } else {
            UI_CHANGES_WHEN_JLIST_CLICKED_NOT_ENCRYPTED();
        }

        COPY_PASSWORD_TO_CLIPBOARD_WHEN_DOBLE_CLICK(evt);
    }//GEN-LAST:event_jList_SEEPASSWORDSMouseClicked

    /**
     * WHEN THE USER CLICKS ON A PASSWORD INSIDE THE JLIST, SOME BUTTONS ARE
     * ENABLED AND DISABLED. THIS METHOD DOES THE COMPROBATION WHEN THE PROGRAM
     * IS WORKING WITH AN ECRYPTED DATABASE.
     */
    private void UI_CHANGES_WHEN_JLIST_CLICKED_ENCRYPTED() {
        Passwordv3 TEMPORAL_PASSWORD = jList_SEEPASSWORDS.getSelectedValue();
        if (TEMPORAL_PASSWORD != null) {
            jButton_PASSWORD.setEnabled(true);
            jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORD.setEnabled(true);
            jButton_seePasswordInfo.setEnabled(true);
            if (!TEMPORAL_PASSWORD.getEmail_DECRYPTED().equals("")) {
                jButton_MAIL.setEnabled(true);
            } else {
                jButton_MAIL.setEnabled(false);
            }
            if (!TEMPORAL_PASSWORD.getUser_DECRYPTED().equals("")) {
                jButton_User.setEnabled(true);
            } else {
                jButton_User.setEnabled(false);
            }

        }
    }

    /**
     * WHEN THE USER CLICKS ON A PASSWORD INSIDE THE JLIST, SOME BUTTONS ARE
     * ENABLED AND DISABLED. THIS METHOD DOES THE COMPROBATION WHEN THE PROGRAM
     * IS WORKING WITH A NOT ECRYPTED DATABASE.
     */
    private void UI_CHANGES_WHEN_JLIST_CLICKED_NOT_ENCRYPTED() {
        Passwordv3 TEMPORAL_PASSWORD = jList_SEEPASSWORDS.getSelectedValue();
        if (TEMPORAL_PASSWORD != null) {
            jButton_PASSWORD.setEnabled(true);
            jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORD.setEnabled(true);
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

    private void jtextField_serviceTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextField_serviceTxtKeyReleased
        if (IS_THERE_TEXT_INSIDE_THE_SEARCH_TEXT_FIELD()) {
            TOGGLE_RESET_SEARCH_BUTTON_ENABLE_DISABLED(true);
            SEARCH_FOR_SERVICES_AND_SET_INTO_JLIST();
        } else {
            TOGGLE_RESET_SEARCH_BUTTON_ENABLE_DISABLED(false);
            SET_JLIST_DEFAULT_CONTENT();
            jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDS.setText("Show favorite passwords");
        }
    }//GEN-LAST:event_jtextField_serviceTxtKeyReleased

    private boolean IS_THERE_TEXT_INSIDE_THE_SEARCH_TEXT_FIELD() {
        if (this.jtextField_serviceTxt.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    private void SEARCH_FOR_SERVICES_AND_SET_INTO_JLIST() {
        String TEXT_TYPED = jtextField_serviceTxt.getText().toUpperCase();
        DefaultListModel<Passwordv3> TEMPORAL_PASSWORDS_LIST
                = new DefaultListModel<>();
        for (int i = 0; i < this.jList_SEEPASSWORDS.getModel().getSize(); i++) {
            if (this.jList_SEEPASSWORDS.getModel().getElementAt(i).getService_LEGIBLE().contains(TEXT_TYPED)) {
                TEMPORAL_PASSWORDS_LIST.add(0, this.PASSWORDS_MODEL.get(i));
            }
        }
        SET_CUSTOM_PASSWORDS_LIST_TO_JLIST(TEMPORAL_PASSWORDS_LIST);
    }

    private void TOGGLE_RESET_SEARCH_BUTTON_ENABLE_DISABLED(boolean STATUS) {
        this.jButton_reset_search.setEnabled(STATUS);
    }

    private void jButton_reset_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reset_searchActionPerformed
        this.jtextField_serviceTxt.setText("");
        TOGGLE_RESET_SEARCH_BUTTON_ENABLE_DISABLED(false);
        SET_JLIST_DEFAULT_CONTENT();
        jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDS.setText("Show favorite passwords");
    }//GEN-LAST:event_jButton_reset_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.jLabel_MESSAGE_DOUBLE_CLICK_PASSWORDS.setVisible(false);
        for (Passwordv3 p : Memory.passwordsV3LinkedList) {
            System.out.println(p);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_ADD_REMOVE_FAVORITE_MARK_TO_PASSWORD;
    public static javax.swing.JButton jButton_MAIL;
    private javax.swing.JButton jButton_PASSWORD;
    private javax.swing.JButton jButton_SHOW_OR_HIDE_FAVORITE_PASSWORDS;
    public static javax.swing.JButton jButton_User;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_reset_search;
    private javax.swing.JButton jButton_seePasswordInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_MESSAGE_DOUBLE_CLICK_PASSWORDS;
    private javax.swing.JList<Objects.Passwordv3> jList_SEEPASSWORDS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtextField_serviceTxt;
    // End of variables declaration//GEN-END:variables

}
