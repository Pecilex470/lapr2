package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.register.EncryptionRegister;
import lapr.project.model.register.EventRegister;
import lapr.project.model.register.UserRegister;
import lapr.project.model.register.RepresentativeRegister;
import java.io.Serializable;
import java.util.Collections;
import org.apache.commons.math3.distribution.NormalDistribution;

/**
 *
 * @author Cerqueira
 */
public class EventCenter implements Serializable {

    static final long serialVersionUID = 7;
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

        int nApplicationsTotal = 0;
        int nApplicationsAccepted = 0;

        for (Event e : getEventRegister().getEventList()) {

            nApplicationsAccepted += e.getApplicationList().getAcceptedApplicationRegister().size();
            nApplicationsTotal += e.getApplicationList().getApplications().size();

        }

        double acceptanceRounded = 0;

        if (nApplicationsTotal != 0) {
            int acceptance = (((nApplicationsAccepted * 100) / nApplicationsTotal) * 100);
            acceptanceRounded = (double) acceptance / 100;
        }

        return acceptanceRounded;

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
     * This method iterates all saved Events and returns a list of the events in
     * which the user is organizer
     *
     * @param u teh user to check
     * @return returns the list of the events
     */
    public List<Event> getEventsWhereUserIsOrganizer(User u) {

        List<Event> eventsWhereUserIsOrganizer = new ArrayList<>();
        for (Event e : getEventRegister().getEventList()) {
            if (e.getOrganizerList().getOrganizers() != null) {
                if (e.isOrganizer(u)) {
                    eventsWhereUserIsOrganizer.add(e);
                }
            }

        }
        return eventsWhereUserIsOrganizer;
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

    /**
     * Method that returns all the fae register in the Event Center
     *
     * @return All the fae register in the Event Center
     */
    public List<FAE> getAllFAE() {
        List<FAE> allFAE = new ArrayList<>();
        for (int i = 0; i < er.getEventList().size(); i++) {
            for (int j = 0; j < er.getEventList().get(i).getFaeList().getFAEList().size(); j++) {
                if (!allFAE.contains(er.getEventList().get(i).getFaeList().getFAEList().get(i))) {
                    System.out.println("FAE");
                    allFAE.add(er.getEventList().get(i).getFaeList().getFAEList().get(i));
                }

            }

        }
        return allFAE;
    }

    /**
     * Method that returns all the fae that evaluated a application in the Event
     * Center
     *
     * @return Fae that evaluated a application in the Event Center
     */
    public List<FAE> getFAEEvaluatedApplications() {

        List<FAE> faesWithAtLeastOneApplication = new ArrayList<>();

        for (Event e : getEventRegister().getEventList()) {
            
            for (FAE fae : e.getFaeList().getFAEList()) {
                
                for (Attribution att : fae.getAttributionList()) {
                    
                    Application app = att.getApplication();

                    for (Decision dec : app.getDecisionList().getDecisions()) {
                        
                        if (!faesWithAtLeastOneApplication.contains(e.getFaeList().getFAEbyUsername(dec.getFaeUsername()))) {
                            faesWithAtLeastOneApplication.add(e.getFaeList().getFAEbyUsername(dec.getFaeUsername()));
                        }
                    }
                    
                }
            }

        }

        return faesWithAtLeastOneApplication;
    }

    public List<Decision> getEvaluatedApplicationsFAE(String f) {
        List<Decision> decisionFAE = new ArrayList<>();
        for (Event e : getEventRegister().getEventList()) {
            for (FAE fae : e.getFaeList().getFAEList()) {
                for (Attribution att : fae.getAttributionList()) {
                    Application app = att.getApplication();
                    for (Decision dec : app.getDecisionList().getDecisions()) {
                        if (dec.getFaeUsername().equals(f)) {
                            decisionFAE.add(dec);
                        }

                    }
                }
            }
        }
        return decisionFAE;
    }

    public List<Decision> getAllDecisions() {
        List<Decision> decisionAll = new ArrayList<>();
        for (int i = 0; i < er.getEventList().size(); i++) {
            for (int j = 0; j < er.getEventList().get(i).getApplicationList().getApplications().size(); j++) {
                for (int l = 0; j < er.getEventList().get(i).getApplicationList().getApplications().get(j).getDecisionList().getDecisions().size(); l++) {
                    decisionAll.add(er.getEventList().get(i).getApplicationList().getApplications().get(j).getDecisionList().getDecisions().get(l));
                }
            }
        }
        return decisionAll;
    }

    /**
     * /**
     * Method to get the fae mean rating
     *
     * @param fae fae to get the mean rating
     *
     * @return fae mean deviation
     */
    public double getMeanRatingF(String fae) {
        List<Decision> decisionFAE = getEvaluatedApplicationsFAE(fae);
        double total = 0;
        for (Decision dec : decisionFAE) {
            total += dec.getMeanRating();
        }
        return total / decisionFAE.size();
    }

    /**
     * Method to get the StandardDeviation ´
     *
     * @return StandarDeviation
     */
    public double getStandardDeviation(String fae) {
        double meanRating = getMeanRatingF(fae);
        List<Decision> decisionFAE = getEvaluatedApplicationsFAE(fae);
        double x = 0;
        if (!decisionFAE.isEmpty()) {
            for (Decision dec : decisionFAE) {
                x += Math.abs(dec.getMeanRating() - Math.pow(meanRating, 2));
            }
            return x / decisionFAE.size();
        }
        return -1;

    }

    public double getGlobalMeanRate() {
        double globalMeanRate;
        int total = getAllDecisions().size();
        double sC = 0;

        for (FAE f : getFAEEvaluatedApplications()) {
            sC += getMeanRatingF(f.getName());

        }
        globalMeanRate = sC / total;
        return globalMeanRate;
    }

    public double getMeanDeviation(String fae) {
        double total = 0;
        int cont = 0;
        double global = getGlobalMeanRate();
        for (Decision d : getEvaluatedApplicationsFAE(fae)) {
            total += Math.abs(getMeanRatingF(fae) - global);
            cont++;
        }

        if (cont != 0) {
            return total / cont;
        }
        return -1;
    }

    /**
     * Method that returns the Z-test that is any statistical test for which the
     * distribution of the test statistic under the null hypothesis can be
     * approximated by a normal distribution.In this case, used a Z-test for the
     * mean deviation.
     *
     * @return Z-test
     */
    public double getZ(FAE fae) {
        double mDev = getMeanDeviation(fae.getName());
        int total = getFAEEvaluatedApplications().size();
        double standardDeviation = getStandardDeviation(fae.getName());
        double z = (mDev - 1) / (standardDeviation / Math.sqrt(total));

        return z;
    }

    /**
     * Method that returns the Z-test that is any statistical test for which the
     * distribution of the test statistic under the null hypothesis can be
     * approximated by a normal distribution.In this case, used a Z-test to
     * compare two mean deviations.
     *
     * @param e Second FAE to get the info for the second mean deviation and
     * standard deviation.
     *
     * @return
     */
    public double getZ2MeanDeviations(FAE e, FAE fae) {
        double mDev1 = getMeanDeviation(e.getName());
        int total = getFAEEvaluatedApplications().size();
        double standardDeviation = getStandardDeviation(e.getName());
        double mDev2 = getMeanDeviation(fae.getName());
        int total2 = fae.getAttributionList().size();
        double standardDeviation2 = getStandardDeviation(fae.getName());
        double z = (mDev1 - mDev2) / Math.sqrt((standardDeviation / total) + (standardDeviation2 / total2));
        return z;
    }

    /**
     * Method that returns the decision of the test where if the difference
     * between FAE Mean Deviation and the number 1(Mean Deviation) is equal or
     * not.
     *
     * @return Decision(Yes or No)
     */
    public String testTheDifferenceBetweenTheMeanDeviationAndATheoreticalValue1ForAFAEAverageRating(String a, FAE f) {
        NormalDistribution p = new NormalDistribution();
        double sv = Double.parseDouble(a);
        double zc = p.inverseCumulativeProbability(1 - sv);
        double z = getMeanDeviation(f.getName());
        if (z > zc) {
            return "Yes";
        } else {
            return "No";
        }
    }

    /**
     * Method that returns the decision of the test where we check if the
     * difference between two FAE Mean Deviations is equal or not with a
     * significance level equal to 1%.
     *
     * @param e First fae to get is Z-test
     * @param fae Second fae to get is Z-test
     * @param a Significance level
     *
     * @return Decision(Yes or No)
     */
    public String testingTheDifferenceBetweenTwoFAEsMeanDeviations(FAE e, FAE fae, String a) {

        double zc = zC(a);
        double z = getZ2MeanDeviations(e, fae);
        if (z < -zc && z > zc) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public double zC(String a) {
        NormalDistribution p = new NormalDistribution();
        double sv = Double.parseDouble(a);
        double zc = p.inverseCumulativeProbability(1 - (sv / 2.));
        return zc;
    }

    public Object[][] keywordFrequency() {

        List<Keyword> listWithAllKeywords = new ArrayList<>();
        List<String> listWithOneOfEachKeyword = new ArrayList<>();

        for (Event e : getEventRegister().getEventList()) {
            for (Application a : e.getApplicationList().getApplications()) {
                for (Keyword k : a.getKeywordList()) {

                    listWithAllKeywords.add(k);

                    if (!listWithOneOfEachKeyword.contains(k.getValue())) {
                        listWithOneOfEachKeyword.add(k.getValue());

                    }

                }
            }
        }

        String[][] keywordMatrix = new String[listWithOneOfEachKeyword.size()][2];

        int count = 0;

        for (String k : listWithOneOfEachKeyword) {
            int occurrences = Collections.frequency(listWithAllKeywords, new Keyword(k));
            keywordMatrix[count][0] = k;
            keywordMatrix[count][1] = "" + occurrences;
            count++;
        }

        Object[][] frequencyMatrix = new Object[listWithOneOfEachKeyword.size()][3];
        int nKeywords = listWithAllKeywords.size();
        double tempN;
        int roundDouble;

        for (int i = 0; i < frequencyMatrix.length; i++) {

            frequencyMatrix[i][0] = keywordMatrix[i][0];
            tempN = (Double.parseDouble(keywordMatrix[i][1]) * 100) / nKeywords;

            roundDouble = (int) (tempN * 10);
            tempN = (double) roundDouble / 10;

            frequencyMatrix[i][1] = "" + tempN + "%";
            frequencyMatrix[i][2] = Integer.parseInt(keywordMatrix[i][1]);

        }

        return frequencyMatrix;

    }

}
