package lapr.project.controller;

import lapr.project.model.Encryption;
import lapr.project.model.EventCenter;
import lapr.project.model.User;

/**
 *
 * @author Pedro
 */
public class LoginController {
    
    /**
     * the constructor has the EventCenter as a parameter, so that is has all the information associated to it
     */
    private EventCenter ec;
    
    /**
     * constructor that receives the event center and creates a controller object
     * @param ec
     */
    public LoginController(EventCenter ec) {
        this.ec = ec;
    }
    
    /**
     * this method gets the user that the inserted credentials refer to, and verirfies the login
     * @param username the inserted username
     * @param password
     * @param user
     * @return returns the user 
     */
    public User verifyLogin(String username, String password, User user) {
        int shift = ec.getEncryptionRegister().getEncryptionByUser(ec.getUserRegister().getUserByUsername(username)).getShift();
        password = Encryption.encryptPassword(password, shift, Encryption.ABC);
        
        return ec.getUserRegister().getUserByLogin(username, password, user);
    }
    
    
}
