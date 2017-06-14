/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

/**
 *
 * @author Pedro Pinho
 */
public class PasswordDoesNotMatch extends Exception {
    
    static final long serialVersionUID = -7034897190745766939L;

    /**
     * Creates a new instance of <code>PasswordDoesNotMatch</code> without
     * detail message.
     */
    public PasswordDoesNotMatch() {
    }

    /**
     * Constructs an instance of <code>PasswordDoesNotMatch</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PasswordDoesNotMatch(String msg) {
        super("Incorrect login Data");
    }
}
