/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import lapr.project.controller.UC49_Controller;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;

/**
 *
 * @author Utilizador
 */
public class UC49_UI extends javax.swing.JFrame {
 static final long serialVersionUID = -3387516993124229948L;
 
 
 
    private EventCenter ec;
    
    private UC49_Controller c;
 
 
 
     /**
     * Creates new form UC49_1_UI
     * @param ec EventCenter
     */
    public UC49_UI(EventCenter ec) {
        this.ec=ec;
        this.c=new UC49_Controller(ec);
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC49_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
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
        sig1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sig1ActionPerformed(evt);
            }
        });

        sig5.setText("0.05");
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
        String a="0.01";
         fillTable(a);
         
    }//GEN-LAST:event_sig1ActionPerformed

    private void sig5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sig5ActionPerformed
        String a="0.05";
        fillTable(a);
        
         
          
    }//GEN-LAST:event_sig5ActionPerformed

   
    public void fillTable(String a){
      DefaultTableModel val = (DefaultTableModel) Table1.getModel();
         List<FAE> allFAE = c.getAllFae(ec);
         for(FAE fae : allFAE){
            String nome = fae.getName();
            int nSub = fae.getAttributionList().size();
            double mRa = fae.getMeanRating();
            double dMean = ec.getMeanDeviation();
            double sMean = fae.getStandardDeviation();
            double z = ec.getZ(fae);
            String dec = ec.testTheDifferenceBetweenTheMeanDeviationAndATheoreticalValue1ForAFAEAverageRating(a);
            val.addRow(new Object[]{nome,nSub,mRa,dMean,sMean,z,dec}); 
      }   
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton sig1;
    private javax.swing.JRadioButton sig5;
    // End of variables declaration//GEN-END:variables
}
