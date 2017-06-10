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
    
    public Rating(Application app, double rat, Event event){
        this.application=app;
        this.rating=rat;
        this.event=event;
    }
    
    public Application getApplication(){
        return application;
    }
    
    public double getRating(){
        return rating;
    }
    
    public Event getEvent(){
        return this.event;
    }
}
