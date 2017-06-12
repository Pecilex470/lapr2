package lapr.project.model;

import lapr.project.model.register.FAEList;
import lapr.project.model.register.ApplicationList;
import lapr.project.model.register.OrganizerList;
import java.util.Calendar;
import java.util.List;
import lapr.project.model.register.AttributionList;

public class Event {

    private String title;
    private String location;
    private String description;
    private Calendar startDate;
    private Calendar endDate;
    private Calendar submissionStartDate;
    private Calendar submissionEndDate;
    private String eventType;
    private ApplicationList applicationList;
    private FAEList faeList;
    private OrganizerList OrganizerList;
    private AttributionList attributionList;

    
    public Event(){
        
    }
    
    public Event(String title, String location, String description, Calendar startDate, Calendar endDate, Calendar submissionStartDate, Calendar submissionEndDate, String eventType, ApplicationList al, FAEList fl, OrganizerList ol) {
        this.title = title;
        this.location = location;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.submissionStartDate = submissionStartDate;
        this.submissionEndDate = submissionEndDate;
        this.eventType = eventType;
        this.applicationList = al;
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
        return applicationList.getApplication();
    }

     /**
     * This method returns the ApplicationRegister for this event
     * 
     * @return list of applications
     */
    public ApplicationList getApllicationRegister(){
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

    public FAEList getFaeList() {
        return this.faeList;
    }
    
    /**
     * 
     * @param u user associated with FAE
     * @return the FAE associated with user u
     */
    
    public FAE getFAE(User u){
        FAE f = null;
        
        for (FAE fae: faeList.getFAEList()) {
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
    
    public void addAttribution(Attribution a){
        attributionList.addAttribution(a);
    }
    
    
        
        
        
    

}
