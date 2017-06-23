/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.register.ApplicationList;
import lapr.project.model.register.FAEList;
import lapr.project.model.register.OrganizerList;
import lapr.project.utils.CustomDate;
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
public class EventTest {

    private Event e;
    private Application ap;
    private User u;
    private FAEList faeList;
    private OrganizerList organizerList;
    private ApplicationList applicationList;
    private List<Keyword> keywords;

    public EventTest() {
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
        
        this.faeList = new FAEList(new ArrayList<>());
        faeList.addFAE(new FAE());
        
        this.organizerList = new OrganizerList(new ArrayList<>());
        organizerList.addOrganizer(new Organizer(new User()));
        
        this.applicationList = new ApplicationList(new ArrayList<>());
        applicationList.addApplication(new Application());
        
        e = new Event("Bolo do Caco Festival", "Madeira", "A nice bolo do caco event", new CustomDate(13, 11, 2017), new CustomDate(14, 11, 2017), new CustomDate(20, 6, 2017), new CustomDate(8, 10, 2017), "congress", faeList, organizerList, 300);
        
        this.keywords = new ArrayList<>();
        keywords.add(new Keyword("Cake"));
        keywords.add(new Keyword("Sweet"));
        ap = new Application("Test application", keywords, "FoodInc", u , 15, 30);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class Event.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Event instance = e;
        String expResult = "Bolo do Caco Festival";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Event.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "Bolo do Caco Festival";
        Event instance = e;
        instance.setTitle(title);
    }

    /**
     * Test of getLocation method, of class Event.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Event instance = e;
        String expResult = "Madeira";
        String result = instance.getLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLocation method, of class Event.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "Madeira";
        Event instance = e;
        instance.setLocation(location);
    }

    /**
     * Test of getDescription method, of class Event.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Event instance = e;
        String expResult = "A nice bolo do caco event";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescription method, of class Event.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "A nice bolo do caco event";
        Event instance = e;
        instance.setDescription(description);
    }

    /**
     * Test of getStartDate method, of class Event.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Event instance = e;
        int expDay = 13;
        int expMonth = 11;
        int expYear = 2017;
        int resultDay = instance.getStartDate().getDay();
        int resultMonth = instance.getStartDate().getMonth();
        int resultYear = instance.getStartDate().getYear();
        assertEquals(expDay, resultDay);
        assertEquals(expMonth, resultMonth);
        assertEquals(expYear, resultYear);
    }

    /**
     * Test of setStartDate method, of class Event.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        CustomDate startDate = new CustomDate(13, 11, 2017);
        Event instance = e;
        instance.setStartDate(startDate);
    }

    /**
     * Test of getEndDate method, of class Event.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Event instance = e;
        int expDay = 14;
        int expMonth = 11;
        int expYear = 2017;
        int resultDay = instance.getEndDate().getDay();
        int resultMonth = instance.getEndDate().getMonth();
        int resultYear = instance.getEndDate().getYear();
        assertEquals(expDay, resultDay);
        assertEquals(expMonth, resultMonth);
        assertEquals(expYear, resultYear);
    }

    /**
     * Test of setEndDate method, of class Event.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        CustomDate endDate = new CustomDate(14, 11, 2017);
        Event instance = e;
        instance.setEndDate(endDate);
    }

    /**
     * Test of getSubmissionStartDate method, of class Event.
     */
    @Test
    public void testGetSubmissionStartDate() {
        System.out.println("getSubmissionStartDate");
        Event instance = e;
        int expDay = 20;
        int expMonth = 6;
        int expYear = 2017;
        int resultDay = instance.getSubmissionStartDate().getDay();
        int resultMonth = instance.getSubmissionStartDate().getMonth();
        int resultYear = instance.getSubmissionStartDate().getYear();
        assertEquals(expDay, resultDay);
        assertEquals(expMonth, resultMonth);
        assertEquals(expYear, resultYear);
    }

    /**
     * Test of setSubmissionStartDate method, of class Event.
     */
    @Test
    public void testSetSubmissionStartDate() {
        System.out.println("setSubmissionStartDate");
        CustomDate submissionStartDate = new CustomDate(20, 6, 2017);
        Event instance = e;
        instance.setSubmissionStartDate(submissionStartDate);
    }

    /**
     * Test of getSubmissionEndDate method, of class Event.
     */
    @Test
    public void testGetSubmissionEndDate() {
        System.out.println("getSubmissionEndDate");
        Event instance = e;
        int expDay = 8;
        int expMonth = 10;
        int expYear = 2017;
        int resultDay = instance.getSubmissionEndDate().getDay();
        int resultMonth = instance.getSubmissionEndDate().getMonth();
        int resultYear = instance.getSubmissionEndDate().getYear();
        assertEquals(expDay, resultDay);
        assertEquals(expMonth, resultMonth);
        assertEquals(expYear, resultYear);
    }

    /**
     * Test of setSubmissionEndDate method, of class Event.
     */
    @Test
    public void testSetSubmissionEndDate() {
        System.out.println("setSubmissionEndDate");
        CustomDate submissionEndDate = new CustomDate(8, 10, 2017);
        Event instance = e;
        instance.setSubmissionEndDate(submissionEndDate);
    }

    /**
     * Test of getEventType method, of class Event.
     */
    @Test
    public void testGetEventType() {
        System.out.println("getEventType");
        Event instance = e;
        String expResult = "congress";
        String result = instance.getEventType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEventType method, of class Event.
     */
    @Test
    public void testSetEventType() {
        System.out.println("setEventType");
        String eventType = "congress";
        Event instance = e;
        instance.setEventType(eventType);
    }

//    /**
//     * Test of addApplication method, of class Event.
//     */
//    @Test
//    public void testAddApplication() {
//        System.out.println("addApplication");
//        Application a = ap;
//        Event instance = e;
//        instance.addApplication(a);
//    }

//    /**
//     * Test of getApplicationList method, of class Event.
//     */
//    @Test
//    public void testGetApplicationList() {
//        System.out.println("getApplicationList");
//        Event instance = e;
//        int expResult = applicationList.getApplications().size();
//        int result = instance.getApplicationList().getApplications().size();
//        assertEquals(expResult, result);
//    }

//    /**
//     * Test of getAcceptanceRate method, of class Event.
//     */
//    @Test
//    public void testGetAcceptanceRate() {
//        System.out.println("getAcceptanceRate");
//        Event instance = e;
//        double expResult = 0.0;
//        double result = instance.getAcceptanceRate();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of getFaeList method, of class Event.
//     */
//    @Test
//    public void testGetFaeList() {
//        System.out.println("getFaeList");
//        Event instance = e;
//        FAEList expResult = faeList;
//        FAEList result = instance.getFaeList();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getKeywordList method, of class Event.
//     */
//    @Test
//    public void testGetKeywordList() {
//        System.out.println("getKeywordList");
//        Event instance = e;
//        List<Keyword> expResult = keywords;
//        List<Keyword> result = instance.getKeywordList();
//        assertEquals(expResult, result);
//    }

//    /**
//     * Test of getFAE method, of class Event.
//     */
//    @Test
//    public void testGetFAE() {
//        System.out.println("getFAE");
//        User user = u;
//        Event instance = e;
//        FAE expResult = new FAE(u);
//        FAE result = instance.getFAE(user);
//        assertEquals(expResult, result);
//    }

//    /**
//     * Test of isFAE method, of class Event.
//     */
//    @Test
//    public void testIsFAE() {
//        System.out.println("isFAE");
//        User user = u;
//        Event instance = e;
//        boolean expResult = true;
//        boolean result = instance.isFAE(user);
//        assertEquals(expResult, result);
//    }

//    /**
//     * Test of isOrganizer method, of class Event.
//     */
//    @Test
//    public void testIsOrganizer() {
//        System.out.println("isOrganizer");
//        User u = null;
//        Event instance = new Event();
//        boolean expResult = false;
//        boolean result = instance.isOrganizer(u);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getOrganizerList method, of class Event.
//     */
//    @Test
//    public void testGetOrganizerList() {
//        System.out.println("getOrganizerList");
//        Event instance = new Event();
//        OrganizerList expResult = null;
//        OrganizerList result = instance.getOrganizerList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
    /**
     * Test of getAvailableArea method, of class Event.
     */
    @Test
    public void testGetAvailableArea() {
        System.out.println("getAvailableArea");
        Event instance = e;
        int expResult = 300;
        int result = instance.getAvailableArea();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAvailableArea method, of class Event.
     */
    @Test
    public void testSetAvailableArea() {
        System.out.println("setAvailableArea");
        int area = 300;
        Event instance = e;
        instance.setAvailableArea(area);
    }
//
//    /**
//     * Test of addStand method, of class Event.
//     */
//    @Test
//    public void testAddStand() {
//        System.out.println("addStand");
//        Stand stand = null;
//        Event instance = new Event();
//        instance.addStand(stand);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAvailableStands method, of class Event.
//     */
//    @Test
//    public void testGetAvailableStands() {
//        System.out.println("getAvailableStands");
//        Event instance = new Event();
//        List<Stand> expResult = null;
//        List<Stand> result = instance.getAvailableStands();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getStandList method, of class Event.
//     */
//    @Test
//    public void testGetStandList() {
//        System.out.println("getStandList");
//        Event instance = new Event();
//        List<Stand> expResult = null;
//        List<Stand> result = instance.getStandList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setStandList method, of class Event.
//     */
//    @Test
//    public void testSetStandList() {
//        System.out.println("setStandList");
//        List<Stand> list = null;
//        Event instance = new Event();
//        instance.setStandList(list);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getZUni method, of class Event.
//     */
//    @Test
//    public void testGetZUni() {
//        System.out.println("getZUni");
//        Event instance = new Event();
//        double expResult = 0.0;
//        double result = instance.getZUni();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getZBil method, of class Event.
//     */
//    @Test
//    public void testGetZBil() {
//        System.out.println("getZBil");
//        Event e = null;
//        Event instance = new Event();
//        double expResult = 0.0;
//        double result = instance.getZBil(e);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of criticalValue method, of class Event.
//     */
//    @Test
//    public void testCriticalValue() {
//        System.out.println("criticalValue");
//        String a = "";
//        Event instance = new Event();
//        double expResult = 0.0;
//        double result = instance.criticalValue(a);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of testAcceptanceRate50 method, of class Event.
//     */
//    @Test
//    public void testTestAcceptanceRate50() {
//        System.out.println("testAcceptanceRate50");
//        String a = "";
//        Event instance = new Event();
//        String expResult = "";
//        String result = instance.testAcceptanceRate50(a);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of testDifferenceTwoEventsAccepRate50 method, of class Event.
//     */
//    @Test
//    public void testTestDifferenceTwoEventsAccepRate50() {
//        System.out.println("testDifferenceTwoEventsAccepRate50");
//        Event e = null;
//        String a = "";
//        Event instance = new Event();
//        String expResult = "";
//        String result = instance.testDifferenceTwoEventsAccepRate50(e, a);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFAEList method, of class Event.
//     */
//    @Test
//    public void testSetFAEList() {
//        System.out.println("setFAEList");
//        FAEList faelist = null;
//        Event instance = new Event();
//        instance.setFAEList(faelist);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkIFUserIsFAE method, of class Event.
//     */
//    @Test
//    public void testCheckIFUserIsFAE() {
//        System.out.println("checkIFUserIsFAE");
//        User u = null;
//        Event instance = new Event();
//        boolean expResult = false;
//        boolean result = instance.checkIFUserIsFAE(u);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkIFUserIsOrganizer method, of class Event.
//     */
//    @Test
//    public void testCheckIFUserIsOrganizer() {
//        System.out.println("checkIFUserIsOrganizer");
//        User u = null;
//        Event instance = new Event();
//        boolean expResult = false;
//        boolean result = instance.checkIFUserIsOrganizer(u);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addArea method, of class Event.
//     */
//    @Test
//    public void testAddArea() {
//        System.out.println("addArea");
//        int area = 0;
//        Event instance = new Event();
//        instance.addArea(area);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setKeywordList method, of class Event.
//     */
//    @Test
//    public void testSetKeywordList() {
//        System.out.println("setKeywordList");
//        List<Keyword> keywordList = null;
//        Event instance = new Event();
//        instance.setKeywordList(keywordList);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFAEAtri method, of class Event.
//     */
//    @Test
//    public void testGetFAEAtri() {
//        System.out.println("getFAEAtri");
//        int i = 0;
//        Event instance = new Event();
//        FAE expResult = null;
//        FAE result = instance.getFAEAtri(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getK method, of class Event.
//     */
//    @Test
//    public void testGetK() {
//        System.out.println("getK");
//        int num = 0;
//        Event instance = new Event();
//        int expResult = 0;
//        int result = instance.getK(num);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of determineInterspaceOfTable method, of class Event.
//     */
//    @Test
//    public void testDetermineInterspaceOfTable() {
//        System.out.println("determineInterspaceOfTable");
//        Event instance = new Event();
//        int expResult = 0;
//        int result = instance.determineInterspaceOfTable();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
