/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;

/**
 *
 * @author Cerqueira
 */
public class UC49_Controller {
    EventCenter ec;
    List<FAE> allFAE;
    
    public UC49_Controller(EventCenter ec){
        this.ec=ec;
    }
    
    
    public List<FAE> getAllFae(EventCenter ec) {
        allFAE= ec.getAllFAE();
        return allFAE;
    }
    
//    public boolean testDifference2Fae(FAE fae) {
//        return faeL.testDifference(fae);
//    }
    
}
