/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import lapr.project.controller.UC50_Controller;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;
import lapr.project.model.User;
import lapr.project.utils.ExportData;

/**
 *
 * @author Utilizador
 */
public class UC50_2_UI extends javax.swing.JFrame {

    static final long serialVersionUID = -3387516993124229948L;

    private EventCenter ec;
    private UC50_Controller c;
    private User user;
    private List<FAE> fae1= new ArrayList<>();
    private List<FAE> fae2=new ArrayList<>();
    private String[] a;

    /**
     * Creates new form UC50
     */
    public UC50_2_UI(EventCenter ec, List<FAE> f1, List<FAE> f2, String[] pickedList, User u) {
        this.ec = ec;
        this.user = u;
        this.a=pickedList;
        this.fae1=f1;
        this.fae2=f2;
        this.c = new UC50_Controller(ec);
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC50_2_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        ExportData.serialization(ec);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(UC44_1_UI.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        insertB = new javax.swing.JButton();
        backB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FAEi", "FAEk", "Number of submissions", "Number of submissions", "Deviations mean FAEi", "Deviations mean FAEk", "Critical Value ", "Observed value of teste statistic", "There are differences:Yes/No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };
            static final long serialVersionUID = -3387516993124229948L;
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        insertB.setText("Insert");
        insertB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBActionPerformed(evt);
            }
        });

        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        jLabel1.setText("Testing the difference between two FAEs mean  deviations");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertB)
                .addGap(54, 54, 54)
                .addComponent(backB)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertB)
                    .addComponent(backB))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBActionPerformed
      DefaultTableModel val = (DefaultTableModel) jTable1.getModel();
         List<FAE> allFAEThatEvaluatedAnApplication = ec.getFAEEvaluatedApplications();
         for (int i=0; i<fae1.size(); i++) {
            String sL = getSignificanceLevel(fae1.get(i),fae2.get(i));
            String nome1 = fae1.get(i).getName();
            String nome2 = fae2.get(i).getName();
            int nSub1= ec.getEvaluatedApplicationsFAE(nome1).size();
            int nSub2 =ec.getEvaluatedApplicationsFAE(nome2).size();
            double mRa1 = ec.getMeanRatingF(nome1);
            double mRa2 = ec.getMeanRatingF(nome2);
            double dMean1 = ec.getMeanDeviation(nome1);
            double dMean2 = ec.getMeanDeviation(nome2);
            double sMean1 = ec.getStandardDeviation(nome1);
            double sMean2 = ec.getStandardDeviation(nome2);
            double z = ec.getZ2MeanDeviations(fae1.get(i),fae2.get(i));
            double zc = ec.zC(sL);
            String dec = ec.testingTheDifferenceBetweenTwoFAEsMeanDeviations(fae1.get(i),fae2.get(i),sL);
            if(nSub1 >= 30 && nSub2>=30){
             val.addRow(new Object[]{nome1,nome2,nSub1,nSub2,dMean1,dMean2,zc,z,dec});   
            }
           
      }
        
        
    }//GEN-LAST:event_insertBActionPerformed

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        new UC50_1_UI(ec, user);
        dispose();
    }//GEN-LAST:event_backBActionPerformed

    
     public String getSignificanceLevel(FAE f,FAE f1) {
        String cv = "-1";
        for (int i = 0; i < a.length; i++) {
            String[] parts = a[i].split("-");
            String part1 = parts[0].trim();
            String part2 = parts[1].trim();
            String part3 = parts[2].trim();
  
            if (part1.equals(f.getName()) || part2.equals(f1.getName()) ) {
                cv = part3;
             return cv;
            
            }
           
        }
        return cv;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.JButton insertB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}