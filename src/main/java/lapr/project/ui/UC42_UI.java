/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import lapr.project.controller.UC42_Controller;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.User;
import lapr.project.utils.ExportData;

/**
 *
 * @author Luis
 */
public class UC42_UI extends javax.swing.JFrame {

    static final long serialVersionUID = -3387516993124229948L;
    EventCenter ec;
    User u;
    UC42_Controller c;

    /**
     * Creates new form UC42_UI
     */
    public UC42_UI(EventCenter ec, User u) {
        this.u = u;
        this.ec = ec;
        c = new UC42_Controller(ec);

        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC42_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        ExportData.serialization(ec);
                    } catch (Exception ex) {
                        Logger.getLogger(UC42_UI.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventListUI = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        acceptanceRateUI = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eventListUI.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = initialEventList();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        eventListUI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventListUIMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(eventListUI);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Show Event Acceptance Rate");

        acceptanceRateUI.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        acceptanceRateUI.setText("Select Event");
        acceptanceRateUI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 3, true));

        jLabel3.setText("Selected event acceptance rate:");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acceptanceRateUI))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptanceRateUI)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new EventManagerActions_UI(ec, u);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eventListUIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventListUIMouseClicked

        
       
        if (!ec.getEventRegister().getEventList().get(eventListUI.getSelectedIndex()).getApplicationList().getApplications().isEmpty()) {
            double accepRate = c.getEventAcceptanceRate(ec.getEventRegister().getEventList().get(eventListUI.getSelectedIndex()));
        
        int int1 = (int) (accepRate * 1000);
        double aR = (double) int1 / 1000;
        
        acceptanceRateUI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 3, true));
        acceptanceRateUI.setFont(new java.awt.Font("Dialog", 1, 24));

        acceptanceRateUI.setText(""+aR);
        } else {
            acceptanceRateUI.setText("Doesn't have applications");
            acceptanceRateUI.setFont(new java.awt.Font("Dialog", 1, 10));
            acceptanceRateUI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        }
        
        


    }//GEN-LAST:event_eventListUIMouseClicked

    public String[] initialEventList() {

        String[] eventList = new String[ec.getEventRegister().getEventList().size()];
        int cont = 0;
        for (Event e : ec.getEventRegister().getEventList()) {
            eventList[cont] = e.getTitle();
            cont++;
        }

        return eventList;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acceptanceRateUI;
    private javax.swing.JList<String> eventListUI;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
