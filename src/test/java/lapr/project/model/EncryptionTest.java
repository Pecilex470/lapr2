///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lapr.project.model;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Pedro
// */
//public class EncryptionTest {
//
//    public EncryptionTest() {
//    }
//
//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getShift method, of class Encryption.
//     */
//    @Test
//    public void testGetShift() {
//        System.out.println("getShift");
//        Encryption instance = new Encryption();
//        int expResult = 0;
//        int result = instance.getShift();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setShift method, of class Encryption.
//     */
//    @Test
//    public void testSetShift() {
//        System.out.println("setShift");
//        int shift = 0;
//        Encryption instance = new Encryption();
//        instance.setShift(shift);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUser method, of class Encryption.
//     */
//    @Test
//    public void testGetUser() {
//        System.out.println("getUser");
//        Encryption instance = new Encryption();
//        User expResult = null;
//        User result = instance.getUser();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setUser method, of class Encryption.
//     */
//    @Test
//    public void testSetUser() {
//        System.out.println("setUser");
//        User user = null;
//        Encryption instance = new Encryption();
//        instance.setUser(user);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getKeyword method, of class Encryption.
//     */
//    @Test
//    public void testGetKeyword() {
//        System.out.println("getKeyword");
//        Encryption instance = new Encryption();
//        String expResult = "";
//        String result = instance.getKeyword();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setKeyword method, of class Encryption.
//     */
//    @Test
//    public void testSetKeyword() {
//        System.out.println("setKeyword");
//        String keyword = "";
//        Encryption instance = new Encryption();
//        instance.setKeyword(keyword);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of encryptPassword method, of class Encryption.
//     */
//    @Test
//    public void testEncryptPassword() {
//        System.out.println("encryptPassword");
//        String password = "";
//        int num = 0;
//        String abc = "";
//        String expResult = "";
//        String result = Encryption.encryptPassword(password, num, abc);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deEncryptPassword method, of class Encryption.
//     */
//    @Test
//    public void testDeEncryptPassword() {
//        System.out.println("deEncryptPassword");
//        String password = "";
//        int num = 0;
//        String abc = "";
//        String expResult = "";
//        String result = Encryption.deEncryptPassword(password, num, abc);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of encryptData method, of class Encryption.
//     */
//    @Test
//    public void testEncryptData() {
//        System.out.println("encryptData");
//        String param = "";
//        String key = "";
//        String expResult = "";
//        String result = Encryption.encryptData(param, key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deEncryptData method, of class Encryption.
//     */
//    @Test
//    public void testDeEncryptData() {
//        System.out.println("deEncryptData");
//        String param = "";
//        String key = "";
//        String expResult = "";
//        String result = Encryption.deEncryptData(param, key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of assemblePassword method, of class Encryption.
//     */
//    @Test
//    public void testAssemblePassword() {
//        System.out.println("assemblePassword");
//        char[] chars = null;
//        String expResult = "";
//        String result = Encryption.assemblePassword(chars);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//}
