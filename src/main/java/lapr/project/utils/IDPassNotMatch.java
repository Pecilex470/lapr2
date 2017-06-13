/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

/**
 *
 * @author Utilizador
 */
public class IDPassNotMatch extends RuntimeException {

    static final long serialVersionUID = -7034897190745766939L;
    
    public IDPassNotMatch() {
        super("The inserted password does not match");
    }

}
