/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;
import lapr.project.model.EventCenter;
 
/**
 *
 * @author Cerqueira
 */
public class ExportData {
 
    private static final String ERROR = "ERROR";
 
    private static final String ENCRYPTION_ALG = "AES";
    static String fileName = "LoadData.bin";
 
    private ExportData() {
        throw new IllegalStateException("Utility class");
    }
 
    //use to close the program
    public static void serialization(EventCenter ec) throws FileNotFoundException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {

            KeyGenerator generator = KeyGenerator.getInstance(ENCRYPTION_ALG);
            SecretKey sKey = generator.generateKey();
 
            Cipher c = Cipher.getInstance(ENCRYPTION_ALG);
 
            c.init(Cipher.ENCRYPT_MODE, sKey);
 
            SealedObject so = new SealedObject(ec, c);
 
            out.writeObject(sKey);
            out.writeObject(so);
 
        } catch (Exception e) {
            e.printStackTrace(new PrintWriter(new File("log.txt")));
            JOptionPane.showMessageDialog(null, ERROR);
        }
 
    }
 
    public static EventCenter deserialization() throws FileNotFoundException {
        EventCenter ec = null;
 
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {

            SecretKey sKey = (SecretKey) in.readObject();
 
            Cipher c = Cipher.getInstance(ENCRYPTION_ALG);
 
            c.init(Cipher.DECRYPT_MODE, sKey);
 
            SealedObject so = (SealedObject) in.readObject();
 
            ec = (EventCenter) so.getObject(sKey);
 
        } catch (Exception e) {
            e.printStackTrace(new PrintWriter(new File("log.txt")));
            JOptionPane.showMessageDialog(null, ERROR);
        }
        return ec;
    }
 
}