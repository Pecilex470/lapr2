package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.User;
import lapr.project.model.register.EventRegister;
import lapr.project.model.register.FAEList;
import lapr.project.model.register.OrganizerList;
import lapr.project.utils.CustomDate;

public class UC1_Controller {
    
    /**
     * the instance of the event center
     */
    private EventCenter ec;
    
    /**
     * Constructor for the UC1_Controller's instance, receiving only the instance of the event center
     * @param ec the instance of the event center
     */
    public UC1_Controller(EventCenter ec) {
        this.ec = ec;
    }
    
}
