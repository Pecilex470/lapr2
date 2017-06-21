package lapr.project.controller;

import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.User;

public class UC4_Controller {

    EventCenter ec;
    User u;

    /**
     * This is the constructor for the controller of the UC4
     *
     * @param ec the instance of the event center
     * @param u the user that is using the window
     */
    public UC4_Controller(EventCenter ec, User u) {
        this.ec = ec;
        this.u = u;
    }

    /**
     * This method returns the application's info for it to be reviewed
     *
     * @param a the application to retrieve data from
     *
     * @return returns a formatted string with the information
     */
    public String getApplicationInfo(Application a) {
        return a.toString();
    }
    
    public List<Event> getEventsWhereUserIsFAE() {
        return ec.getEventsWhereUserIsFAE(u);
    }

}
