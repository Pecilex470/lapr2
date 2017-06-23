/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import lapr.project.controller.UC43_Controller;
import lapr.project.controller.UC46_Controller;
import lapr.project.controller.UC47_Controller;
import lapr.project.model.EventCenter;
import lapr.project.model.User;
import lapr.project.utils.ExportData;

/**
 *
 * @author Pedro
 */
public class EventManagerActions_UI extends javax.swing.JFrame {

    static final long serialVersionUID = -3387516993124229948L;

    private EventCenter ec;
    private User u;
    private UC43_Controller uc43;
    private UC46_Controller uc46;

    /**
     * Creates new form EventCenterActions_UI
     *
     * @param ec the instance of the event center
     * @param u the user
     */
    public EventManagerActions_UI(EventCenter ec, User u) {
        this.ec = ec;
        this.u = u;
        uc43 = new UC43_Controller(ec);
        uc46 = new UC46_Controller(ec);

        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {

                if (JOptionPane.showConfirmDialog(EventManagerActions_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    dispose();
                    try {
                        ExportData.serialization(ec);
                    } catch (Exception ex) {
                        Logger.getLogger(EventManagerActions_UI.class.getName()).log(Level.SEVERE, null, ex);
                    }
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
        uc1Button = new javax.swing.JButton();
        uc42Button = new javax.swing.JButton();
        uc43Button = new javax.swing.JButton();
        uc44Button = new javax.swing.JButton();
        uc45Button = new javax.swing.JButton();
        uc46Button = new javax.swing.JButton();
        uc50Button = new javax.swing.JButton();
        uc48Button = new javax.swing.JButton();
        uc47Button = new javax.swing.JButton();
        uc32Button = new javax.swing.JButton();
        uc49Button = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Event Manager Actions");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Event Manager Actions:");

        uc1Button.setText("UC1 - Create Event");
        uc1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc1ButtonActionPerformed(evt);
            }
        });

        uc42Button.setText("UC42 - Show Event acceptance rate");
        uc42Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc42ButtonActionPerformed(evt);
            }
        });

        uc43Button.setText("UC43 - Show Global Acceptance Rate");
        uc43Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc43ButtonActionPerformed(evt);
            }
        });

        uc44Button.setText("UC44 - Test if Event acceptance rate is over 50%");
        uc44Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc44ButtonActionPerformed(evt);
            }
        });

        uc45Button.setText("UC45 - Test the difference between two Events acceptance rate");
        uc45Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc45ButtonActionPerformed(evt);
            }
        });

        uc46Button.setText("UC46 - Show a FAE mean rating");
        uc46Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc46ButtonActionPerformed(evt);
            }
        });

        uc50Button.setText("UC50 - Test the difference between two FAEs mean deviations");
        uc50Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc50ButtonActionPerformed(evt);
            }
        });

        uc48Button.setText("UC48 - Show the mean deviation between FAEs' average ratings and global mean rating");
        uc48Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc48ButtonActionPerformed(evt);
            }
        });

        uc47Button.setText("UC47 - Show submission global mean rating");
        uc47Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc47ButtonActionPerformed(evt);
            }
        });

        uc32Button.setText("UC32 - Import Event Data from file");
        uc32Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc32ButtonActionPerformed(evt);
            }
        });

        uc49Button.setText("UC49 - Test the difference between the mean deviation and a theoretical value for a FAE average rating");
        uc49Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc49ButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uc43Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uc32Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uc42Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uc44Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(uc1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(uc45Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uc48Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uc50Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uc49Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uc47Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uc46Button, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uc1Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uc32Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uc42Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uc43Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uc44Button))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uc46Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uc47Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uc48Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uc49Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uc50Button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uc45Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uc1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc1ButtonActionPerformed
        new UC1_UI(ec, u);
        dispose();
    }//GEN-LAST:event_uc1ButtonActionPerformed

    private void uc42ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc42ButtonActionPerformed
        new UC42_UI(ec, u);
        dispose();
    }//GEN-LAST:event_uc42ButtonActionPerformed

    private void uc44ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc44ButtonActionPerformed
        new UC44_1_UI(ec, u);
        dispose();
    }//GEN-LAST:event_uc44ButtonActionPerformed

    private void uc50ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc50ButtonActionPerformed
        new UC50_1_UI(ec, u);
        dispose();
    }//GEN-LAST:event_uc50ButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new MainWindow(u, ec);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void uc43ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc43ButtonActionPerformed

        JOptionPane.showMessageDialog(EventManagerActions_UI.this, uc43.getGlobalAcceptanceRate() + "% is the Global Acceptance Rate");

    }//GEN-LAST:event_uc43ButtonActionPerformed

    private void uc46ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc46ButtonActionPerformed

        String username;

        username = JOptionPane.showInputDialog(EventManagerActions_UI.this, "Enter the username of the FAE you\nwant to know the mean rating of:\n[type 0 to leave]");
        while (ec.getEventsWhereUserIsFAE(ec.getUserRegister().getUserByUsername(username)).isEmpty() && !username.equals("0")) {
            JOptionPane.showMessageDialog(EventManagerActions_UI.this, "That user is not a FAE in any event");
            username = JOptionPane.showInputDialog(EventManagerActions_UI.this, "Enter the username of the FAE you\n want to know the mean rating of");
        }

        if (username.equals("0")) {

        } else {
            double meanR = ec.getMeanRatingF(username);
            JOptionPane.showMessageDialog(EventManagerActions_UI.this, "O mean rating é " + meanR);
        }


    }//GEN-LAST:event_uc46ButtonActionPerformed

    private void uc32ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc32ButtonActionPerformed
        new UC32_UI(ec, u);
        dispose();
    }//GEN-LAST:event_uc32ButtonActionPerformed
    private void uc49ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc49ButtonActionPerformed
        new UC49_UI(ec, u);
        dispose();
    }//GEN-LAST:event_uc49ButtonActionPerformed

    private void uc45ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc45ButtonActionPerformed
        new UC45_1_UI(ec, u);
        dispose();
    }//GEN-LAST:event_uc45ButtonActionPerformed

    private void uc47ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc47ButtonActionPerformed
        UC47_Controller cont = new UC47_Controller(ec);
        JOptionPane.showMessageDialog(EventManagerActions_UI.this, "The Global Mean Rating is: " + cont.getGlobalMeanRating());
    }//GEN-LAST:event_uc47ButtonActionPerformed

    private void uc48ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc48ButtonActionPerformed
        new UC48_UI(ec, u);
        dispose();
    }//GEN-LAST:event_uc48ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton uc1Button;
    private javax.swing.JButton uc32Button;
    private javax.swing.JButton uc42Button;
    private javax.swing.JButton uc43Button;
    private javax.swing.JButton uc44Button;
    private javax.swing.JButton uc45Button;
    private javax.swing.JButton uc46Button;
    private javax.swing.JButton uc47Button;
    private javax.swing.JButton uc48Button;
    private javax.swing.JButton uc49Button;
    private javax.swing.JButton uc50Button;
    // End of variables declaration//GEN-END:variables
}
