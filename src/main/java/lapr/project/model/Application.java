package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.register.DecisionList;

/**
 * Candidatura class.
 *
 * @author by Nuno Bettencourt [nmb@isep.ipp.pt] on 29/05/16.
 */
public class Application implements Serializable {

    static final long serialVersionUID = 1;

    private static final int DEFAULT_DECISION = 0;
    private List<Keyword> keywordList = new ArrayList<>();
    private String description = "";
    private int submissionMeanRating;
    private int decisionStatus;
    private String companyName;
    private int numberOfDecisions;
    private Stand stand;
    private User representative;
    private int boothArea;
    private int invitesQuantity;
    private DecisionList decisionList = new DecisionList();

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
        this.decisionStatus = DEFAULT_DECISION;
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

    /**
     * Gets the representative that submitted this application
     *
     * @return returns the representative
     */
    public User getRepresentative() {
        return representative;
    }

    /**
     * This method gets the application information and converts it into a
     * formatted string
     *
     * @return returns the formatted string
     */
    @Override
    public String toString() {
        String name = ("  Company name: " + Application.this.getCompanyName() + "\n"
                + "  Representative: " + Application.this.getRepresentative().getUsername() + "\n"
                + "          Booth Area: " + Application.this.getBoothArea() + "\n"
                + "   Invites quantity: " + Application.this.getInvitesQuantity() + "\n\n"
                + "     Description: " + Application.this.getDescription());
        return name;
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
     * Adds a new Decision to the application
     *
     * @param decision the decision to be added
     */
    public void addDecision(Decision decision) {
        decisionList.addDecision(decision);
    }

    /**
     * Obtain the list of existing keywords.
     *
     * @return A list of existing keywords.
     */
    public List<Keyword> getKeywordList() {
        return keywordList;
    }

    /**
     * This method gets all the decisions for the application
     *
     * @return returns the decisions list
     */
    public DecisionList getDecisionList() {
        return decisionList;
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

    /**
     * This method calculates the submission mean rating
     *
     * @return the submission mean rating
     */
    public int getSubmissionMeanRating() {
        return this.submissionMeanRating;
    }

    public int getDecisionStatus() {
        return this.decisionStatus;
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

    public void setDecisionStatus(int dec) {
        this.decisionStatus = dec;
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

    public void setDecisionList(List<Decision> readReviews) {
        decisionList.setDecisionList(readReviews);
    }
}
