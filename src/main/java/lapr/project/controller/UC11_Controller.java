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
import lapr.project.model.Keyword;
import lapr.project.model.Stand;
import lapr.project.model.User;

/**
 *
 * @author Luis
 */
public class UC11_Controller {
    
    EventCenter ec;
    
    public UC11_Controller(EventCenter ec) {
        this.ec = ec;
    }
    
    public List<Event> getEventsWhereRepresentativeHasApplications(User u) {
        
        List<Event> eventsWhereRepresentativeHasApplications = null;
        
        for (Event e : ec.getEventRegister().getEventList()) {
            
            for (Application a : e.getApplicationList()) {
                if (a.getRepresentative().getUsername().equals(u.getUsername())) {
                    eventsWhereRepresentativeHasApplications.add(e);
                    break;
                }
            }
            
        }
        
        return eventsWhereRepresentativeHasApplications;
        
    }
    
    public List<Application> getApplicationListFromThisUser(User u, List<Event> eventsWhereRepresentativeHasApplications) {
        
        List<Application> applicationList = null;
        
        for (Event e : eventsWhereRepresentativeHasApplications) {
            for (Application a : e.getApplicationList()) {
                if (a.getRepresentative().getUsername().equals(u.getUsername())) {
                    applicationList.add(a);
                }
            }
        }
        
        return applicationList;
    }
    
    public void removeApplication(Event e, Application a) {
        
        e.getApplicationList().remove(a);
        
    }
    
    public void changeApplication(Application a, String description, List<Keyword> keywordList, String companyName, Stand stand, User representative){
        a.setCompanyName(companyName);
        a.setDescription(description);
        a.setKeywordList(keywordList);
        a.setRepresentative(representative);
        a.setStand(stand);
    }
    
}
