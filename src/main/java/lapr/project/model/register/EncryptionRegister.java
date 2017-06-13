package lapr.project.model.register;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Encryption;

/**
 * 
 * @author Pedro
 */
public class EncryptionRegister {
    
    /**
     * List that stores all the data from the user password encryptions
     */
    private List<Encryption> enr = new ArrayList();
    
    /**
     * Constructor for the EncryptionRegister object
     *
     * @param enr receives an empty list from the eventCenter instanciation
     */
    public EncryptionRegister(List<Encryption> enr) {
        this.enr = enr;
    }
    
    public List<Encryption> getEncryptionList() {
        return enr;
    }
    
    public void setEncryptionList(List<Encryption> encryptionList) {
        this.enr = encryptionList;
    }
    
}
