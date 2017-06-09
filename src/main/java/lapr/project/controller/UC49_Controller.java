/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;
import lapr.project.model.register.FAEList;

/**
 *
 * @author Cerqueira
 */
public class UC49_Controller {
    EventCenter ec;
    FAEList faeL;
    
    public UC49_Controller(EventCenter ec){
        this.ec=ec;
    }
    
    public List<Event> getEvenList() {
        return ec.getEventRegister().getEventList();
    }
    
    public List<FAE> getFAEList(Event e) {
        faeL= e.getFaeList();
        return faeL.getFAEList();
    }
    
//    public boolean testDifference2Fae(FAE fae) {
//        return faeL.testDifference(fae);
//    }
    
}
