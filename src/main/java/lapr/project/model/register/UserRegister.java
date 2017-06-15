/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model.register;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import lapr.project.model.User;
import lapr.project.ui.InitialWindow;
import lapr.project.utils.PasswordDoesNotMatch;

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
     * @param username Identification (username or email) of the user that is
     * trying to start session.
     * @param password User pass that is trying to start session. sessão
     * @param user
     * @return User object
     * @throws lapr.project.utils.PasswordDoesNotMatch
     */
    public User getUserByLogin(String username, String password, User user) throws PasswordDoesNotMatch {

        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
            return user;
        } else
        throw new PasswordDoesNotMatch("Incorrect login credentials");
    }

}
