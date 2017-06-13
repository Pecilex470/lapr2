package lapr.project.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
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
    private String username;
    
    private EncryptionRegister enr;

    /**
     * All the characters that can be used
     */
    private final static String ABC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890,;.:-";

    /**
     * Constructor that creates the instance of an encryption
     *
     * @param shift the shift the encryption has on set user
     * @param username the username of the user
     * @param enr the encryption registry
     */
    public Encryption(int shift, String username, EncryptionRegister enr) {
        this.shift = shift;
        this.username = username;
        this.enr = enr;
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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method encrypts the password and saves the shift that is generated
     *
     * @param password the unencrypted password
     * @param username the username relative to the user
     * @return returns the encrypted password
     */
    public static String encryptPassword(String password, String username) {
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
                }
            }
        }
        
        
        return encryptedPassword;
    }
    
    public static String encryptData(String param) {
        return "hello";
    }

}
