/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.Stand;

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
     * @param area the area of the stand
     * @return Stand
     */
    public Stand newStand(int area){
        return new Stand(area, "");
    }
    
    /**
     * Method that saves stand in event class
     * @param e - Event
     * @param stand - Stand
     */
    public void saveStand(Event e, Stand stand){
        e.addStand(stand);
        e.setAvailableArea(e.getAvailableArea() - stand.getArea());
    }
}
