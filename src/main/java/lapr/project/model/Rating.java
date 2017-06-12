/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Cerqueira
 */
public class Rating {

    private Event event;
    private Application application;
    private double rating;

    /**
     * Constructor
     *
     * @param app - Application
     * @param rat - Rating
     * @param event - Event
     */
    public Rating(Application app, double rat, Event event) {
        this.application = app;
        this.rating = rat;
        this.event = event;
    }

    /**
     * Obtain the application for which the rating is intended
     *
     * @return application.
     */
    public Application getApplication() {
        return application;
    }

    /**
     * Obtain the rating
     *
     * @return rating.
     */
    public double getRating() {
        return rating;
    }

    /**
     * Obtain the event for which the rating is intended
     *
     * @return event.
     */
    public Event getEvent() {
        return this.event;
    }
}
