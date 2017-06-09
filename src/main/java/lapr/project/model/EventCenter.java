package lapr.project.model;

/**
 *
 * @author Cerqueira
 */
public class EventCenter {

    /**
     * Variavel that saves the data of each event of the respective event
     * center.
     */
    private EventRegister er;

    /**
     * Variavel that saves the data of each user of the respective event center.
     */
    private UserRegister ur;

    /**
     * Variavel that saves the data of each representative of the respective
     * event center.
     */
    private RepresentativeList rl;

    /**
     * Creates an instance of EventCenter that receives the event and users
     * registered in this event center and also receives the representatives
     * listed in this event center.
     *
     * @param er Object of the class EventRegister.
     * @param ur Object of the class UserRegister.
     * @param rl Object of the class RepresentativeList
     *
     */
    public EventCenter(EventRegister er, UserRegister ur, RepresentativeList rl) {
        this.er = er;
        this.ur = ur;
        this.rl = rl;
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
    public RepresentativeList getRepresentativeList() {
        return rl;
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
     * @param rl Variable that saves the object of the class RepresentativeList.
     */
    public void setRepresentativeList(RepresentativeList rl) {
        this.rl = rl;
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

}
