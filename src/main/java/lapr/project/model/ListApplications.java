/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;

/**
 *
 * @author Cerqueira
 */
public class ListApplications {

    List<Applications> al;

    public ListApplications() {

    }

    public double getGlobalMeanRating() {
        double total = 0;
        for (Applications a : al) {
            total += a.getSubmissionRating();
        }
        return total / al.size();
    }
}
