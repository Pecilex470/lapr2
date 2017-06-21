package lapr.project.model;

import java.util.List;
import org.apache.commons.math3.distribution.NormalDistribution;

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
     * @param user user that will perform the role of FAE
     */
    public FAE(User user) {
        userFAE = user;
    }

    public FAE(){
        
    }
    /**
     * @return User that received the role of FAE of a certain event.
     */
    public User getUserFAE() {
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

    public List<Attribution> getAttributionList() {
        return this.attributionList;
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
    
    /**
     * Method to get the StandardDeviation ´
     *
     * @return StandarDeviation
     */
    public double getStandardDeviation() {
        double meanRating = getMeanRating();
        double x = 0;
        if (!this.attributionList.isEmpty()) {
            for (Attribution att : this.attributionList) {
                x += Math.abs(att.getEvaluation().getMeanRating() - Math.pow(meanRating, 2));
            }
            return x / this.attributionList.size();
        }
        return -1;

    }
    

   

 
    

    
    
}
