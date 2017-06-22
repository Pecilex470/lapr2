/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;

/**
 *
 * @author Luis
 */
public class UC22_Controller {

    EventCenter ec;

    public UC22_Controller(EventCenter ec) {
        this.ec = ec;
    }

    public List<Event> getEventList() {

        return ec.getEventRegister().getEventList();
    }

    /**
     * 
     * @param e event that the user selected
     * @return a matrix with
     */
    
    
    public String[][] getApplications(Event e) {

        String[][] appList = new String[3][e.getApplicationList().getApplications().size()];
        int count = 0;

        // APPLICATIONS WITHOUT DECISION
        for (Application a : e.getApplicationList().getApplications()) {

            if (a.getDecisionStatus() == 0) {
                appList[0][count] = a.getCompanyName();
                count++;
            }

        }
        count=0;

        // ACCEPTED APPLICATIONS
        for (Application a : e.getApplicationList().getApplications()) {

            if (a.getDecisionStatus() == 1) {
                appList[1][count] = a.getCompanyName();
                count++;
            }

        }
        count=0;

        // REJECTED APPLICATIONS
        for (Application a : e.getApplicationList().getApplications()) {

            if (a.getDecisionStatus() == -1) {
                appList[2][count] = a.getCompanyName();
                count++;
            }

        }

        return appList;
    }
}
