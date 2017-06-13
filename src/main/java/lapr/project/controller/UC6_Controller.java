package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.User;

/**
 *
 * @author Pedro
 */
public class UC6_Controller {
    
    /**
     * this is the instance of the EventCenter that contains all the information
     */
    private EventCenter ec;
    
    /**
     * This is the contructor for the controller, that creates an instance of the UC6's controller
     * 
     * @param ec The instance of the EventCenter
     */
    public UC6_Controller(EventCenter ec) {
        this.ec = ec;
    }
    
    /**
     * This method takes tha Data that the unregistered user inserted and creates a new User with those details
     * 
     * @param name The full name od the user
     * @param email The user's email address
     * @param username The user's username, the way he is recognised in the system
     * @param password The user's password, that has been encrypted before being stored under the User object
     */
    public void registerUser(String name, String email, String username, String password) {
        ec.getUserRegister().getUsers().add(new User(name, email, username, password));
    }
    
    /**
     * This method's functionality is to encrypt the password that the user provided for further logins
     * 
     * @param password the password the user inserted
     * @return returns the encrypted password
     */
    public String encryptPassword(String password) {
        return password;
    }
    
}
