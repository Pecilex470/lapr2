
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author Utilizador
 */
public class Decision implements Serializable {

    static final long serialVersionUID = 5;

    private static final double NUMBER_OF_CRITERIA = 4;

    /**
     * Parameters that the FAE will use to evaluate the application
     */
    private int knowledge;
    private int adequancy;
    private int quantity;
    private int overall;

    /**
     * Boolean representative of the decision taken by an FAE in relation to a
     * given application.
     */
    private Boolean decision;

    /**
     * Text supporting the decision taken.
     */
    private String justification;

    /**
     * The FAE's username
     */
    private String faeUsername;

    /**
     * Creates a Evaluation instance, by receiveing the decision and
     * justification.
     *
     * @param decision Boolean representative of the decision taken by an FAE in
     * relation to a given application.
     * @param justification Text supporting the decision taken.
     * @param knowledge th knowledge of the FAE abou the event
     * @param adequancy the adequancy of that application to the Event
     * @param quantity the adequacy of the invite quantity
     * @param overall the overall recommendation
     * @param faeUsername the username of the FAE that made this Decision
     */
    public Decision(boolean decision, String justification, int knowledge, int adequancy, int quantity, int overall, String faeUsername) {
        this.decision = decision;
        this.justification = justification;
        this.knowledge = knowledge;
        this.adequancy = adequancy;
        this.quantity = quantity;
        this.overall = overall;
        this.faeUsername = faeUsername;
    }

    /**
     * Creates a Evalution instance with no parameters.
     */
    public Decision() {

    }

    /**
     * @return Boolean representative of the decision taken by an FAE in
     * relation to a given application.
     */
    public boolean decisionApplication() {
        return decision;
    }

    /**
     * @return Text supporting the decision taken.
     */
    public String getJustification() {
        return justification;
    }

    /**
     * Define the decision taken by the FAE in relation with a certain
     * Application.
     *
     * @param decision Boolean "true" if application is accepted; "false" if
     * refused
     */
    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    /**
     * Define the justification text for the made decision in relation with a
     * certain application
     *
     * @param justification Novo texto justificativo para a decisão tomada em
     * relação a uma determinada candidatura
     */
    public void setJustificacao(String justification) {
        this.justification = justification;
    }

    /**
     *
     * @return the mean rating of this evaluation
     */
    public double getMeanRating() {
        return (double) (adequancy + overall + knowledge + quantity) / NUMBER_OF_CRITERIA;
    }

    public void setKnowledge(int know) {
        this.knowledge = know;
    }

    public void setAdequancy(int ade) {
        this.adequancy = ade;
    }

    public void setOverall(int ove) {
        this.overall = ove;
    }

    public void setQuantity(int qua) {
        this.quantity = qua;
    }

    public String getFaeUsername() {
        return this.faeUsername;
    }

    public void setFaeUsername(String username) {
        this.faeUsername = username;
    }
}
