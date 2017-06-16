/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Pinho
 */
public class LoginDataIncorrect extends Exception {
    
    static final long serialVersionUID = -3387516993124229948L;

    /**
     * Creates a new instance of <code>LoginDataIncorrect</code> without detail
     * message.
     */
    public LoginDataIncorrect() {
    }

    /**
     * Constructs an instance of <code>LoginDataIncorrect</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LoginDataIncorrect(String msg) {
        super(msg);
        JOptionPane.showMessageDialog(null, "The username or password are incorrect", "Error", JOptionPane.OK_OPTION);
    }
}
