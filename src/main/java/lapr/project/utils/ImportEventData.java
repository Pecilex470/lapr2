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
    Node event;

    public ImportEventData() {
        try {
            this.factory = DocumentBuilderFactory.newInstance();
            this.builder = factory.newDocumentBuilder();
            ec = null;
            this.docXML = builder.parse("exposicao1_v0.1.xml");
            this.event = docXML.getFirstChild();
        } catch (SAXException ex) {
            Logger.getLogger(ImportEventData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportEventData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ImportEventData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Event readEvent() {

        Event newEvent = new Event();
        NodeList eventAtributes = this.event.getChildNodes();

        for (int i = 0; i < eventAtributes.getLength(); i++) {

            Element element = (Element) eventAtributes.item(i);

            switch (element.getTagName()) {

                case "stands":
                    newEvent.setStandList(readStands(element));
                    break;
                case "FAESet":
                    newEvent.getFaeList().setFAE(readFAESet(element));
                    break;
                case "applicationSet":
                    newEvent.getApllicationRegister().setApplication(readApplication(element));
                    break;
            }

        }

        return newEvent;
    }

    public List<FAE> readFAESet(Element faeList) throws NullPointerException{

        List<FAE> list = null;

        NodeList fae = faeList.getElementsByTagName("fae");

        for (int i = 0; i < fae.getLength(); i++) {

            Element element = (Element) fae.item(i);

            NodeList atributesList = element.getChildNodes();

            for (int j = 0; j < atributesList.getLength(); j++) {

                FAE newFae = new FAE();

                switch (element.getTagName()) {

                    case "user":

                        User user = new User();

                        NodeList userAtributes = element.getChildNodes();

                        for (int w = 0; w < userAtributes.getLength(); w++) {

                            Element el = (Element) userAtributes.item(w);

                            switch (el.getTagName()) {

                                case "name":
                                    user.setName(el.getTextContent());
                                    break;
                                case "email":
                                    user.setEmail(el.getTextContent());
                                    break;
                                case "username":
                                    user.setUsername(el.getTextContent());
                                    break;
                                case "password":
                                    user.setPassword(el.getTextContent());
                                    break;
                            }
                        }
                        newFae.setUtilizadorFAE(user);
                        try{ 
                            list.add(newFae);
                        } catch (NullPointerException e) {
                        }
                        break;
                }

            }

        }

        return list;
    }

    public List<Stand> readStands(Element element) {
        List<Stand> list = null;

        NodeList standsList = element.getElementsByTagName("stand");

        for (int i = 0; i < standsList.getLength(); i++) {

            Stand stand = new Stand();

            NodeList standAtributes = standsList.item(i).getChildNodes();

            for (int j = 0; j < standAtributes.getLength(); j++) {

                Element at = (Element) standAtributes.item(j);
                switch (at.getTagName()) {

                    case "description":
                        stand.setDescription(at.getTextContent());
                        break;
                    case "area":
                        try {
                            stand.setArea(Integer.parseInt(at.getTextContent()));
                        } catch (Exception ex) {
                        }
                        break;
                }
            }
            try{ 
                list.add(stand);
            } catch (NullPointerException e) {
            }
        }
        return list;
    }

    public List<Application> readApplication(Element element) {
        List<Application> list = null;

        NodeList applicationList = element.getElementsByTagName("application");

        for (int i = 0; i < applicationList.getLength(); i++) {

            Element app = (Element) applicationList.item(i);

            NodeList appAtributes = app.getChildNodes();

            Application newApp = new Application();

            for (int j = 0; j < appAtributes.getLength(); j++) {

                Element el = (Element) appAtributes.item(i);

                switch (el.getTagName()) {

                    case "accepted":
                        if (el.getTextContent().equalsIgnoreCase("true")) {
                            newApp.setDecision(1);
                        }
                        if (el.getTextContent().equalsIgnoreCase("false")) {
                            newApp.setDecision(-1);
                        }
                        break;
                    case "description":
                        newApp.setDescription(el.getTextContent());
                        break;
                    case "boothArea":
                        try {
                            newApp.setBoothArea(Integer.parseInt(el.getTextContent()));
                        } catch (Exception ex) {
                        }
                        break;
                    case "invitesQuantity":
                        try {
                            newApp.setInvitesQuantity(Integer.parseInt(el.getTextContent()));
                        } catch (Exception ex) {
                        }
                        break;
                    case "reviews":
                        readReviews(el);
                        break;
                    case "keywords":
                        readKeywords(el);
                        break;
                }

            }

        }

        return list;
    }

    public List<Evaluation> readReviews(Element element) {
        List<Evaluation> list = null;

        NodeList evaList = element.getElementsByTagName("review");

        for (int i = 0; i < evaList.getLength(); i++) {

            Element el = (Element) evaList.item(i);

            NodeList evaAtributes = el.getChildNodes();

            Evaluation eva = new Evaluation();

            for (int j = 0; j < evaAtributes.getLength(); j++) {

                Element at = (Element) evaAtributes.item(j);
                switch (at.getTagName()) {
                    case "text":
                        eva.setJustificacao(at.getTextContent());
                        break;
                    case "faeTopicKnowledge":
                        try {
                            eva.setKnowledge(Integer.parseInt(at.getTextContent()));
                        } catch (Exception ex) {
                        }
                        break;
                    case "eventAdequacy":
                        try {
                            eva.setAdequancy(Integer.parseInt(at.getTextContent()));
                        } catch (Exception ex) {
                        }
                        break;
                    case "inviteAdequacy":
                        try {
                            eva.setQuantity(Integer.parseInt(at.getTextContent()));
                        } catch (Exception ex) {
                        }
                        break;
                    case "recommendation":
                        try {
                            eva.setOverall(Integer.parseInt(at.getTextContent()));
                        } catch (Exception ex) {
                        }
                        break;
                    case "assignment":
//                        readAssignment(Element element);
                        break;
                }
            }
            try{ 
                list.add(eva);
            } catch (NullPointerException e) {
            }
        }

        return list;
    }

    public Attribution readAssignment(Element element, UserRegister ur, Application app) {
        Attribution att = new Attribution();

        NodeList list = element.getElementsByTagName("fae");

        for (int i = 0; i < list.getLength(); i++) {
            Element el = (Element) list.item(i);

            NodeList user = el.getElementsByTagName("user");

            for (int j = 0; j < user.getLength(); i++) {

                Element userEl = (Element) user.item(j);
                NodeList userAtributes = userEl.getChildNodes();

                for (int w = 0; w < userAtributes.getLength(); w++) {
                    Element userAtributesEl = (Element) userAtributes.item(w);

                    NodeList usernameList = userAtributesEl.getElementsByTagName("username");

                    for (int a = 0; a < usernameList.getLength(); a++) {

                        if (ur.verifyUsername(usernameList.item(a).getTextContent())) {
                            att.setUser(usernameList.item(a).getTextContent());
                        } else {

                            User newUser = new User();
                            for (int t = 0; t < userAtributes.getLength(); t++) {

                                Element elAtributes = (Element) userAtributes.item(t);
                                switch (elAtributes.getTagName()) {

                                    case "name":
                                        newUser.setName(elAtributes.getTextContent());
                                        break;
                                    case "email":
                                        newUser.setEmail(elAtributes.getTextContent());
                                        break;
                                    case "username":
                                        newUser.setUsername(elAtributes.getTextContent());
                                        att.setUser(elAtributes.getTextContent());
                                        break;
                                    case "password":
                                        newUser.setPassword(elAtributes.getTextContent());
                                        break;
                                }
                            }
                            ur.getUsers().add(newUser);

                        }
                    }
                }
            }
        }
        return att;
    }

    public List<Keyword> readKeywords(Element element) {
        List<Keyword> list = null;

        NodeList listKeyword = element.getElementsByTagName("keyword");

        for (int i = 0; i < listKeyword.getLength(); i++) {
            Element key = (Element) listKeyword.item(i);

            switch (key.getTagName()) {
                case "keyword":
                    try{
                        list.add(new Keyword(key.getTextContent()));
                    } catch (NullPointerException e) {
                    }
                    break;
            }
        }

        return list;
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
