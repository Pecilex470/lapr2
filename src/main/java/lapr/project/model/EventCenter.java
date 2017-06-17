package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.register.EncryptionRegister;
import lapr.project.model.register.EventRegister;
import lapr.project.model.register.UserRegister;
import lapr.project.model.register.RepresentativeRegister;

/**
 *
 * @author Cerqueira
 */
public class EventCenter {

    /**
     * Variable that saves the data of each event of the respective event
     * center.
     */
    private EventRegister er;

    /**
     * Variable that saves the data of each user of the respective event center.
     */
    private UserRegister ur;

    /**
     * Variable that saves the data of each representative of the respective
     * event center.
     */
    private RepresentativeRegister rr;

    /**
     * Variable that saves all the data needed from the password encryption
     */
    private EncryptionRegister enr;

    /**
     * Creates an instance of EventCenter that receives the event and users
     * registered in this event center and also receives the representatives
     * listed in this event center.
     *
     * @param er Object of the class EventRegister.
     * @param ur Object of the class UserRegister.
     * @param rr Object of the class RepresentativeList
     * @param enr Object of the class EncryptionRegister
     *
     */
    public EventCenter(EventRegister er, UserRegister ur, RepresentativeRegister rr, EncryptionRegister enr) {
        this.er = er;
        this.ur = ur;
        this.rr = rr;
        this.enr = enr;
    }

    /**
     * Creates an empty instance of EventCenter.
     */
    public EventCenter() {
    }

    /**
     * @return Object of the class EventRegister.
     */
    public EventRegister getEventRegister() {
        return er;
    }

    /**
     * @return Object of the class UserRegister.
     */
    public UserRegister getUserRegister() {
        return ur;
    }

    /**
     * @return Object of the class RepresentativeList.
     */
    public RepresentativeRegister getRepresentativeRegister() {
        return rr;
    }

    public EncryptionRegister getEncryptionRegister() {
        return enr;
    }

    /**
     * Allows to define all the events that are related with the Event Center.
     *
     * @param er Variable that saves the object of the class EventRegister.
     */
    public void setEventRegister(EventRegister er) {
        this.er = er;
    }

    /**
     * Allows to define all the users that are related with the Event Center.
     *
     * @param ur Variable that saves the object of the class UserRegister.
     */
    public void setUserRegister(UserRegister ur) {
        this.ur = ur;
    }

    /**
     * Allows to define all the representatives that are related with the Event
     * Center.
     *
     * @param rr Variable that saves the object of the class RepresentativeList.
     */
    public void setRepresentativeList(RepresentativeRegister rr) {
        this.rr = rr;
    }

    public void setEncryptionRegister(EncryptionRegister enr) {
        this.enr = enr;
    }

    /**
     * It uses the getAcceptanceRate for each event and then calculates the
     * global acceptance rate
     *
     * @return global acceptance rate
     */
    public double getGlobalAcceptanceRate() {

        double globalAcceptanceRate = 0;

        for (Event e : er.getEventList()) {
            globalAcceptanceRate += e.getAcceptanceRate();
        }

        return globalAcceptanceRate / er.getEventList().size();

    }

    /**
     *
     * @param u user that we want to check where plays a roll as a FAE
     * @return list of events where the user u is FAE
     */
    public List<Event> getEventsWhereUserIsFAE(User u) {

        List<Event> eventsWhereUserIsFAE = new ArrayList<>();
        for (Event e : er.getEventList()) {
            if (e.isFAE(u)) {
                eventsWhereUserIsFAE.add(e);
            }
        }
        return eventsWhereUserIsFAE;
    }

    /**
     *
     * @param u user that we want to check if it's a FAE in any event or not
     * @return true if the user u is a FAE in any event, false if he isn't a FAE
     * in any event
     */
    public boolean checkIFUserIsFAE(User u) {

        try {
            er.getEventList();
        } catch (NullPointerException e) {
            return false;
        }

        for (Event e : er.getEventList()) {
            if (e.isFAE(u)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     *
     * @param u user that we want to check if it's a FAE in any event or not
     * @return true if the user u is a FAE in any event, false if he isn't a FAE
     * in any event
     */
    public boolean checkIFUserIsOrganizer(User u) {

        try {
            er.getEventList();
        } catch (NullPointerException e) {
            return false;
        }

        for (Event e : er.getEventList()) {
            if (e.isOrganizer(u)) {
                return true;
            }
        }
        return false;
    }

}
