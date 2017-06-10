/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model.register;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.User;
import lapr.project.utils.IDPassNotMatch;

/**
 *
 * @author Utilizador
 */
public class UserRegister {

    /**
     * List that contains all the users from a specific event center.
     */
    private List<User> users = new ArrayList<>();

    /**
     * Creates a UserRegister instance,, by receiving a list with all user
     * belonging to an event center
     *
     * @param users List that contains all the FAE from a specific event center.
     */
    public UserRegister(List<User> users) {
        this.users = users;
    }

    /**
     * @return List that contains all the users from a specific event center.
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Allows to define a list that contains all the users belonging to an
     * certain event center.
     *
     * @param users List that contains all the users from a specific event
     * center.
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * 
     * @param username username of the user
     * @return an object User with the username given as username
     */
    
    public User getUserByUsername(String username) {

        User userByUsername = new User();

        for (User u : users) {
            if (u.getUsername().equals(username)) {
                userByUsername = u;
            }
        }
        
        return userByUsername;
    }

    /**
     * Method that will search and return a user that correspond to the id and
     * pass passed as parameters
     *
     * @param id Identification (username or email) of the user that is trying
     * to start session.
     * @param pass User pass that is trying to start session. sessão
     * @return User object
     */
    public User obterUtilizador(String id, String pass) {
        if (id.contains("@")) {
            for (User userA : users) {
                String utilAtualEmail = userA.getEmail();
                String utilAtualPass = userA.getPassword();
                if (utilAtualEmail.equalsIgnoreCase(id) && utilAtualPass.equalsIgnoreCase(pass)) {
                    return userA;
                }
            }
        } else {
            for (User utilAtual : users) {
                String utilAtualUsername = utilAtual.getUsername();
                String utilAtualPass = utilAtual.getPassword();
                if (utilAtualUsername.equalsIgnoreCase(id) && utilAtualPass.equalsIgnoreCase(pass)) {
                    return utilAtual;
                }
            }
        }
        throw new IDPassNotMatch();
    }

}
