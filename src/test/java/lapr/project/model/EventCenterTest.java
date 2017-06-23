/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.register.ApplicationList;
import lapr.project.model.register.EncryptionRegister;
import lapr.project.model.register.EventRegister;
import lapr.project.model.register.FAEList;
import lapr.project.model.register.OrganizerList;
import lapr.project.model.register.RepresentativeRegister;
import lapr.project.model.register.UserRegister;
import lapr.project.utils.CustomDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Utilizador
 */
public class EventCenterTest {
//    private Event e;
//    private Application ap;
//    private User u;
//    private User u1;
//    private User u2;
//    private FAEList faeList;
//    private OrganizerList organizerList;
//    private ApplicationList applicationList;
//    private List<Organizer> organizerL;
//    private List<FAE> faeL;
//    private List<Keyword> keywords;
//    private EventRegister ever; 
//    private UserRegister userr; 
//    private RepresentativeRegister reprer;
//    private EncryptionRegister encrypr;
//    private EventRegister eventRegister;
//    private List<Event> er;
//    private List<User> ur;
//    private List<Representative> rr;
//    private List<Encryption> enr;
//    private UserRegister userRegister; 
//    private RepresentativeRegister representativeRegister;
//    private EncryptionRegister encryptionRegister; 
//    public EventCenterTest() {
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
//        er = new ArrayList<>();
//        ur = new ArrayList<>();
//        rr = new ArrayList<>();
//        enr = new ArrayList<>();
//        faeL= new ArrayList<>();
//        organizerL = new ArrayList<>();
//        
//        eventRegister = new EventRegister(er);
//        
//         String name = Encryption.encryptData("Pedro Miller Brandão Pinho", "zebras");
//        name = Encryption.encryptPassword(name, 6, Encryption.ABC);
//
//        String email = Encryption.encryptData("pedro.miller.pinho@gmail.com", "zebras");
//        email = Encryption.encryptPassword(email, 6, Encryption.ABC);
//
//        String password = Encryption.encryptPassword("Pm-10", 6, Encryption.ABC);
//
//        this.u = new User(name, email, "admin", password, true, true);
//        
//        String name1 = Encryption.encryptData("ProfessorOak", "zebras");
//        name1 = Encryption.encryptPassword(name1, 6, Encryption.ABC);
//
//        String email1 = Encryption.encryptData("professor.oak@gmail.com", "zebras");
//        email1 = Encryption.encryptPassword(email1, 6, Encryption.ABC);
//
//        String password1 = Encryption.encryptPassword("Pm-10", 6, Encryption.ABC);
//
//        u1 = new User(name1, email1, "admin", password1, true, true);
//        
//        
//        String name2 = Encryption.encryptData("ProfessorElm", "zebras");
//        name2 = Encryption.encryptPassword(name2, 6, Encryption.ABC);
//
//        String email2 = Encryption.encryptData("professor.Elm@gmail.com", "zebras");
//        email2 = Encryption.encryptPassword(email2, 6, Encryption.ABC);
//
//        String password2 = Encryption.encryptPassword("Pm-10", 6, Encryption.ABC);
//        
//        u2 = new User(name2, email2, "admin", password2, true, true); 
//        faeL.add(new FAE(u1));
//        this.faeList = new FAEList(faeL);
//        
//        this.organizerList = new OrganizerList(new ArrayList<>());
//        organizerList.addOrganizer(new Organizer(u2));
//        organizerL.add(new Organizer(u2));
//        this.organizerList = new OrganizerList(organizerL);
//        
//        this.applicationList = new ApplicationList(new ArrayList<>());
//        applicationList.addApplication(new Application());
//        
//        e = new Event("Bolo do Caco Festival", "Madeira", "A nice bolo do caco event", new CustomDate(13, 11, 2017), new CustomDate(14, 11, 2017), new CustomDate(20, 6, 2017), new CustomDate(8, 10, 2017), "congress", faeList, organizerList, 300);
//        
//        
//        this.keywords = new ArrayList<>();
//        keywords.add(new Keyword("Cake"));
//        keywords.add(new Keyword("Sweet"));
//        ap = new Application("Test application", keywords, "FoodInc", u , 15, 30);
//        
//        e.addApplication(ap);
//        
//        
//        EventCenter ec = new EventCenter(eventRegister, userr, reprer, encrypr);
//       
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getEventRegister method, of class EventCenter.
//     */
//    @Test
//    public void testGetEventRegister() {
//        System.out.println("getEventRegister");
//        EventCenter instance = new EventCenter();
//        EventRegister expResult = null;
//        EventRegister result = instance.getEventRegister();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUserRegister method, of class EventCenter.
//     */
//    @Test
//    public void testGetUserRegister() {
//        System.out.println("getUserRegister");
//        EventCenter instance = new EventCenter();
//        UserRegister expResult = null;
//        UserRegister result = instance.getUserRegister();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRepresentativeRegister method, of class EventCenter.
//     */
//    @Test
//    public void testGetRepresentativeRegister() {
//        System.out.println("getRepresentativeRegister");
//        EventCenter instance = new EventCenter();
//        RepresentativeRegister expResult = null;
//        RepresentativeRegister result = instance.getRepresentativeRegister();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEncryptionRegister method, of class EventCenter.
//     */
//    @Test
//    public void testGetEncryptionRegister() {
//        System.out.println("getEncryptionRegister");
//        EventCenter instance = new EventCenter();
//        EncryptionRegister expResult = null;
//        EncryptionRegister result = instance.getEncryptionRegister();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEventRegister method, of class EventCenter.
//     */
//    @Test
//    public void testSetEventRegister() {
//        System.out.println("setEventRegister");
//        EventRegister er = null;
//        EventCenter instance = new EventCenter();
//        instance.setEventRegister(er);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setUserRegister method, of class EventCenter.
//     */
//    @Test
//    public void testSetUserRegister() {
//        System.out.println("setUserRegister");
//        UserRegister ur = null;
//        EventCenter instance = new EventCenter();
//        instance.setUserRegister(ur);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setRepresentativeList method, of class EventCenter.
//     */
//    @Test
//    public void testSetRepresentativeList() {
//        System.out.println("setRepresentativeList");
//        RepresentativeRegister rr = null;
//        EventCenter instance = new EventCenter();
//        instance.setRepresentativeList(rr);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEncryptionRegister method, of class EventCenter.
//     */
//    @Test
//    public void testSetEncryptionRegister() {
//        System.out.println("setEncryptionRegister");
//        EncryptionRegister enr = null;
//        EventCenter instance = new EventCenter();
//        instance.setEncryptionRegister(enr);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getGlobalAcceptanceRate method, of class EventCenter.
//     */
//    @Test
//    public void testGetGlobalAcceptanceRate() {
//        System.out.println("getGlobalAcceptanceRate");
//        EventCenter instance = new EventCenter();
//        double expResult = 0.0;
//        double result = instance.getGlobalAcceptanceRate();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEventsWhereUserIsFAE method, of class EventCenter.
//     */
//    @Test
//    public void testGetEventsWhereUserIsFAE() {
//        System.out.println("getEventsWhereUserIsFAE");
//        User u = null;
//        EventCenter instance = new EventCenter();
//        List<Event> expResult = null;
//        List<Event> result = instance.getEventsWhereUserIsFAE(u);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEventsWhereUserIsOrganizer method, of class EventCenter.
//     */
//    @Test
//    public void testGetEventsWhereUserIsOrganizer() {
//        System.out.println("getEventsWhereUserIsOrganizer");
//        User u = null;
//        EventCenter instance = new EventCenter();
//        List<Event> expResult = null;
//        List<Event> result = instance.getEventsWhereUserIsOrganizer(u);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkIFUserIsFAE method, of class EventCenter.
//     */
//    @Test
//    public void testCheckIFUserIsFAE() {
//        System.out.println("checkIFUserIsFAE");
//        User u = null;
//        EventCenter instance = new EventCenter();
//        boolean expResult = false;
//        boolean result = instance.checkIFUserIsFAE(u);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkIFUserIsOrganizer method, of class EventCenter.
//     */
//    @Test
//    public void testCheckIFUserIsOrganizer() {
//        System.out.println("checkIFUserIsOrganizer");
//        User u = null;
//        EventCenter instance = new EventCenter();
//        boolean expResult = false;
//        boolean result = instance.checkIFUserIsOrganizer(u);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllFAE method, of class EventCenter.
//     */
//    @Test
//    public void testGetAllFAE() {
//        System.out.println("getAllFAE");
//        EventCenter instance = new EventCenter();
//        List<FAE> expResult = null;
//        List<FAE> result = instance.getAllFAE();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFAEEvaluatedApplications method, of class EventCenter.
//     */
//    @Test
//    public void testGetFAEEvaluatedApplications() {
//        System.out.println("getFAEEvaluatedApplications");
//        EventCenter instance = new EventCenter();
//        List<FAE> expResult = null;
//        List<FAE> result = instance.getFAEEvaluatedApplications();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEvaluatedApplicationsFAE method, of class EventCenter.
//     */
//    @Test
//    public void testGetEvaluatedApplicationsFAE() {
//        System.out.println("getEvaluatedApplicationsFAE");
//        String fae = "";
//        EventCenter instance = new EventCenter();
//        List<Decision> expResult = null;
//        List<Decision> result = instance.getEvaluatedApplicationsFAE(fae);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllDecisions method, of class EventCenter.
//     */
//    @Test
//    public void testGetAllDecisions() {
//        System.out.println("getAllDecisions");
//        EventCenter instance = new EventCenter();
//        List<Decision> expResult = null;
//        List<Decision> result = instance.getAllDecisions();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMeanRatingF method, of class EventCenter.
//     */
//    @Test
//    public void testGetMeanRatingF() {
//        System.out.println("getMeanRatingF");
//        String fae = "";
//        EventCenter instance = new EventCenter();
//        double expResult = 0.0;
//        double result = instance.getMeanRatingF(fae);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getStandardDeviation method, of class EventCenter.
//     */
//    @Test
//    public void testGetStandardDeviation() {
//        System.out.println("getStandardDeviation");
//        String fae = "";
//        EventCenter instance = new EventCenter();
//        double expResult = 0.0;
//        double result = instance.getStandardDeviation(fae);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getGlobalMeanRate method, of class EventCenter.
//     */
//    @Test
//    public void testGetGlobalMeanRate() {
//        System.out.println("getGlobalMeanRate");
//        EventCenter instance = new EventCenter();
//        double expResult = 0.0;
//        double result = instance.getGlobalMeanRate();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMeanDeviation method, of class EventCenter.
//     */
//    @Test
//    public void testGetMeanDeviation() {
//        System.out.println("getMeanDeviation");
//        String fae = "";
//        EventCenter instance = new EventCenter();
//        double expResult = 0.0;
//        double result = instance.getMeanDeviation(fae);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getZ method, of class EventCenter.
//     */
//    @Test
//    public void testGetZ() {
//        System.out.println("getZ");
//        FAE fae = null;
//        EventCenter instance = new EventCenter();
//        double expResult = 0.0;
//        double result = instance.getZ(fae);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getZ2MeanDeviations method, of class EventCenter.
//     */
//    @Test
//    public void testGetZ2MeanDeviations() {
//        System.out.println("getZ2MeanDeviations");
//        FAE e = null;
//        FAE fae = null;
//        EventCenter instance = new EventCenter();
//        double expResult = 0.0;
//        double result = instance.getZ2MeanDeviations(e, fae);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of testTheDifferenceBetweenTheMeanDeviationAndATheoreticalValue1ForAFAEAverageRating method, of class EventCenter.
//     */
//    @Test
//    public void testTestTheDifferenceBetweenTheMeanDeviationAndATheoreticalValue1ForAFAEAverageRating() {
//        System.out.println("testTheDifferenceBetweenTheMeanDeviationAndATheoreticalValue1ForAFAEAverageRating");
//        String a = "";
//        FAE f = null;
//        EventCenter instance = new EventCenter();
//        String expResult = "";
//        String result = instance.testTheDifferenceBetweenTheMeanDeviationAndATheoreticalValue1ForAFAEAverageRating(a, f);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of testingTheDifferenceBetweenTwoFAEsMeanDeviations method, of class EventCenter.
//     */
//    @Test
//    public void testTestingTheDifferenceBetweenTwoFAEsMeanDeviations() {
//        System.out.println("testingTheDifferenceBetweenTwoFAEsMeanDeviations");
//        FAE e = null;
//        FAE fae = null;
//        String a = "";
//        EventCenter instance = new EventCenter();
//        String expResult = "";
//        String result = instance.testingTheDifferenceBetweenTwoFAEsMeanDeviations(e, fae, a);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of zC method, of class EventCenter.
//     */
//    @Test
//    public void testZC() {
//        System.out.println("zC");
//        String a = "";
//        EventCenter instance = new EventCenter();
//        double expResult = 0.0;
//        double result = instance.zC(a);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of keywordFrequency method, of class EventCenter.
//     */
//    @Test
//    public void testKeywordFrequency() {
//        System.out.println("keywordFrequency");
//        EventCenter instance = new EventCenter();
//        Object[][] expResult = null;
//        Object[][] result = instance.keywordFrequency();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
