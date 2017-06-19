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
public class Stand {

    private int area;
    private boolean available = true;

    /**
     * Enum that lists the possivel stands
     */
    /**
     * Constructor
     *
     * @param type - type of stand
     */
    public Stand(int area) {
        this.area = area;
    }

    public Stand() {

    }

    /**
     * Method to return the area of stand
     *
     * @return area (int)
     */
    public int getArea() {
        return this.area;
    }

    /**
     *
     * @return availability of stand
     */
    public boolean getAvailable() {
        return this.available;
    }

    /**
     * set the availability of event
     *
     * @param available (boolean)
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setArea(int area) {
        this.area = area;
    }

}