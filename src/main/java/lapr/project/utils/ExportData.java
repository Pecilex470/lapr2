/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import lapr.project.model.EventCenter;

/**
 *
 * @author Luis
 */
public class ExportData {
    
    private static final String ERROR = "ERROR";

    private ExportData() {
        throw new IllegalStateException("Utility class");
    }

    static String fileName = "test.bin";

    //use to close the program
    public static void serialization(EventCenter ec) {
        try {
            FileOutputStream teste = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(teste);
            try {
                out.writeObject(ec);

            } finally {
                out.close();
            }
        } catch (IOException ex) {
            System.out.println(ex);
            System.out.println(ERROR);
        }
    }

    public static EventCenter deserialization() {
        EventCenter ec = null;
        try {
            FileInputStream test = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(test);
            try {
                ec = (EventCenter) in.readObject();
            } catch (Exception e) {
                e.printStackTrace(new PrintWriter(new File("log.txt")));
                System.out.println(ERROR);
            } finally {
                in.close();
            }
        } catch (IOException ex) {
            System.out.println(ERROR);
        }
        return ec;
    }
}
