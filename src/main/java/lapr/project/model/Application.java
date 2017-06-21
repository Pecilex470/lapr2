package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Candidatura class.
 *
 * @author by Nuno Bettencourt [nmb@isep.ipp.pt] on 29/05/16.
 */
public class Application implements Serializable {

    static final long serialVersionUID = 1;
    private static final String ROOT_ELEMENT_NAME = "application";
    private static final String DESCRIPTION_ELEMENT_NAME = "description";
    private static final String KEYWORDS_ELEMENT_NAME = "keywords";
    private static final int DEFAULT_DECISION = 0;
    private List<Keyword> keywordList = new ArrayList<>();
    private String description = "";
    private int submissionMeanRating;
    private int decision;
    private String companyName;
    private int numberOfDecisions;
    private Stand stand;
    private User representative;
    private int boothArea;
    private int invitesQuantity;
    private List<Evaluation> evaluationList;

    /**
     * Constructor for Application
     *
     * @param description CandidaturaDescription
     * @param keywordList Keyword List
     * @param companyName
     * @param representative
     * @param boothArea
     * @param invitesQuantity
     */
    public Application(String description, List<Keyword> keywordList, String companyName, User representative, int boothArea, int invitesQuantity) {
        this.description = description;
        this.keywordList.addAll(keywordList);
        this.decision = DEFAULT_DECISION;
        this.companyName = companyName;
        this.representative = representative;
        this.boothArea = boothArea;
        this.invitesQuantity = invitesQuantity;

    }

    /**
     * Default public constructor.
     */
    public Application() {

    }

    /**
     * Obtain Candidatura's description.
     *
     * @return Candidatura description
     */
    public String getDescription() {
        return description;
    }

    public User getRepresentative() {
        return representative;
    }

    /**
     * Add a keyword to Candidatura.
     *
     * @param keyword Keyword to be added.
     */
    public void addKeyword(Keyword keyword) {
        getKeywordList().add(keyword);
    }

    /**
     * Obtain the list of existing keywords.
     *
     * @return A list of existing keywords.
     */
    public List<Keyword> getKeywordList() {
        return keywordList;

    }

    @Override
    public int hashCode() {
        int result = getDescription().hashCode();
        result = 31 * result + getKeywordList().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Application)) {
            return false;
        }

        Application that = (Application) o;

        if (!getDescription().equals(that.getDescription())) {
            return false;
        }
        return getKeywordList().equals(that.getKeywordList());

    }

    public int getSubmissionMeanRating() {
        return this.submissionMeanRating;
    }

    public int getDecision() {
        return this.decision;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public int getNumberOfDecisions() {
        return this.numberOfDecisions;
    }

    public void setSubmissionMeanRating(int value) {
        this.submissionMeanRating = value;
    }

    public void setDecision(int dec) {
        this.decision = dec;
    }

    public void setNumberOfDecisions(int num) {
        this.numberOfDecisions = num;
    }

    /**
     * @param keywordList the keywordList to set
     */
    public void setKeywordList(List<Keyword> keywordList) {
        this.keywordList = keywordList;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @param representative the representative to set
     */
    public void setRepresentative(User representative) {
        this.representative = representative;
    }

    public void setBoothArea(int area) {
        this.boothArea = area;
    }

    /**
     * this method gets the invites quantity
     *
     * @param invitesQuantity the quantity of the invites
     */
    public void setInvitesQuantity(int invitesQuantity) {
        this.invitesQuantity = invitesQuantity;
    }

    /**
     * @return the boothArea
     */
    public int getBoothArea() {
        return boothArea;
    }

    /**
     * @return the invitesQuantity
     */
    public int getInvitesQuantity() {
        return invitesQuantity;
    }

    public void setEvaluationList(List<Evaluation> list) {
        this.evaluationList = list;
    }

    /**
     * This method gets the application information and converts it into a
     * formatted string
     *
     * @return returns the formatted string
     */
    @Override
    public String toString() {
        return "hello";
    }
}
