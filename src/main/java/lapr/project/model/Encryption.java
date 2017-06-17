package lapr.project.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
     * Attribute that stores the keyword input by the user to use on the
     * encryptation
     */
    private String keyword;

    /**
     * All the characters that can be used
     */
    public final static String ABC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890,;.:-";

    /**
     * Constructor that creates the instance of an encryption
     *
     * @param shift the shift the encryption has on set user
     * @param user the user the encryption is associated to
     * @param keyword the keyword that the user inputs to be used on the
     * encryptation
     */
    public Encryption(int shift, User user, String keyword) {
        this.shift = shift;
        this.user = user;
        this.keyword = keyword;
    }
    
    public Encryption(){
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
    public User getUser() {
        return user;
    }

    /**
     * @param user the username to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * @param keyword the keyword to set
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * This method encrypts the password and saves the shift that is generated
     *
     * @param password the unencrypted password
     * @param num the shift to use in the encryption
     * @param abc the abecedary of characters
     * @return returns the encrypted password
     */
    public static String encryptPassword(String password, int num, String abc) {

        String encryptedPassword = "";

        List<String> abecedary = new ArrayList<>();
        List<String> rotated = new ArrayList<>();

        for (int i = 0; i < abc.length(); i++) {
            abecedary.add(abc.substring(i, i + 1));
            rotated.add(abc.substring(i, i + 1));
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

    /**
     * Method that encrypts data using a substitution algorithm
     *
     * @param param the String to be encrypted
     * @param key the keyword that the user inputs to be used on the
     * encryptation
     * @return returns de encrypted piece of Data
     */
    public static String encryptData(String param, String key) {

        String encryptedParam = "";

        List<String> abecedary = new ArrayList<>();
        List<String> substitution = new ArrayList<>();

        for (int i = 0; i < ABC.length(); i++) {
            abecedary.add(ABC.substring(i, i + 1));
        }

        for (int i = 0; i < key.length(); i++) {
            substitution.add(key.substring(i, i + 1));
        }

        for (int i = 0; i < key.length(); i++) {
            for (int j = 0; j < abecedary.size(); j++) {
                if (key.substring(i, i + 1).equals(abecedary.get(j))) {
                    abecedary.remove(j);
                }
            }
        }

        for (int i = 0; i < abecedary.size(); i++) {
            substitution.add(abecedary.get(i));
        }

        for (int i = 0; i < param.length(); i++) {
            for (int j = 0; j < abecedary.size(); j++) {
                if (param.substring(i, i + 1).equals(abecedary.get(j))) {
                    encryptedParam = encryptedParam + substitution.get(j);
                }
            }
        }
        
        return encryptedParam;
    }

    /**
     * Method that takes a char array and converts it into a String
     *
     * @param chars the array received
     * @return returns the converted String
     */
    public static String assemblePassword(char[] chars) {
        String password = "";

        for (int i = 0; i < chars.length; i++) {
            password = password + chars[i];
        }
        return password;
    }

}
