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
import lapr.project.utils.CustomDate;

/**
 *
 * @author Utilizador
 */
public class EventRegister implements Serializable {

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

    /**
     * This method gets the events that are still available for receiving
     * applications
     *
     * @return returns a list with the Events
     */
    public List<Event> getAvailableEvents() {
        List<Event> list = new ArrayList<>();
        CustomDate today = CustomDate.getCurrentTime();
        for (Event event : events) {
            

            
            if (today.checkSubmissionPeriod(event.getSubmissionStartDate(), event.getSubmissionEndDate())) {
                list.add(event);
            }
        }
        return list;
    }

    /**
     * sets the event list from an existing list
     *
     * @param el existing list that is received
     */
    public void setEventList(List<Event> el) {
        this.events = el;
    }
    
    public void addEventList(List<Event> eventL){
        for(Event event: eventL){
            this.events.add(event);
        }
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
