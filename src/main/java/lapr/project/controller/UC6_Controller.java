package lapr.project.controller;

import lapr.project.model.Encryption;
import lapr.project.model.EventCenter;
import lapr.project.model.User;
import lapr.project.model.register.EncryptionRegister;

/**
 *
 * @author Pedro
 */
public class UC6_Controller {

    /**
     * this is the instance of the EventCenter that contains all the information
     */
    private EventCenter ec;

    /**
     * This is the contructor for the controller, that creates an instance of
     * the UC6's controller
     *
     * @param ec The instance of the EventCenter
     */
    public UC6_Controller(EventCenter ec) {
        this.ec = ec;
    }

    /**
     * This method takes tha Data that the unregistered user inserted and
     * creates a new User with those details
     *
     * @param name The full name od the user
     * @param email The user's email address
     * @param username The user's username, the way he is recognised in the
     * system
     * @param password The user's password, that has been encrypted before being
     * stored under the User object
     */
    public void registerUser(String name, String email, String username, String password) {
        ec.getUserRegister().getUsers().add(new User(name, email, username, password));
    }

    /**
     * This method's functionality is to encrypt the password that the user
     * provided for further logins
     *
     * @param password the password the user inserted
     * @param shift the shift to be used in the encryptation
     * @param abc the abecedary of characters
     * @return returns the encrypted password
     */
    public String encryptPassword(String password, int shift, String abc) {
        return Encryption.encryptPassword(password, shift, abc);
    }

    /**
     * This method encrypts the user data in a safe way by performing a two-step encryption
     * @param param the data string to be processed
     * @param shift the shift to be used
     * @param keyword the keyword to use in the substitution encryption
     * @param abc the full character abecedary
     * @return returns the encrypted data string
     */
    public String twoLayerEncription(String param, int shift, String keyword, String abc) {
        String temp = Encryption.encryptData(param, keyword);
        return Encryption.encryptPassword(param, shift, abc);
    }

    /**
     * This method gets the EncryptionRegister instance
     *
     * @return returns the EncryptionRegister instance
     */
    public EncryptionRegister getEncryptionRegister() {
        return ec.getEncryptionRegister();
    }

    /**
     * Method that verifies if the password
     *
     * @param password
     * @return
     */
    public boolean verifyPassword(String password) {
        return User.verifyPassword(password);
    }

    /**
     * Method that assembles the char array rteceived into a String
     * 
     * @param chars the array received
     * @return the assembled String
     */
    public String assemblePassword(char[] chars) {
        return Encryption.assemblePassword(chars);
    }


}
