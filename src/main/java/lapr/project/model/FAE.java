package lapr.project.model;

import java.util.List;

public class FAE {

    /**
     * User that received the role of FAE of a certain event.
     */
    private User userFAE;
    private List<Rating> ratingList;

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

    public List<Rating> getRatingList() {
        return this.ratingList;
    }

}
