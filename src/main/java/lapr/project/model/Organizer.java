/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

public class Organizer {

    /**
     * User that received the role of Organizer of a certain event.
     */
    private User userOrg;

    /**
     *Creates an Organizer instance, receiving a user that will perform the duty of organizer.
     *
     * @param user User that received the role of organizer of a certain event.
     */
    public Organizer(User user) {
        userOrg = user;
    }

    /**
     * @return User that received the role of organizer of a certain event.
     */
    public User getUtilizadorOrganizador() {
        return userOrg;
    }

    /**
     * Method that allows to define the user that received the role of Organizer of a certain event.
     *
     * @param user User that received the role of organizer of a certain event.
     */
    public void setUtilizadorOrganizador(User user) {
        this.userOrg = user;
    }

    
}
