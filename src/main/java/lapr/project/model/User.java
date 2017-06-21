/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author Utilizador
 */
public class User implements Serializable{
    
     static final long serialVersionUID = 13;

    /**
     * The user's full name
     */
    private String name;

    /**
     * User email address
     */
    private String email;

    /**
     * User Identification
     */
    private String username;

    /**
     * User Access password
     */
    private String password;

    /**
     * Checks if the user is an EventManager
     */
    private boolean isEventManager;

    /**
     * Checks if the user is a Representative
     */
    private boolean isRepresentative;

    /**
     * Creates a User instance receiving the name, email, username, and password
     * of the new user to be created.
     *
     * @param name User civil name
     * @param email User email
     * @param username User identification
     * @param password User Acess password
     * @param isEventManager checks if the user is an event manager
     * @param isRepresentative checks if the user is a representative
     */
    public User(String name, String email, String username, String password, boolean isEventManager, boolean isRepresentative) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.isEventManager = isEventManager;
        this.isRepresentative = isRepresentative;
    }

    public User() {
        this.username = "null";
    }

    /**
     * @return The name of the respective user
     */
    public String getName() {
        return name;
    }

    /**
     * @return The email of the respective user
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return The username of the respective user
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return The password of the respective user
     */
    public String getPassword() {
        return password;
    }

    /**
     * Method that allows to define the name of the user
     *
     * @param name The user name in question to be defined.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method that allows to define the email of the user
     *
     * @param email The user email in question to be defined
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method that allows to define the username of the user
     *
     * @param username The user username in question to be defined
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Method that allows to define the password of the user
     *
     * @param password The user password in question to be defined
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method verifies if the password has the minimum requirements
     * @param password the password received to test
     * @return returns if it has the requirements or not
     */
    public static boolean verifyPassword(String password) {
        boolean specialChars = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean number = false;

        String chars = ".,;:-";
        for (int i = 0; i < password.length(); i++) {
            if (chars.contains(password.substring(i, i + 1))) {
                specialChars = true;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                upperCase = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lowerCase = true;
            }
        }

        String numbers = "1234567890";
        for (int i = 0; i < password.length(); i++) {
            if (numbers.contains(password.substring(i, i + 1))) {
                number = true;
            }
        }

        if (specialChars == true && upperCase == true && lowerCase == true && number == true) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param email
     * @return true if the string email has only one "@" and has atleast one "."
     * after the "@"
     */
    public static boolean verifyEmail(String email) {

        int atPosition = 0;
        int flag = 0;

        for (int i = 0; i < email.length() - 1; i++) {
            if ("@".contains(email.substring(i, i + 1))) {
                atPosition = i;
                flag++;
            }
        }

        if (flag == 1) {

            for (int i = atPosition; i < email.length() - 2; i++) {
                if (".".contains(email.substring(i, i + 1))) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if the user is an event manager
     * @return returns a boolean
     */
    public boolean isEventManager() {
        return isEventManager;
    }

    /**
     * Checks if the user is a representative
     * @return returns a boolean
     */
    public boolean isRepresentative() {
        return isRepresentative;
    }
    
}
