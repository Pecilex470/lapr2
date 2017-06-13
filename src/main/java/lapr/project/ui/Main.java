package lapr.project.ui;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.*;
import lapr.project.model.register.*;

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
        InitialWindow initialWindow = new InitialWindow(ec);

    }
    
    /**
     * method that creates all the lists that the EventCenter holds, and the instance of the EventCenter with those lists
     */
    public static EventCenter createInitialComponents() {
        
        List<Event> er = new ArrayList();
        List<User> ur = new ArrayList();
        List<Representative> rr = new ArrayList();
        
        EventRegister eventRegister = new EventRegister(er);
        UserRegister userRegister = new UserRegister(ur);
        RepresentativeRegister representativeRegister = new RepresentativeRegister(rr);
        
        return new EventCenter(eventRegister, userRegister, representativeRegister);
    }

}
