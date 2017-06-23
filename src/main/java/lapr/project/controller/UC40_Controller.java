/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.Event;


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
   * @param ec Events Center to be considered
   */
   public UC40_Controller(EventCenter ec){
        this.ec=ec;
    }

   public Object[][] keywordFrequency(){
       
       
       return ec.keywordFrequency();
   }
    
}
