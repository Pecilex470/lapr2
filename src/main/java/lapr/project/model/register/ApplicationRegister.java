package lapr.project.model.register;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.Attribution;
import lapr.project.model.Event;
import lapr.project.model.FAE;

public class ApplicationRegister {

    private List<Application> applicationRegister;

    public ApplicationRegister() {
    }

    public ArrayList<Application> getApplicationList() {
        return new ArrayList<>(this.applicationRegister);
    }

    public double getGlobalMeanRating() {
        double total = 0;
        if (!applicationRegister.isEmpty()) {
            for (Application a : applicationRegister) {
                total += a.getSubmissionMeanRating();
            }
            return total / applicationRegister.size();
        }
        return -1;
    }

    /**
     * Method that compute the mean deviation between FAEs’ average ratings for each submission and
     * global mean rating
     * @param e - Event
     * @param app - Application
     * @return Mean deviation
     */
    public double getMeanDeviation(Event e, Application app) {
        double total = 0;
        int cont = 0;
        double global = this.getGlobalMeanRating();
        for (FAE fae : e.getFaeList().getFAEList()) {
            for (int i = 0; i < fae.getRatingList().size(); i++) {
                if (fae.getRatingList().get(i).getApplication().equals(app)) {
                    total += Math.abs(fae.getRatingList().get(i).getRating() - global);
                    cont++;
                }
            }
        }

        if (cont != 0) {
            return total / cont;
        }
        return -1;
    }

    /**
     *
     * This method calculates and returns the accepted applications list using
     * the getDecision method for each application.
     *
     * @return accepted applications list
     */
    public List<Application> getAcceptedApplicationRegister() {

        List<Application> acceptedApplicationRegister = new ArrayList<>();

        for (Application a : applicationRegister) {
            if (a.getDecision() == 1) {
                acceptedApplicationRegister.add(a);
            }
        }

        return acceptedApplicationRegister;
    }
}
