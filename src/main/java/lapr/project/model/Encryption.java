package lapr.project.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import lapr.project.model.register.EncryptionRegister;

/**
 *
 * @author Pedro
 */
public class Encryption {

    /**
     * Variable that stores the shift on the encryptation
     */
    private int shift;

    /**
     * Variable that stores the Username from the user that the shift is
     * asscoaited to
     */
    private User user;
    
    /**
     * Attribute that stores the keyword input by the user to use on the encryptation
     */
    private String keyword;

    /**
     * Instance of the registry of all Encryptions
     */
    private EncryptionRegister enr;

    /**
     * All the characters that can be used
     */
    private final static String ABC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890,;.:-";

    /**
     * Constructor that creates the instance of an encryption
     *
     * @param shift the shift the encryption has on set user
     * @param user the user this encryption is associated to
     * @param enr the encryption registry
     */
    public Encryption(int shift, User user, EncryptionRegister enr, String keyword) {
        this.shift = shift;
        this.user = user;
        this.enr = enr;
        this.keyword = keyword;
    }

    /**
     * @return the shift
     */
    public int getShift() {
        return shift;
    }

    /**
     * @param shift the shift to set
     */
    public void setShift(int shift) {
        this.shift = shift;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * This method encrypts the password and saves the shift that is generated
     *
     * @param password the unencrypted password
     * @return returns the encrypted password
     */
    public static String encryptPassword(String password) {
        int num = ThreadLocalRandom.current().nextInt(1, 66 + 1);
        String encryptedPassword = "";

        List<String> abecedary = new ArrayList();
        List<String> rotated = new ArrayList();

        for (int i = 0; i < ABC.length(); i++) {
            abecedary.add(ABC.substring(i, i + 1));
            rotated.add(ABC.substring(i, i + 1));
        }

        Collections.rotate(rotated, num);

        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < abecedary.size(); j++) {
                if (password.substring(i, i + 1).equals(abecedary.get(j))) {
                    encryptedPassword = encryptedPassword + rotated.get(j);
                    System.out.println(encryptedPassword);
                }
            }
        }
        return encryptedPassword;
    }

    /**
     * Method that encrypts data using a substitution algorithm
     *
     * @param param the String to be encrypted
     * @return returns de encrypted piece of Data
     */
    public static String encryptData(String param) {
        return "hello";
    }

}
