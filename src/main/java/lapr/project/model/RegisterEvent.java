/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;

/**
 *
 * @author Cerqueira
 */
public class RegisterEvent {
    private List<Event> el;
    
    public RegisterEvent(){
        
    }
    
    public List<Event> getEventList(){
        return el;
    }
}
