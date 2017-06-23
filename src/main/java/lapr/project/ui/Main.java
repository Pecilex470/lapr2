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

   
    private static final String ADMIN1 = "admin";
    private static final String KEYWORD = "zebras";

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        EventCenter ec = new EventCenter();
        if (new File("LoadData.bin").exists()) {
            try {
                ec = ExportData.deserialization();
            } catch (Exception e) {
                e.printStackTrace(new PrintStream(new File("log.txt")));
            }
        } else {
            ec = createInitialComponents();
            createEventManager(ec);
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
  
    }



}
