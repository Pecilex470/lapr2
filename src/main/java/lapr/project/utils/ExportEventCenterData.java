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
import lapr.project.model.Attribution;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.FAE;
import lapr.project.model.Organizer;
import lapr.project.model.Stand;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

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

    public void testePutaQuePareu(EventCenter ec) {
        try {

            Element root = docXML.createElement("Event Center");
            docXML.appendChild(root);

            Element eventReg = docXML.createElement("Event Register");
            Element eventList = docXML.createElement("Event List");

            TransformerFactory transFactory = TransformerFactory.newInstance();
            Transformer trans;

            trans = transFactory.newTransformer();

            DOMSource docSource = new DOMSource(docXML);

            StreamResult docFinal = new StreamResult(new File("teste.xml"));

            trans.transform(docSource, docFinal);

        } catch (TransformerException ex) {

        }
    }

    public Element writeEventList() {
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
            writeStandList(event);
            writeOrganizerList(event);

//            writeFaeList();
//            writeApplicationList();
//            writeAttributionList();
        }
        return eventList;
    }

    public Element writeFaeList(Event e) {
        Element faeList = docXML.createElement("FAE List");

        for (FAE fae : e.getFaeList().getFAEList()) {
            Element user = docXML.createElement(fae.getUtilizadorFAE().getUsername());
            faeList.appendChild(user);

            //  writeAttributionList();
        }
        return faeList;
    }

//    public Element writeAttributionList(FAE fae) {
//        Element attList = docXML.createElement("Attribution List");
//
//        for (Attribution att: fae.getAttributionList() ) {
//            Element  app = docXML.createElement(att.getApplication());
//            faeList.appendChild(user);
//        }
//    }
//    public Element writeApplicationList() {
//        return Element;
//    }
    public Element writeOrganizerList(Event e) {

        Element orgList = docXML.createElement("Organizer List");

        for (Organizer org : e.getOrganizerList().getOrganizadores()) {
            Element user = docXML.createElement(org.getUtilizadorOrganizador().getUsername());
            orgList.appendChild(user);

        }
        return orgList;
    }

    public Element writeStandList(Event e) {
        Element standList = docXML.createElement("Stand List");

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

}
