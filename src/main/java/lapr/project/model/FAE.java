package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FAE implements Serializable{
    
     static final long serialVersionUID = 8;

    /**
     * User that received the role of FAE of a certain event.
     */
    private User userFAE;
    private List<Attribution> attributionList = new ArrayList<>();

    /**
     * Creates an FAE instance, receiving a user that will perform the duty of
     * FAE.
     *
     * @param user user that will perform the role of FAE
     */
    public FAE(User user) {
        userFAE = user;
    }

    public FAE(){
        
    }
    /**
     * @return User that received the role of FAE of a certain event.
     */
    public User getUserFAE() {
        return userFAE;
    }

    /**
     * Method that allows to define the user that received the role of FAE of a
     * certain event.
     *
     * @param utilizadorFAE New user that will become FAE of a certain event.
     *
     */
    public void setUtilizadorFAE(User utilizadorFAE) {
        this.userFAE = utilizadorFAE;
    }

    public String getName() {
        return userFAE.getName();
    }

    public List<Attribution> getAttributionList() {
        return this.attributionList;
    }
    
  
    
   
    

   

 
    

    
    
}
