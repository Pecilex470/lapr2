/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import lapr.project.controller.UC5_Controller;
import lapr.project.model.Application;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.Keyword;
import lapr.project.model.User;
import lapr.project.utils.ExportData;

/**
 *
 * @author Pedro
 */
public class UC5_UI extends javax.swing.JFrame {

    static final long serialVersionUID = -3387516993124229948L;

    private EventCenter ec;
    private User u;
    private UC5_Controller c;
    private Event eventSelected;

    /**
     * Creates new form UC5_UI
     *
     * @param ec the instance of the event center
     * @param u the user that is using
     */
    public UC5_UI(EventCenter ec, User u) {
        this.ec = ec;
        this.u = u;
        this.c = new UC5_Controller(ec);
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC5_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        ExportData.serialization(ec);
                    } catch (Exception ex) {
                        Logger.getLogger(UC5_UI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    dispose();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listEvent = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        companyNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        keyw1 = new javax.swing.JTextField();
        keyw4 = new javax.swing.JTextField();
        keyw2 = new javax.swing.JTextField();
        keyw5 = new javax.swing.JTextField();
        keyw3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        standArea = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maxAreaAvailableStand = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nInvites = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        productsTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("UC5 - Submit Application");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Choose an Event to apply to:");

        listEvent.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = nameList();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listEventMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listEvent);

        jLabel2.setText("Company's name:");

        jLabel3.setText("Stand:");

        jLabel4.setText("Keywords:");

        keyw4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyw4ActionPerformed(evt);
            }
        });

        keyw3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyw3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Description:");

        description.setColumns(20);
        description.setLineWrap(true);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
        );

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        standArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standAreaActionPerformed(evt);
            }
        });

        jLabel9.setText("m²");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel10.setText("Please enter a number between ");

        jLabel11.setText("1");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel6.setText("and");

        jLabel7.setText("Number of Invites:");

        nInvites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nInvitesActionPerformed(evt);
            }
        });

        jLabel8.setText("Products");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 9)); // NOI18N
        jLabel12.setText("Each product separated by commas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(standArea, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxAreaAvailableStand))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(submitButton)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nInvites, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(productsTextField))
                                .addComponent(companyNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(keyw4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(keyw1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(keyw2)
                                        .addComponent(keyw5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(keyw3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(companyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(standArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(maxAreaAvailableStand))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(keyw1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(keyw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(keyw3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(keyw4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(keyw5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(nInvites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(productsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton)
                            .addComponent(submitButton))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keyw3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyw3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyw3ActionPerformed

    private void keyw4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyw4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyw4ActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            if (!(companyNameTextField.getText().equals("") || standArea.getText().equals("") || description.getText().equals("") || nInvites.getText().equals(""))) {
                if (numberOfKeywords() > 1) {
                    
                    if (eventSelected.getFaeList().getFAEList().isEmpty()) {
                        
                        JOptionPane.showMessageDialog(UC5_UI.this, "You cant submit this application to this\nevent because it doesn't have any FAEs");
                        return;
                    }
                    if (JOptionPane.showConfirmDialog(UC5_UI.this, "Do you really want to submit this application?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

                        List<Keyword> keywordList = new ArrayList<>();
                        String[] keywordArray = {keyw1.getText(), keyw2.getText(), keyw3.getText(), keyw4.getText(), keyw5.getText()};

                        for (int i = 0; i < keywordArray.length; i++) {
                            if (!keywordArray[i].isEmpty()) {
                                keywordList.add(new Keyword(keywordArray[i]));
                            }
                        }

                        Application a = new Application(description.getText(), keywordList, companyNameTextField.getText(), u, Integer.parseInt(standArea.getText()), Integer.parseInt(nInvites.getText()));
                        eventSelected.addApplication(a);
                        a.setProducts(productsTextField.getText());
                        JOptionPane.showMessageDialog(UC5_UI.this, "Application submitted!", "Information", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        new RepresentativeActions(ec, u);

                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "At least 2 keywords needed");
                }
                
            } else {
                JOptionPane.showMessageDialog(UC5_UI.this, "Please fill in all the fields!", "Error", JOptionPane.OK_OPTION);
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            JOptionPane.showMessageDialog(null, "Select an event");
        }

    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        new RepresentativeActions(ec, u);
        dispose();

    }//GEN-LAST:event_backButtonActionPerformed

    private void standAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standAreaActionPerformed

    private void listEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEventMouseClicked

        this.eventSelected = ec.getEventRegister().getEventList().get(listEvent.getSelectedIndex());

        if (eventSelected.getFaeList().getFAEList().isEmpty()) {
            JOptionPane.showMessageDialog(UC5_UI.this, "WARNING: This event has no FAEs\nto decide your application");
        }
        
        
        maxAreaAvailableStand.setText("" + eventSelected.getAvailableArea());

    }//GEN-LAST:event_listEventMouseClicked

    private void nInvitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nInvitesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nInvitesActionPerformed

    public int numberOfKeywords() {

        int numberOfKeywords = 0;

        if (!keyw1.getText().isEmpty()) {
            numberOfKeywords++;
        }

        if (!keyw2.getText().isEmpty()) {
            numberOfKeywords++;
        }

        if (!keyw3.getText().isEmpty()) {
            numberOfKeywords++;
        }

        if (!keyw4.getText().isEmpty()) {
            numberOfKeywords++;
        }

        if (!keyw5.getText().isEmpty()) {
            numberOfKeywords++;
        }

        return numberOfKeywords;
    }

    public String[] nameList() {

        String[] eventList = new String[ec.getEventRegister().getAvailableEvents().size()];
        int cont = 0;
        for (Event e : ec.getEventRegister().getAvailableEvents()) {
            eventList[cont] = e.getTitle();
            cont++;
        }

        return eventList;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField companyNameTextField;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keyw1;
    private javax.swing.JTextField keyw2;
    private javax.swing.JTextField keyw3;
    private javax.swing.JTextField keyw4;
    private javax.swing.JTextField keyw5;
    private javax.swing.JList<String> listEvent;
    private javax.swing.JLabel maxAreaAvailableStand;
    private javax.swing.JTextField nInvites;
    private javax.swing.JTextField productsTextField;
    private javax.swing.JTextField standArea;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
