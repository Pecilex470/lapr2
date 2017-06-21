package lapr.project.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Organizer;

public class OrganizerList implements Serializable{
    
     static final long serialVersionUID = 20;

    /**
     * List that contains all the FAE from a specific event.
     */
    private List<Organizer> organizers = new ArrayList<>();

    /**
     * Creates a OrganizerList instance,, by receiving a list with all organizers belonging to an event
     *
     * @param organizers  List that contains all the FAE from the event in question
     */
    public OrganizerList(List<Organizer> organizers) {
        this.organizers = organizers;
    }
    
    public OrganizerList(){
        this.organizers = new ArrayList<>();
    }
    
    /**
     * @return  List that contains all the FAE from a specific event.
     */
    public List<Organizer> getOrganizers() {
        return organizers;
    }
    

    /**
     * Allows to define a list that contains all the organizers belonging to an certain event
     *
     * @param organizers  List that contains all the FAE from a specific event.
     */
    public void setOrganizers(List<Organizer> organizers) {
        this.organizers = organizers;
    }

}

