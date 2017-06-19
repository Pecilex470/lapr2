package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.User;
import lapr.project.model.register.EventRegister;
import lapr.project.model.register.FAEList;
import lapr.project.model.register.OrganizerList;
import lapr.project.utils.Date;

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

    /**
     * this method validates the data that was entered to create an Event
     * @param title the event's title
     * @param location the event's location
     * @param description the event's short description
     * @param startDate the event's starting date
     * @param endDate the event's ending date
     * @param submissionStartDate the event's date for the start of application submissions
     * @param submissionEndDate the event's date for the end of application submissions
     * @param eventType the type of event
     * @param fl the faeList
     * @param ol the OrganizerList
     * @param availableArea the area available for creating stands
     * @return returns if the data is correct or not
     */
    public boolean validateEventData(String title, String location, String description, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate, String eventType, FAEList fl, OrganizerList ol, int availableArea) {
        return ec.getEventRegister().validateEventData(title, location, description, startDate, endDate, submissionStartDate, submissionEndDate, eventType, fl, ol, availableArea);
    }
    
}
