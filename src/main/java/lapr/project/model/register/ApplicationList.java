/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Application;

/**
 *
 * @author Utilizador
 */
public class ApplicationList implements Serializable{
    
     static final long serialVersionUID = 14;

    /**
     * List that contains all the applications that were submitted to a specific event.
     */
    private List<Application> applications = new ArrayList<>();

    /**
     * Creates a ApplicationList instance, by receiving a list with all applications submitted to an event
     *
     * @param applications List that contains all the applications that were submitted to a specific event.
     */
    public ApplicationList(List<Application> applications) {
        this.applications = applications;
    }
    
    public ApplicationList(){
        
    }

    /**
     * @return List that contains all the applications that were submitted to a specific event.
     * evento
     */
    public List<Application> getApplication() {
        return applications;
    }

    
    public void addApplication(Application a){
        applications.add(a);
    }
    
    /**
     * Allows to define a list that contains all the applications. 
     *
     * @param applications List that contains all the applications that were submitted to a specific event.
     */
    public void setApplication(List<Application> applications) {
        this.applications = applications;
    }
    
    /**
     *
     * This method calculates and returns the global mean rating using
     *
     * @return accepted applications list
     */
    public double getGlobalMeanRating() {
        double total = 0;
        if (!applications.isEmpty()) {
            for (Application a : applications) {
                total += a.getSubmissionMeanRating();
            }
            return total / applications.size();
        }
        return -1;
    }

    /**
     *
     * This method calculates and returns the accepted applications list using
     * the getDecision method for each application.
     *
     * @return accepted applications list
     */
    public List<Application> getAcceptedApplicationRegister() {

        List<Application> acceptedApplicationRegister = new ArrayList<>();

        for (Application a : applications) {
            if (a.getDecision() == 1) {
                acceptedApplicationRegister.add(a);
            }
        }

        return acceptedApplicationRegister;
    }

}
