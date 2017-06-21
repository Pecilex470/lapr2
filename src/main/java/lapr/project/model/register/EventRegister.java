/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Event;
import lapr.project.model.User;
import lapr.project.utils.Date;

/**
 *
 * @author Utilizador
 */
public class EventRegister implements Serializable{
    
     static final long serialVersionUID = 17;

    /**
     * List of events in charge of a given Event Center.
     */
    private List<Event> events = new ArrayList<>();

    /**
     * Creates an instance of EventRegister receiving an event list.
     *
     * @param events Event list to be saved on the EventRegister instance being
     * created
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
    /**
     * sets the event list from an existing list
     *
     * @param el existing list that is received
     */
    public void setEventList(List<Event> el) {
        this.events = el;
    }

    public boolean validateEventData(String title, String location, String description, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate, String eventType, FAEList fl, OrganizerList ol, int availableArea) {
        return true;
    }

  

    public Event getEventByTitle(String title) {

        for (Event e : events) {
            if (e.getTitle().equals(title)) {
                return e;
            }
        }
        return null;
    }

}
