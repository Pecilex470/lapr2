package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRegister {

    public List<Application> applicationRegister;

    public ApplicationRegister(ArrayList<Application> applicationRegister) {
        this.applicationRegister = new ArrayList(applicationRegister);
    }

    public ApplicationRegister() {
        applicationRegister = new ArrayList();
    }

    public ArrayList<Application> getApplicationList() {
        return new ArrayList<>(this.applicationRegister);
    }

    public double getGlobalMeanRating() {
        double total = 0;
        for (Application a : applicationRegister) {
            total += a.getSubmissionRating();
        }
        return total / applicationRegister.size();
    }
    
    /**
     * Method Incomplet - Values only for tests
     * @param e - Event
     * @return Mean deviation
     */
    public double getMeanDeviation(Event e){
        return 23;
    }
}
