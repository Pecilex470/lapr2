package lapr.project.model.register;

import java.util.List;
import lapr.project.model.FAE;

public class FAEList {
    
    private List<FAE> faeList;

    public FAEList() {
    }
    
    
    public List<FAE> getFAEList(){
        return faeList;
    } 
    
    public boolean testDifference2Fae(FAE fae1, FAE fae2){
        return false;//only for tests
    }
    
    public boolean testDifference(FAE fae){
        return false;//only for tests
    }
    
}
