/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import lapr.project.model.EventCenter;
import lapr.project.model.User;
import lapr.project.utils.ExportData;

/**
 *
 * @author Pedro
 */
public class OrganizerActions_UI extends javax.swing.JFrame {
    
    static final long serialVersionUID = -3387516993124229948L;
    
    private EventCenter ec;
    private User u;

    /**
     * Creates new form OrganizerActions_UI
     * @param ec the instance of the event center
     * @param u the user that is currently using the window
     */
    public OrganizerActions_UI(EventCenter ec, User u) {
        this.ec = ec;
        this.u = u;
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(OrganizerActions_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        ExportData.serialization(ec);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(OrganizerActions_UI.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        uc2Button = new javax.swing.JButton();
        uc20Button = new javax.swing.JButton();
        uc21Button = new javax.swing.JButton();
        uc22Button = new javax.swing.JButton();
        uc40Button = new javax.swing.JButton();
        uc41Button = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Organizer Actions");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Organizer Actions:");

        uc2Button.setText("UC2 - Define FAE");
        uc2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc2ButtonActionPerformed(evt);
            }
        });

        uc20Button.setText("UC20 - Create stands");

        uc21Button.setText("UC21 - Assign Stands");
        uc21Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc21ButtonActionPerformed(evt);
            }
        });

        uc22Button.setText("UC22 - List Applications");

        uc40Button.setText("UC40 - Show Event submission keywords");
        uc40Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc40ButtonActionPerformed(evt);
            }
        });

        uc41Button.setText("UC41 - Show Event stands information");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uc40Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uc22Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uc2Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uc20Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uc21Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uc41Button, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))))
                        .addGap(0, 33, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uc2Button)
                    .addComponent(uc20Button))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uc22Button)
                    .addComponent(uc21Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uc41Button)
                    .addComponent(uc40Button))
                .addGap(26, 26, 26)
                .addComponent(backButton)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uc40ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc40ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uc40ButtonActionPerformed

    private void uc2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc2ButtonActionPerformed
        dispose();
        
        
        
        new UC2_UI(ec, u);
    }//GEN-LAST:event_uc2ButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new MainWindow(u, ec);
    }//GEN-LAST:event_backButtonActionPerformed

    private void uc21ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc21ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uc21ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton uc20Button;
    private javax.swing.JButton uc21Button;
    private javax.swing.JButton uc22Button;
    private javax.swing.JButton uc2Button;
    private javax.swing.JButton uc40Button;
    private javax.swing.JButton uc41Button;
    // End of variables declaration//GEN-END:variables
}