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

    private typeStand type;
    private boolean available = true;

    /**
     * Enum that lists the possivel stands
     */
    public enum typeStand {

        SMALL_STAND("Small Stand", 10),
        MEDIUM_STAND("Medium Stand", 20),
        BIG_STAND("Big Stand", 40),
        PREMIUM_STAND("Premium Stand", 80);

        private int area;
        private String name;

        typeStand(String nome, int area) {
            this.name = nome;
            this.area = area;
        }

        public int getArea() {
            return this.area;
        }

        public String getName() {
            return this.name;
        }

        public void setArea(int area) {
            this.area = area;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * Constructor
     *
     * @param type - type of stand
     */
    public Stand(typeStand type) {
        this.type = type;
    }

    public Stand() {

    }

    /**
     * Method to return the area of stand
     *
     * @return area (int)
     */
    public int getArea() {
        return type.getArea();
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

    public String getName() {
        return this.type.getName();
    }

    public void setArea(int area) {
        this.type.area = area;
    }

    public void setName(String name) {
        this.type.name = name;
    }

    public int getIndexStand() {

        if (getName().equals("Small Stand")) {
            return 0;
        }

        if (getName().equals("Medium Stand")) {
            return 1;
        }
        
        if (getName().equals("Big Stand")) {
            return 2;
        }
        
        if (getName().equals("Premium Stand")) {
            return 3;
        }

        return 0;
    }
}
