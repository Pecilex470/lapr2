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
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.Stand;
import lapr.project.model.User;
import lapr.project.utils.ExportData;
import lapr.project.utils.MathUtils;

/**
 *
 * @author Utilizador
 */
public class UC41_2_UI extends javax.swing.JFrame {

    EventCenter ec;
    Event event;
    User u;
    String[] areaColumn;
    double[] relativeColumn;
    int[] absoluteColumn;

    /**
     * Creates new form UC41_2_UI
     */
    public UC41_2_UI(Event e, EventCenter ec, User u) {
        this.ec = ec;
        this.u = u;
        this.event = e;
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        getTableValues(event);
        getAbsoluteColumn(event);
        getRelativeColumn();

        DefaultTableModel val = (DefaultTableModel) jTable1.getModel();

        for (int i = 0; i < areaColumn.length; i++) {

            val.addRow(new Object[]{areaColumn[i], absoluteColumn[i], relativeColumn[i]});
        }

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC41_2_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        ExportData.serialization(ec);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(UC2_UI.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        meanLabel = new javax.swing.JTextField();
        deviationLabel = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stand Area", "Absolute Frequency", "Relative Frequency"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BackB.setText("Back");
        BackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBActionPerformed(evt);
            }
        });

        jLabel1.setText("Mean");

        jLabel2.setText("Standard Deviation");

        meanLabel.setEditable(false);
        meanLabel.setText("0");
        meanLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meanLabelActionPerformed(evt);
            }
        });

        deviationLabel.setEditable(false);
        deviationLabel.setText("0");
        deviationLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviationLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackB)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(84, 84, 84)
                                .addComponent(meanLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(deviationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(208, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(meanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(deviationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(BackB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBActionPerformed
        new UC41_1_UI(ec, u);
        dispose();
    }//GEN-LAST:event_BackBActionPerformed

    private void deviationLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviationLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deviationLabelActionPerformed

    private void meanLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meanLabelActionPerformed

    }//GEN-LAST:event_meanLabelActionPerformed

    public void getTableValues(Event e) {

        int space = e.determineInterspaceOfTable();
        int cont = 0;
        areaColumn = new String[e.getK(e.getStandList().size())];

        for (int i = 0; i < areaColumn.length; i++) {
            areaColumn[i] = "]" + cont + "-";
            areaColumn[i] += cont + space + "]";
            cont += space;
        }

    }

    public void getAbsoluteColumn(Event e) {

        absoluteColumn = new int[areaColumn.length];
        List<Stand> list = e.getStandList();
        int mean = 0;
        int cont = 0;

        for (int i = 0; i < areaColumn.length; i++) {
            String[] ends = areaColumn[i].split("-");

            try {
                int smallEnd = Integer.parseInt(ends[0].substring(1));
                int bigEnd = Integer.parseInt(ends[1].substring(0, ends[1].length() - 1));
                int[] listDes = new int[list.size()];
                absoluteColumn[i] = 0;
                for (Stand stand : list) {
                    listDes[cont] = stand.getArea();
                    if (stand.getArea() > smallEnd && stand.getArea() <= bigEnd) {
                        absoluteColumn[i] += 1;
                        mean += stand.getArea();
                        cont++;
                    }
                }
                deviationLabel.setText(MathUtils.calculeStandartDesviation(listDes)+"");
            } catch (Exception ex) {
                System.out.println("Erro in conversion to int, method getAbsoluteColumn!");
            }

        }
        meanLabel.setText((mean / cont) + "");
    }

    public void getRelativeColumn() {

        relativeColumn = new double[absoluteColumn.length];

        double total = 0;
        for (int i = 0; i < absoluteColumn.length; i++) {
            total += absoluteColumn[i];
        }

        for (int i = 0; i < relativeColumn.length; i++) {
            relativeColumn[i] = (absoluteColumn[i] / total);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackB;
    private javax.swing.JTextField deviationLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField meanLabel;
    // End of variables declaration//GEN-END:variables
}
