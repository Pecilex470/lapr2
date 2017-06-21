/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import lapr.project.controller.UC44_Controller;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.utils.ExportData;

/**
 *
 * @author Utilizador
 */
public class UC44_2_UI extends javax.swing.JFrame {

    static final long serialVersionUID = -3387516993124229948L;
    private UC44_Controller c;
    private EventCenter ec;
    private List<Event> events;
    private String[] a;

    /**
     * Creates new form UC44_UI
     *
     * @param ec the instance of the event center
     * @param events
     * @param a
     *
     */
    public UC44_2_UI(EventCenter ec, List<Event> events, String[] a) {
        this.ec = ec;
        this.c = new UC44_Controller(ec);
        this.events = events;
        this.a = a;
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC44_2_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        ExportData.serialization(ec);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(UC44_2_UI.class.getName()).log(Level.SEVERE, null, ex);
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
        Back = new javax.swing.JButton();
        Inserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(

            new Object [][] {

            },
            new String [] {
                "Event", "Proportion of submittions accepted in ni ", "Critical Value", "Significance level", "Observed Value of test statistic", "Decision(Yes or No)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };
            static final long serialVersionUID = -3387516993124229948L;
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Inserir.setText("Inserir");
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Inserir)
                .addGap(66, 66, 66)
                .addComponent(Back)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Inserir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        DefaultTableModel val = (DefaultTableModel) jTable1.getModel();
        double e;
        String sl;
        double cv;
        double eve;
        String decision;
        String title;
        for (int i = 0; i < events.size(); i++) {
            System.out.print(events.get(i).getTitle());
            title = events.get(i).getTitle();
            e = events.get(i).getAcceptanceRate();
            sl = getSignificanceLevel(events.get(i));
            cv  = events.get(i).criticalValue(sl);
            eve = events.get(i).getZUni();
            decision = events.get(i).testAcceptanceRate50(sl);
            val.addRow(new Object[]{title,e,sl,cv,eve,decision});
        }
    
    
        
    }//GEN-LAST:event_InserirActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
         new UC44_1_UI(ec);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    
    
    
    

    public String getSignificanceLevel(Event e) {
        String cv = "-1";
        for (int i = 0; i < a.length; i++) {
            String[] parts = a[i].split("-");
            String part1 = parts[0];
            String part2 = parts[1];
            if (part1.equals(e.getTitle())) {
                cv = parts[1];
            }
        }
        return cv;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Inserir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
