package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Pedro
 */
public class Encryption implements Serializable {

    static final long serialVersionUID = 4;

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
    public static final String ABC = " abcdefghijklmnopqrstuvwxyzãÃõÕêÊçÇíÍ*+ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890,;.:-@";
    public static final int nCharABC = 81;

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

    public Encryption() {
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
        
        String encryptedString = "";

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
                    encryptedString = encryptedString + rotated.get(j);
                }
            }
        }
        return encryptedString;
    }

    /**
     * this method deEncrypts a password
     *
     * @param password the password to deEncrypt
     * @param num the shift that was used in the encryption
     * @param abc the abecedary of characters
     * @return returns the deencrypted password
     */
    public static String deEncryptPassword(String password, int num, String abc) {

        String deEncryptedString = "";

        List<String> abecedary = new ArrayList<>();
        List<String> rotated = new ArrayList<>();

        for (int i = 0; i < abc.length(); i++) {
            abecedary.add(abc.substring(i, i + 1));
            rotated.add(abc.substring(i, i + 1));
        }

        Collections.rotate(rotated, num);

        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < rotated.size(); j++) {
                if (password.substring(i, i + 1).equals(rotated.get(j))) {
                    deEncryptedString = deEncryptedString + abecedary.get(j);
                }
            }
        }
        return deEncryptedString;
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
        int cont = 0;

        List<String> abecedary = new ArrayList<>();
        List<String> substitution = new ArrayList<>();
        List<String> comparator = new ArrayList<>();

        for (int i = 0; i < ABC.length(); i++) {
            abecedary.add(ABC.substring(i, i + 1));
            comparator.add(ABC.substring(i, i + 1));
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
            for (int j = 0; j < comparator.size(); j++) {
                if (param.substring(i, i + 1).equals(comparator.get(j))) {
                    encryptedParam = encryptedParam + substitution.get(j);
                }
            }
        }

        return encryptedParam;
    }

    /**
     * This method deencrypts the two-step encrypted user data
     *
     * @param param the parameter do deencrypt
     * @param key the keyword used on the encryption
     * @return returns the deencrypted parameter
     */
    public static String deEncryptData(String param, String key) {
        String deEncryptedParam = "";
        int cont = 0;

        List<String> abecedary = new ArrayList<>();
        List<String> substitution = new ArrayList<>();
        List<String> comparator = new ArrayList<>();

        for (int i = 0; i < ABC.length(); i++) {
            abecedary.add(ABC.substring(i, i + 1));
            comparator.add(ABC.substring(i, i + 1));
        }

        for (int i = cont; i < key.length(); i++) {
            substitution.add(key.substring(i, i + 1));
            cont++;
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
            for (int j = 0; j < substitution.size(); j++) {
                if (param.substring(i, i + 1).equals(substitution.get(j))) {
                    deEncryptedParam = deEncryptedParam + comparator.get(j);
                }
            }
        }
        return deEncryptedParam;
    }

    /**
     * Method that takes a char array and converts it into a String
     *
     * @param chars the array received
     * @return returns the converted String
     */
    public static String assemblePassword(char[] chars) {
        String string = "";

        for (int i = 0; i < chars.length; i++) {
            string = string + chars[i];
        }
        return string;
    }

    public static String randomCipher() {

        Random r = new Random();
        int Low = 4;
        int High = 8;
        int nCaractersOfCipher = r.nextInt(High - Low) + Low;
        
        String cipher = "";

        for (int i = 0; i < nCaractersOfCipher; i++) {

            Random ra = new Random();
            int Low2 = 0;
            int High2 = 80;
            int indexOfAbc = ra.nextInt(High2 - Low2) + Low2;
            
            cipher += ABC.substring(indexOfAbc, indexOfAbc +1);
            

        }
      
        return cipher;
        
    }

}
