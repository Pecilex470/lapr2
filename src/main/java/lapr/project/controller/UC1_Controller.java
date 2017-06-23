package lapr.project.controller;

import lapr.project.model.EventCenter;

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
