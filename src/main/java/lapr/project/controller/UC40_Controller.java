/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.Event;
import java.util.List;

/**
 *
 * @author Utilizador
 */
public class UC40_Controller {
   private EventCenter ec;
  
   private Event event;
   
   
   /**
    *   
   * Creates an instance of UC40_Controller receiving Events Center to be considered for the management and organization of
   * your events through the current application.
   *
   * @param ce Events Center to be considered
   */
   public UC40_Controller(EventCenter ec){
        this.ec=ec;
    }
    /**
     * Method that allows to keep the event chosen by the organizer.
     * @return  Lista of all the events.
     */
    public List<Event> getEvents(){
     return ec.getEventRegister().getEventList();
    }
    
    /**
     * Method that allows to save the event choosed by the organizer that is using the aplication in the moment.
     * 
     * @param eve Event choosed by the organizer.
     */
    public void setEvent(Event eve){
      this.event=eve; 
    }
    
    
}
