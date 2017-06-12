/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.Stand.typeStand;

/**
 *
 * @author Cerqueira
 */
public class UC20_Controller {
    
    private EventCenter ec;
    
    public UC20_Controller(EventCenter ec){
        this.ec=ec;
    }
    
    public List<Event> getEventList(){
        return ec.getEventRegister().getEventList();
    }
    
    public int getAvailableArea(Event e){
        return e.getAvailableArea();
    }
    
    public void addStand(Event e, typeStand stand, Application app){
        app.addStand(stand);
        e.setAvailableArea(e.getAvailableArea()-stand.getArea());
    }
    
}
