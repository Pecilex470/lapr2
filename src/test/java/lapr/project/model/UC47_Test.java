/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;
import lapr.project.controller.UC47_Controller;
import lapr.project.model.register.ApplicationRegister;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Cerqueira
 */
public class UC47_Test {
    
    
    @Test
    public void ensureGetEventListWorking() throws Exception {
        EventCenter ec= new EventCenter();
        List<Event> eventList_Expected=null;
        UC47_Controller uc= new UC47_Controller(ec);
        //adicionar uma lista igual igual ao centro de eventos
        assertEquals(eventList_Expected, uc.getEventList(ec));
    }
    
    public void ensureGetGlobalMeanRating() throws Exception {
        int eventIndex;
        EventCenter ec= new EventCenter();
        double globalMeanRatingExpected= 4.00;
        UC47_Controller uc= new UC47_Controller(ec);
        ApplicationRegister ar= ec.getEventRegister().getEventList().get(0).getApllicationRegister();
        assertEquals(globalMeanRatingExpected, uc.getGlobalMeanRating(ar));
    }
    
}
