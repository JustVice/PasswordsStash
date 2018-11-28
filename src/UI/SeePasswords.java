package UI;

import Logic.StaticOld;
import Logic.Passwordv2;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import Logic.ThreadClass;
import LogicV2.Static;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class SeePasswords extends javax.swing.JFrame {

    private Passwordv2 generalPassword;
    private boolean searchPerformed = false;
    private boolean showFavoritesPerformed = false;

    public SeePasswords() {
        initComponents();
        setLocationRelativeTo(null);
        settings();
    }

    private void settings() {
        setPasswordsToJlist();
        setComboBox();
        SearchEnganched = false;
        this.setTitle(Static.title + " " + Static.version);
        this.setResizable(false);
        saveFavB.setEnabled(false);
    }

    private void setPasswordsToJlist() {
        j_list.setModel(Static.run.setModelAndGet());
    }

    private void setComboBox() {
        LinkedList<String> items = new LinkedList<String>();
        for (Passwordv2 password : Static.data.getUserData().getPasswordsList()) {
            boolean repeated = false;
            for (String str : items) {
                if (str.equals(password.getService())) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                items.add(password.getService());
            }
        }
        for (String str : items) {
            serviceCombo.addItem(str);
        }
    }

    private boolean SearchEnganched;
    private int timeThread = 1200;
    private byte password = 0, mail = 1, user = 2;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        j_list = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        MAIL = new javax.swing.JButton();
        User = new javax.swing.JButton();
        PASSWORD = new javax.swing.JButton();
        SEARCHBUTTON = new javax.swing.JButton();
        SEEPASSWORD = new javax.swing.JButton();
        serviceCombo = new javax.swing.JComboBox<>();
        serviceTxt = new javax.swing.JTextField();
        saveFavB = new javax.swing.JButton();
        showFavButton = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(j_list);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Search:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, -1, -1));

        MAIL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MAIL.setText("MAIL");
        MAIL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MAILMouseClicked(evt);
            }
        });
        getContentPane().add(MAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 110, -1));

        User.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        User.setText("USER");
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 110, -1));

        PASSWORD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PASSWORD.setText("PASSWORD");
        PASSWORD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PASSWORDMouseClicked(evt);
            }
        });
        getContentPane().add(PASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 220, -1));

        SEARCHBUTTON.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SEARCHBUTTON.setText("SEARCH SERVICE");
        SEARCHBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHBUTTONActionPerformed(evt);
            }
        });
        getContentPane().add(SEARCHBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 200, 40));

        SEEPASSWORD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SEEPASSWORD.setText("SEE ALL INFORMATION");
        SEEPASSWORD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SEEPASSWORDMouseClicked(evt);
            }
        });
        getContentPane().add(SEEPASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 220, 30));

        serviceCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        serviceCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                serviceComboItemStateChanged(evt);
            }
        });
        getContentPane().add(serviceCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 200, 30));

        serviceTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(serviceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 528, 200, 30));

        saveFavB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveFavB.setText("Add/remove favorite");
        saveFavB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFavBActionPerformed(evt);
            }
        });
        getContentPane().add(saveFavB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 260, 70));

        showFavButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showFavButton.setText("Show favorite passwords");
        showFavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFavButtonActionPerformed(evt);
            }
        });
        getContentPane().add(showFavButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, -1));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 109, 110));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Favorites");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Copy to clipboard:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, -1));

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
        try {
            Passwordv2 password = j_list.getSelectedValue();
            if (password != null) {
                FrameSeePasswordText f = new FrameSeePasswordText(password);
                f.setVisible(true);
            }
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

    private void showFavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFavButtonActionPerformed
        if (!showFavoritesPerformed) {
            Boolean thereAreFavPasswords = showFavorites();
            if (thereAreFavPasswords) {
                showFavButton.setText("RESET VIEW");
                showFavoritesPerformed = true;
            }
        } else {
            j_list.setModel(Static.modeloPasswords);
            showFavButton.setText("Show favorite passwords");
            showFavoritesPerformed = false;
        }
    }//GEN-LAST:event_showFavButtonActionPerformed

    private boolean showFavorites() {
        boolean thereAreFavPasswords = true;
        DefaultListModel<Passwordv2> tempModel = new DefaultListModel();
        for (Passwordv2 password : Static.data.getUserData().getPasswordsList()) {
            if (password.isFavorite()) {
                tempModel.addElement(password);
            }
        }
        if (!tempModel.isEmpty()) {
            j_list.setModel(tempModel);
        } else {
            Static.run.message("There are not any password setted as favorite", "No fav passwords", 1);
            thereAreFavPasswords = false;
        }
        return thereAreFavPasswords;
    }

    private void saveFavBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFavBActionPerformed
        Passwordv2 tempPassword = j_list.getSelectedValue();
        try {
            if (tempPassword != null) {
                for (int i = 0; i < Static.data.getUserData().getPasswordsList().size(); i++) {
                    if (Static.data.getUserData().getPasswordsList().get(i).getID() == tempPassword.getID()) {
                        if (Static.data.getUserData().getPasswordsList().get(i).isFavorite()) {
                            Static.data.getUserData().getPasswordsList().get(i).setFavorite(false);
                            System.out.println("Password fav = false");
                            break;
                        } else {
                            Static.data.getUserData().getPasswordsList().get(i).setFavorite(true);
                            System.out.println("Password fav = true");
                            break;
                        }
                    }
                }
                Static.data.updateInfo();
                j_list.setModel(Static.run.setModelAndGet());
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
            j_list.setModel(Static.modeloPasswords);
            SEARCHBUTTON.setText("SEARCH SERVICE");
            searchPerformed = false;
        }


    }//GEN-LAST:event_SEARCHBUTTONActionPerformed

    private void serviceComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_serviceComboItemStateChanged
        serviceTxt.setText(serviceCombo.getSelectedItem().toString());
    }//GEN-LAST:event_serviceComboItemStateChanged

    private void j_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_listMouseClicked
        Passwordv2 pass = j_list.getSelectedValue();
        if (pass != null) {
            saveFavB.setEnabled(true);
        }
    }//GEN-LAST:event_j_listMouseClicked

    private void searchService() {
        if (!serviceTxt.getText().equals("")) {
            DefaultListModel<Passwordv2> tempModel = new DefaultListModel();
            for (Passwordv2 password : Static.data.getUserData().getPasswordsList()) {
                if (password.getService().equals(serviceTxt.getText())) {
                    tempModel.addElement(password);
                }
            }
            if (!tempModel.isEmpty()) {
                j_list.setModel(tempModel);

            } else {
                Static.run.message("There is not any password associated with the service name \"" + serviceTxt.getText() + "\"", "Not found", 0);
            }
        } else {
            System.out.println("Empty field");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton MAIL;
    private javax.swing.JButton PASSWORD;
    private javax.swing.JButton SEARCHBUTTON;
    private javax.swing.JButton SEEPASSWORD;
    public static javax.swing.JButton User;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Logic.Passwordv2> j_list;
    private javax.swing.JButton saveFavB;
    private javax.swing.JComboBox<String> serviceCombo;
    private javax.swing.JTextField serviceTxt;
    private javax.swing.JButton showFavButton;
    // End of variables declaration//GEN-END:variables

}
