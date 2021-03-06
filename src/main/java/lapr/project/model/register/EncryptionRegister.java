package lapr.project.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Encryption;
import lapr.project.model.User;

/**
 *
 * @author Pedro
 */
public class EncryptionRegister implements Serializable{
    
     static final long serialVersionUID = 16;

    /**
     * List that stores all the data from the user password encryptions
     */
    private List<Encryption> enr = new ArrayList<>();

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

    public void addEncryption(Encryption e) {
        enr.add(e);
    }

    public Encryption getEncryptionByUser(User user) {
        for (Encryption encryption : enr) {
            if (encryption.getUser().equals(user)) {
                return encryption;
            }
        }
        return null;
    }

}
