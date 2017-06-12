package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.User;
import lapr.project.model.register.UserRegister;

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
    
    public User getUser(String username, String password) {
        UserRegister userRegister = ec.getUserRegister();
        return userRegister.getUser(username, password);
    }
    
}
