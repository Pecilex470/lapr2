package lapr.project.model;

import java.util.List;

public class FAE {

    /**
     * User that received the role of FAE of a certain event.
     */
    private User userFAE;
    private List<Attribution> attributionList;

    /**
     * Creates an FAE instance, receiving a user that will perform the duty of
     * FAE.
     *
     * @param use User that will perform the role of FAE
     */
    public FAE(User use) {
        userFAE = use;
    }

    /**
     * @return User that received the role of FAE of a certain event.
     */
    public User getUtilizadorFAE() {
        return userFAE;
    }

    /**
     * Method that allows to define the user that received the role of FAE of a
     * certain event.
     *
     * @param utilizadorFAE New user that will become FAE of a certain event.
     *
     */
    public void setUtilizadorFAE(User utilizadorFAE) {
        this.userFAE = utilizadorFAE;
    }

    public String getName() {
        return userFAE.getName();
    }

    public List<Attribution> getRatingList() {
        return this.attributionList;
    }

    /**
     * Method that compute the mean deviation between FAEs’ average ratings for
     * each submission and global mean rating
     *
     * @param e - Event
     * @return Mean deviation
     */
    public double getMeanDeviation(Event e) {
        double total = 0;
        int cont = 0;
        double global = e.getApllicationRegister().getGlobalMeanRating();
        for (Attribution att : this.attributionList) {
            if (e.isFAE(att.getFAE().getUtilizadorFAE())) {
                total += Math.abs(att.getEvaluation().getMeanRating() - global);
                cont++;
            }
        }
        if (cont != 0) {
            return total / cont;
        }
        return -1;
    }

    /**
     * Method to get the fae mean rating
     *
     * @return fae mean deviation
     */
    public double getMeanRating() {
        double total = 0;
        if (!this.attributionList.isEmpty()) {
            for (Attribution att : this.attributionList) {
                total += att.getEvaluation().getMeanRating();
            }
            return total / this.attributionList.size();
        }
        return -1;
    }
}
