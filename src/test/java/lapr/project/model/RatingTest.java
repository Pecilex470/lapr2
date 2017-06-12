/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Cerqueira
 */
public class RatingTest {

    @Test
    public void ensureGetApplicationWorking() throws Exception {
        Application app = new Application();
        Event event = new Event();
        Rating rat = new Rating(app, 4.34, event);
        assertEquals(app, rat.getApplication());
    }
    
    @Test
    public void ensureGetRatingWorking() throws Exception {
        Application app = new Application();
        Event event = new Event();
        Rating rat = new Rating(app, 4.34, event);
        double expRat=4.34;
        assertEquals(expRat, rat.getRating());
    }
    
    @Test
    public void ensureGetEventWorking() throws Exception {
        Application app = new Application();
        Event event = new Event();
        Rating rat = new Rating(app, 4.34, event);
        assertEquals(event, rat.getEvent());
    }
    
    
    
}
