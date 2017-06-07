/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.EventCenter;

/**
 *
 * @author Luis
 */
public class UC43_Controller {
    
    
    private EventCenter ec;
    
    public UC43_Controller(EventCenter ec){
        this.ec=ec;
    }
    
    public double getGlobalAcceptanceRate(){    
        return ec.getGlobalAcceptanceRate();
    }
}
