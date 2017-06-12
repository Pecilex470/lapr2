package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;


/*
 * UC48 Controller
 * 
 */

/**
 *
 * @author Cerqueira
 */
public class UC48_Controller {
    
    /**
     * ec - Event Center
     */
    private EventCenter ec;
    
    /**
     * Constructor
     * @param ec - Event Center
     */
    public UC48_Controller(EventCenter ec){
        this.ec=ec;
    }
    
    /**
     * Method to get the Event List of Event Center
     * @return Event List
     */
    public List<Event> getEventList(){
        return ec.getEventRegister().getEventList();
    }
    
    /**
     * Method to get the mean deviation
     * 
     * @param e - Event
     * @param fae - FAE
     * @return mean deviation
     */
    public double getMeanDeviation(Event e, FAE fae){
        return fae.getMeanDeviation(e);
    }
    
}
