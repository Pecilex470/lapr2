/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import lapr.project.controller.UC45_Controller;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;
import lapr.project.model.User;
import lapr.project.utils.ExportData;

/**
 *
 * @author Utilizador
 */
public class UC50_1_UI extends javax.swing.JFrame {

    static final long serialVersionUID = -3387516993124229948L;
    private UC45_Controller c;
    private List<FAE> faeSelected1 = new ArrayList<>();
    private List<FAE> faeSelected2 = new ArrayList<>();
    private EventCenter ec;
    private String[] pickedList = new String[0];
    private String[] topList;
    private Double[] a;
    private User user;

    /**
     * Creates new form UC50_1_UI
     */
    public UC50_1_UI(EventCenter ec, User u) {
        this.user = u;
        this.ec = ec;
        this.c = new UC45_Controller(ec);
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC50_1_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        ExportData.serialization(ec);
                    } catch (Exception ex) {
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
        pickFae1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        pickFae2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        pickedFAE = new javax.swing.JList<>();
        pickFB = new javax.swing.JButton();
        unpickFB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        confirmFae = new javax.swing.JButton();
        backFae = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pickFae1.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = inicialFAE1List();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        pickFae1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faeListMouseClicked(evt);
            }

        });
        jScrollPane1.setViewportView(pickFae1);

        pickFae2.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = inicialFAE2List();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        pickFae2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faeListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(pickFae2);

        pickedFAE.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = {""};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        pickedFAE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faeListMouseClicked(evt);
            }

        });
        jScrollPane3.setViewportView(pickedFAE);

        pickFB.setText("Pick");
        pickFB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickFBActionPerformed(evt);
            }
        });

        unpickFB.setText("Unpick");
        unpickFB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unpickFBActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose a FAE in each List");

        confirmFae.setText("Confirm");
        confirmFae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmFaeActionPerformed(evt);
            }
        });

        backFae.setText("Back");
        backFae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backFaeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(pickFB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unpickFB)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmFae)
                .addGap(29, 29, 29)
                .addComponent(backFae)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pickFB)
                    .addComponent(unpickFB))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmFae)
                    .addComponent(backFae))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pickFBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickFBActionPerformed
       String fae = pickFae1.getSelectedValue();
        String fae2 = pickFae2.getSelectedValue();
        
        
        pickFae2.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = returnTopList();
            
            public int getSize() {
                return strings.length;
            }
            
            public String getElementAt(int i) {
                return strings[i];
            }
        });
        
        addFAEToPickedList(fae,fae2);
        
        
        
        double a = Double.parseDouble(JOptionPane.showInputDialog(UC50_1_UI.this, "Enter the significance level [0.01 or 0.05]"));
        
        while (a != 0.01 && a != 0.05) {
            JOptionPane.showMessageDialog(UC50_1_UI.this, "Insert 0.01 or 0.05");
            a = Double.parseDouble(JOptionPane.showInputDialog(UC50_1_UI.this, "Enter the significance level [0.01 or 0.05]"));
        }
    }//GEN-LAST:event_pickFBActionPerformed

    private void unpickFBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unpickFBActionPerformed
       String faePicked = pickedFAE.getSelectedValue();
        
        removeFAEFromPickedList(faePicked);
        
        pickedFAE.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = returnPickedList();
            
            public int getSize() {
                return strings.length;
            }
            
            public String getElementAt(int i) {
                return strings[i];
            }
        }); 
        
     
        
        pickFae2.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = returnTopList();
            
            public int getSize() {
                return strings.length;
            }
            
            public String getElementAt(int i) {
                return strings[i];
            }
        });                                         
                                              
    }//GEN-LAST:event_unpickFBActionPerformed

    private void backFaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backFaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backFaeActionPerformed

    private void confirmFaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmFaeActionPerformed
       for(int i =0; i<pickedList.length;i++){
         String[] part=pickedList[i].trim().split("-");
         String part1 = part[0].trim();
         String part2 = part[1].trim();
         faeSelected1.add(nameStringToFAE(part1));
         faeSelected2.add(nameStringToFAE(part2));
      
      }
       
      
      if(faeSelected1==null || faeSelected2==null){
       JOptionPane.showMessageDialog(UC50_1_UI.this, "Please select events", "Error", JOptionPane.OK_OPTION);
      }else{
        new UC50_2_UI(ec,faeSelected1,faeSelected2,pickedList, user);
        dispose();
      }
                                                 
    }//GEN-LAST:event_confirmFaeActionPerformed

    
    /**
     * Method that retrieves the full list of fae that evaluated a application
     *
     * @return a String array to fill the JList
     */
    public String[] inicialFAE1List() {
        

        String[] list = new String[ec.getFAEEvaluatedApplications().size()];
        int cont = 0;
        for (FAE fae : ec.getFAEEvaluatedApplications()) {
            String title = fae.getName();
            list[cont] = title;
            cont++;
        }
        
        topList = list;
        
        return list;
    }
    /**
     * /
     * Method that retrieves the full list of fae that evaluated a application
     *
     * @return a String array to fill the JList
     */
    public String[] inicialFAE2List() {
       
     return inicialFAE1List(); 
    }
    
     public void removeFAEFromTop2List(String uName) {
        
        String[] list = new String[topList.length - 1];
        
        int flag = 0;
        for (int i = 0; i < topList.length; i++) {
            
            if (!uName.equals(topList[i])) {
                list[i - flag] = topList[i];
            } else {
                flag++;
            }
        }
        
        topList = new String[topList.length - 1];
        topList = list;
        
    }
    
    public void removeFAEFromPickedList(String eTwoTitle) {
        String[] eTitle = eTwoTitle.trim().split("-");
        String eTitle1 = eTitle[0];
        String eTitle2 = eTitle[1]; 
        
        String[] list = new String[pickedList.length - 1];
        
        int flag = 0;
        for (int i = 0; i < pickedList.length; i++){
           String[] part= pickedList[i].trim().split("-");
           String part1 = part[0];
           String part2 = part[1];
           if (!eTitle1.equals(part1) && !eTitle2.equals(part2)) {
                list[i - flag] = pickedList[i] ;
            } else {
                flag++;
            }
        }
        
        pickedList = new String[pickedList.length - 1];
        pickedList = list;
        
    }
    
    public void addFAEToPickedList(String pickedFAE, String pickedFAE2) {
        
        String[] list = new String[pickedList.length + 1];
        
        for (int i = 0; i < pickedList.length; i++) {
            list[i] = pickedList[i];
        }
        
        list[list.length - 1] = pickedFAE + "-" + pickedFAE2;
        
        pickedList = new String[pickedList.length + 1];
        pickedList = list;
        
    }
    
    
    public void addEventToTopList(String topFAE) {
        
        String[] list = new String[topList.length + 1];
        
        for (int i = 0; i < topList.length; i++) {
            list[i] = topList[i];
        }
        String[] part = topFAE.split("-");
        String FAE2=part[1].trim();
        list[list.length - 1] = FAE2;
        
        topList = new String[topList.length + 1];
        topList = list;
        
    }
    
    public String[] returnPickedList() {
        
        return pickedList;
    }
    
    public String[] returnTopList() {
        return topList;
    }
    
    public FAE nameStringToFAE(String name) {
        
        String c =name;
        FAE f= new FAE();
        for (FAE fae : ec.getFAEEvaluatedApplications()) {
         
            if (c.equals(fae.getName())) {  

                f = fae;
                break;
            }
        }
        
        return f;
    }
    
     private void faeListMouseClicked(java.awt.event.MouseEvent evt) {                                      

    }  
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backFae;
    private javax.swing.JButton confirmFae;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton pickFB;
    private javax.swing.JList<String> pickFae1;
    private javax.swing.JList<String> pickFae2;
    private javax.swing.JList<String> pickedFAE;
    private javax.swing.JButton unpickFB;
    // End of variables declaration//GEN-END:variables
}
