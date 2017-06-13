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
public class User {
    
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
     * User Acess password
     */
    private String password;

    /**
     * Creates a User instance receiving the name, email, username, and password of the new user to be created.
     *
     * @param name User civil name
     * @param email User email
     * @param username User identification 
     * @param password User Acess password
     */
    public User(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    
    public User(){
        
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
     * @param name  The user name in question to be defined.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *Method that allows to define the email of the user
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

   }
    

