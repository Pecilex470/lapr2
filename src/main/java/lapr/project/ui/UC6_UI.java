/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import lapr.project.controller.UC6_Controller;
import lapr.project.model.Encryption;
import lapr.project.model.EventCenter;
import lapr.project.model.Representative;

/**
 *
 * @author Pedro
 */
@SuppressWarnings("serial")
public class UC6_UI extends javax.swing.JDialog {

    private EventCenter ec;
    private UC6_Controller c;

    /**
     * Creates new form UC6_UI
     *
     * @param ec Receives the instance of the EventCenter
     * @param c Receives the instance of this UI's Controller
     */
    public UC6_UI(EventCenter ec) {
        this.c = new UC6_Controller(ec);
        this.ec = ec;
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(UC6_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        representativeCheckBox = new javax.swing.JCheckBox();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        errorTextArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        timezoneComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        keywordTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New User");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Insert all your data:");

        jLabel2.setText("Full name:");

        jLabel3.setText("E-mail address:");

        jLabel4.setText("Username:");

        jLabel5.setText("* Password:");

        jLabel6.setText("Confirm Password:");

        jLabel8.setText("Preferred Timezone:");

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        representativeCheckBox.setText("I'm a Representative");
        representativeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                representativeCheckBoxActionPerformed(evt);
            }
        });

        errorTextArea.setEditable(false);
        errorTextArea.setColumns(20);
        errorTextArea.setRows(5);
        errorTextArea.setText("The password must have at least one special\ncharacter (, . : ; -), and at least one uppercase\nletter and one lowercase letter, as well as at least\none number");
        jScrollPane1.setViewportView(errorTextArea);

        jLabel9.setText("*");

        timezoneComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UTC", "GMT" }));

        jLabel7.setText("Data encryption keyword:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(representativeCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timezoneComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(keywordTextField))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timezoneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(keywordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(representativeCheckBox)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmButton)
                            .addComponent(cancelButton)))
                    .addComponent(jLabel9))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void representativeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_representativeCheckBoxActionPerformed

    }//GEN-LAST:event_representativeCheckBoxActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed

        if (!(nameTextField.getText().equals("") || emailTextField.getText().equals("") || usernameTextField.getText().equals("") || c.assemblePassword(passwordField.getPassword()).equals("") || keywordTextField.getText().equals(""))) {
            if (ec.getUserRegister().verifyUsername(usernameTextField.getText()) == false) {
                if (c.verifyEmail(emailTextField.getText())) {
                    if (c.verifyExistingEmail(emailTextField.getText()) == false) {
                        if (c.assemblePassword(passwordField.getPassword()).equals(c.assemblePassword(confirmPasswordField.getPassword()))) {
                            if (4 <= keywordTextField.getText().length() && 7 >= keywordTextField.getText().length()) {
                                if (c.verifyPassword(c.assemblePassword(passwordField.getPassword())) == true) {
                                    if (JOptionPane.showConfirmDialog(UC6_UI.this, "Are you sure you want to register with this Data?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                                        int shift = ThreadLocalRandom.current().nextInt(1, 81);
                                        String password = c.encryptPassword(c.assemblePassword(passwordField.getPassword()), shift, Encryption.ABC);
                                        if (representativeCheckBox.isSelected()) {
                                            c.registerUser(c.twoLayerEncription(nameTextField.getText(), shift, keywordTextField.getText(), Encryption.ABC), c.twoLayerEncription(emailTextField.getText(), shift, keywordTextField.getText(), Encryption.ABC), usernameTextField.getText(), password, false, true);
                                        } else {
                                            c.registerUser(c.twoLayerEncription(nameTextField.getText(), shift, keywordTextField.getText(), Encryption.ABC), c.twoLayerEncription(emailTextField.getText(), shift, keywordTextField.getText(), Encryption.ABC), usernameTextField.getText(), password, false, false);
                                        }
                                        c.addEncryption(shift, usernameTextField.getText(), keywordTextField.getText());
                                        dispose();
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(UC6_UI.this, "Missing password requirements", "Error", JOptionPane.OK_OPTION);
                                    errorTextArea.setForeground(Color.red);
                                }
                            } else {
                                JOptionPane.showMessageDialog(UC6_UI.this, "The Keyword must be between 4 and 7 characters", "Error", JOptionPane.OK_OPTION);
                            }
                        } else {
                            JOptionPane.showMessageDialog(UC6_UI.this, "Passwords don´t match, please try again", "Error", JOptionPane.OK_OPTION);
                        }

                    } else {
                        JOptionPane.showMessageDialog(UC6_UI.this, "Email already exists in the system", "Error", JOptionPane.OK_OPTION);
                    }
                } else {
                    JOptionPane.showMessageDialog(UC6_UI.this, "Email is not in the example@example.domain format", "Error", JOptionPane.OK_OPTION);
                }
            } else {
                JOptionPane.showMessageDialog(UC6_UI.this, "This username is already taken", "Error", JOptionPane.OK_OPTION);
            }
        } else {
            JOptionPane.showMessageDialog(UC6_UI.this, "Please fill in all the fields", "Missing data", JOptionPane.OK_OPTION);
        }

    }//GEN-LAST:event_confirmButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        if (JOptionPane.showConfirmDialog(UC6_UI.this, "Do you wish to exit without saving?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextArea errorTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keywordTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox representativeCheckBox;
    private javax.swing.JComboBox<String> timezoneComboBox;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
