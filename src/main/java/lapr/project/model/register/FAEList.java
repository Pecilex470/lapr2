/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model.register;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Attribution;
import lapr.project.model.Event;
import lapr.project.model.FAE;

/**
 *
 * @author Utilizador
 */
public class FAEList {

    /**
     * List that contains all the faes from a specific event.
     */
    private List<FAE> faes = new ArrayList<>();

    /**
     * Creates a FAEList instance, by receiving a list with all faes belonging
     * to an event
     *
     * @param listaFAE Lista de faes que pertencem ao evento em questão
     */
    public FAEList(List<FAE> listaFAE) {
        faes = listaFAE;
    }

    public FAEList() {
        this.faes = new ArrayList<>();
    }

    /**
     * @return List that contains all the faes from a specific event.
     */
    public List<FAE> getFAEList() {
        return faes;
    }

    /**
     * Allows to define a list that contains all the fae belonging to an certain
     * event
     *
     * @param FAE faes list that belongs to an event
     */
    public void setFAE(List<FAE> FAE) {
        this.faes = FAE;
    }

    public boolean testDifference2Fae(FAE fae1, FAE fae2) {
        return false;//only for tests
    }

    /**
     * Method that compute the mean deviation between FAEs’ average ratings for
     * each submission and global mean rating
     *
     * @param e - Event
     * @return Mean deviation
     */
    public double getMeanDeviation(Event e, FAE fae) {
        double total = 0;
        int cont = 0;
        double global = e.getApplicationList().getGlobalMeanRating();
        for (Attribution att : fae.getAttributionList()) {
            total += Math.abs(att.getEvaluation().getMeanRating() - global);
            cont++;
        }

        if (cont != 0) {
            return total / cont;
        }
        return -1;
    }

    /**
     * This method adds a FAE to an Event
     * @param fae the FAE to be added
     */
    public void addFAE(FAE fae) {
        faes.add(fae);
    }

}
