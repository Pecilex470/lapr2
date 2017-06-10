/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Utilizador
 */
public class Representative {
  /**
     * User that is associated with the role of Representative
     */
    private User userRepre;

    /**
     * Creates an Representative instance, receiving a user that will perform the duty of representative.
     *
     * @param user  User that is associated with the role of Representative
     */
    public Representative(User user) {
        userRepre = user;
    }

    /**
     * @return  User that is associated with the role of Representative
     *
     */
    public User getUserRepre() {
        return userRepre;
    }

    /**
     * Method that allows to define the user that is associated with the role of Representative
     *
     * @param user User that is associated with the role of Representative
     */
    public void setUserRepre(User user) {
        this.userRepre = userRepre;
    }
  
}
