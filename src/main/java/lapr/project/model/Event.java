package lapr.project.model;

import java.util.Calendar;
import java.util.List;

public class Event {

    private String title;
    private String location;
    private String description;
    private Calendar startDate;
    private Calendar endDate;
    private Calendar submissionStartDate;
    private Calendar submissionEndDate;
    private String eventType;
    private ListApplication applicationRegister;
    private FAEList faeList;
    private OrganizerList OrganizerList;

    public Event(String title, String location, String description, Calendar startDate, Calendar endDate, Calendar submissionStartDate, Calendar submissionEndDate, String eventType, ListApplication al, FAEList fl, OrganizerList ol) {
        this.title = title;
        this.location = location;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.submissionStartDate = submissionStartDate;
        this.submissionEndDate = submissionEndDate;
        this.eventType = eventType;
        this.applicationRegister = al; 
        this.faeList = fl;
        this.OrganizerList = ol; 
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the startDate
     */
    public Calendar getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Calendar getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the submissionStartDate
     */
    public Calendar getSubmissionStartDate() {
        return submissionStartDate;
    }

    /**
     * @param submissionStartDate the submissionStartDate to set
     */
    public void setSubmissionStartDate(Calendar submissionStartDate) {
        this.submissionStartDate = submissionStartDate;
    }

    /**
     * @return the submissionEndDate
     */
    public Calendar getSubmissionEndDate() {
        return submissionEndDate;
    }

    /**
     * @param submissionEndDate the submissionEndDate to set
     */
    public void setSubmissionEndDate(Calendar submissionEndDate) {
        this.submissionEndDate = submissionEndDate;
    }

    /**
     * @return the eventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType the eventType to set
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * This method returns the list of applications for this event
     * 
     * @return list of applications
     */
    public List<Application> getApplicationList() {
        return applicationRegister.getApplication();
    }

    /**
     * This method calculates and returns the acceptance rate of an event
     *
     * @return acceptance rate of an event
     */

    public double getAcceptanceRate() {

        int accepted = applicationRegister.getAcceptedApplicationRegister().size();
        int total = applicationRegister.getApplication().size();

        double acceptanceRate = (accepted * 100) / total;

        return acceptanceRate;

    }
    
    public FAEList getFaeList(){
        return this.faeList;
    }


}
