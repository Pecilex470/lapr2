/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import lapr.project.controller.UC6_Controller;
import lapr.project.model.Encryption;
import lapr.project.model.EventCenter;
import lapr.project.model.User;
import lapr.project.utils.ExportData;

/**
 *
 * @author Pedro
 */
public class MainWindow extends javax.swing.JFrame {

    static final long serialVersionUID = -7034897190745766939L;

    User u;
    EventCenter ec;
    UC6_Controller c = new UC6_Controller(ec);

    /**
     * Creates new form MainWindow
     *
     * @param u
     * @param ec
     */
    public MainWindow(User u, EventCenter ec) {
        this.u = u;
        this.ec = ec;
        this.c = c;
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(MainWindow.this, "Do you wish to exit?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    ExportData.serialization(ec);
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

        buttonOrganizer = new javax.swing.JButton();
        buttonFAE = new javax.swing.JButton();
        buttonEventManager = new javax.swing.JButton();
        buttonRepresentative = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Event Center");

        buttonOrganizer.setText("Organizer Actions");
        buttonOrganizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrganizerActionPerformed(evt);
            }
        });

        buttonFAE.setText("FAE Actions");
        buttonFAE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFAEActionPerformed(evt);
            }
        });

        buttonEventManager.setText("Event Manager Actions");
        buttonEventManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEventManagerActionPerformed(evt);
            }
        });

        buttonRepresentative.setText("Representative Actions");
        buttonRepresentative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRepresentativeActionPerformed(evt);
            }
        });

        jLabel1.setText("What do you want to do?");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Hi " + c.twoLayerDeencryption(u.getName(), ec.getEncryptionRegister().getEncryptionByUser(u).getShift(), ec.getEncryptionRegister().getEncryptionByUser(u).getKeyword(), Encryption.ABC)+ "!");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(logoutButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonOrganizer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonFAE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonEventManager, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonRepresentative, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFAE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEventManager, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRepresentative, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOrganizer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(logoutButton)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void buttonFAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFAEActionPerformed

        if (ec.checkIFUserIsFAE(u)) {
            dispose();
            new UC4_UI(ec, u);
        } else {
            JOptionPane.showMessageDialog(null, "You are not FAE in any event!");
        }

    }//GEN-LAST:event_buttonFAEActionPerformed

    private void buttonEventManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEventManagerActionPerformed

        if (u.isEventManager()) {
            dispose();
            new EventManagerActions_UI(ec, u);
        } else {
            JOptionPane.showMessageDialog(null, "You are not an Event Manager");
        }

    }//GEN-LAST:event_buttonEventManagerActionPerformed

    private void buttonOrganizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrganizerActionPerformed

        if (ec.checkIFUserIsOrganizer(u)) {
            dispose();
            new OrganizerActions_UI(ec, u);
        } else {
            JOptionPane.showMessageDialog(null, "You are not organizer in any event!");
        }
    }//GEN-LAST:event_buttonOrganizerActionPerformed

    private void buttonRepresentativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRepresentativeActionPerformed

        if (u.isRepresentative()) {
            new RepresentativeActions(ec, u);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "You are not a Representative");
        }
    }//GEN-LAST:event_buttonRepresentativeActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        new InitialWindow_UI(ec);
    }//GEN-LAST:event_logoutButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEventManager;
    private javax.swing.JButton buttonFAE;
    private javax.swing.JButton buttonOrganizer;
    private javax.swing.JButton buttonRepresentative;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}
