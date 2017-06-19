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
import lapr.project.model.Evaluation;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;
import lapr.project.model.Keyword;
import lapr.project.model.register.KeywordList;
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
public class ImportEventData {

    EventCenter ec;
    DocumentBuilderFactory factory;
    DocumentBuilder builder;
    Document docXML;

    public ImportEventData() {
        try {
            this.factory = DocumentBuilderFactory.newInstance();
            this.builder = factory.newDocumentBuilder();
            ec = null;
            this.docXML = builder.parse("inserir nome do ficheiro");
        } catch (SAXException ex) {
            Logger.getLogger(ImportEventData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportEventData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ImportEventData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public EventCenter readEvent(Node event) {

//        NodeList eventList = docXML.getElementsByTagName("event");

        NodeList eventAtributes = event.getChildNodes();
        
        for(int i=0; i<eventAtributes.getLength(); i++){
           
            Element element = (Element) eventAtributes.item(i);
            
            switch (element.getTagName()){
                
                case "stands":
                    
            }
            
            
            
            
            
            
            
        }

            
            
            
            
            
            
            
            
            
        for (int i = 0; i < eventList.getLength(); i++) {

            Node event = eventList.item(i);

            NodeList eventAtributes = event.getChildNodes();

            readEvent(eventAtributes);

        }

        return ec;
    }

//    public Event readEvent(NodeList eventAtributes) {
//
//        Event event = new Event();
//
//        for (int i = 0; i < eventAtributes.getLength(); i++) {
//
//            Element atr = (Element) eventAtributes.item(i);
//            switch (atr.getTagName()) {
//
//                case "title":
//                    event.setTitle(atr.getTextContent());
//                    break;
//                case "location":
//                    event.setLocation(atr.getTextContent());
//                    break;
//                case "description":
//                    event.setDescription(atr.getTextContent());
//                    break;
////                //alterar isto por causa de ser Date, criar construtor com String
////                case "startDate":
////                    event.setStartDate(new Date(atr.getTextContent()));
////                    break;
////                case "endDate":
////                    event.setEndDate(new Date(atr.getTextContent()));
////                    break;
////                case "submissionStartDate":
////                    event.setSubmissionStartDate(new Date(atr.getTextContent()));
////                    break;
////                case "submissionEndDate":
////                    event.setSubmissionEndDate(new Date(atr.getTextContent()));
////                    break;
////                case "eventType":
////                    event.setEventType(atr.getTextContent());
////                    break;
////                case "availableArea":
////                    event.setAvailableArea(Integer.parseInt(atr.getTextContent()));
////                    break;
////                case "StandList":
////                    //criar método
////                    event.setStandList(readStandList());
////                    break;
////                case "OrganizerList":
////                    event.setOrganizerList(readOrganizerList());
////                    break;
////                case "FAEList":
////                    event.setFAEList(readFAEList());
////                    break;
////                case "ApplicationList":
////                    event.setApplicationList(readApplicationList());
////                    break;
//            }
//        }
//        return event;
//    }
//
//    public User readUser(NodeList userAtributes) {
//        User user = new User();
//
//        for (int i = 0; i < userAtributes.getLength(); i++) {
//
//            Element atr = (Element) userAtributes.item(i);
//            switch (atr.getTagName()) {
//
//                case "username":
//                    user.setUsername(atr.getTextContent());
//                    break;
//                case "email":
//                    user.setEmail(atr.getTextContent());
//                    break;
//                case "name":
//                    user.setName(atr.getTextContent());
//                    break;
//                case "password":
//                    user.setPassword(atr.getTextContent());
//                    break;
//            }
//
//        }
//        return user;
//    }
//
//    public Representative readRepresentative(NodeList repAtributes, UserRegister ur) {
//
//        for (int i = 0; i < repAtributes.getLength(); i++) {
//
//            Element atr = (Element) repAtributes.item(i);
//
//            if (atr.getTagName().equals("username")) {
//                return new Representative(ur.getUserByUsername(atr.getTextContent()));
//            }
//
//        }
//        return new Representative();
//    }
//
//    public Encryption readEncryption(NodeList encAtributes, UserRegister ur) {
//        Encryption enc = new Encryption();
//
//        for (int i = 0; i < encAtributes.getLength(); i++) {
//
//            Element atr = (Element) encAtributes.item(i);
//            switch (atr.getTagName()) {
//
//                case "user":
//                    enc.setUser(ur.getUserByUsername(atr.getTagName()));
//                    break;
//                case "shift":
//                    enc.setShift(Integer.parseInt(atr.getTextContent()));
//                    break;
//                case "keyword":
//                    enc.setKeyword(atr.getTextContent());
//                    break;
//            }
//
//        }
//        return enc;
//
//    }
//
//    public Stand readStandList(NodeList standAtributes) {
//
//        Stand stand = new Stand();
//
//        for (int i = 0; i < standAtributes.getLength(); i++) {
//
//            Element atr = (Element) standAtributes.item(i);
//            switch (atr.getTagName()) {
//
//                case "areaStand":
//                    stand.setArea(Integer.parseInt(atr.getTextContent()));
//                    break;
//                case "nameStand":
//                    stand.setName(atr.getTextContent());
//                    break;
//                case "available":
//                    if (atr.getTextContent().equals("true")) {
//                        stand.setAvailable(true);
//                    } else {
//                        stand.setAvailable(false);
//                    }
//                    break;
//            }
//
//        }
//
//        return stand;
//    }
//
//    public FAE readFAEList(NodeList faeAtributes, UserRegister ur) {
//        FAE fae = new FAE();
//
//        for (int i = 0; i < faeAtributes.getLength(); i++) {
//            Element atr = (Element) faeAtributes.item(i);
//            switch (atr.getTagName()) {
//
//                case "user":
//                    fae.setUtilizadorFAE(ur.getUserByUsername(atr.getTextContent()));
//                    break;
//                case "AttributionList":
//                    //readAttributionList();
//                    break;
//            }
//        }
//
//        return fae;
//    }
//
//    public Attribution readAtributionList(NodeList list) {
//        Attribution attr = new Attribution();
//
//        for (int i = 0; i < list.getLength(); i++) {
//            Element atr = (Element) list.item(i);
//            switch (atr.getTagName()) {
//
//                case "applications":
//                    readApplication(atr.getElementsByTagName(atr.getTextContent()));
//                    break;
//                case "evaluation":
//                    //readEvaluation(atr);
//                    break;
//            }
//        }
//        return attr;
//    }
//
//    public Application readApplication(NodeList list) {
//        Application app = new Application();
//
//        for (int i = 0; i < list.getLength(); i++) {
//            Element atr = (Element) list.item(i);
//
//            switch (atr.getTagName()) {
//                case "keywordList":
//                    //readKeywordList()
//                    break;
//                case "description":
//                    app.setDescription(atr.getTextContent());
//                    break;
//                case "submissionMeanRating":
//                    app.setSubmissionMeanRating(Integer.parseInt(atr.getTextContent()));
//                    break;
//                case "decision":
//                    app.setDecision(Integer.parseInt(atr.getTextContent()));
//                    break;
//                case "companyName":
//                    app.setCompanyName(atr.getTagName());
//                    break;
//                case "numberOfDecisions":
//                    app.setNumberOfDecisions(Integer.parseInt(atr.getTextContent()));
//                    break;
//                case "stand":
//                    readStandList(atr.getElementsByTagName(atr.getTagName()));
//                    break;
//            }
//        }
//        return app;
//    }
//
//    public Evaluation readEvaluation(NodeList list) {
//        Evaluation eva = new Evaluation();
//
//        for (int i = 0; i < list.getLength(); i++) {
//            Element atr = (Element) list.item(i);
//
//            switch (atr.getTagName()) {
//                case "decision":
//                    if (atr.getTextContent().equals("true")) {
//                        eva.setDecision(true);
//                    } else {
//                        eva.setDecision(false);
//                    }
//                    break;
//                case "justification":
//                    eva.setJustificacao(atr.getTextContent());
//                    break;
//                case "knowledge":
//                    eva.setKnowledge(Integer.parseInt(atr.getTextContent()));
//                    break;
//                case "adequancy":
//                    eva.setAdequancy(Integer.parseInt(atr.getTextContent()));
//                    break;
//                case "quantity":
//                    eva.setQuantity(Integer.parseInt(atr.getTextContent()));
//                    break;
//                case "overall":
//                    eva.setOverall(Integer.parseInt(atr.getTextContent()));
//                    break;
//            }
//        }
//        return eva;
//    }
//    
//    public KeywordList readKeywordList(NodeList list){
//        KeywordList keyList = new KeywordList();
//        
//        for (int i = 0; i < list.getLength(); i++) {
//            
//            Element atr = (Element) list.item(i);
//            
//            switch (atr.getTagName()) {
//                //case ""
//            }
//            
//        }
//        return keyList;
//    }
}
