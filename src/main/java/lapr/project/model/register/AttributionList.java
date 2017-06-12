/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model.register;

import java.util.List;
import lapr.project.model.Attribution;

/**
 *
 * @author Luis
 */
public class AttributionList {
    
    private List<Attribution> l_att;

    
    /**
     * 
     * @return list of attribution 
     */
    public List<Attribution> getL_att() {
        return l_att;
    }
    
    public void addAttribution(Attribution a){
        l_att.add(a);
    }
    
    
}
