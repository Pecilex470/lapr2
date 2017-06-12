/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.Stand;
import lapr.project.model.Stand.typeStand;

/**
 *
 * @author Cerqueira
 */
public class UC20_Controller {

    private EventCenter ec;

    /**
     * Constructor
     *
     * @param ec - Event Center
     */
    public UC20_Controller(EventCenter ec) {
        this.ec = ec;
    }
    
    /**
     * Method that creats new stand
     * @param stand - Stand
     * @return Stand
     */
    public Stand newStand(typeStand stand){
        return new Stand(stand);
    }
    
    /**
     * Method that saves stand in event class
     * @param e - Event
     * @param stand - Stand
     */
    public void saveStand(Event e, Stand stand){
        e.addStand(stand);
    }
}
