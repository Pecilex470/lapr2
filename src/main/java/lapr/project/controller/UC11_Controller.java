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

                for (Application a : e.getApplicationList()) {

                    System.out.println("antes do if " + a.getRepresentative().getUsername());
                    System.out.println("antes do if " + u.getUsername());

                    if (a.getRepresentative().getUsername().equals(u.getUsername())) {

                        System.out.println("depois do if " + a.getRepresentative().getUsername());
                        System.out.println("depois do if " + u.getUsername());
                        eventsWhereRepresentativeHasApplications.add(e);

                        System.out.println("UC11111");
                        System.out.println("UC11111");
                        break;
                    }
                }
            } catch (NullPointerException ex) {

            }

        }

        return eventsWhereRepresentativeHasApplications;
    }

    public List<Application> getApplicationsFromThisUserInThisEvent(User u, Event e) {

        List<Application> applicationList = null;

        for (Application a : e.getApplicationList()) {
            if (a.getRepresentative().getUsername().equals(u.getUsername())) {
                applicationList.add(a);
            }
        }

        return applicationList;
    }

    public void removeApplication(Event e, Application a) {

        e.getApplicationList().remove(a);

    }

    public void changeApplication(Application a, String description, List<Keyword> keywordList, String companyName, Stand stand, User representative) {
        a.setCompanyName(companyName);
        a.setDescription(description);
        a.setKeywordList(keywordList);
        a.setRepresentative(representative);
        a.setStand(stand);
    }

}
