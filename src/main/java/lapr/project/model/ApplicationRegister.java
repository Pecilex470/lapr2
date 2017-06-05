package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Application;

public class ApplicationRegister {

    public List<Application> applicationRegister;

    public ApplicationRegister(ArrayList<Application> applicationRegister) {
        this.applicationRegister = new ArrayList(applicationRegister);
    }

    public ApplicationRegister() {
        applicationRegister = new ArrayList();
    }

    public List<Application> getApplicationList() {
        return new ArrayList<>(this.applicationRegister);
    }

    public double getGlobalMeanRating() {
        double total = 0;
        for (Application a : applicationRegister) {
            if (a.getDecision() == 0) {
                total += a.getSubmissionRating();
            }
        }
        return total / applicationRegister.size();
    }
}
