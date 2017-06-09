/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model.register;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.FAE;

/**
 *
 * @author Utilizador
 */
public class FAEList {
     /**
     * List that contains all the FAE from a specific event.
     */
    private List<FAE> FAE = new ArrayList<>();

    /**
     * Creates a FAEList instance, by receiving a list with all FAE belonging to an event
     * 
     * @param listaFAE Lista de FAE que pertencem ao evento em questão
     */
    public FAEList(List<FAE> listaFAE) {
        FAE = listaFAE;
    }

    /**
     * @return List that contains all the FAE from a specific event.
     */
    public List<FAE> getFAEList() {
        return FAE;
    }

    /**
     * Allows to define a list that contains all the fae belonging to an certain event
     *
     * @param FAE FAE list that belongs to an event
     */
    public void setFAE(List<FAE> FAE) {
        this.FAE = FAE;
    }
    
    public boolean testDifference2Fae(FAE fae1, FAE fae2){
        return false;//only for tests
    }

}
  

