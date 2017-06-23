/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import lapr.project.controller.UC1_Controller;
import lapr.project.model.Encryption;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;
import lapr.project.model.Organizer;
import lapr.project.model.User;
import lapr.project.model.register.FAEList;
import lapr.project.model.register.OrganizerList;
import lapr.project.utils.CustomDate;
import lapr.project.utils.ExportData;

/**
 *
 * @author Pedro
 */
public class UC1_UI extends javax.swing.JDialog {

    static final long serialVersionUID = -3387516993124229948L;

    private EventCenter ec;
    private String[] pickedList = new String[0];
    SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
    private UC1_Controller c;
    private String[] topList;
    private User u;

    /**
     * Creates new form UC1_Dialog
     *
     * @param ec the instance of the event center
     * @param u the user that is received
     */
    public UC1_UI(EventCenter ec, User u) {

        this.ec = ec;
        this.c = new UC1_Controller(ec);
        this.topList = initialUserList();
        this.u = u;

        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC1_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        ExportData.serialization(ec);
                    } catch (Exception ex) {
                        Logger.getLogger(UC1_UI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    new EventManagerActions_UI(ec, u);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        locationTextField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        eventTypeComboBox = new javax.swing.JComboBox<>();
        startDateDay = new javax.swing.JTextField();
        startDateMonth = new javax.swing.JTextField();
        startDateYear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        submissionStartDateMonth = new javax.swing.JTextField();
        submissionStartDateYear = new javax.swing.JTextField();
        submissionStartDateDay = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        endDateMonth = new javax.swing.JTextField();
        endDateYear = new javax.swing.JTextField();
        endDateDay = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        submissionEndDateMonth = new javax.swing.JTextField();
        submissionEndDateYear = new javax.swing.JTextField();
        submissionEndDateDay = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        unpickButton = new javax.swing.JButton();
        pickButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pickedUserList = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        availableArea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UC1 - Create Event");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Title:");

        jLabel2.setText("Location:");

        jLabel3.setText("Start Date:");

        jLabel4.setText("End Date:");

        jLabel5.setText("Application submission starting date:");

        jLabel6.setText("Application submission ending date:");

        jLabel7.setText("Event type:");

        jLabel8.setText("Short Description:");

        titleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextFieldActionPerformed(evt);
            }
        });

        locationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTextFieldActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descriptionTextArea);

        eventTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exhibition", "Congress" }));
        eventTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventTypeComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("/");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("/");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("/");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("/");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("/");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("/");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("/");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("/");

        jLabel11.setText("Pick at least 2 organizers for the Event:");

        userList.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = initialUserList();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        userList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userListMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(userList);

        unpickButton.setText("Unpick");
        unpickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unpickButtonActionPerformed(evt);
            }
        });

        pickButton.setText("Pick");
        pickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickButtonActionPerformed(evt);
            }
        });

        pickedUserList.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = {""};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(pickedUserList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("Available Area:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(186, 186, 186))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(startDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(startDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)))
                            .addComponent(startDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submissionStartDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submissionStartDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(submissionStartDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(locationTextField)
                            .addComponent(eventTypeComboBox, 0, 328, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(endDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(endDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submissionEndDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submissionEndDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(submissionEndDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addComponent(availableArea)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(cancelButton)
                        .addGap(56, 56, 56)
                        .addComponent(confirmButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pickButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(unpickButton)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(unpickButton)
                                    .addComponent(pickButton))
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(endDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19))
                                .addGap(27, 27, 27)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(submissionEndDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(submissionEndDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(submissionEndDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21))
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(eventTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(availableArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cancelButton)
                                    .addComponent(confirmButton)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submissionStartDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submissionStartDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submissionStartDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        List<FAE> faelist = new ArrayList<>();
        List<Organizer> organizerList = new ArrayList<>();
        for (int i = 0; i < pickedList.length; i++) {
            organizerList.add(nameStringToOrganizer(pickedList[i]));
        }

        if (!(("").equals(titleTextField.getText()) || locationTextField.getText().equals("") || descriptionTextArea.getText().equals("") || startDateDay.getText().equals("") || startDateMonth.getText().equals("") || startDateYear.getText().equals("") || endDateDay.getText().equals("") || endDateMonth.getText().equals("") || endDateYear.getText().equals("") || (submissionStartDateDay.getText().equals("") || submissionStartDateMonth.getText().equals("") || submissionStartDateYear.getText().equals("") || submissionEndDateDay.getText().equals("") || submissionEndDateMonth.getText().equals("") || submissionEndDateYear.getText().equals("") || availableArea.getText().equals("")))) {
            if (!(assembleDate(startDateDay.getText(), startDateMonth.getText(), startDateYear.getText()).getDay() == -1 || assembleDate(endDateDay.getText(), endDateMonth.getText(), endDateYear.getText()).getDay() == -1 || assembleDate(submissionStartDateDay.getText(), submissionStartDateMonth.getText(), submissionStartDateYear.getText()).getDay() == -1 || assembleDate(submissionEndDateDay.getText(), submissionEndDateMonth.getText(), submissionEndDateYear.getText()).getDay() == -1)) {
                if (pickedUserList.getModel().getSize() >= 2) {
                    if (JOptionPane.showConfirmDialog(UC1_UI.this, "Are you sure you want to create an Event with this Data?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                        ec.getEventRegister().getEventList().add(new Event(titleTextField.getText(), locationTextField.getText(), descriptionTextArea.getText(), assembleDate(startDateDay.getText(), startDateMonth.getText(), startDateYear.getText()), assembleDate(endDateDay.getText(), endDateMonth.getText(), endDateYear.getText()), assembleDate(submissionStartDateDay.getText(), submissionStartDateMonth.getText(), submissionStartDateYear.getText()), assembleDate(submissionEndDateDay.getText(), submissionEndDateMonth.getText(), submissionEndDateYear.getText()), (String) eventTypeComboBox.getSelectedItem(), new FAEList(faelist), new OrganizerList(organizerList), Integer.parseInt(availableArea.getText())));
                        JOptionPane.showMessageDialog(UC1_UI.this, "Event Created!", "Information", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(UC1_UI.this, "You must pick at least 2 organizers", "Error", JOptionPane.OK_OPTION);
                }
            } else {
                JOptionPane.showMessageDialog(UC1_UI.this, "One of the dates inserted isn't in a correct format", "Error", JOptionPane.OK_OPTION);
            }
        } else {
            JOptionPane.showMessageDialog(UC1_UI.this, "Please fill in all the fields", "Error", JOptionPane.OK_OPTION);
        }

    }//GEN-LAST:event_confirmButtonActionPerformed

    private void locationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTextFieldActionPerformed

    private void titleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTextFieldActionPerformed

    private void eventTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventTypeComboBoxActionPerformed

    private void pickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickButtonActionPerformed

        String user = userList.getSelectedValue();

        removeUserFromTopList(user);

        userList.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = returnTopList();

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });

        addUserToPickedList(user);

        pickedUserList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = returnPickedList();
            static final long serialVersionUID = -3387516993124229948L;

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });

    }//GEN-LAST:event_pickButtonActionPerformed

    private void unpickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unpickButtonActionPerformed

        String user = pickedUserList.getSelectedValue();

        removeUserFromPickedList(user);

        pickedUserList.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = returnPickedList();

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });

        addUserToTopList(user);

        userList.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = returnTopList();

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });


    }//GEN-LAST:event_unpickButtonActionPerformed

    private CustomDate assembleDate(String day, String month, String year) {
        return new CustomDate(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year));
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        if (JOptionPane.showConfirmDialog(UC1_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            new EventManagerActions_UI(ec, u);
            dispose();
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void userListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userListMouseClicked

    }//GEN-LAST:event_userListMouseClicked

    /**
     * method that retrieves the full list of registered users to allow the
     * event manager to choose organizers for the new event
     *
     * @return a String array to fill the JList
     */
    public String[] initialUserList() {
        String[] list = new String[ec.getUserRegister().getUsers().size()];
        int cont = 0;
        for (User u : ec.getUserRegister().getUsers()) {
            String name = Encryption.deEncryptPassword(u.getName(), ec.getEncryptionRegister().getEncryptionByUser(u).getShift(), Encryption.ABC);
            name = Encryption.deEncryptData(name, ec.getEncryptionRegister().getEncryptionByUser(u).getKeyword());
            list[cont] = name + " (" + u.getUsername() + ")";
            cont++;
        }
        return list;
    }

    public void removeUserFromTopList(String uName) {

        String[] list = new String[topList.length - 1];

        int flag = 0;
        for (int i = 0; i < topList.length; i++) {

            if (!uName.equals(topList[i])) {
                list[i - flag] = topList[i];
            } else {
                flag++;
            }
        }

        topList = new String[topList.length - 1];
        topList = list;

    }

    public void removeUserFromPickedList(String uName) {

        String[] list = new String[pickedList.length - 1];

        int flag = 0;
        for (int i = 0; i < pickedList.length; i++) {

            if (!uName.equals(pickedList[i])) {
                list[i - flag] = pickedList[i];
            } else {
                flag++;
            }
        }

        pickedList = new String[pickedList.length - 1];
        pickedList = list;

    }

    public void addUserToPickedList(String pickedUser) {

        String[] list = new String[pickedList.length + 1];

        for (int i = 0; i < pickedList.length; i++) {
            list[i] = pickedList[i];
        }

        list[list.length - 1] = pickedUser;

        pickedList = new String[pickedList.length + 1];
        pickedList = list;

    }

    public void addUserToTopList(String topUser) {

        String[] list = new String[topList.length + 1];

        for (int i = 0; i < topList.length; i++) {
            list[i] = topList[i];
        }

        list[list.length - 1] = topUser;

        topList = new String[topList.length + 1];
        topList = list;

    }

    public String[] returnPickedList() {

        return pickedList;
    }

    public String[] returnTopList() {
        return topList;
    }

    public Organizer nameStringToOrganizer(String name) {

        String c;
        int count = 0;
        String username;

        do {
            c = name.substring(count, count + 1);
            count++;
        } while (!c.equals("("));

        username = name.substring(count, name.length() - 1);

        User org = null;

        for (User u : ec.getUserRegister().getUsers()) {
            if (username.equals(u.getUsername())) {
                org = u;
                break;
            }
        }

        return new Organizer(org);
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availableArea;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JTextField endDateDay;
    private javax.swing.JTextField endDateMonth;
    private javax.swing.JTextField endDateYear;
    private javax.swing.JComboBox<String> eventTypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JButton pickButton;
    private javax.swing.JList<String> pickedUserList;
    private javax.swing.JTextField startDateDay;
    private javax.swing.JTextField startDateMonth;
    private javax.swing.JTextField startDateYear;
    private javax.swing.JTextField submissionEndDateDay;
    private javax.swing.JTextField submissionEndDateMonth;
    private javax.swing.JTextField submissionEndDateYear;
    private javax.swing.JTextField submissionStartDateDay;
    private javax.swing.JTextField submissionStartDateMonth;
    private javax.swing.JTextField submissionStartDateYear;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JButton unpickButton;
    private javax.swing.JList<String> userList;
    // End of variables declaration//GEN-END:variables
}
