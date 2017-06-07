package lapr.project.model.register;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.Event;

public class ApplicationRegister {

    private List<Application> applicationRegister;

    public ApplicationRegister() {
        this.applicationRegister = new ArrayList();
    }

    public ApplicationRegister(ArrayList<Application> arrayList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Application> getApplicationList() {
        return new ArrayList<>(this.applicationRegister);
    }

    public double getGlobalMeanRating() {
        double total = 0;
        if (!applicationRegister.isEmpty()) {
            for (Application a : applicationRegister) {
                total += a.getSubmissionRating();
            }
            return total / applicationRegister.size();
        }
        return -1;
    }

    /**
     * Method Incomplet - Values only for tests
     *
     * @param e - Event
     * @return Mean deviation
     */
    public double getMeanDeviation(Event e) {
        return 23;
    }
}