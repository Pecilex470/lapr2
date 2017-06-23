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
public class DecisionTest {
    
    private Decision dec;
    
    public DecisionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.dec = new Decision(true, "nice", 5, 5, 5, 5, "username");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of decisionApplication method, of class Decision.
     */
    @Test
    public void testDecisionApplication() {
        System.out.println("decisionApplication");
        Decision instance = dec;
        boolean expResult = true;
        boolean result = instance.decisionApplication();
        assertEquals(expResult, result);
    }

    /**
     * Test of getJustification method, of class Decision.
     */
    @Test
    public void testGetJustification() {
        System.out.println("getJustification");
        Decision instance = dec;
        String expResult = "nice";
        String result = instance.getJustification();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDecision method, of class Decision.
     */
    @Test
    public void testSetDecision() {
        System.out.println("setDecision");
        boolean decision = true;
        Decision instance = dec;
        instance.setDecision(decision);
    }

    /**
     * Test of setJustificacao method, of class Decision.
     */
    @Test
    public void testSetJustificacao() {
        System.out.println("setJustificacao");
        String justification = "nice";
        Decision instance = dec;
        instance.setJustificacao(justification);
    }

    /**
     * Test of getMeanRating method, of class Decision.
     */
//    @Test
//    public void testGetMeanRating() {
//        System.out.println("getMeanRating");
//        Decision instance = dec;
//        double expResult = 0.0;
//        double result = instance.getMeanRating();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setKnowledge method, of class Decision.
     */
    @Test
    public void testSetKnowledge() {
        System.out.println("setKnowledge");
        int know = 5;
        Decision instance = dec;
        instance.setKnowledge(know);
    }

    /**
     * Test of setAdequancy method, of class Decision.
     */
    @Test
    public void testSetAdequancy() {
        System.out.println("setAdequancy");
        int ade = 5;
        Decision instance = dec;
        instance.setAdequancy(ade);
    }

    /**
     * Test of setOverall method, of class Decision.
     */
    @Test
    public void testSetOverall() {
        System.out.println("setOverall");
        int ove = 5;
        Decision instance = dec;
        instance.setOverall(ove);
    }

    /**
     * Test of setQuantity method, of class Decision.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int qua = 5;
        Decision instance = dec;
        instance.setQuantity(qua);
    }

    /**
     * Test of getFaeUsername method, of class Decision.
     */
    @Test
    public void testGetFaeUsername() {
        System.out.println("getFaeUsername");
        Decision instance = dec;
        String expResult = "username";
        String result = instance.getFaeUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFaeUsername method, of class Decision.
     */
    @Test
    public void testSetFaeUsername() {
        System.out.println("setFaeUsername");
        String username = "username";
        Decision instance = dec;
        instance.setFaeUsername(username);
    }
    
}
