package lapr.project.model;



import java.util.ArrayList;
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
    
    private Application a;

    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        List<Keyword> l = new ArrayList<>();
        l.add(new Keyword("abc"));
        l.add(new Keyword("def"));
        User u = new User("joao", "joao@hotmail.com", "joao", "password", true, true);
        this.a = new Application("hi there", l, "google", u, 50, 12);
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
        Application instance = a;
        String expResult = "hi there";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRepresentative method, of class Application.
     */
    @Test
    public void testGetRepresentative() {
        System.out.println("getRepresentative");
        Application instance = a;
        User expResult = a.getRepresentative();
        User result = instance.getRepresentative();
        assertEquals(expResult, result);

    }

    /**
     * Test of addKeyword method, of class Application.
     */
    @Test
    public void testAddKeyword() {
        System.out.println("addKeyword");
        Keyword keyword = new Keyword("lol");
        Application instance = a;
        instance.addKeyword(keyword);

    }

    /**
     * Test of getKeywordList method, of class Application.
     */
    @Test
    public void testGetKeywordList() {
        System.out.println("getKeywordList");
        Application instance = a;
        List<Keyword> expResult = a.getKeywordList();
        List<Keyword> result = instance.getKeywordList();
        assertEquals(expResult, result);

    }

    /**
     * Test of hashCode method, of class Application.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Application instance = a;
        int expResult = a.hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Application.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = a;
        Application instance =a ;
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of getSubmissionMeanRating method, of class Application.
     */
    @Test
    public void testGetSubmissionMeanRating() {
        System.out.println("getSubmissionMeanRating");
        Application instance = a;
        int expResult = a.getSubmissionMeanRating();
        int result = instance.getSubmissionMeanRating();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDecision method, of class Application.
     */
    @Test
    public void testGetDecisionStatus() {
        System.out.println("getDecision");
        Application instance = a;
        int expResult = a.getDecisionStatus();
        int result = instance.getDecisionStatus();
        assertEquals(expResult, result);

    }

    /**
     * Test of getCompanyName method, of class Application.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        Application instance = a;
        String expResult = a.getCompanyName();
        String result = instance.getCompanyName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getNumberOfDecisions method, of class Application.
     */
    @Test
    public void testGetNumberOfDecisions() {
        System.out.println("getNumberOfDecisions");
        Application instance = a;
        int expResult = a.getNumberOfDecisions();
        int result = instance.getNumberOfDecisions();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSubmissionMeanRating method, of class Application.
     */
    @Test
    public void testSetSubmissionMeanRating() {
        System.out.println("setSubmissionMeanRating");
        int value = 12;
        Application instance = a;
        instance.setSubmissionMeanRating(value);

    }

    /**
     * Test of setDecision method, of class Application.
     */
    @Test
    public void testSetDecisionStatus() {
        System.out.println("setDecision");
        int dec = 1;
        Application instance = a;
        instance.setDecisionStatus(dec);

    }

    /**
     * Test of setNumberOfDecisions method, of class Application.
     */
    @Test
    public void testSetNumberOfDecisions() {
        System.out.println("setNumberOfDecisions");
        int num = 5;
        Application instance = a;
        instance.setNumberOfDecisions(num);

    }

    /**
     * Test of setKeywordList method, of class Application.
     */
    @Test
    public void testSetKeywordList() {
        System.out.println("setKeywordList");
        List<Keyword> keywordList = a.getKeywordList();
        Application instance = a;
        instance.setKeywordList(keywordList);

    }

    /**
     * Test of setDescription method, of class Application.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "descriçao";
        Application instance = a;
        instance.setDescription(description);

    }

    /**
     * Test of setCompanyName method, of class Application.
     */
    @Test
    public void testSetCompanyName() {
        System.out.println("setCompanyName");
        String companyName = "copanhia";
        Application instance = a;
        instance.setCompanyName(companyName);

    }

    /**
     * Test of setRepresentative method, of class Application.
     */
    @Test
    public void testSetRepresentative() {
        System.out.println("setRepresentative");
        User representative = a.getRepresentative();
        Application instance = a;
        instance.setRepresentative(representative);
     
    }

    /**
     * Test of setBoothArea method, of class Application.
     */
    @Test
    public void testSetBoothArea() {
        System.out.println("setBoothArea");
        int area = 40;
        Application instance = a;
        instance.setBoothArea(area);

    }

    /**
     * Test of setInvitesQuantity method, of class Application.
     */
    @Test
    public void testSetInvitesQuantity() {
        System.out.println("setInvitesQuantity");
        int invitesQuantity = 20;
        Application instance = a;
        instance.setInvitesQuantity(invitesQuantity);

    }

    /**
     * Test of getBoothArea method, of class Application.
     */
    @Test
    public void testGetBoothArea() {
        System.out.println("getBoothArea");
        Application instance = a;
        int expResult = a.getBoothArea();
        int result = instance.getBoothArea();
        assertEquals(expResult, result);

    }

    /**
     * Test of getInvitesQuantity method, of class Application.
     */
    @Test
    public void testGetInvitesQuantity() {
        System.out.println("getInvitesQuantity");
        Application instance = a;
        int expResult = a.getInvitesQuantity();
        int result = instance.getInvitesQuantity();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Application.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Application instance = a;
        String expResult = a.toString();
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDecisionList method, of class Application.
     */
    @Test
    public void testSetDecisionList() {
        System.out.println("setDecisionList");
        List<Decision> readReviews = new ArrayList<>();
        Application instance = a;
        instance.setDecisionList(readReviews);
 
    }


}