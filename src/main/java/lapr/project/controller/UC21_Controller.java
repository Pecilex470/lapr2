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
import lapr.project.model.Stand;

/**
 *
 * @author Cerqueira
 */
public class UC21_Controller {

    EventCenter ec;

    public UC21_Controller(EventCenter ec) {
        this.ec = ec;
    }

    /**
     * Method that return EventList of Event Center
     *
     * @return list of events
     */
    public List<Event> getEventList() {
        return ec.getEventRegister().getEventList();
    }

    /**
     * Method that return the available stands of event
     *
     * @param e - Event
     * @return available area (int)
     */
    public List<Stand> getAvailableStand(Event e) {
        return e.getAvailableStands();
    }

    /**
     * Method that returns the Application List of an event
     *
     * @param e - Event
     * @return List of applications
     */
    public List<Application> getApplicationList(Event e) {
        return e.getApllicationRegister().getApplication();
    }

    /**
     * Method that add a stand in application
     *
     * @param e - Event
     * @param stand - typeStand
     * @param app - Application
     */
    public void addStand(Event e, Stand stand, Application app) {
    //    app.addStand(stand);
    }

}
