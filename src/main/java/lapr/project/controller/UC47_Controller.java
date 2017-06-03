package lapr.project.controller;

import java.util.List;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.RegisterEvent;

/*
 * Controller of UC47
 */

/**
 *
 * @author João Oliveira
 */
public class UC47_Controller {
    

    private EventCenter ec;
    
    public UC47_Controller(){
    }
      

    /**
     * Method to get the EventList
     * @param ec - EventCenter
     * @return List
     */
    public List<Event> getEventList(EventCenter ec){
        return ec.getRegisterEvent().getEventList();
    }
    
    
    /**
     * Method to get a submission global mean rating of the event
     * @param e - Event
     * @return submission global mean rating (double)
     */
    public double getGlobalMeanRating(Event e){
        return e.getListApplications().getGlobalMeanRating();
    }
}
