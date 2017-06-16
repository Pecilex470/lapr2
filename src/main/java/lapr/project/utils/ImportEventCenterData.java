/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import lapr.project.model.Application;
import lapr.project.model.Attribution;
import lapr.project.model.Encryption;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;
import lapr.project.model.Keyword;
import lapr.project.model.Organizer;
import lapr.project.model.Representative;
import lapr.project.model.Stand;
import lapr.project.model.User;
import lapr.project.model.register.UserRegister;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Cerqueira
 */
public class ImportEventCenterData {

    EventCenter ec;
    DocumentBuilderFactory factory;
    DocumentBuilder builder;
    Document docXML;

    public ImportEventCenterData() {
        try {
            this.factory = DocumentBuilderFactory.newInstance();
            this.builder = factory.newDocumentBuilder();
            ec = null;
            this.docXML = builder.parse("inserir nome do ficheiro");
        } catch (SAXException ex) {
            Logger.getLogger(ImportEventCenterData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportEventCenterData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ImportEventCenterData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public EventCenter readEventCenter() {

        NodeList eventList = docXML.getElementsByTagName("event");

        for (int i = 0; i < eventList.getLength(); i++) {

            Node event = eventList.item(i);

            NodeList eventAtributes = event.getChildNodes();

            readEvent(eventAtributes);

        }

        return ec;
    }

    public Event readEvent(NodeList eventAtributes) {

        Event event = new Event();

        for (int i = 0; i < eventAtributes.getLength(); i++) {

            Element atr = (Element) eventAtributes.item(i);
            switch (atr.getTagName()) {

                case "title":
                    event.setTitle(atr.getTextContent());
                    break;
                case "location":
                    event.setLocation(atr.getTextContent());
                    break;
                case "description":
                    event.setDescription(atr.getTextContent());
                    break;
//                //alterar isto por causa de ser Date, criar construtor com String
//                case "startDate":
//                    event.setStartDate(new Date(atr.getTextContent()));
//                    break;
//                case "endDate":
//                    event.setEndDate(new Date(atr.getTextContent()));
//                    break;
//                case "submissionStartDate":
//                    event.setSubmissionStartDate(new Date(atr.getTextContent()));
//                    break;
//                case "submissionEndDate":
//                    event.setSubmissionEndDate(new Date(atr.getTextContent()));
//                    break;
//                case "eventType":
//                    event.setEventType(atr.getTextContent());
//                    break;
//                case "availableArea":
//                    event.setAvailableArea(Integer.parseInt(atr.getTextContent()));
//                    break;
//                case "StandList":
//                    //criar método
//                    event.setStandList(readStandList());
//                    break;
//                case "OrganizerList":
//                    event.setOrganizerList(readOrganizerList());
//                    break;
//                case "FAEList":
//                    event.setFAEList(readFAEList());
//                    break;
//                case "ApplicationList":
//                    event.setApplicationList(readApplicationList());
//                    break;
            }
        }
        return event;
    }

    public User readUser(NodeList userAtributes) {
        User user = new User();

        for (int i = 0; i < userAtributes.getLength(); i++) {

            Element atr = (Element) userAtributes.item(i);
            switch (atr.getTagName()) {

                case "username":
                    user.setUsername(atr.getTextContent());
                    break;
                case "email":
                    user.setEmail(atr.getTextContent());
                    break;
                case "name":
                    user.setName(atr.getTextContent());
                    break;
                case "password":
                    user.setPassword(atr.getTextContent());
                    break;
            }

        }
        return user;
    }

    public Representative readRepresentative(NodeList repAtributes, UserRegister ur) {

        for (int i = 0; i < repAtributes.getLength(); i++) {

            Element atr = (Element) repAtributes.item(i);

            if (atr.getTagName().equals("username")) {
                return new Representative(ur.getUserByUsername(atr.getTextContent()));
            }

        }
        return new Representative();
    }

    public Encryption readEncryption(NodeList encAtributes, UserRegister ur) {
        Encryption enc = new Encryption();

        for (int i = 0; i < encAtributes.getLength(); i++) {

            Element atr = (Element) encAtributes.item(i);
            switch (atr.getTagName()) {

                case "user":
                    enc.setUser(ur.getUserByUsername(atr.getTagName()));
                    break;
                case "shift":
                    enc.setShift(Integer.parseInt(atr.getTextContent()));
                    break;
                case "keyword":
                    enc.setKeyword(atr.getTextContent());
                    break;
            }

        }
        return enc;

    }
    
    public List<Stand> readStandList(NodeList standAtributes){
        List<Stand> standL=null;
        
        for (int i = 0; i < standAtributes.getLength(); i++) {

            Stand stand = new Stand();
            Element atr = (Element) standAtributes.item(i);
            switch (atr.getTagName()) {

                case "typeStand":
//                    stand.setArea(atr.getTextContent());
                    break;
                case "shift":
                   
            }

        }
        
        
        
        
        return standL;
    }
}
