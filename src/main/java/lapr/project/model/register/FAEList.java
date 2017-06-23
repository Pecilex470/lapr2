/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Attribution;
import lapr.project.model.Event;
import lapr.project.model.FAE;


/**
 *
 * @author Utilizador
 */
public class FAEList implements Serializable{
    
     static final long serialVersionUID = 18;

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

    /**
     * This method adds a FAE to an Event
     * @param fae the FAE to be added
     */
    public void addFAE(FAE fae) {
        faes.add(fae);
    }

}
