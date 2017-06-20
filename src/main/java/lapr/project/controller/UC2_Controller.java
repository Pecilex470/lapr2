/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.User;

/**
 *
 * @author Pedro Pinho
 */
public class UC2_Controller {

    /**
     * The instance of the event center
     */
    private EventCenter ec;

    /**
     * The constructor for the UC2_Controller
     *
     * @param ec the instance of the eventcenter
     */
    public UC2_Controller(EventCenter ec) {
        this.ec = ec;
    }

}
