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
public class StandTest {
    
    private Stand s;
    
    public StandTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        s = new Stand(20, "test");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getArea method, of class Stand.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Stand instance = s;
        int expResult = 20;
        int result = instance.getArea();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAvailable method, of class Stand.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        Stand instance = s;
        boolean expResult = true;
        boolean result = instance.getAvailable();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAvailable method, of class Stand.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        boolean available = true;
        Stand instance = s;
        instance.setAvailable(available);
    }

    /**
     * Test of setArea method, of class Stand.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        int area = 20;
        Stand instance = s;
        instance.setArea(area);
    }

    /**
     * Test of setDescription method, of class Stand.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String des = "test";
        Stand instance = s;
        instance.setDescription(des);
    }

    /**
     * Test of getDescription method, of class Stand.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Stand instance = s;
        String expResult = "test";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }
    
}
