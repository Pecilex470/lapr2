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
import lapr.project.model.User;
import lapr.project.utils.ExportData;

/**
 *
 * @author Utilizador
 */
public class UC45_1_UI extends javax.swing.JFrame {

    static final long serialVersionUID = -3387516993124229948L;
    private UC45_Controller c;
    private List<Event> eventSelected1 = new ArrayList<>();
    private List<Event> eventSelected2 = new ArrayList<>();
    private EventCenter ec;
    private String[] pickedList = new String[0];
    private String[] topList1;
    private User user;

    /**
     * Creates new form UC45_1_UI
     */
    public UC45_1_UI(EventCenter ec, User u) {
        this.user = user;
        this.ec = ec;
        this.c = new UC45_Controller(ec);
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC45_1_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        ExportData.serialization(ec);
                    } catch (Exception ex) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        eve1List = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        eve2List = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        pickedEventList = new javax.swing.JList<>();
        pickButton = new javax.swing.JButton();
        UnpickButtom = new javax.swing.JButton();
        confirmButoon = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eve1List.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = inicialEvent1List();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        eve1List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventListMouseClicked(evt);
            }

        });
        jScrollPane1.setViewportView(eve1List);

        eve2List.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = inicialEvent2List();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        eve2List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(eve2List);

        pickedEventList.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = {""};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(pickedEventList);

        pickButton.setText("Pick");
        pickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickButtonActionPerformed(evt);
            }
        });

        UnpickButtom.setText("Unpick");
        UnpickButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnpickButtomActionPerformed(evt);
            }
        });

        confirmButoon.setText("Confirm");
        confirmButoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButoonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose a event in each List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(pickButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UnpickButtom)
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(88, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confirmButoon)
                        .addGap(42, 42, 42)
                        .addComponent(backButton)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(230, 230, 230))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UnpickButtom)
                    .addComponent(pickButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButoon)
                    .addComponent(backButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickButtonActionPerformed
        String event = eve1List.getSelectedValue();
        String event2 = eve2List.getSelectedValue();

        eve2List.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = returnTopList();

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });

        addEventsToPickedList(event, event2);

        double a = Double.parseDouble(JOptionPane.showInputDialog(UC45_1_UI.this, "Enter the significance level [0.01 or 0.05]"));

        while (a != 0.01 && a != 0.05) {
            JOptionPane.showMessageDialog(UC45_1_UI.this, "Insert 0.01 or 0.05");
            a = Double.parseDouble(JOptionPane.showInputDialog(UC45_1_UI.this, "Enter the significance level [0.01 or 0.05]"));
        }

        pickedList[pickedList.length - 1] += " - " + a;

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

    private void UnpickButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnpickButtomActionPerformed
        String event = pickedEventList.getSelectedValue();

        removeEventFromPickedList(event);

        pickedEventList.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] list = returnPickedList();

            public int getSize() {
                return list.length;
            }

            public String getElementAt(int i) {
                return list[i];
            }
        });

        eve2List.setModel(new javax.swing.AbstractListModel<String>() {
            static final long serialVersionUID = -3387516993124229948L;
            String[] strings = returnTopList();

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
    }//GEN-LAST:event_UnpickButtomActionPerformed

    private void confirmButoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButoonActionPerformed
        for (int i = 0; i < pickedList.length; i++) {
            String[] part = pickedList[i].trim().split("-");
            String part1 = part[0].trim();
            String part2 = part[1].trim();
            eventSelected1.add(titleStringToEvent(part1));
            eventSelected2.add(titleStringToEvent(part2));

        }

        if (eventSelected1 == null || eventSelected2 == null) {
            JOptionPane.showMessageDialog(UC45_1_UI.this, "Please select events", "Error", JOptionPane.OK_OPTION);
        } else {
            new UC45_2_UI(ec, eventSelected1, eventSelected2, pickedList, user);
            dispose();
        }
    }//GEN-LAST:event_confirmButoonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new EventManagerActions_UI(ec, user);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * Method that retrieves the full list of events to allow the organizer to
     * select the events.
     *
     * @return a String array to fill the JList
     */
    public String[] inicialEvent1List() {
        String[] list = new String[ec.getEventRegister().getEventList().size()];
        int cont = 0;
        for (Event e : ec.getEventRegister().getEventList()) {
            String title = e.getTitle();
            list[cont] = title;
            cont++;
        }

        topList1 = list;

        return list;
    }

    public String[] inicialEvent2List() {

        return inicialEvent1List();
    }

    public void removeEventFromTop2List(String uName) {

        String[] list = new String[topList1.length - 1];

        int flag = 0;
        for (int i = 0; i < topList1.length; i++) {

            if (!uName.equals(topList1[i])) {
                list[i - flag] = topList1[i];
            } else {
                flag++;
            }
        }

        topList1 = new String[topList1.length - 1];
        topList1 = list;

    }

    public void removeEventFromPickedList(String eTwoTitle) {
        String[] eTitle = eTwoTitle.trim().split("-");
        String eTitle1 = eTitle[0];
        String eTitle2 = eTitle[1];

        String[] list1 = new String[pickedList.length - 1];

        int flag = 0;
        for (int i = 0; i < pickedList.length; i++) {
            String[] part = pickedList[i].trim().split("-");
            String part1 = part[0];
            String part2 = part[1];
            if (!eTitle1.equals(part1) && !eTitle2.equals(part2)) {
                list1[i - flag] = pickedList[i];
            } else {
                flag++;
            }
        }

        pickedList = new String[pickedList.length - 1];
        pickedList = list1;

    }

    public void addEventsToPickedList(String pickedEvent, String pickedEvent2) {

        String[] list = new String[pickedList.length + 1];

        for (int i = 0; i < pickedList.length; i++) {
            list[i] = pickedList[i];
        }

        list[list.length - 1] = pickedEvent + "-" + pickedEvent2;

        pickedList = new String[pickedList.length + 1];
        pickedList = list;

    }

    public void addEventToTopList(String topEvent) {

        String[] list = new String[topList1.length + 1];

        for (int i = 0; i < topList1.length; i++) {
            list[i] = topList1[i];
        }
        String[] part = topEvent.split("-");
        String Event2 = part[1].trim();
        list[list.length - 1] = Event2;

        topList1 = new String[topList1.length + 1];
        topList1 = list;

    }

    public String[] returnPickedList() {

        return pickedList;
    }

    public String[] returnTopList() {
        return topList1;
    }

    public Event titleStringToEvent(String title) {

        String c = title;
        Event eve = new Event();
        for (Event e : ec.getEventRegister().getEventList()) {

            if (c.equals(e.getTitle())) {

                eve = e;
                break;
            }
        }

        return eve;
    }

    private void eventListMouseClicked(java.awt.event.MouseEvent evt) {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UnpickButtom;
    private javax.swing.JButton backButton;
    private javax.swing.JButton confirmButoon;
    private javax.swing.JList<String> eve1List;
    private javax.swing.JList<String> eve2List;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton pickButton;
    private javax.swing.JList<String> pickedEventList;
    // End of variables declaration//GEN-END:variables
}
