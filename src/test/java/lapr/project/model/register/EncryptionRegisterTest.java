/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model.register;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Encryption;
import lapr.project.model.User;
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
public class EncryptionRegisterTest {
    
    private EncryptionRegister enr;
    private List<Encryption> encryptions;
    private User u;
    private Encryption e;
    
    public EncryptionRegisterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.encryptions = new ArrayList<>();
        this.enr = new EncryptionRegister(encryptions);
        this.u = new User();
        this.e = new Encryption(6, u, "zebras");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEncryptionList method, of class EncryptionRegister.
     */
    @Test
    public void testGetEncryptionList() {
        System.out.println("getEncryptionList");
        EncryptionRegister instance = enr;
        List<Encryption> expResult = encryptions;
        List<Encryption> result = instance.getEncryptionList();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEncryptionList method, of class EncryptionRegister.
     */
    @Test
    public void testSetEncryptionList() {
        System.out.println("setEncryptionList");
        List<Encryption> encryptionList = encryptions;
        EncryptionRegister instance = enr;
        instance.setEncryptionList(encryptionList);
    }

    /**
     * Test of addEncryption method, of class EncryptionRegister.
     */
    @Test
    public void testAddEncryption() {
        System.out.println("addEncryption");
        Encryption e = new Encryption(6, new User(), "zebras");
        EncryptionRegister instance = enr;
        instance.addEncryption(e);
    }

    /**
     * Test of getEncryptionByUser method, of class EncryptionRegister.
     */
    @Test
    public void testGetEncryptionByUser() {
        System.out.println("getEncryptionByUser");
        User user = u;
        EncryptionRegister instance = enr;
        Encryption expResult = instance.getEncryptionByUser(user);
        Encryption result = instance.getEncryptionByUser(user);
        assertEquals(expResult, result);
    }
    
}
