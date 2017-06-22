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
import lapr.project.controller.UC44_Controller;
import lapr.project.controller.UC45_Controller;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.User;
import lapr.project.utils.ExportData;

/**
 *
 * @author Utilizador
 */
public class UC45_2_UI extends javax.swing.JFrame {
    
    static final long serialVersionUID = -3387516993124229948L;
    private UC45_Controller c;
    private EventCenter ec;
    private List<Event> eve1= new ArrayList<>();
    private List<Event> eve2=new ArrayList<>();
    private String[] a;
    private User user;
    

    /**
     * Creates new form UC45_2_UI
     */
    public UC45_2_UI(EventCenter ec, List<Event> eventSelected1,List<Event> eventSelected2, String[] a, User user) {
        this.user=user;
        this.ec = ec;
        this.c = new UC45_Controller(ec);
        this.eve1=eventSelected1;
        this.eve2=eventSelected2;
        this.a = a;
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC45_2_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
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
        insert45 = new javax.swing.JButton();
        back45 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event i", "Event j", "Proportion of submissions accepted in ni", "Proportion of submissions accepted in nj", "Significance level", "Observed value of teste statistic", "Decision(Yes/No)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        insert45.setText("Insert");
        insert45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert45ActionPerformed(evt);
            }
        });

        back45.setText("Back");
        back45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back45ActionPerformed(evt);
            }
        });

        jLabel1.setText(" Testing the difference between  two Events acceptance rate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(insert45)
                        .addGap(54, 54, 54)
                        .addComponent(back45)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(247, 247, 247))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert45)
                    .addComponent(back45))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insert45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert45ActionPerformed
       DefaultTableModel val = (DefaultTableModel) jTable1.getModel();

       
        for (int i=0; i<eve1.size(); i++) {
        
           
            String title1 = eve1.get(i).getTitle();
            String title2 = eve2.get(i).getTitle();
            double aR1 = eve1.get(i).getAcceptanceRate();
            double aR2 = eve2.get(i).getAcceptanceRate();
            String sl = getSignificanceLevel(eve1.get(i),eve2.get(i));
            double cv = eve1.get(i).criticalValue(sl);
            double ZBil = eve1.get(i).getZBil(eve2.get(i));
            String decision = eve1.get(i).testDifferenceTwoEventsAccepRate50(eve2.get(i),sl);
            val.addRow(new Object[]{title1,title2,aR1,aR2,sl,cv,ZBil,decision});
        }


                                           
    }//GEN-LAST:event_insert45ActionPerformed

    
    public String getSignificanceLevel(Event e,Event e1) {
        String cv = "-1";
        for (int i = 0; i < a.length; i++) {
            String[] parts = a[i].split("-");
            String part1 = parts[0].trim();
            String part2 = parts[1].trim();
            String part3 = parts[2].trim();
  
            if (part1.equals(e.getTitle()) || part2.equals(e1.getTitle()) ) {
                cv = part3;
             return cv;
            
            }
           
        }
        return cv;

    }
    
    
    
    private void back45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back45ActionPerformed
       new UC45_1_UI(ec, user);
        dispose();
    }//GEN-LAST:event_back45ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back45;
    private javax.swing.JButton insert45;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
