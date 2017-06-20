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
import lapr.project.model.Evaluation;
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
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 *
 * @author Cerqueira
 */
public class ImportEventData {

    private static final String fileName = "eventData.xml";
    EventCenter ec;
    Node event;
    Document docXML;

    public ImportEventData() {
        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            docXML = builder.parse(new File(fileName));

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


        UserRegister ur = new UserRegister();


        for (int i = 1; i < eventAtributes.getLength(); i++) {

            if (eventAtributes.item(i).getNodeType() == Node.ELEMENT_NODE) {

                Element element = (Element) eventAtributes.item(i);

                switch (element.getTagName()) {
                    case "stands":
                        newEvent.setStandList(readStands(element)); //v
                        break;
                    case "title":
                        newEvent.setTitle(element.getTextContent());//v
                        break;
                    case "FAESet":
                        FAEList faeList = new FAEList();
                        newEvent.setFAEList(faeList);
                        List<User> userList = new ArrayList();
                        newEvent.getFaeList().setFAE(readFAESet(element, userList));
                        ur.setUsers(userList);
                        break;
                    case "applicationSet":
                        newEvent.getApllicationRegister().setApplication(readApplication(element, ur));
                        break;
                }
            }
        }

        return newEvent;
    }


    public List<FAE> readFAESet(Element faeList, List<User> userList) {


        List<FAE> list = new ArrayList();

        NodeList faeL = faeList.getElementsByTagName("fae");

        for (int i = 0; i < faeL.getLength(); i++) {

            if (faeL.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) faeL.item(i);

                NodeList userL = element.getElementsByTagName("user");

                for (int w = 0; w < userL.getLength(); w++) {

                    if (userL.item(w).getNodeType() == Node.ELEMENT_NODE) {

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
                            userList.add(newUser);
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

    public List<Stand> readStands(Element element) {

        NodeList standsList = element.getElementsByTagName("stand");

        List<Stand> list = new ArrayList();
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
                                stand.setArea(Integer.parseInt(at.getTextContent()));
                            } catch (Exception ex) {
                            }
                            break;
                    }
                }
            }
            try{ 
                list.add(stand);
            } catch (NullPointerException e) {
            }
        }
        return list;
    }

    public List<Application> readApplication(Element element, UserRegister ur) {
        List<Application> list = null;

        NodeList applicationList = element.getElementsByTagName("application");

        for (int i = 0; i < applicationList.getLength(); i++) {

            Element app = (Element) applicationList.item(i);

            NodeList appAtributes = app.getChildNodes();

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
                        case "reviews":
                            readReviews(el, ur, newApp);
                            break;
                        case "keywords":
                            newApp.setKeywordList(readKeywords(el));
                            break;
                    }
                }

            }

        }

        return list;
    }

    public List<Evaluation> readReviews(Element element, UserRegister ur, Application app) {
        List<Evaluation> list = new ArrayList();

        NodeList evaList = element.getElementsByTagName("review");

        Attribution attr = new Attribution();

        for (int i = 0; i < evaList.getLength(); i++) {

            Element el = (Element) evaList.item(i);

            NodeList evaAtributes = el.getChildNodes();

            Evaluation eva = new Evaluation();

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
                            readAssignment(element, ur, app);
                            break;
                    }
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
                    if (userAtributes.item(w).getNodeType() == Node.ELEMENT_NODE) {
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
        }
        return att;
    }

    public List<Keyword> readKeywords(Element element) {
        List<Keyword> list = new ArrayList();

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
}
