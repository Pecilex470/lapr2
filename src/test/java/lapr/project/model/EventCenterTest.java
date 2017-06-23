/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
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
//
//    EventCenter ec;
//    User u;
//    FAE f;
//    List<Event> eveFAEIsUser = new ArrayList<>();
//    User u1;
//    Organizer o;
//    List<Event> eveOrgIsUser = new ArrayList<>();
//    Object[][] frequencyMatrix = new Object[5][3];
//
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
//        List<Event> er = new ArrayList<>();
//        List<User> ur = new ArrayList<>();
//        List<Representative> rr = new ArrayList<>();
//        List<Encryption> enr = new ArrayList<>();
//        List<FAE> FAEListEvent = new ArrayList<>();
//        List<Organizer> organizerListEvent = new ArrayList<>();
//        List<Keyword> pokeKeywords = new ArrayList<>();
//        pokeKeywords.add(new Keyword("pikachu"));
//        pokeKeywords.add(new Keyword("abra"));
//        pokeKeywords.add(new Keyword("kadabra"));
//        pokeKeywords.add(new Keyword("snorlax"));
//        pokeKeywords.add(new Keyword("monkey"));
//
//        frequencyMatrix[0][0] = "pikachu";
//        frequencyMatrix[0][1] = "" + 20 + "%";
//        frequencyMatrix[0][2] = "" + 1;
//        frequencyMatrix[1][0] = "abra";
//        frequencyMatrix[1][1] = "" + 20 + "%";
//        frequencyMatrix[1][2] = "" + 1;
//        frequencyMatrix[2][0] = "kadabra";
//        frequencyMatrix[2][1] = "" + 20 + "%";
//        frequencyMatrix[2][2] = "" + 1;
//        frequencyMatrix[3][0] = "snorlax";
//        frequencyMatrix[3][1] = "" + 20 + "%";
//        frequencyMatrix[3][2] = "" + 1;
//        frequencyMatrix[4][0] = "monkey";
//        frequencyMatrix[4][1] = "" + 20 + "%";
//        frequencyMatrix[4][2] = "" + 1;
//
//        Event eve = new Event("Guns and Roses Festival", "Porto", "a musical gathering", new CustomDate(13, 11, 2017), new CustomDate(14, 11, 2017), new CustomDate(20, 6, 2017), new CustomDate(25, 7, 2017), "exibition", new FAEList(FAEListEvent), new OrganizerList(organizerListEvent), 150);
//
//        String name = Encryption.encryptData("Pedro Miller Brandão Pinho", "zebras");
//        name = Encryption.encryptPassword(name, 6, Encryption.ABC);
//
//        String email = Encryption.encryptData("pedro.miller.pinho@gmail.com", "zebras");
//        email = Encryption.encryptPassword(email, 6, Encryption.ABC);
//
//        String password = Encryption.encryptPassword("Pm-10", 6, Encryption.ABC);
//
//        this.u = new User(name, email, "admin", password, true, true);
//
//        this.f = new FAE(u);
//        FAEListEvent.add(f);
//        eveFAEIsUser.add(eve);
//
//        String name1 = Encryption.encryptData("ProfessorOak", "zebras");
//        name = Encryption.encryptPassword(name, 6, Encryption.ABC);
//
//        String email1 = Encryption.encryptData("professor.oak@gmail.com", "zebras");
//        email = Encryption.encryptPassword(email, 6, Encryption.ABC);
//
//        String password1 = Encryption.encryptPassword("Pm-10", 6, Encryption.ABC);
//
//        User oak = new User(name1, email1, "admin", password1, true, true);
//
//        Application app = new Application("Pokemon", pokeKeywords, "PokeCenter", oak, 50, 5);
//        Decision dcPokemon = new Decision(true, "HealMyPokemonVeryGood", 5, 5, 5, 5, f.getName());
//        app.addDecision(dcPokemon);
//        eve.addApplication(app);
//
//        String name2 = Encryption.encryptData("ProfessorElm", "zebras");
//        name = Encryption.encryptPassword(name, 6, Encryption.ABC);
//
//        String email2 = Encryption.encryptData("professor.Elm@gmail.com", "zebras");
//        email = Encryption.encryptPassword(email, 6, Encryption.ABC);
//
//        String password2 = Encryption.encryptPassword("Pm-10", 6, Encryption.ABC);
//
//        this.u1 = new User(name2, email2, "admin", password2, true, true);
//        this.o = new Organizer(u1);
//        organizerListEvent.add(o);
//        eveOrgIsUser.add(eve);
//
//        EventRegister eventRegister = new EventRegister(er);
//        UserRegister userRegister = new UserRegister(ur);
//        RepresentativeRegister representativeRegister = new RepresentativeRegister(rr);
//        EncryptionRegister encryptionRegister = new EncryptionRegister(enr);
//
//        this.ec = new EventCenter(eventRegister, userRegister, representativeRegister, encryptionRegister);
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
//        EventCenter instance = ec;
//        EventRegister expResult = ec.getEventRegister();
//        EventRegister result = instance.getEventRegister();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getUserRegister method, of class EventCenter.
//     */
//    @Test
//    public void testGetUserRegister() {
//        System.out.println("getUserRegister");
//        EventCenter instance = ec;
//        UserRegister expResult = ec.getUserRegister();
//        UserRegister result = instance.getUserRegister();
//        assertEquals(expResult, result);
//
//    }
//
//    /**
//     * Test of getRepresentativeRegister method, of class EventCenter.
//     */
//    @Test
//    public void testGetRepresentativeRegister() {
//        System.out.println("getRepresentativeRegister");
//        EventCenter instance = ec;
//        RepresentativeRegister expResult = ec.getRepresentativeRegister();
//        RepresentativeRegister result = instance.getRepresentativeRegister();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getEncryptionRegister method, of class EventCenter.
//     */
//    @Test
//    public void testGetEncryptionRegister() {
//        System.out.println("getEncryptionRegister");
//        EventCenter instance = ec;
//        EncryptionRegister expResult = new EncryptionRegister(new ArrayList<>());
//        EncryptionRegister result = instance.getEncryptionRegister();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setEventRegister method, of class EventCenter.
//     */
//    @Test
//    public void testSetEventRegister() {
//        System.out.println("setEventRegister");
//        EventRegister er = new EventRegister(new ArrayList<>());
//        EventCenter instance = ec;
//        instance.setEventRegister(er);
//
//    }
//
//    /**
//     * Test of setUserRegister method, of class EventCenter.
//     */
//    @Test
//    public void testSetUserRegister() {
//        System.out.println("setUserRegister");
//        UserRegister ur = new UserRegister(new ArrayList<>());
//        EventCenter instance = ec;
//        instance.setUserRegister(ur);
//
//    }
//
//    /**
//     * Test of setRepresentativeList method, of class EventCenter.
//     */
//    @Test
//    public void testSetRepresentativeList() {
//        System.out.println("setRepresentativeList");
//        RepresentativeRegister rr = new RepresentativeRegister(new ArrayList<>());
//        EventCenter instance = new EventCenter();
//        instance.setRepresentativeList(rr);
//    }
//
//    /**
//     * Test of setEncryptionRegister method, of class EventCenter.
//     */
//    @Test
//    public void testSetEncryptionRegister() {
//        System.out.println("setEncryptionRegister");
//        EncryptionRegister enr = new EncryptionRegister(new ArrayList<>());
//        EventCenter instance = ec;
//        instance.setEncryptionRegister(enr);
//    }
//
//    /**
//     * Test of getGlobalAcceptanceRate method, of class EventCenter.
//     */
//    @Test
//    public void testGetGlobalAcceptanceRate() {
//        System.out.println("getGlobalAcceptanceRate");
//        EventCenter instance = ec;
//        double expResult = 100.0;
//        double result = instance.getGlobalAcceptanceRate();
//        assertEquals(expResult, result, 0.0);
//    }
//
//    /**
//     * Test of getEventsWhereUserIsFAE method, of class EventCenter.
//     */
//    @Test
//    public void testGetEventsWhereUserIsFAE() {
//        System.out.println("getEventsWhereUserIsFAE");
//        User user = u;
//        EventCenter instance = ec;
//        List<Event> expResult = eveFAEIsUser;
//        List<Event> result = instance.getEventsWhereUserIsFAE(user);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getEventsWhereUserIsOrganizer method, of class EventCenter.
//     */
//    @Test
//    public void testGetEventsWhereUserIsOrganizer() {
//        System.out.println("getEventsWhereUserIsOrganizer");
//        User u = u1;
//        EventCenter instance = ec;
//        List<Event> expResult = eveOrgIsUser;
//        List<Event> result = instance.getEventsWhereUserIsOrganizer(u);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of checkIFUserIsFAE method, of class EventCenter.
//     */
//    @Test
//    public void testCheckIFUserIsFAE() {
//        System.out.println("checkIFUserIsFAE");
//        User user = u;
//        EventCenter instance = ec;
//        boolean expResult = true;
//        boolean result = instance.checkIFUserIsFAE(user);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of checkIFUserIsOrganizer method, of class EventCenter.
//     */
//    @Test
//    public void testCheckIFUserIsOrganizer() {
//        System.out.println("checkIFUserIsOrganizer");
//        User u = u1;
//        EventCenter instance = ec;
//        boolean expResult = true;
//        boolean result = instance.checkIFUserIsOrganizer(u);
//        assertEquals(expResult, result);
//    }

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

//    /**
//     * Test of
//     * testTheDifferenceBetweenTheMeanDeviationAndATheoreticalValue1ForAFAEAverageRating
//     * method, of class EventCenter.
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

//    /**
//     * Test of testingTheDifferenceBetweenTwoFAEsMeanDeviations method, of class
//     * EventCenter.
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

//    /**
//     * Test of keywordFrequency method, of class EventCenter.
//     */
//    @Test
//    public void testKeywordFrequency() {
//        System.out.println("keywordFrequency");
//        EventCenter instance = ec;
//        Object[][] expResult = frequencyMatrix;
//        Object[][] result = instance.keywordFrequency();
//        assertArrayEquals(expResult, result);
//    }

}
