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
import lapr.project.controller.UC44_Controller;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.User;
import lapr.project.utils.ExportData;

/**
 *
 * @author Utilizador
 */

public class UC44_1_UI extends javax.swing.JFrame {
     
    static final long serialVersionUID = -3387516993124229948L;
    private UC44_Controller c;
     private List<Event> eventSelected = new ArrayList<>();
     private EventCenter ec;
     private String[] pickedList = new String[0];
     private String[] topList;
     private Double[] a;
    private User user;

      

    /**
     * Creates new form UC44_UI
     * @param ec the instance of the event center
     * @param u the user that is using
     */
    public UC44_1_UI(EventCenter ec, User u) {
        this.user=u;
        this.ec = ec;
        this.c = new UC44_Controller(ec);
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC44_1_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        pickedEventList = new javax.swing.JList<>();
        pickButton = new javax.swing.JButton();
        unpickButton = new javax.swing.JButton();
        Continue = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eventList.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = inicialEventList();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        eventList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(eventList);

        pickedEventList.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = {""};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }

        });
        jScrollPane2.setViewportView(pickedEventList);

        pickButton.setText("Pick");
        pickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickButtonActionPerformed(evt);
            }
        });

        unpickButton.setText("Unpick");
        unpickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unpickButtonActionPerformed(evt);
            }
        });

        Continue.setText("Continue");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });

        jLabel1.setText("Test if the acceptance rate of each event is over 50%");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(pickButton)
                        .addGap(62, 62, 62)
                        .addComponent(unpickButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Continue)
                                .addGap(20, 20, 20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pickButton)
                    .addComponent(unpickButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Continue)
                    .addComponent(back))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickButtonActionPerformed
        String event = eventList.getSelectedValue();
        
        removeEventFromTopList(event);
        
        eventList.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = returnTopList();
            
            public int getSize() {
                return strings.length;
            }
            
            public String getElementAt(int i) {
                return strings[i];
            }
        });
        
        addEventToPickedList(event);
        
        double a = Double.parseDouble(JOptionPane.showInputDialog(UC44_1_UI.this, "Enter the significance level [0.01 or 0.05]"));
        
        pickedList[pickedList.length-1] += " - " + a;
        
        
        
        pickedEventList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = returnPickedList();
            static final long serialVersionUID = -3387516993124229948L;
            
            public int getSize() {
                return strings.length;
            }
            
            public String getElementAt(int i) {
                return strings[i];
            }
        });
        
       
        
        
                
    }//GEN-LAST:event_pickButtonActionPerformed
    
    private void unpickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unpickButtonActionPerformed
                                        
        
        String event = pickedEventList.getSelectedValue();
        
        removeEventFromPickedList(event);
        
        pickedEventList.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = returnPickedList();
            
            public int getSize() {
                return strings.length;
            }
            
            public String getElementAt(int i) {
                return strings[i];
            }
        }); 
        
        addEventToTopList(event);
        
        eventList.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = returnTopList();
            
            public int getSize() {
                return strings.length;
            }
            
            public String getElementAt(int i) {
                return strings[i];
            }
        });                                            
    }//GEN-LAST:event_unpickButtonActionPerformed

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed

      for(int i =0; i<pickedList.length;i++){
         String[] part=pickedList[i].split("-");
         String part1 = part[0].trim();
         eventSelected.add(titleStringToEvent(part1));
      
      }
       
      
      if(eventSelected==null){
       JOptionPane.showMessageDialog(UC44_1_UI.this, "Please select events", "Error", JOptionPane.OK_OPTION);
      }else{
        new UC44_2_UI(ec,eventSelected,pickedList,user);
      }
      
     
    }//GEN-LAST:event_ContinueActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new EventManagerActions_UI(ec,user);
        dispose();
    }//GEN-LAST:event_backActionPerformed
 
    private void eventListMouseClicked(java.awt.event.MouseEvent evt) {                                      

    }                      
    
    
    /**
     * Method that retrieves the full list of events to allow the
     * organizer to select the events.
     *
     * @return a String array to fill the JList
     */
    public String[] inicialEventList() {
        String[] list = new String[ec.getEventRegister().getEventList().size()];
        int cont = 0;
        for (Event e : ec.getEventRegister().getEventList()) {
            String title = e.getTitle();
            list[cont] = title;
            cont++;
        }
        
        topList = list;
        
        return list;
    }
    
    public void removeEventFromTopList(String uName) {
        
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
    
    public void removeEventFromPickedList(String eTitle) {
        
        String[] list = new String[pickedList.length - 1];
        
        int flag = 0;
        for (int i = 0; i < pickedList.length; i++){
           if (!eTitle.equals(pickedList[i])) {
                list[i - flag] = pickedList[i] ;
            } else {
                flag++;
            }
        }
        
        pickedList = new String[pickedList.length - 1];
        pickedList = list;
        
    }
    
    public void addEventToPickedList(String pickedEvent) {
        
        String[] list = new String[pickedList.length + 1];
        
        for (int i = 0; i < pickedList.length; i++) {
            list[i] = pickedList[i];
        }
        
        list[list.length - 1] = pickedEvent;
        
        pickedList = new String[pickedList.length + 1];
        pickedList = list;
        
    }
    
    
    public void addEventToTopList(String topEvent) {
        
        String[] list = new String[topList.length + 1];
        
        for (int i = 0; i < topList.length; i++) {
            list[i] = topList[i];
        }
        String[] part = topEvent.split("-");
        String part1=part[0];
        list[list.length - 1] = part1;
        
        topList = new String[topList.length + 1];
        topList = list;
        
    }
    
    public String[] returnPickedList() {
        
        return pickedList;
    }
    
    public String[] returnTopList() {
        return topList;
    }
   
    
    public Event titleStringToEvent(String title) {
        
        String c =title;
        Event eve= new Event();
        for (Event e : ec.getEventRegister().getEventList()) {
         
            if (c.equals(e.getTitle())) {  

                eve = e;
                break;
            }
        }
        
        return eve;
    }
    
    public void getA(){
       for(int i=0;i<pickedList.length;i++){
           String[] part=pickedList[i].split("-");
           String part2 = part[1];
           a[i]= Double.parseDouble(part2);
       }
       
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continue;
    private javax.swing.JButton back;
    private javax.swing.JList<String> eventList;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pickButton;
    private javax.swing.JList<String> pickedEventList;
    private javax.swing.JButton unpickButton;
    // End of variables declaration//GEN-END:variables
}
