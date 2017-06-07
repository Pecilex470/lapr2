package lapr.project.model.register;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Event;

public class EventRegister {

    private ArrayList<Event> eventRegister;
    
    public EventRegister(){
        this.eventRegister = new ArrayList();
    }
    
    public ArrayList<Event> getEventList(){
        return eventRegister;
    }
    
//    public List<Event> getAvailableEvents() {
//        Date
//        for (Event event : eventRegister) {
//            if (event.getSubmissionStartDate())
//        }
//    }
}
