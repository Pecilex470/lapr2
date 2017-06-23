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
     * @param isEventManager checks if the user is event manager
     * @param isRepresentative checks if the user is a Representative
     */
    public void registerUser(String name, String email, String username, String password, boolean isEventManager, boolean isRepresentative) {
        ec.getUserRegister().getUsers().add(new User(name, email, username, password, isEventManager, isRepresentative));
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
     * this method deencrypts the password that was provided by the user
     * when he first registered himself
     * 
     * @param password the password to be deencrypted
     * @param shift the shift used in the encryption
     * @param abc the full abecedary of characters to encrypt
     * @return returns the deencrypted password
     */
    public String deEncryptPassword(String password, int shift, String abc) {
        return Encryption.deEncryptPassword(password, shift, abc);
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
        return Encryption.encryptPassword(temp, shift, abc);
    }
    
    /**
     * This method deencrypts the data that was 2-step encrypted
     * @param param the parameter do deencrypt
     * @param shift the shift used in the encryption
     * @param keyword the keyword used in the encryption
     * @param abc the abecedary of characters
     * @return returns the deencrypted String
     */
    public String twoLayerDeencryption(String param, int shift, String keyword, String abc) {
        String temp = Encryption.deEncryptPassword(param, shift, abc);
        return Encryption.deEncryptData(temp, keyword);
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
     * Method that verifies if the password is inside the especified parameters
     *
     * @param password
     * @return
     */
    public boolean verifyPassword(String password) {
        return User.verifyPassword(password);
    }
    
    /**
     * Method that verifies if the email is legit
     *
     * @param email
     * @return
     */
    public boolean verifyEmail(String email) {
        return User.verifyEmail(email);
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
    
    /**
     * This method creates a new encryption that is vinculated to a certain user
     * @param shift the shift used in the one step encryptation
     * @param username
     * @param keyword
     */
    public void addEncryption(int shift, String username, String keyword) {
        ec.getEncryptionRegister().addEncryption(new Encryption(shift, ec.getUserRegister().getUserByUsername(username), keyword));
    }

    /**
     * This method verifies if the inputted email already exists in the system
     * @param email the email to be verified
     * @return returns true or false accordingly
     */
    public boolean verifyExistingEmail(String email) {
        return ec.getUserRegister().verifyExistingEmail(email, ec);
    }

}
