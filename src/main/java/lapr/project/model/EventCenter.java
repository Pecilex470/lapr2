package lapr.project.model;

import lapr.project.model.register.EventRegister;

/**
 *
 * @author Cerqueira
 */
public class EventCenter {

    private EventRegister er;

    public EventCenter() {

    }

    public EventRegister getEventRegister() {
        return this.er;
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
