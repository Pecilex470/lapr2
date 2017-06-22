package lapr.project.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import lapr.project.controller.UC6_Controller;
import lapr.project.model.*;
import lapr.project.model.register.*;
import lapr.project.utils.CustomDate;
import lapr.project.utils.ExportData;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
public class Main {

    /**
     * Private constructor to hide implicit public one.
     */
    private Main() {

    }

    private static final String EVENT1 = "Bolo do Caco Festival";
    private static final String EVENT2 = "Guns and Roses Festival";
    private static final String ADMIN1 = "admin";
    private static final String ADMIN2 = "sicked";
    private static final String KEYWORD = "zebras";

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        EventCenter ec = new EventCenter();
        if (new File("test.bin").exists()) {
            try {
                ec = ExportData.deserialization();
            } catch (Exception e) {
                e.printStackTrace(new PrintStream(new File("log.txt")));
            }
        } else {
            ec = createInitialComponents();
            createEventManager(ec);
            addOrganizers(ec);
        }
        new InitialWindow_UI(ec);
       
    }

    /**
     * method that creates all the lists that the EventCenter holds, and the
     * instance of the EventCenter with those lists
     *
     * @return returns the event center instance
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
        eventRegister.getEventList().add(new Event(EVENT1, "Madeira", "A nice bolo do caco event", new CustomDate(13, 11, 2017), new CustomDate(14, 11, 2017), new CustomDate(20, 6, 2017), new CustomDate(8, 10, 2017), "congress", new FAEList(FAEListEvent1), new OrganizerList(organizerListEvent1), 300));
//        List<Keyword> lK1 = new ArrayList<>();
//        lK1.add(new Keyword("abc"));
//        lK1.add(new Keyword("abc"));
//        lK1.add(new Keyword("abc"));
//        lK1.add(new Keyword("ze"));
//        lK1.add(new Keyword("ze"));
//        eventRegister.getEventList().get(0).setKeywordList(lK1);
        
        
        /////////////////////////////////////////////////////////////
        ///////// EVENT 2 //////////////////////////////////////////
        List<FAE> FAEListEvent2 = new ArrayList<>();
        List<Organizer> organizerListEvent2 = new ArrayList<>();
        eventRegister.getEventList().add(new Event(EVENT2, "Porto", "a musical gathering", new CustomDate(13, 11, 2017), new CustomDate(14, 11, 2017), new CustomDate(20, 6, 2017), new CustomDate(25, 7, 2017), "exibition", new FAEList(FAEListEvent2), new OrganizerList(organizerListEvent2), 150));
//        List<Keyword> lK2 = new ArrayList<>();
//        lK2.add(new Keyword("abc"));
//        lK2.add(new Keyword("abc"));
//        lK2.add(new Keyword("abc"));
//        lK2.add(new Keyword("ze"));
//        lK2.add(new Keyword("boas"));
//        eventRegister.getEventList().get(1).setKeywordList(lK2);

        
/////////////////////////////////////////////////////////////

        UserRegister userRegister = new UserRegister(ur);
        RepresentativeRegister representativeRegister = new RepresentativeRegister(rr);
        EncryptionRegister encryptionRegister = new EncryptionRegister(enr);

        return new EventCenter(eventRegister, userRegister, representativeRegister, encryptionRegister);
    }

    public static void createEventManager(EventCenter ec) {
        UC6_Controller c = new UC6_Controller(ec);
        c.registerUser(c.twoLayerEncription("Pedro Miller Brandão Pinho", 6, KEYWORD, Encryption.ABC), c.twoLayerEncription("pedro.miller.pinho@gmail.com", 6, KEYWORD, Encryption.ABC), ADMIN1, c.encryptPassword("Pm-10", 6, Encryption.ABC), true, true);
        c.addEncryption(6, ADMIN1, KEYWORD);
        c.registerUser(c.twoLayerEncription("Luís Azevedo", 6, KEYWORD, Encryption.ABC), c.twoLayerEncription("luis@gmail.com", 6, KEYWORD, Encryption.ABC), ADMIN2, c.encryptPassword("Pm-10", 6, Encryption.ABC), true, true);
        c.addEncryption(6, ADMIN2, KEYWORD);
    }

    public static void addOrganizers(EventCenter ec) {
        ec.getEventRegister().getEventByTitle(EVENT1).getOrganizerList().getOrganizers().add(new Organizer(ec.getUserRegister().getUserByUsername(ADMIN1)));
        ec.getEventRegister().getEventByTitle(EVENT1).getOrganizerList().getOrganizers().add(new Organizer(ec.getUserRegister().getUserByUsername(ADMIN2)));

        ec.getEventRegister().getEventByTitle(EVENT2).getOrganizerList().getOrganizers().add(new Organizer(ec.getUserRegister().getUserByUsername(ADMIN1)));
        ec.getEventRegister().getEventByTitle(EVENT2).getOrganizerList().getOrganizers().add(new Organizer(ec.getUserRegister().getUserByUsername(ADMIN2)));

    }

}
