/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;
import lapr.project.controller.UC47_Controller;
import lapr.project.model.register.ApplicationList;
import lapr.project.model.register.EventRegister;
import lapr.project.model.register.FAEList;
import lapr.project.model.register.OrganizerList;
import lapr.project.utils.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Cerqueira
 */
public class UC47_Test {

    EventCenter ec = new EventCenter();
    List<Event> eventList_Expected = null;
    ApplicationList al = new ApplicationList();
    FAEList faeL = new FAEList();
    OrganizerList orgL = new OrganizerList();
    List<Keyword> keyL;
    EventRegister er;

    /**
     *
     * @throws Exception
     */
    @Test
    public void ensureGetEventListWorking() throws Exception {

        keyL.add(new Keyword("keyword1"));
        keyL.add(new Keyword("keyword2"));
        keyL.add(new Keyword("keyword3"));

        List<Organizer> orgList = null;
        orgList.add(new Organizer(new User("Luis", "luis@hotmail.com", "luizinho", "luis123")));
        orgList.add(new Organizer(new User("Couto", "couto@hotmail.com", "coutinho", "couto123")));
        orgList.add(new Organizer(new User("Pedro", "pedro@hotmail.com", "pedrinho", "pedro123")));
        this.orgL.setOrganizers(orgList);

        List<FAE> faeList = null;
        faeList.add(new FAE(new User("Luis", "luis@hotmail.com", "luizinho", "luis123")));
        faeList.add(new FAE(new User("Couto", "couto@hotmail.com", "coutinho", "couto123")));
        faeList.add(new FAE(new User("Pedro", "pedro@hotmail.com", "pedrinho", "pedro123")));
        this.faeL.setFAE(faeList);

        List<Application> appL = null;
        appL.add(new Application("Test1", keyL));
        appL.add(new Application("Test2", keyL));
        appL.add(new Application("Test3", keyL));
        this.al.setApplication(appL);

        eventList_Expected.add(new Event("Event1", "location1", "bla bla bla", new Date(2017, 8, 10), new Date(2017, 11, 10), new Date(2017, 9, 10), new Date(2017, 10, 10), "Exposição", faeL, orgL));
        eventList_Expected.add(new Event("Event2", "location1", "bla bla bla", new Date(2016, 8, 10), new Date(2016, 11, 10), new Date(2016, 9, 10), new Date(2016, 10, 10), "Exposição", faeL, orgL));

        er.setEventList(eventList_Expected);
        ec.setEventRegister(er);

        UC47_Controller uc = new UC47_Controller(ec);
        assertEquals(eventList_Expected, uc.getEventList(ec));
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void ensureGetGlobalMeanRating() throws Exception {
        int eventIndex = 0;
        EventCenter ec = new EventCenter();
        double globalMeanRatingExpected = 4.00;
        UC47_Controller uc = new UC47_Controller(ec);
        ApplicationList al = ec.getEventRegister().getEventList().get(eventIndex).getApllicationRegister();
        assertEquals(globalMeanRatingExpected, uc.getGlobalMeanRating(al));
    }

}
