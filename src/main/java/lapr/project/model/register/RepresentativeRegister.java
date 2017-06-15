/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model.register;


import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Representative;

/**
 *
 * @author Utilizador
 */
public class RepresentativeRegister {
   /**
     * List that contains all the representatives from a specific event center.
     */
    private List<Representative> representatives = new ArrayList<>();

    /**
     * Cria uma instância de ListaRepresentantes recebendo uma lista de
     * representantes de um dado Centro de Eventos
     *
     * @param representatives List that contains all the representatives from a specific event center.
     */
    public RepresentativeRegister(List<Representative> representatives) {
        this.representatives = representatives;
    }
    
    /**
     * 
     * @return List that contains all the representatives from a specific event center. 
     */
    public List<Representative> getRepresentativeList(){
        return representatives;
    }
    
    /**
     *Allows to define a list that contains all the representatives belonging to an certain event center
     * 
     * @param representatives List that contains all the representatives from a specific event center. 
     */
    public void setRepresentativeRegister(List<Representative> representatives){
     this.representatives=representatives; 
    }
    
    /**
     * This method adds a Representative to the Registry
     * @param r the representative to be added
     */
    public void addRepresentative(Representative r) {
        representatives.add(r);
    }

   
}
