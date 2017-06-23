/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;


/**
 *
 * @author Cerqueira
 */
public class MathUtils {

    public static double calculeStandartDesviation(int[] list) {
        double des = 0;
        double total = 0;
        double mean = 0;
        
        for (int i = 0; i < list.length; i++) {
            total += list[i];
        }
        
        mean=total/list.length;
        
        total=0;
        for (int i = 0; i < list.length; i++) {
            total+= Math.pow(list[i]-mean, 2);
        }
        
        double aux = total/list.length;
        
        double result = Math.sqrt(aux)*100;
        int aux1 = (int) result;
        
        
        return ((double) aux1)/100;
    }
}
