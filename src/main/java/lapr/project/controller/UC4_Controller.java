package lapr.project.controller;

import lapr.project.model.Application;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.User;

public class UC4_Controller {

    EventCenter ec;
    User u;

    public UC4_Controller(EventCenter ec, User u) {
        this.ec = ec;
        this.u = u;

    }


   // public String[] applicationsAssigned() {

      //  for (Event e : ec.getEventsWhereUserIsFAE(u)) {
            
       // }

 //   }

    public static String getApplicationInfo(Application a) {
        return a.toString();
    }
}
