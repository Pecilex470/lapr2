/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import lapr.project.controller.UC49_Controller;
import lapr.project.model.Decision;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;
import lapr.project.model.User;
import lapr.project.utils.ExportData;

/**
 *
 * @author Utilizador
 */
public class UC49_UI extends javax.swing.JFrame {

    static final long serialVersionUID = -3387516993124229948L;

    private EventCenter ec;

    private UC49_Controller c;
    private User u;

    /**
     * Creates new form UC49_1_UI
     *
     * @param ec EventCenter
     */
    public UC49_UI(EventCenter ec, User u) {
        this.ec = ec;
        this.u = u;
        this.c = new UC49_Controller(ec);
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {

                if (JOptionPane.showConfirmDialog(UC49_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        ExportData.serialization(ec);
                    } catch (Exception ex) {
                        Logger.getLogger(EventManagerActions_UI.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        sig1 = new javax.swing.JRadioButton();
        sig5 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FAE", "Number of Submissions", "FAE Mean Rating", "Deviation Mean", "Standard Deviation", "Observed Value of test statistic", "Decision(Yes or No)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };
            static final long serialVersionUID = -3387516993124229948L;
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table1);

        sig1.setText("0.01");
        sig1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sig1MouseClicked(evt);
            }
        });
        sig1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sig1ActionPerformed(evt);
            }
        });

        sig5.setText("0.05");
        sig5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sig5MouseClicked(evt);
            }
        });
        sig5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sig5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose the significance level:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sig5)
                    .addComponent(sig1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sig1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sig5)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sig1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sig1ActionPerformed


    }//GEN-LAST:event_sig1ActionPerformed

    private void sig5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sig5ActionPerformed


    }//GEN-LAST:event_sig5ActionPerformed

    private void sig1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sig1MouseClicked

        cleanTable();
        
        String a = "0.01";
        fillTable(a);

        if (sig1.isSelected()) {
            sig5.setSelected(false);
        } else {
          
        }
        
        JOptionPane.showMessageDialog(UC49_UI.this, "The organizer was alerted if any of the FAE's mean deviation was above 1");
        
    }//GEN-LAST:event_sig1MouseClicked

    private void sig5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sig5MouseClicked

        cleanTable();
        
        String a = "0.05";
        fillTable(a);

        if (sig5.isSelected()) {
            sig1.setSelected(false);
        } else {
            
        }
        
        JOptionPane.showMessageDialog(UC49_UI.this, "The organizer was alerted if any of the FAE's mean deviation was above 1");
        

    }//GEN-LAST:event_sig5MouseClicked

    public void fillTable(String a) {
        DefaultTableModel val = (DefaultTableModel) Table1.getModel();
        List<FAE> allFAE = c.getFaeThatEvaluatedApplications(ec);
        for (FAE fae : allFAE) {
            String username = fae.getUserFAE().getUsername();
            List<Decision> user = ec.getEvaluatedApplicationsFAE(username);
            int nSub = user.size();
            double mRa = ec.getMeanRatingF(user);
            double dMean = ec.getMeanDeviation(user);
            double sMean = ec.getStandardDeviation(user);
            double z = ec.getZ(dMean, nSub, user);
            String dec = ec.testTheDifferenceBetweenTheMeanDeviationAndATheoreticalValue1ForAFAEAverageRating(a, user);
            if (nSub >= 30) {
                val.addRow(new Object[]{username, nSub, mRa, dMean, sMean, z, dec});
            }

        }

    }

    public void cleanTable() {

        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        model.setRowCount(0);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton sig1;
    private javax.swing.JRadioButton sig5;
    // End of variables declaration//GEN-END:variables
}
