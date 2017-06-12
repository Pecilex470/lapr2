package lapr.project.model;

import lapr.project.model.register.FAEList;
import lapr.project.model.register.ApplicationList;
import lapr.project.model.register.OrganizerList;
import java.util.List;
import lapr.project.model.register.AttributionList;
import lapr.project.utils.Date;

public class Event {

    private String title;
    private String location;
    private String description;
    private Date startDate;
    private Date endDate;
    private Date submissionStartDate;
    private Date submissionEndDate;
    private String eventType;
    private ApplicationList applicationList;
    private FAEList faeList;
    private OrganizerList OrganizerList;
    private AttributionList attributionList;
    private int availableArea;
    private List<Stand> standL;

    public Event() {

    }

    /**
     * Constructor
     * @param title - String
     * @param location - String
     * @param description - String
     * @param startDate - Date
     * @param endDate - Date
     * @param submissionStartDate - Date
     * @param submissionEndDate - Date
     * @param eventType - String
     * @param fl - List
     * @param ol - List
     * @param availableArea - int
     */
    public Event(String title, String location, String description, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate, String eventType, FAEList fl, OrganizerList ol, int availableArea) {
        this.title = title;
        this.location = location;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.submissionStartDate = submissionStartDate;
        this.submissionEndDate = submissionEndDate;
        this.eventType = eventType;
        this.faeList = fl;
        this.OrganizerList = ol;
        this.availableArea = availableArea;
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
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the submissionStartDate
     */
    public Date getSubmissionStartDate() {
        return submissionStartDate;
    }

    /**
     * @param submissionStartDate the submissionStartDate to set
     */
    public void setSubmissionStartDate(Date submissionStartDate) {
        this.submissionStartDate = submissionStartDate;
    }

    /**
     * @return the submissionEndDate
     */
    public Date getSubmissionEndDate() {
        return submissionEndDate;
    }

    /**
     * @param submissionEndDate the submissionEndDate to set
     */
    public void setSubmissionEndDate(Date submissionEndDate) {
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
        return applicationList.getApplication();
    }

    /**
     * This method returns the ApplicationRegister for this event
     *
     * @return list of applications
     */
    public ApplicationList getApllicationRegister() {
        return applicationList;
    }

    /**
     * This method calculates and returns the acceptance rate of an event
     *
     * @return acceptance rate of an event
     */
    public double getAcceptanceRate() {

        int accepted = applicationList.getAcceptedApplicationRegister().size();
        int total = applicationList.getApplication().size();

        double acceptanceRate = (accepted * 100) / total;

        return acceptanceRate;

    }

    /**
     * 
     * @return FAEList
     */
    public FAEList getFaeList() {
        return this.faeList;
    }

    /**
     *
     * @param u user associated with FAE
     * @return the FAE associated with user u
     */
    public FAE getFAE(User u) {
        FAE f = null;

        for (FAE fae : faeList.getFAEList()) {
            if (fae.getUtilizadorFAE().getUsername().equals(u.getUsername())) {
                f = fae;
            }
        }

        return f;
    }

    /**
     *
     * @param u user that we want to check if it is FAE in this event
     * @return true if the user u is FAE in this event, false if it's not
     */
    public boolean isFAE(User u) {

        boolean isFAE = false;
        for (FAE f : faeList.getFAEList()) {
            if (f.getUtilizadorFAE().getUsername().equals(u.getUsername())) {
                isFAE = true;
            }
        }

        return isFAE;
    }

    /**
     * Method that adds an attibuition
     * @param a - Attribution
     */
    public void addAttribution(Attribution a) {
        attributionList.addAttribution(a);
    }

    /**
     * 
     * @return availableArea
     */
    public int getAvailableArea() {
        return this.availableArea;
    }

    /**
     * 
     * @param area - available area
     */
    public void setAvailableArea(int area) {
        this.availableArea = area;
    }

    /**
     * Method that adds a stand to event
     * @param stand - Stand
     */
    public void addStand(Stand stand) {
        standL.add(stand);
    }

}
