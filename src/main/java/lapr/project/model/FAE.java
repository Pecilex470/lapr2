package lapr.project.model;

import java.util.List;

public class FAE {


    /**
     *  User that received the role of FAE of a certain event.
     */
    private User userFAE;

    /**
     * Creates an FAE instance, receiving a user that will perform the duty of FAE.
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
     * Method that allows to define the user that received the role of FAE of a certain event.
     *
     * @param utilizadorFAE New user that will become FAE of a certain event.
     * 
     */
    public void setUtilizadorFAE(User utilizadorFAE) {
        this.userFAE = utilizadorFAE;
    }


    /**
     * Method that compares 2 objects and verifies are equal to each other
     *
     * @param obj Object to be compared with the one that invokes the method.
     * @return "True" - The 2 FAE are equals; "False" - Otherwise 
     * 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        FAE outroFAE = (FAE) obj;
        return (this.userFAE.equals(outroFAE.getUtilizadorFAE()));
    }

}


    

