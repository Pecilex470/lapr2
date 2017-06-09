package lapr.project.controller;

import lapr.project.model.register.ApplicationRegister;
import java.util.List;
import lapr.project.model.*;

/*
 * Controller of UC47
 */
/**
 *
 *
 * @author João Oliveira
 */
public class UC47_Controller {

    private EventCenter ec;

    public UC47_Controller(EventCenter ec) {
        this.ec = ec;
    }

    /**
     * Method to get the EventList
     *
     * @param ec - EventCenter
     * @return List
     */
    public List<Event> getEventList(EventCenter ec) {
        return ec.getEventRegister().getEventList();
    }

    /**
     * Method to get a submission global mean rating of the event
     *
     * @param ar - ApplicationRegister
     * @return submission global mean rating (double)
     */
    public double getGlobalMeanRating(ApplicationRegister ar) {
        return ar.getGlobalMeanRating();
    }
}
