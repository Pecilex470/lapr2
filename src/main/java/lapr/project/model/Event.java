package lapr.project.model;

import java.util.Date;
import java.util.List;

public class Event {

    private String title;
    private String location;
    private String description;
    private Date startDate;
    private Date endDate;
    private Date submissionStartDate;
    private Date submissionEndDate;
    private String eventType;
    private List<Application> applicationRegister;
    private List<FAE> faeRegister;
    private List<Organizer> OrganizerRegister;
    
    public Event(String title, String location, String description, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate, String eventType, ApplicationRegister applicationRegister, FAERegister faeRegister, OrganizerRegister organizerRegister) {
        this.title = title;
        this.location = location;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.submissionStartDate = submissionStartDate;
        this.submissionEndDate = submissionEndDate;
        this.eventType = eventType;
        this.applicationRegister = new ApplicationRegister();
        this.faeRegister = new FAERegister();
        this.OrganizerRegister = new OrganizerRegister();
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
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the submissionStartDate
     */
    public String getSubmissionStartDate() {
        return submissionStartDate;
    }

    /**
     * @param submissionStartDate the submissionStartDate to set
     */
    public void setSubmissionStartDate(String submissionStartDate) {
        this.submissionStartDate = submissionStartDate;
    }

    /**
     * @return the submissionEndDate
     */
    public String getSubmissionEndDate() {
        return submissionEndDate;
    }

    /**
     * @param submissionEndDate the submissionEndDate to set
     */
    public void setSubmissionEndDate(String submissionEndDate) {
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
     * @return the listaCandidaturas
     */
    public ApplicationRegister getListaCandidaturas() {
        return listaCandidaturas;
    }

    /**
     * @param listaCandidaturas the listaCandidaturas to set
     */
    public void setListaCandidaturas(ApplicationRegister listaCandidaturas) {
        this.listaCandidaturas = listaCandidaturas;
    }

    /**
     * @return the listaFAE
     */
    public FAERegister getListaFAE() {
        return listaFAE;
    }

    /**
     * @param listaFAE the listaFAE to set
     */
    public void setListaFAE(FAERegister listaFAE) {
        this.listaFAE = listaFAE;
    }

    /**
     * @return the listaOrganizadores
     */
    public OrganizerRegister getListaOrganizadores() {
        return listaOrganizadores;
    }

    /**
     * @param listaOrganizadores the listaOrganizadores to set
     */
    public void setListaOrganizadores(OrganizerRegister listaOrganizadores) {
        this.listaOrganizadores = listaOrganizadores;
    }
    
    
}
