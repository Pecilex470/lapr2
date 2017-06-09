package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cerqueira
 */
public class UC50_Controller {

    EventCenter ec;
    FAEList faeL;
    
    public UC50_Controller(EventCenter ec) {
        this.ec = ec;
    }

    public List<Event> getEvenList() {
        return ec.getEventRegister().getEventList();
    }

    public List<FAE> getFAEList(Event e) {
        faeL= e.getFaeList();
        return faeL.getFAEList();
    }

    public boolean testDifference2Fae(FAE fae1, FAE fae2) {
        return faeL.testDifference2Fae(fae1, fae2);
    }

}
