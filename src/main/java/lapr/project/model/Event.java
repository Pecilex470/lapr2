package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import lapr.project.model.register.FAEList;
import lapr.project.model.register.ApplicationList;
import lapr.project.model.register.OrganizerList;
import java.util.List;
import lapr.project.utils.CustomDate;
import org.apache.commons.math3.distribution.NormalDistribution;

public class Event implements Serializable {

    static final long serialVersionUID = 6;
    private String title;
    private String location;
    private String description;
    private CustomDate startDate;
    private CustomDate endDate;
    private CustomDate submissionStartDate;
    private CustomDate submissionEndDate;
    private String eventType;
    private ApplicationList applicationList = new ApplicationList();
    private FAEList faeList = new FAEList();
    private OrganizerList organizerList = new OrganizerList();
    private int availableArea;
    private List<Stand> standList;
    private List<Keyword> keywordList;

    /**
     * Constructor with all the parameters
     *
     * @param title - String
     * @param location - String
     * @param description - String
     * @param startDate - CustomDate
     * @param endDate - CustomDate
     * @param submissionStartDate - CustomDate
     * @param submissionEndDate - CustomDate
     * @param eventType - String
     * @param fl - List
     * @param ol - List
     * @param availableArea - int
     */
    public Event(String title, String location, String description, CustomDate startDate, CustomDate endDate, CustomDate submissionStartDate, CustomDate submissionEndDate, String eventType, FAEList fl, OrganizerList ol, int availableArea) {
        this.title = title;
        this.location = location;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.submissionStartDate = submissionStartDate;
        this.submissionEndDate = submissionEndDate;
        this.eventType = eventType;
        this.faeList = fl;
        this.organizerList = ol;
        this.availableArea = availableArea;
        this.standList = new ArrayList<>();
    }

    /**
     * Empty constructor for an Event
     */
    public Event() {

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
    public CustomDate getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(CustomDate startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public CustomDate getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(CustomDate endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the submissionStartDate
     */
    public CustomDate getSubmissionStartDate() {
        return submissionStartDate;
    }

    /**
     * @param submissionStartDate the submissionStartDate to set
     */
    public void setSubmissionStartDate(CustomDate submissionStartDate) {
        this.submissionStartDate = submissionStartDate;
    }

    /**
     * @return the submissionEndDate
     */
    public CustomDate getSubmissionEndDate() {
        return submissionEndDate;
    }

    /**
     * @param submissionEndDate the submissionEndDate to set
     */
    public void setSubmissionEndDate(CustomDate submissionEndDate) {
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
     * this method adds an application to the event
     *
     * @param a the application to be added
     */
    public void addApplication(Application a) {
        applicationList.addApplication(a);
    }

    /**
     * This method returns the ApplicationRegister for this event
     *
     * @return list of applications
     */
    public ApplicationList getApplicationList() {
        return applicationList;
    }

    /**
     * This method calculates and returns the acceptance rate of an event
     *
     * @return acceptance rate of an event
     */
    public double getAcceptanceRate() {

        int accepted = applicationList.getAcceptedApplicationRegister().size();
        int total = applicationList.getApplications().size();
        if(total<30){
         return -1;   
        }
        
        return (double) (accepted * 100) / (double) total;

    }

    /**
     *
     * @return FAEList
     */
    public FAEList getFaeList() {
        return this.faeList;
    }

    public List<Keyword> getKeywordList() {
        return this.keywordList;
    }

    /**
     *
     * @param u user associated with FAE
     * @return the FAE associated with user u
     */
    public FAE getFAE(User u) {
        FAE f = null;

        for (FAE fae : faeList.getFAEList()) {
            if (fae.getUserFAE().getUsername().equals(u.getUsername())) {
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
            if (f.getUserFAE().getUsername().equals(u.getUsername())) {
                isFAE = true;
            }
        }

        return isFAE;
    }

    /**
     *
     * @param u user that we want to check if it is an Organizer in this event
     * @return true if the user u is an Organizer in this event, false if it's
     * not
     */
    public boolean isOrganizer(User u) {

        boolean isOrganizer = false;

        for (Organizer o : organizerList.getOrganizers()) {

            if (o.getUserOrganizer().getUsername().equals(u.getUsername())) {

                isOrganizer = true;
            }
        }

        return isOrganizer;
    }

    public OrganizerList getOrganizerList() {
        return this.organizerList;
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
     *
     * @param stand - Stand
     */
    public void addStand(Stand stand) {
        standList.add(stand);
    }

    /**
     * Method that returns a list of available stands of event
     *
     * @return List of stands available
     */
    public List<Stand> getAvailableStands() {
        List<Stand> aL = new ArrayList<>();
        for (Stand stand : this.standList) {
            if (stand.getAvailable()) {
                try {
                    aL.add(stand);
                } catch (NullPointerException e) {

                }
            }
        }
        return aL;
    }

    public List<Stand> getStandList() {
        return this.standList;
    }

    public void setStandList(List<Stand> list) {
        this.standList = list;
    }

    /**
     * Method that returns the Z-test that is any statistical test for which the
     * distribution of the test statistic under the null hypothesis can be
     * approximated by a normal distribution.In this case, used a Z-test
     * Unilateral for proportion.
     *
     * @return Z-test
     */
    public double getZUni() {
        double ho = 0.5;
        double acceptanceRate = (getAcceptanceRate() / 100.);
        int total = getApplicationList().getApplications().size();
        return (acceptanceRate - ho) / Math.sqrt((ho * (1 - ho)) / total);
    }

    /**
     * Method that returns the Z-test that is any statistical test for which the
     * distribution of the test statistic under the null hypothesis can be
     * approximated by a normal distribution.In this case, used a Z-test
     * Bilateral to compare two proportions.
     *
     * @param e Second event to get the second proportion.
     * @return Z-test
     */
    public double getZBil(Event e) {
        double acceptanceRate1 = (getAcceptanceRate() / 100.);
        double acceptanceRate2 = (e.getAcceptanceRate() / 100.);
        double ho = acceptanceRate1 - acceptanceRate2;
        int total1 = getApplicationList().getApplications().size();
        int total2 = e.getApplicationList().getApplications().size();
        double z = ho / (Math.sqrt((acceptanceRate1 * (1 - acceptanceRate1)) / total1) + Math.sqrt((acceptanceRate2 * (1 - acceptanceRate2)) / total2));
        return z;
    }

    public double criticalValue(String a) {
        NormalDistribution p = new NormalDistribution();
        double sv = Double.parseDouble(a);
        return p.inverseCumulativeProbability(1 - sv);

    }

    /**
     * Method that returns the decision of the test where we check if the
     * acceptance rate is over 50%.
     *
     * @param a Significance level
     * @return Decision(Yes or No)
     */
    public String testAcceptanceRate50(String a) {
        double zc = criticalValue(a);
        double z = getZUni();
        if (z > zc) {
            return "Yes";
        } else {
            return "No";
        }
    }

    /**
     * Method that returns the decision of the test where we check if the
     * difference between two Events acceptance rate is equal or not
     *
     * @param e Second event to get is Z-test.
     *
     * @return Decision(Yes or No)
     */
    public String testDifferenceTwoEventsAccepRate50(Event e, String a) {
        double zc = criticalValue(a);
        double z = getZBil(e);
        if (z < -zc && z > zc) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public void setFAEList(FAEList faelist) {
        this.faeList = faelist;
    }

    public boolean checkIFUserIsFAE(User u) {
        return Event.this.isFAE(u);
    }

    public boolean checkIFUserIsOrganizer(User u) {
        return Event.this.isOrganizer(u);
    }

    public void addArea(int area) {
        this.availableArea += area;
    }

    /**
     * @param keywordList the keywordList to set
     */
    public void setKeywordList(List<Keyword> keywordList) {
        this.keywordList = keywordList;
    }
    
    public FAE getFAEAtri(int i){
      if(faeList.getFAEList().get(i).getAttributionList().size()!=0){
       return faeList.getFAEList().get(i);
      }
      return null;
    }
    
    
    

}
