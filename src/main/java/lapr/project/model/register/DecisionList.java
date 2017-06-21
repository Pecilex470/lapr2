/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model.register;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Decision;

/**
 *
 * @author Pedro
 */
public class DecisionList {

    /**
     * List of events in charge of a given Event Center.
     */
    private List<Decision> decisionList = new ArrayList<>();

    /**
     * Creates an instance of EventRegister receiving an event list.
     *
     * @param decisionList the list that will hold all the decisions
     */
    public DecisionList(List<Decision> decisionList) {
        this.decisionList = decisionList;
    }

    public DecisionList() {
        this.decisionList = new ArrayList<>();
    }

    /**
     * @return List of events in charge of a given Event Center
     */
    public List<Decision> getDecisions() {
        return decisionList;
    }

    /**
     * 
     * @param decisionList 
     */
    public void setDecisionList(List<Decision> decisionList) {
        this.decisionList = decisionList;
    }
    
    /**
     * This method adds a new decision to a certain application
     * @param decision the decision to be added
     */
    public void addDecision(Decision decision) {
        decisionList.add(decision);
    }

    /**
     * This method returns a decision by its decisor's username
     * @param username the username of the FAE that decided it
     * @return returns the decision
     */
    public Decision getDecisionByFAEUsername(String username) {
        
        for (Decision dec : decisionList) {
            if (dec.getFaeUsername().equals(username)) {
                return dec;
            }
        }
        return null;
    }

}
