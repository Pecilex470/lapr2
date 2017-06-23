/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;
import lapr.project.model.User;

/**
 *
 * @author Luis
 */
public class UC46_Controller {
    
    
    EventCenter ec;
    
    public UC46_Controller(EventCenter ec){
        this.ec=ec;
    }
    
    public User getUserByUsername(String username){
        
        return ec.getUserRegister().getUserByUsername(username);
    }
    
}
