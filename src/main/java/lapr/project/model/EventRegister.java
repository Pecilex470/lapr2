/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utilizador
 */
public class EventRegister {
    /**
     * List of events in charge of a given Event Center.
     */
    private List<Event> events = new ArrayList<>();

    /**
     * Creates an instance of EventRegister receiving an event list.
     *
     * @param events Event list to be saved on the EventRegister instance being created 
     */
    public EventRegister(List<Event> events) {
        this.events = events;
    }

    /**
     * @return List of events in charge of a given Event Center
     */
    public List<Event> getEventList() {
        return events;
    }
    
    //    public List<Event> getAvailableEvents() {
//        Date
//        for (Event event : eventRegister) {
//            if (event.getSubmissionStartDate())
//        }
//    }

  
  
}
