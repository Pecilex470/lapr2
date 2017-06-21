/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import lapr.project.model.Application;
import lapr.project.model.Attribution;
import lapr.project.model.Decision;
import lapr.project.model.Encryption;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;
import lapr.project.model.Keyword;
import lapr.project.model.Stand;
import lapr.project.model.User;
import lapr.project.model.register.FAEList;
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

    private static final String DEFAULT_KEYWORD = "zebras";
    private static final int DEFAULT_SHIFT = 6;
    private static final String FILE_NAME = "eventData.xml";
    EventCenter ec;
    Node event;
    Document docXML;

    public ImportEventData(EventCenter ec) {
        this.ec = ec;

        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            docXML = builder.parse(new File(FILE_NAME));

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
//devolve uma lista de event
        NodeList eventAtributes = this.event.getChildNodes();

        UserRegister ur = ec.getUserRegister();

//para cada event
        for (int i = 1; i < eventAtributes.getLength(); i++) {
//vai buscar os atributos de event
            if (eventAtributes.item(i).getNodeType() == Node.ELEMENT_NODE) {

                Element element = (Element) eventAtributes.item(i);

                switch (element.getTagName()) {

                    case "stands":

                        newEvent.setStandList(readStands(element, newEvent)); //v
                        break;
                    case "title":

                        newEvent.setTitle(element.getTextContent());//v
                        break;
                    case "FAESet":

                        FAEList faeList = new FAEList();
                        newEvent.setFAEList(faeList);
                        List<User> userList = new ArrayList<>();
                        newEvent.getFaeList().setFAE(readFAESet(element, userList, ur));//v
                        
                        break;
                    case "applicationSet":

                        newEvent.getApplicationList().setApplicationList(readApplication(element, ur));
                        break;
                }
            }
        }

        return newEvent;
    }

    public List<FAE> readFAESet(Element faeList, List<User> userList, UserRegister ur) {

        List<FAE> list = new ArrayList<>();

        NodeList faeL = faeList.getElementsByTagName("fae");

        for (int i = 0; i < faeL.getLength(); i++) {

            if (faeL.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) faeL.item(i);

                NodeList userL = element.getElementsByTagName("user");

                for (int w = 0; w < userL.getLength(); w++) {

                    if (userL.item(w).getNodeType() == Node.ELEMENT_NODE) {
//pode validar se o user é unico
                        Element user = (Element) userL.item(w);
                        NodeList userAtributes = user.getChildNodes();

                        FAE newFae = new FAE();
                        User newUser = new User();
                        for (int a = 0; a < userAtributes.getLength(); a++) {

                            for (int u = 0; u < userAtributes.getLength(); u++) {
                                if (userAtributes.item(u).getNodeType() == Node.ELEMENT_NODE) {

                                    Element el = (Element) userAtributes.item(u);
                                    switch (el.getTagName()) {

                                        case "name":
                                            newUser.setName(el.getTextContent());
                                            break;
                                        case "email":
                                            newUser.setEmail(el.getTextContent());
                                            break;
                                        case "username":
                                            newUser.setUsername(el.getTextContent());
                                            break;
                                        case "password":
                                            newUser.setPassword(el.getTextContent());
                                            break;
                                    }
                                }

                            }
                            ec.getUserRegister().getUsers().add(newUser);
                            newFae.setUtilizadorFAE(newUser);
                            list.add(newFae);
                            break;
                        }

                    }

                }
            }
        }
        return list;
    }

    public List<Stand> readStands(Element element, Event newEvent) {

        NodeList standsList = element.getElementsByTagName("stand");

        List<Stand> list = new ArrayList<>();
        for (int i = 0; i < standsList.getLength(); i++) {

            Stand stand = new Stand();

            NodeList standAtributes = standsList.item(i).getChildNodes();

            for (int j = 0; j < standAtributes.getLength(); j++) {

                if (standAtributes.item(j).getNodeType() == Node.ELEMENT_NODE) {

                    Element at = (Element) standAtributes.item(j);
                    switch (at.getTagName()) {

                        case "description":
                            stand.setDescription(at.getTextContent());
                            break;
                        case "area":
                            try {
                                newEvent.addArea(Integer.parseInt(at.getTextContent()));
                                stand.setArea(Integer.parseInt(at.getTextContent()));
                            } catch (Exception ex) {
                            }
                            break;
                    }
                }
            }
            try {
                list.add(stand);
            } catch (NullPointerException e) {
            }
        }
        return list;
    }

    public List<Application> readApplication(Element element, UserRegister ur) {

        List<Application> list = new ArrayList<>();
        List<Attribution> attList = new ArrayList<>();

        NodeList applicationList = element.getElementsByTagName("application");

        for (int i = 0; i < applicationList.getLength(); i++) {

            if (applicationList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element app = (Element) applicationList.item(i);

                NodeList appAtributes = app.getChildNodes();
                Attribution att = new Attribution();
                Application newApp = new Application();

                for (int j = 0; j < appAtributes.getLength(); j++) {

                    if (appAtributes.item(j).getNodeType() == Node.ELEMENT_NODE) {

                        Element el = (Element) appAtributes.item(j);

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
                            case "keywords":

                                newApp.setKeywordList(readKeywords(el));
                                break;
                        }
                    }
                }
                for (int j = 0; j < appAtributes.getLength(); j++) {
                    if (appAtributes.item(j).getNodeType() == Node.ELEMENT_NODE) {

                        Element el = (Element) appAtributes.item(j);

                        switch (el.getTagName()) {
                            case "reviews":

                                newApp.setDecisionList(readReviews(el, ur));
                                break;
                        }
                    }
                    att.setApplication(newApp);
                    attList.add(att);
                }
            }

        }

        return list;
    }

    public List<Decision> readReviews(Element element, UserRegister ur) {

        List<Decision> list = new ArrayList<>();

        NodeList evaList = element.getElementsByTagName("review");

        //Attribution attr = new Attribution();
        for (int i = 0; i < evaList.getLength(); i++) {

            if (evaList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element el = (Element) evaList.item(i);

                NodeList evaAtributes = el.getChildNodes();

                Decision eva = new Decision();
                for (int j = 0; j < evaAtributes.getLength(); j++) {

                    if (evaAtributes.item(j).getNodeType() == Node.ELEMENT_NODE) {
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

                                eva.setFaeUsername(readAssignment(element, ur, eva));

                                //application
                                break;
                        }
                    }
                }
                list.add(eva);
            }
        }

        return list;
    }

    public String readAssignment(Element element, UserRegister ur, Decision eva) {

        NodeList list = element.getElementsByTagName("fae");

        User newUser = new User();

        for (int i = 0; i < list.getLength(); i++) {

            if (list.item(i).getNodeType() == Node.ELEMENT_NODE) {

                Element el = (Element) list.item(i);

                NodeList user = el.getElementsByTagName("user");

                for (int j = 0; j < user.getLength(); j++) {
          
                    if (user.item(j).getNodeType() == Node.ELEMENT_NODE) {
                     
                        Element userEl = (Element) user.item(j);
                        NodeList userAtributes = userEl.getChildNodes();

                        for (int w = 0; w < userAtributes.getLength(); w++) {
                       
                            if (userAtributes.item(w).getNodeType() == Node.ELEMENT_NODE) {
                          
                                Element userAtributesEl = (Element) userAtributes.item(w);

                                NodeList usernameList = userAtributesEl.getElementsByTagName("username");
                                
                                for (int a = 0; a < usernameList.getLength(); a++) {
                                  

                                    if (userAtributes.item(w).getNodeType() == Node.ELEMENT_NODE) {

                                        Element elementT = (Element) userAtributes.item(w);

                                        if (ur.verifyUsername(elementT.getTextContent())) {

                                            eva.setFaeUsername(userAtributes.item(w).getTextContent());
                                        } else {

                                            for (int t = 0; t < userAtributes.getLength(); t++) {

                                                if (userAtributes.item(t).getNodeType() == Node.ELEMENT_NODE) {

                                                    Element elAtributes = (Element) userAtributes.item(t);

                                                    switch (elAtributes.getTagName()) {

                                                        case "name":

                                                            String temp = Encryption.encryptData(elAtributes.getTextContent(), DEFAULT_KEYWORD);
                                                            temp = Encryption.encryptPassword(temp, DEFAULT_SHIFT, Encryption.ABC);
                                                            newUser.setName(temp);
                                                            break;
                                                        case "email":
                                                            
                                                            temp = Encryption.encryptData(elAtributes.getTextContent(), DEFAULT_KEYWORD);
                                                            temp = Encryption.encryptPassword(temp, DEFAULT_SHIFT, Encryption.ABC);
                                                            newUser.setEmail(temp);
                                                            break;
                                                        case "username":

                                                            newUser.setUsername(elAtributes.getTextContent());
                                                            eva.setFaeUsername(elAtributes.getTextContent());
                                                            break;
                                                        case "password":

                                                            temp = Encryption.encryptPassword(elAtributes.getTextContent(), DEFAULT_SHIFT, Encryption.ABC);
                                                            newUser.setPassword(temp);
                                                            break;
                                                    }
                                                }
                                            }
                                            ur.getUsers().add(newUser);
                                            ec.getEncryptionRegister().addEncryption(new Encryption(DEFAULT_SHIFT, newUser, DEFAULT_KEYWORD));
                                        }
                                    }
                                }
                            }
                        }
                        }
                    }
                }
            }
            return newUser.getUsername();
        }

    

    public List<Keyword> readKeywords(Element element) {
        List<Keyword> list = new ArrayList<>();

        NodeList listKeyword = element.getElementsByTagName("keyword");

        for (int i = 0; i < listKeyword.getLength(); i++) {
            Element key = (Element) listKeyword.item(i);

            switch (key.getTagName()) {
                case "keyword":
                    try {
                        list.add(new Keyword(key.getTextContent()));
                    } catch (NullPointerException e) {
                    }
                    break;
            }
        }

        return list;
    }
}
