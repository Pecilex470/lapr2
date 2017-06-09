package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

public class OrganizerList {

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

    /**
     * @return  List that contains all the FAE from a specific event.
     */
    public List<Organizer> getOrganizadores() {
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

