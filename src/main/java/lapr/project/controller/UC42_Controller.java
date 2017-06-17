/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.register.EventRegister;

/**
 *
 * @author Luis
 */
public class UC42_Controller {

    EventCenter ec;

    public UC42_Controller(EventCenter ec) {
        this.ec = ec;
    }

    public List<Event> getEventRegister() {

        return ec.getEventRegister().getEventList();

    }

    public Event getEventByIndex(int index) {

        return ec.getEventRegister().getEventList().get(index);
        
    }

    public double getEventAcceptanceRate(Event e) {

        return e.getAcceptanceRate();
        
    }
}
