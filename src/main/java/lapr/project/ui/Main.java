package lapr.project.ui;

import java.util.ArrayList;
import java.util.List;
import lapr.project.controller.UC6_Controller;
import lapr.project.model.*;
import lapr.project.model.register.*;
import lapr.project.utils.Date;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
public class Main {

    /**
     * Private constructor to hide implicit public one.
     */
    private Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EventCenter ec = createInitialComponents();
        createEventManager(ec);
        new InitialWindow_UI(ec);

    }

    /**
     * method that creates all the lists that the EventCenter holds, and the
     * instance of the EventCenter with those lists
     */
    public static EventCenter createInitialComponents() {

        List<Event> er = new ArrayList<>();
        List<User> ur = new ArrayList<>();
        List<Representative> rr = new ArrayList<>();
        List<Encryption> enr = new ArrayList<>();

        EventRegister eventRegister = new EventRegister(er);

        
        ////////// EVENT 1 //////////////////////////////////////////
        List<FAE> FAEListEvent1 = new ArrayList<>();
        List<Organizer> organizerListEvent1 = new ArrayList<>();
        eventRegister.getEventList().add(new Event("Bolo do Caco Festival", "Madeira", "A nice bolo do caco event", new Date(13, 11, 2017), new Date(14, 11, 2017), new Date(1, 11, 2017), new Date(12, 11, 2017), "congress", new FAEList(FAEListEvent1), new OrganizerList(organizerListEvent1), 300));
        /////////////////////////////////////////////////////////////
        
        ///////// EVENT 2 //////////////////////////////////////////
        List<FAE> FAEListEvent2 = new ArrayList<>();
        List<Organizer> organizerListEvent2 = new ArrayList<>();
        eventRegister.getEventList().add(new Event("Guns and Roses Festival", "Porto", "a musical gathering", new Date(13, 11, 2017), new Date(14, 11, 2017), new Date(1, 11, 2017), new Date(12, 11, 2017), "exibition", new FAEList(FAEListEvent2), new OrganizerList(organizerListEvent2), 150));
        /////////////////////////////////////////////////////////////
        
        
        UserRegister userRegister = new UserRegister(ur);
        RepresentativeRegister representativeRegister = new RepresentativeRegister(rr);
        EncryptionRegister encryptionRegister = new EncryptionRegister(enr);

        return new EventCenter(eventRegister, userRegister, representativeRegister, encryptionRegister);
    }

    public static void createEventManager(EventCenter ec) {
        UC6_Controller c = new UC6_Controller(ec);
        c.registerUser(c.twoLayerEncription("Pedro Miller Brandão Pinho", 6, "zebras", Encryption.ABC), c.twoLayerEncription("pedro.miller.pinho@gmail.com", 6, "zebras", Encryption.ABC), "admin", c.encryptPassword("Pm-10", 6, Encryption.ABC), true, true);
        c.addEncryption(6, "admin", "zebras");
    }

}
