package lapr.project.controller;

import lapr.project.model.Encryption;
import lapr.project.model.EventCenter;
import lapr.project.model.User;
import lapr.project.model.register.UserRegister;
import lapr.project.utils.PasswordDoesNotMatch;

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
     */
    public LoginController(EventCenter ec) {
        this.ec = ec;
    }
    
    /**
     * this method gets the user that the inserted credentials refer to, and verirfies the login
     * @param username the inserted username
     * @param pass the inserted password
     * @return returns the user
     * @throws PasswordDoesNotMatch 
     */
    public User verifyLogin(String username, char[] pass) throws PasswordDoesNotMatch {
        int shift = ec.getEncryptionRegister().getEncryptionByUser(ec.getUserRegister().getUserByUsername(username)).getShift();
        String password = Encryption.encryptPassword(Encryption.assemblePassword(pass), shift, Encryption.ABC);
        return ec.getUserRegister().getUserByLogin(username, password);
    }
    
    
}
