package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.register.ApplicationRegister;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cerqueira
 */
public class UC48_Controller {
    
    private EventCenter ec;
    
    public UC48_Controller(EventCenter ec){
        this.ec=ec;
    }
    
    public List<Event> getEventList(){
        return ec.getEventRegister().getEventList();
    }
    
    public double getMeanDeviation(Event e, Application app){
        return e.getApllicationRegister().getMeanDeviation(e, app);
    }
    
}
