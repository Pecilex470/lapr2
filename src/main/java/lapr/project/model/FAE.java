package lapr.project.model;

import java.io.Serializable;
import java.util.List;
import org.apache.commons.math3.distribution.NormalDistribution;

public class FAE implements Serializable{
    
     static final long serialVersionUID = 8;

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
    /**
     * Method that returns the Z-test that is any statistical test for which the distribution of the test statistic under the null hypothesis can be approximated by a normal distribution.In this case, used a Z-test for the mean deviation.
     * 
     * @return Z-test 
     */
    public double getZ1MeanDeviation() {
        double acceptanceRate = getMeanRating();
        int total = getAttributionList().size();
        double standardDeviation = getStandardDeviation();
        double z = (acceptanceRate - 1) / (standardDeviation / Math.sqrt(total));

        return z;
    }
    /**
     * Method that returns the decision of the test where if the difference between FAE Mean Deviation and the number 1(Mean Deviation) is equal or no with a significance level equal to 1%.
     * 
     * @return Decision(Yes or No)
     */
    public String TestTheDifferenceBetweenTheMeanDeviationAndATheoreticalValue1ForAFAEAverageRatingA1() {
        NormalDistribution p = new NormalDistribution();
        double a = 0.01;
        double zc = p.inverseCumulativeProbability(1 - a);
        double z = getZ1MeanDeviation();
        if (z > zc) {
            return "Yes";
        } else {
            return "No";
        }
    }
    /**
     * Method that returns the decision of the test where if the difference between FAE Mean Deviation and the number 1(Mean Deviation) is equal or no with a significance level equal to 5%.
     * 
     * @return Decision(Yes or No) 
     */
    public String TestTheDifferenceBetweenTheMeanDeviationAndATheoreticalValue1ForAFAEAverageRatingA5() {
        NormalDistribution p = new NormalDistribution();
        double a = 0.05;
        double zc = p.inverseCumulativeProbability(1 - a);
        double z = getZ1MeanDeviation();
        if (z > zc) {
            return "Yes";
        } else {
            return "No";
        }
    }

    /**
     * Method that returns the Z-test that is any statistical test for which the distribution of the test statistic under the null hypothesis can be approximated by a normal distribution.In this case, used a Z-test to compare two mean deviations.
     * 
     *@param e Second FAE to get the info for the second mean deviation and standard deviation.
     * 
     * @return 
     */
    public double getZ2MeanDeviations(FAE e) {
        double acceptanceRate = getMeanRating();
        int total = getAttributionList().size();
        double standardDeviation = getStandardDeviation();
        double acceptanceRate2 = e.getMeanRating();
        int total2 = e.getAttributionList().size();
        double standardDeviation2 = e.getStandardDeviation();
        double z = (acceptanceRate - acceptanceRate2) / Math.sqrt((standardDeviation / total) + (standardDeviation2 / total2));
        return z;
    }

    /**
     *  Method that returns the decision of the test where we check if the difference between two FAE Mean Deviations is equal or not with a significance level equal to 1%.
     * 
     * @param e Second event to get is Z-test
     * 
     * @return Decision(Yes or No) 
     */
    public String TestingTheDifferenceBetweenTwoFAEsMeanDeviationsA1(FAE e) {
        NormalDistribution p = new NormalDistribution();
        double a = 0.01;
        double zc = p.inverseCumulativeProbability(1 - (a / 2.));
        double z = getZ2MeanDeviations(e);
        if (z < -zc && z > zc) {
            return "Yes";
        } else {
            return "No";
        }
    }
    /**
     * Method that returns the decision of the test where we check if the difference between two FAE Mean Deviations is equal or not with a significance level equal to 1%.
     * 
     * @param e Second event to get is Z-test
     * 
     * @return Decision(Yes or No) 
     */
    public String TestingTheDifferenceBetweenTwoFAEsMeanDeviationsA5(FAE e) {
        NormalDistribution p = new NormalDistribution();
        double a = 0.05;
        double zc = p.inverseCumulativeProbability(1 - (a / 2.));
        double z = getZ2MeanDeviations(e);
        if (z < -zc && z > zc) {
            return "Yes";
        } else {
            return "No";
        }
    }

    
    
}
