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
    
    private typeStand area;
    
    public enum typeStand{

        SMALL_STAND("Small Stand", 10),
        MEDIUM_STAND("Medium Stand", 20),
        BIG_STAND("Big Stand", 40),
        PREMIUM_STAND("Premium Stand", 80);

        private final int area;
        private final String nome;

        typeStand(String nome, int area) {
            this.nome = nome;
            this.area = area;
        }

        public int getArea() {
            return this.area;
        }

        public String getNome() {
            return this.nome;
        }
    }

        /**
         * Constructor
         *
         * @param area - area of stand
         */
        public Stand(typeStand area) {
            this.area = area;
        }

        /**
         * Method to return the area of stand
         *
         * @return area (int)
         */
        public int getArea(){
            return area.getArea();
        }
    }
