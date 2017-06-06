package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRegister {

    public List<Application> applicationRegister;

    public ApplicationRegister(List<Application> applicationRegister) {
        this.applicationRegister = applicationRegister;
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
