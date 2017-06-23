///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lapr.project.utils;
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
//public class CustomDateTest {
//    
//    public CustomDateTest() {
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
//     * Test of getDay method, of class CustomDate.
//     */
//    @Test
//    public void testGetDay() {
//        System.out.println("getDay");
//        CustomDate instance = null;
//        int expResult = 0;
//        int result = instance.getDay();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMonth method, of class CustomDate.
//     */
//    @Test
//    public void testGetMonth() {
//        System.out.println("getMonth");
//        CustomDate instance = null;
//        int expResult = 0;
//        int result = instance.getMonth();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getYear method, of class CustomDate.
//     */
//    @Test
//    public void testGetYear() {
//        System.out.println("getYear");
//        CustomDate instance = null;
//        int expResult = 0;
//        int result = instance.getYear();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDate method, of class CustomDate.
//     */
//    @Test
//    public void testSetDate() {
//        System.out.println("setDate");
//        int day = 0;
//        int month = 0;
//        int year = 0;
//        CustomDate instance = null;
//        CustomDate expResult = null;
//        CustomDate result = instance.setDate(day, month, year);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCurrentTime method, of class CustomDate.
//     */
//    @Test
//    public void testGetCurrentTime() {
//        System.out.println("getCurrentTime");
//        CustomDate expResult = null;
//        CustomDate result = CustomDate.getCurrentTime();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkSubmissionPeriod method, of class CustomDate.
//     */
//    @Test
//    public void testCheckSubmissionPeriod() {
//        System.out.println("checkSubmissionPeriod");
//        CustomDate minPeriod = null;
//        CustomDate maxPeriod = null;
//        CustomDate instance = null;
//        boolean expResult = false;
//        boolean result = instance.checkSubmissionPeriod(minPeriod, maxPeriod);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of testIfDateIsAfter method, of class CustomDate.
//     */
//    @Test
//    public void testTestIfDateIsAfter() {
//        System.out.println("testIfDateIsAfter");
//        CustomDate minPeriod = null;
//        CustomDate instance = null;
//        boolean expResult = false;
//        boolean result = instance.testIfDateIsAfter(minPeriod);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of testIfDateIsBefore method, of class CustomDate.
//     */
//    @Test
//    public void testTestIfDateIsBefore() {
//        System.out.println("testIfDateIsBefore");
//        CustomDate maxPeriod = null;
//        CustomDate instance = null;
//        boolean expResult = false;
//        boolean result = instance.testIfDateIsBefore(maxPeriod);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
