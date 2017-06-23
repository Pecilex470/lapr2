/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro
 */
public class EncryptionTest {

    private User u;

    public EncryptionTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        String name = Encryption.encryptData("Pedro Miller Brandão Pinho", "zebras");
        name = Encryption.encryptPassword(name, 6, Encryption.ABC);

        String email = Encryption.encryptData("pedro.miller.pinho@gmail.com", "zebras");
        email = Encryption.encryptPassword(email, 6, Encryption.ABC);

        String password = Encryption.encryptPassword("Pm-10", 6, Encryption.ABC);

        this.u = new User(name, email, "admin", password, true, true);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getShift method, of class Encryption.
     */
    @Test
    public void testGetShift() {
        System.out.println("getShift");
        Encryption instance = new Encryption(6, u, "zebras");
        int expResult = 6;
        int result = instance.getShift();
        assertEquals(expResult, result);
    }

    /**
     * Test of setShift method, of class Encryption.
     */
    @Test
    public void testSetShift() {
        System.out.println("setShift");
        int shift = 0;
        Encryption instance = new Encryption(6, u, "zebras");
        instance.setShift(shift);
    }

    /**
     * Test of getUser method, of class Encryption.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Encryption instance = new Encryption(6, u, "zebras");
        User expResult = u;
        User result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser method, of class Encryption.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = u;
        Encryption instance = new Encryption();
        instance.setUser(user);
    }

    /**
     * Test of getKeyword method, of class Encryption.
     */
    @Test
    public void testGetKeyword() {
        System.out.println("getKeyword");
        Encryption instance = new Encryption(6, u, "zebras");
        String expResult = "zebras";
        String result = instance.getKeyword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setKeyword method, of class Encryption.
     */
    @Test
    public void testSetKeyword() {
        System.out.println("setKeyword");
        String keyword = "hello";
        Encryption instance = new Encryption(6, u, "zebras");
        instance.setKeyword(keyword);
    }

    /**
     * Test of encryptPassword method, of class Encryption.
     */
    @Test
    public void testEncryptPassword() {
        System.out.println("encryptPassword");
        String password = "Pm-10";
        int num = 1;
        String abc = Encryption.ABC;
        String expResult = "Ol:Z9";
        String result = Encryption.encryptPassword(password, num, abc);
        assertEquals(expResult, result);
    }

    /**
     * Test of deEncryptPassword method, of class Encryption.
     */
    @Test
    public void testDeEncryptPassword() {
        System.out.println("deEncryptPassword");
        String password = "Ol:Z9";
        int num = 1;
        String abc = Encryption.ABC;
        String expResult = "Pm-10";
        String result = Encryption.deEncryptPassword(password, num, abc);
        assertEquals(expResult, result);
    }

    /**
     * Test of encryptData method, of class Encryption.
     */
    @Test
    public void testEncryptData() {
        System.out.println("encryptData");
        String param = "Pedro Miller Brandão Pinho";
        String key = "zebras";
        String expResult = "PsaolzMfiisozBoekaãlzPfkdl";
        String result = Encryption.encryptData(param, key);
        assertEquals(expResult, result);
    }

    /**
     * Test of deEncryptData method, of class Encryption.
     */
    @Test
    public void testDeEncryptData() {
        System.out.println("deEncryptData");
        String param = "PsaolzMfiisozBoekaãlzPfkdl";
        String key = "zebras";
        String expResult = "Pedro Miller Brandão Pinho";
        String result = Encryption.deEncryptData(param, key);
        assertEquals(expResult, result);
    }

    /**
     * Test of assemblePassword method, of class Encryption.
     */
    @Test
    public void testAssemblePassword() {
        System.out.println("assemblePassword");
        char[] chars = {'a', 'b', 'c', 'd'};
        String expResult = "abcd";
        String result = Encryption.assemblePassword(chars);
        assertEquals(expResult, result);
    }

}
