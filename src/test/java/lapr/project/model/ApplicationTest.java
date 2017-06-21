package lapr.project.model;



import java.util.List;
import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Class to demonstrate a Candidatura simple example.
 *
 * @author Nuno Bettencourt [nmb@isep.ipp.pt] on 29/05/16.
 */
public class ApplicationTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getDescription method, of class Application.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Application instance = new Application();
        String expResult = "teste";
        instance.setDescription("teste");
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepresentative method, of class Application.
     */
    @Test
    public void testGetRepresentative() {
        System.out.println("getRepresentative");
        Application instance = new Application();
        User expResult = null;
        User result = instance.getRepresentative();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addKeyword method, of class Application.
     */
    @Test
    public void testAddKeyword() {
        System.out.println("addKeyword");
        Keyword keyword = null;
        Application instance = new Application();
        instance.addKeyword(keyword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKeywordList method, of class Application.
     */
    @Test
    public void testGetKeywordList() {
        System.out.println("getKeywordList");
        Application instance = new Application();
        List<Keyword> expResult = null;
        List<Keyword> result = instance.getKeywordList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Application.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Application instance = new Application();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Application.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Application instance = new Application();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubmissionMeanRating method, of class Application.
     */
    @Test
    public void testGetSubmissionMeanRating() {
        System.out.println("getSubmissionMeanRating");
        Application instance = new Application();
        int expResult = 0;
        int result = instance.getSubmissionMeanRating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDecision method, of class Application.
     */
    @Test
    public void testGetDecision() {
        System.out.println("getDecision");
        Application instance = new Application();
        int expResult = 0;
        int result = instance.getDecision();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompanyName method, of class Application.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        Application instance = new Application();
        String expResult = "";
        String result = instance.getCompanyName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfDecisions method, of class Application.
     */
    @Test
    public void testGetNumberOfDecisions() {
        System.out.println("getNumberOfDecisions");
        Application instance = new Application();
        int expResult = 0;
        int result = instance.getNumberOfDecisions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubmissionMeanRating method, of class Application.
     */
    @Test
    public void testSetSubmissionMeanRating() {
        System.out.println("setSubmissionMeanRating");
        int value = 0;
        Application instance = new Application();
        instance.setSubmissionMeanRating(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDecision method, of class Application.
     */
    @Test
    public void testSetDecision() {
        System.out.println("setDecision");
        int dec = 0;
        Application instance = new Application();
        instance.setDecision(dec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfDecisions method, of class Application.
     */
    @Test
    public void testSetNumberOfDecisions() {
        System.out.println("setNumberOfDecisions");
        int num = 0;
        Application instance = new Application();
        instance.setNumberOfDecisions(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKeywordList method, of class Application.
     */
    @Test
    public void testSetKeywordList() {
        System.out.println("setKeywordList");
        List<Keyword> keywordList = null;
        Application instance = new Application();
        instance.setKeywordList(keywordList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Application.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Application instance = new Application();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompanyName method, of class Application.
     */
    @Test
    public void testSetCompanyName() {
        System.out.println("setCompanyName");
        String companyName = "";
        Application instance = new Application();
        instance.setCompanyName(companyName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRepresentative method, of class Application.
     */
    @Test
    public void testSetRepresentative() {
        System.out.println("setRepresentative");
        User representative = null;
        Application instance = new Application();
        instance.setRepresentative(representative);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBoothArea method, of class Application.
     */
    @Test
    public void testSetBoothArea() {
        System.out.println("setBoothArea");
        int area = 0;
        Application instance = new Application();
        instance.setBoothArea(area);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInvitesQuantity method, of class Application.
     */
    @Test
    public void testSetInvitesQuantity() {
        System.out.println("setInvitesQuantity");
        int invitesQuantity = 0;
        Application instance = new Application();
        instance.setInvitesQuantity(invitesQuantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoothArea method, of class Application.
     */
    @Test
    public void testGetBoothArea() {
        System.out.println("getBoothArea");
        Application instance = new Application();
        int expResult = 0;
        int result = instance.getBoothArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInvitesQuantity method, of class Application.
     */
    @Test
    public void testGetInvitesQuantity() {
        System.out.println("getInvitesQuantity");
        Application instance = new Application();
        int expResult = 0;
        int result = instance.getInvitesQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Application.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Application instance = new Application();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDecisionList method, of class Application.
     */
    @Test
    public void testSetDecisionList() {
        System.out.println("setDecisionList");
        List<Decision> readReviews = null;
        Application instance = new Application();
        instance.setDecisionList(readReviews);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


}