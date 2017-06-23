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
import lapr.project.controller.UC11_Controller;
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
public class UC11_UI extends javax.swing.JFrame {

    static final long serialVersionUID = -3387516993124229948L;

    private EventCenter ec;
    private User u;
    private UC11_Controller c;
    private Event selectedEvent;
    private Application selectedApplication;

    /**
     * Creates new form UC11_UI
     *
     * @param ec the instance of the event center
     * @param u the user that is using
     */
    public UC11_UI(EventCenter ec, User u) {
        this.ec = ec;
        this.u = u;
        this.c = new UC11_Controller(ec, u);
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC11_UI.this, "Do you wish to exit?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        ExportData.serialization(ec);
                    } catch (Exception ex) {
                        Logger.getLogger(UC11_UI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    dispose();
                }
            }
        });

        if (c.getEventsWhereRepresentativeHasApplications(u).isEmpty()) {
            listEvent.setModel(new javax.swing.AbstractListModel<String>() {
                static final long serialVersionUID = -3387516993124229948L;
                String[] strings = {"|| YOU DONT HAVE ANY APPLICATIONS ||"};

                public int getSize() {
                    return strings.length;
                }

                public String getElementAt(int i) {
                    return strings[i];
                }
            });

            listApplication.setModel(new javax.swing.AbstractListModel<String>() {
                static final long serialVersionUID = -3387516993124229948L;
                String[] strings = {""};

                public int getSize() {
                    return strings.length;
                }

                public String getElementAt(int i) {
                    return strings[i];
                }
            });

        }

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
        keyword1 = new javax.swing.JTextField();
        keyword4 = new javax.swing.JTextField();
        keyword2 = new javax.swing.JTextField();
        keyword5 = new javax.swing.JTextField();
        keyword3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        changeButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listApplication = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        standArea = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maxAreaAvailableStand = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nInvites = new javax.swing.JTextField();
        productsTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("UC11 - Change/Remove Application");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Choose an Event:");

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

        companyNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyNameTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Stand area:");

        jLabel4.setText("Keywords:");

        keyword4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyword4ActionPerformed(evt);
            }
        });

        keyword3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyword3ActionPerformed(evt);
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

        changeButton.setText("Change");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        listApplication.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = { "|| SELECT EVENT ||" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listApplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listApplicationMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listApplication);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Choose an Application:");

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
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

        maxAreaAvailableStand.setText("100");

        jLabel7.setText("Number of Invites:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 9)); // NOI18N
        jLabel12.setText("Each product separated by commas");

        jLabel13.setText("Products");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(companyNameTextField)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(keyword4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(keyword1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(keyword2)
                                        .addComponent(keyword5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(keyword3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(standArea, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(maxAreaAvailableStand)
                                    .addGap(28, 28, 28)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(changeButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nInvites, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(productsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(companyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
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
                                .addComponent(keyword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(keyword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(keyword3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(keyword4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(keyword5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel5)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nInvites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(productsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(changeButton)
                                .addComponent(backButton)
                                .addComponent(removeButton)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keyword3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyword3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyword3ActionPerformed

    private void keyword4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyword4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyword4ActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed

        if (numberOfKeywords() > 1) {
            if (JOptionPane.showConfirmDialog(UC11_UI.this, "Do you really want to change this application?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

                Event e = ec.getEventRegister().getEventList().get(listEvent.getSelectedIndex());

                List<Keyword> keywordList = new ArrayList<>();
                String[] keywordArray = {keyword1.getText(), keyword2.getText(), keyword3.getText(), keyword4.getText(), keyword5.getText()};

                for (int i = 0; i < keywordArray.length; i++) {
                    if (!keywordArray[i].isEmpty()) {
                        keywordList.add(new Keyword(keywordArray[i]));
                    }
                }

                c.changeApplication(c.getApplicationsFromThisUserInThisEvent(u, c.getEventsWhereRepresentativeHasApplications(u).get(listEvent.getSelectedIndex())).get(listApplication.getSelectedIndex()), description.getText(), keywordList, companyNameTextField.getText(), u, Integer.parseInt(standArea.getText()), Integer.parseInt(nInvites.getText()));

                JOptionPane.showMessageDialog(UC11_UI.this, "Application Changed", "Information", JOptionPane.INFORMATION_MESSAGE);

            }
        } else {

            JOptionPane.showMessageDialog(null, "At least 2 keywords needed");

        }


    }//GEN-LAST:event_changeButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        new RepresentativeActions(ec, u);
        dispose();

    }//GEN-LAST:event_backButtonActionPerformed

    private void listEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEventMouseClicked

        try {
            this.selectedEvent = c.getEventsWhereRepresentativeHasApplications(u).get(listEvent.getSelectedIndex());
        } catch (Exception e) {

        }

        try {
            listApplication.setModel(new javax.swing.AbstractListModel<String>() {
                static final long serialVersionUID = -3387516993124229948L;

                String[] strings = applicationList(c.getEventsWhereRepresentativeHasApplications(u).get(listEvent.getSelectedIndex()));

                public int getSize() {
                    return strings.length;
                }

                public String getElementAt(int i) {
                    return strings[i];
                }
            });

            maxAreaAvailableStand.setText("" + selectedEvent.getAvailableArea());
        } catch (Exception e) {

        }

        cleanTextFields();

    }//GEN-LAST:event_listEventMouseClicked

    private void companyNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyNameTextFieldActionPerformed

    }//GEN-LAST:event_companyNameTextFieldActionPerformed

    private void listApplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listApplicationMouseClicked

        cleanTextFields();

        this.selectedApplication = c.getApplicationsFromThisUserInThisEvent(u, selectedEvent).get(listApplication.getSelectedIndex());

        companyNameTextField.setText(selectedApplication.getCompanyName());
        standArea.setText("" + selectedApplication.getBoothArea());
        try {
            keyword1.setText(selectedApplication.getKeywordList().get(0).getValue());
            keyword2.setText(selectedApplication.getKeywordList().get(1).getValue());
            keyword3.setText(selectedApplication.getKeywordList().get(2).getValue());
            keyword4.setText(selectedApplication.getKeywordList().get(3).getValue());
            keyword5.setText(selectedApplication.getKeywordList().get(4).getValue());
        } catch (Exception e) {

        }
        description.setText(selectedApplication.getDescription());
        nInvites.setText("" + selectedApplication.getInvitesQuantity());
        productsTextField.setText(selectedApplication.getProducts());
    }//GEN-LAST:event_listApplicationMouseClicked

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed

        if (JOptionPane.showConfirmDialog(UC11_UI.this, "Do you really want to remove this application?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            c.removeApplication(selectedEvent, selectedApplication);

            listApplication.setModel(new javax.swing.AbstractListModel<String>() {
                static final long serialVersionUID = -3387516993124229948L;
                String[] strings = {"|| SELECT EVENT ||"};

                public int getSize() {
                    return strings.length;
                }

                public String getElementAt(int i) {
                    return strings[i];
                }
            });

            cleanTextFields();
            JOptionPane.showMessageDialog(UC11_UI.this, "Application Removed", "Information", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_removeButtonActionPerformed

    private void standAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standAreaActionPerformed

    public int numberOfKeywords() {

        int numberOfKeywords = 0;

        if (!keyword1.getText().isEmpty()) {
            numberOfKeywords++;
        }

        if (!keyword2.getText().isEmpty()) {
            numberOfKeywords++;
        }

        if (!keyword3.getText().isEmpty()) {
            numberOfKeywords++;
        }

        if (!keyword4.getText().isEmpty()) {
            numberOfKeywords++;
        }

        if (!keyword5.getText().isEmpty()) {
            numberOfKeywords++;
        }

        return numberOfKeywords;
    }

    public String[] nameList() {

        String[] eventList = new String[c.getEventsWhereRepresentativeHasApplications(u).size()];

        int cont = 0;
        for (Event e : c.getEventsWhereRepresentativeHasApplications(u)) {

            eventList[cont] = c.getEventsWhereRepresentativeHasApplications(u).get(cont).getTitle();
            cont++;
        }

        return eventList;
    }

    public String[] applicationList(Event e) {

        String[] applicationList = new String[c.getApplicationsFromThisUserInThisEvent(u, e).size()];

        int count = 0;
        for (Application a : c.getApplicationsFromThisUserInThisEvent(u, e)) {

            applicationList[count] = c.getApplicationsFromThisUserInThisEvent(u, e).get(count).getCompanyName();
            count++;

        }

        return applicationList;

    }

    public void cleanTextFields() {

        companyNameTextField.setText("");
        standArea.setText("");
        keyword1.setText("");
        keyword2.setText("");
        keyword3.setText("");
        keyword4.setText("");
        keyword5.setText("");
        description.setText("");
        nInvites.setText("");
        productsTextField.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton changeButton;
    private javax.swing.JTextField companyNameTextField;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField keyword1;
    private javax.swing.JTextField keyword2;
    private javax.swing.JTextField keyword3;
    private javax.swing.JTextField keyword4;
    private javax.swing.JTextField keyword5;
    private javax.swing.JList<String> listApplication;
    private javax.swing.JList<String> listEvent;
    private javax.swing.JLabel maxAreaAvailableStand;
    private javax.swing.JTextField nInvites;
    private javax.swing.JTextField productsTextField;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField standArea;
    // End of variables declaration//GEN-END:variables
}
