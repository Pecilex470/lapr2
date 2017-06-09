/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Utilizador
 */
public class Evaluation {
  /**
     * Boolean representative of the decision taken by an FAE in relation to a given application.
     */
    private Boolean decision;

    /**
     * Text supporting the decision taken.
     */
    private String justification;

    /**
     * Creates a Evaluation instance, by receiveing the decision and justification. 
     *
     * @param decision Boolean representative of the decision taken by an FAE in relation to a given application.
     * @param justification Text supporting the decision taken.
     */
    public Evaluation(boolean decision, String justification) {
        this.decision = decision;
        this.justification = justification;
    }

    /**
     * Creates a Evalution instance with no parameters.
     */
    public Evaluation() {
        
    }

    /**
     * @return Boolean representative of the decision taken by an FAE in relation to a given application. 
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
     * Define the decision taken by the FAE in relation with a certain Application.
     *
     * @param decision Boolean "true" if application is accepted;  "false" if refused
     */
    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    /**
     * Define the justification text for the made decision in relation with a certain application
     *
     * @param justification Novo texto justificativo para a decisão tomada em
     * relação a uma determinada candidatura
     */
    public void setJustificacao(String justification) {
        this.justification = justification;
    }
  
}
