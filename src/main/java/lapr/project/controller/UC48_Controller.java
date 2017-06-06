package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.ApplicationRegister;
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
        return ec.getRegisterEvent().getEventList();
    }
    
    public double getMeanDeviation(Event e){
        ApplicationRegister ar = new ApplicationRegister((ArrayList<Application>) e.getApplicationList());
        return ar.getMeanDeviation(e);
    }
    
}
