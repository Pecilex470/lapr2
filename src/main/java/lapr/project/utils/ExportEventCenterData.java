/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.File;
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
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author Cerqueira
 */
public class ExportEventCenterData {

    EventCenter ec;
    Document docXML;
    DocumentBuilder docB;
    DocumentBuilderFactory dbf;

    public ExportEventCenterData(EventCenter ec) throws ParserConfigurationException {
        this.ec = ec;
        this.dbf = DocumentBuilderFactory.newInstance();
        this.docB = dbf.newDocumentBuilder();
        this.docXML = docB.newDocument();
    }

    public void writeEventCenter(EventCenter ec) {
        try {

            Element root = docXML.createElement("EventCenter");
            docXML.appendChild(root);

            Element eventReg = docXML.createElement("EventRegister");
            eventReg.appendChild(writeEventList(this.ec));
            root.appendChild(eventReg);
            
            Element userRegister = docXML.createElement("UserRegister");
            userRegister.appendChild(writeUserRegister(this.ec));
            root.appendChild(userRegister);
            
            
            Element repReg = docXML.createElement("RepresentativeRegister");
            repReg.appendChild(writeRepList(this.ec));
            root.appendChild(repReg);
            
            Element encReg = docXML.createElement("EncryptionRegister");
            encReg.appendChild(writeEncReg(this.ec));
            root.appendChild(encReg);
            
            
            TransformerFactory transFactory = TransformerFactory.newInstance();
            Transformer trans;

            trans = transFactory.newTransformer();

            DOMSource docSource = new DOMSource(docXML);

            StreamResult docFinal = new StreamResult(new File("teste.xml"));

            trans.transform(docSource, docFinal);

        } catch (TransformerException ex) {

        }
    }

    public Node writeEventList(EventCenter ec) {
        Element eventList = docXML.createElement("eventList");
        for (Event event : ec.getEventRegister().getEventList()) {

            Element title = docXML.createElement("title");
            title.appendChild(docXML.createTextNode(event.getTitle()));
            eventList.appendChild(title);

            Element location = docXML.createElement("location");
            location.appendChild(docXML.createTextNode(event.getLocation()));
            eventList.appendChild(location);

            Element description = docXML.createElement("description");
            description.appendChild(docXML.createTextNode(event.getDescription()));
            eventList.appendChild(description);

            Element startDate = docXML.createElement("startDate");
            startDate.appendChild(docXML.createTextNode(event.getStartDate().toString()));
            eventList.appendChild(startDate);

            Element endDate = docXML.createElement("endDate");
            endDate.appendChild(docXML.createTextNode(event.getEndDate().toString()));
            eventList.appendChild(endDate);

            Element submissionStartDate = docXML.createElement("submissionStartDate");
            submissionStartDate.appendChild(docXML.createTextNode(event.getSubmissionStartDate().toString()));
            eventList.appendChild(submissionStartDate);

            Element submissionEndDate = docXML.createElement("submissionEndDate");
            submissionEndDate.appendChild(docXML.createTextNode(event.getSubmissionEndDate().toString()));
            eventList.appendChild(submissionEndDate);

            Element eventType = docXML.createElement("eventType");
            eventType.appendChild(docXML.createTextNode(event.getEventType()));
            eventList.appendChild(eventType);

            Element availableArea = docXML.createElement("availableArea");
            availableArea.appendChild(docXML.createTextNode(event.getAvailableArea() + ""));
            availableArea.appendChild(availableArea);
            
            
            eventList.appendChild(writeStandList(event));
            eventList.appendChild(writeOrganizerList(event));

            eventList.appendChild(writeFaeList(event));
            eventList.appendChild(writeApplicationList(event));
            
        }
        return eventList;
    }

    public Node writeFaeList(Event e) {
        Element faeList = docXML.createElement("FAEList");

        for (FAE fae : e.getFaeList().getFAEList()) {
            Element f = docXML.createElement("fae");
            Element user = docXML.createElement(fae.getUtilizadorFAE().getUsername());
            f.appendChild(user);
            faeList.appendChild(f);
            writeAttributionList(fae);
        }
        return faeList;
    }

    public Node writeAttributionList(FAE fae) {
        Element attList = docXML.createElement("AttributionList");

        for (Attribution a : fae.getAttributionList()) {
            Element attr = docXML.createElement("attribution");
            Element att = docXML.createElement("application");
            att.appendChild(docXML.createTextNode(a.getApplication().toString()));
            attr.appendChild(att);
            attList.appendChild(attr);
        }
        return attList;
    }

    public Node writeApplicationList(Event e) {
        Element appList = docXML.createElement("ApplicationList");

        for (Application a : e.getApplicationList()) {
            Element app = docXML.createElement("application");

            Element compName = docXML.createElement("companyName");
            compName.appendChild(docXML.createTextNode(a.getCompanyName()));
            app.appendChild(compName);

            Element des = docXML.createElement("description");
            des.appendChild(docXML.createTextNode(a.getDescription()));
            app.appendChild(des);

            Element submissionMeanRating = docXML.createElement("submissionMeanRating");
            submissionMeanRating.appendChild(docXML.createTextNode(a.getSubmissionMeanRating() + ""));
            app.appendChild(submissionMeanRating);

            Element decision = docXML.createElement("decision");
            decision.appendChild(docXML.createTextNode(a.getDecision() + ""));
            app.appendChild(decision);

            Element numberOfDecisions = docXML.createElement("numberOfDecisions");
            numberOfDecisions.appendChild(docXML.createTextNode(a.getNumberOfDecisions() + ""));
            app.appendChild(numberOfDecisions);

            Element stand = docXML.createElement("stand");
            stand.appendChild(docXML.createTextNode(a.getStand().toString()));
            app.appendChild(stand);

            writeKeywordsList(a);

            appList.appendChild(app);
        }

        return appList;
    }

    public Node writeKeywordsList(Application app) {
        Element keyList = docXML.createElement("keywordList");

        for (Keyword key : app.getKeywordList()) {
            Element k = docXML.createElement("keyword");
            Element value = docXML.createElement("value");
            value.appendChild(docXML.createTextNode(key.getValue()));
            k.appendChild(value);
            keyList.appendChild(k);
        }

        return keyList;
    }

    public Node writeOrganizerList(Event e) {

        Element orgList = docXML.createElement("OrganizerList");

        for (Organizer org : e.getOrganizerList().getOrganizadores()) {
            Element o = docXML.createElement("organizer");
            Element user = docXML.createElement(org.getUtilizadorOrganizador().getUsername());
            o.appendChild(user);
            orgList.appendChild(o);

        }
        return orgList;
    }

    public Node writeStandList(Event e) {
        Element standList = docXML.createElement("StandList");

        for (Stand stand : e.getStandList()) {
            Element typeStand = docXML.createElement("typeStand");
            typeStand.appendChild(docXML.createTextNode(stand.getArea() + ""));
            standList.appendChild(typeStand);
            Element ava = docXML.createElement("available");
            ava.appendChild(docXML.createTextNode(stand.getAvailable() + ""));
            standList.appendChild(ava);
        }
        return standList;
    }

    public Node writeUserRegister(EventCenter ec){
        Element userList=docXML.createElement("userList");
        
        for(User user: ec.getUserRegister().getUsers()){
            
            Element u= docXML.createElement("user");
            
            Element username = docXML.createElement("username");
            username.appendChild(docXML.createTextNode(user.getUsername()));
            u.appendChild(username);
            
            Element email = docXML.createElement("email");
            email.appendChild(docXML.createTextNode(user.getEmail()));
            u.appendChild(email);
            
            Element name = docXML.createElement("name");
            name.appendChild(docXML.createTextNode(user.getName()));
            u.appendChild(name);
            
            Element password = docXML.createElement("password");
            password.appendChild(docXML.createTextNode(user.getPassword()));
            u.appendChild(password);
            
            userList.appendChild(u);
        }
        
        return userList;
    }
    
    public Node writeRepList(EventCenter ec){
        Element repList = docXML.createElement("repList");
        
        for(Representative rep : ec.getRepresentativeRegister().getRepresentativeList()){
            Element repr = docXML.createElement("representative");
            Element user=docXML.createElement("username");
            user.appendChild(docXML.createTextNode(rep.getUserRepre().getUsername()));
            repr.appendChild(user);
            repList.appendChild(repr);
        }
        return repList;
    }
    
    public Node writeEncReg(EventCenter ec){
        
        Element encList = docXML.createElement("encList");
        
        for(Encryption enc : ec.getEncryptionRegister().getEncryptionList()){
            Element encr = docXML.createElement("encryption");
            
            Element user = docXML.createElement("user");
            user.appendChild(docXML.createTextNode(enc.getUser().getUsername()));
            encr.appendChild(user);
            
            Element shift = docXML.createElement("shift");
            shift.appendChild(docXML.createTextNode(enc.getShift()+""));
            encr.appendChild(shift);
            
            Element keyword = docXML.createElement("keyword");
            keyword.appendChild(docXML.createTextNode(enc.getKeyword()));
            encr.appendChild(keyword);
            
            encList.appendChild(encr);
        }
        
        return encList;
    }
}
