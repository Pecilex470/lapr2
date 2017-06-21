/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import lapr.project.model.Application;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.Keyword;
import lapr.project.model.Stand;
import lapr.project.model.User;
import lapr.project.ui.RepresentativeActions;

/**
 *
 * @author Luis
 */
public class UC11_Controller {

    EventCenter ec;
    User u;

    public UC11_Controller(EventCenter ec, User u) {
        this.ec = ec;
        this.u = u;
    }

    public List<Event> getEventsWhereRepresentativeHasApplications(User u) {
        this.u = u;
        List<Event> eventsWhereRepresentativeHasApplications = new ArrayList<>();

        for (Event e : ec.getEventRegister().getEventList()) {

            try {

                for (Application a : e.getApplicationList().getApplications()) {

                    if (a.getRepresentative().getUsername().equals(u.getUsername())) {

                        eventsWhereRepresentativeHasApplications.add(e);

                        break;
                    }
                }
            } catch (NullPointerException ex) {

            }

        }

        return eventsWhereRepresentativeHasApplications;
    }

    public List<Application> getApplicationsFromThisUserInThisEvent(User u, Event e) {

        List<Application> applicationList = new ArrayList<>();

        for (Application a : e.getApplicationList().getApplications()) {
            if (a.getRepresentative().getUsername().equals(u.getUsername())) {
                applicationList.add(a);
            }
        }

        return applicationList;
    }

    public void removeApplication(Event e, Application a) {

        e.getApplicationList().getApplications().remove(a);

    }

    public void changeApplication(Application a, String description, List<Keyword> keywordList, String companyName, User representative, int boothArea, int nInvites) {
        a.setCompanyName(companyName);
        a.setDescription(description);
        a.setKeywordList(keywordList);
        a.setRepresentative(representative);
        a.setBoothArea(boothArea);
        a.setInvitesQuantity(nInvites);
    }

}
