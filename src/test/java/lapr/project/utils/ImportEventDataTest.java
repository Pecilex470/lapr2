/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.Decision;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;
import lapr.project.model.Keyword;
import lapr.project.model.Stand;
import lapr.project.model.User;
import lapr.project.model.register.EncryptionRegister;
import lapr.project.model.register.EventRegister;
import lapr.project.model.register.RepresentativeRegister;
import lapr.project.model.register.UserRegister;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 *
 * @author Pedro
 */
public class ImportEventDataTest {
    
    public ImportEventDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of readEvent method, of class ImportEventData.
     */
    @Test
    public void testReadEvent() {
        System.out.println("readEvent");
        ImportEventData instance = new ImportEventData(new EventCenter(new EventRegister(new ArrayList<>()), new UserRegister(new ArrayList<>()) , new RepresentativeRegister(new ArrayList<>()), new EncryptionRegister(new ArrayList<>())), "a");
        Event expResult = instance.readEvent();
        Event result = instance.readEvent();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of readFAESet method, of class ImportEventData.
     */
    @Test
    public void testReadFAESet() {
        System.out.println("readFAESet");
        Element faeList = null;
        List<User> userList = null;
        UserRegister ur = null;
        ImportEventData instance = new ImportEventData(new EventCenter(new EventRegister(new ArrayList<>()), new UserRegister(new ArrayList<>()) , new RepresentativeRegister(new ArrayList<>()), new EncryptionRegister(new ArrayList<>())), "a");
        List<FAE> expResult = instance.readFAESet(faeList, userList, ur);
        List<FAE> result = instance.readFAESet(faeList, userList, ur);
        assertEquals(expResult, result);

    }

//    /**
//     * Test of readStands method, of class ImportEventData.
//     */
//    @Test
//    public void testReadStands() {
//        System.out.println("readStands");
//        Element element = null;
//        Event newEvent = null;
//        ImportEventData instance = new ImportEventData(new EventCenter(new EventRegister(new ArrayList<>()), new UserRegister(new ArrayList<>()) , new RepresentativeRegister(new ArrayList<>()), new EncryptionRegister(new ArrayList<>())), "a");
//        List<Stand> expResult = instance.readStands(element, newEvent);
//        List<Stand> result = instance.readStands(element, newEvent);
//        assertEquals(expResult, result);
//    
//    }

    /**
     * Test of readApplication method, of class ImportEventData.
     */
    @Test
    public void testReadApplication() {
        System.out.println("readApplication");
        Element element = null;
        UserRegister ur = null;
        ImportEventData instance = new ImportEventData(new EventCenter(new EventRegister(new ArrayList<>()), new UserRegister(new ArrayList<>()) , new RepresentativeRegister(new ArrayList<>()), new EncryptionRegister(new ArrayList<>())), "a");
        List<Application> expResult = instance.readApplication(element, ur);
        List<Application> result = instance.readApplication(element, ur);
        assertEquals(expResult, result);

    }

    /**
     * Test of readReviews method, of class ImportEventData.
     */
    @Test
    public void testReadReviews() {
        System.out.println("readReviews");
        Element element = null;
        UserRegister ur = null;
        ImportEventData instance = new ImportEventData(new EventCenter(new EventRegister(new ArrayList<>()), new UserRegister(new ArrayList<>()) , new RepresentativeRegister(new ArrayList<>()), new EncryptionRegister(new ArrayList<>())), "a");
        List<Decision> expResult = instance.readReviews(element, ur);
        List<Decision> result = instance.readReviews(element, ur);
        assertEquals(expResult, result);

    }

//    /**
//     * Test of readAssignment method, of class ImportEventData.
//     */
//    @Test
//    public void testReadAssignment() {
//        System.out.println("readAssignment");
//        Element element = null;
//        UserRegister ur = null;
//        Decision eva = null;
//        ImportEventData instance = new ImportEventData(new EventCenter(new EventRegister(new ArrayList<>()), new UserRegister(new ArrayList<>()) , new RepresentativeRegister(new ArrayList<>()), new EncryptionRegister(new ArrayList<>())), "a");
//        String expResult = instance.readAssignment(element, ur, eva);
//        String result = instance.readAssignment(element, ur, eva);
//        assertEquals(expResult, result);
//
//    }

    /**
     * Test of readKeywords method, of class ImportEventData.
     */
    @Test
    public void testReadKeywords() {
        System.out.println("readKeywords");
        Element element = null;
        ImportEventData instance = new ImportEventData(new EventCenter(new EventRegister(new ArrayList<>()), new UserRegister(new ArrayList<>()) , new RepresentativeRegister(new ArrayList<>()), new EncryptionRegister(new ArrayList<>())), "a");
        List<Keyword> expResult = instance.readKeywords(element);
        List<Keyword> result = instance.readKeywords(element);
        assertEquals(expResult, result);

    }
    
}
