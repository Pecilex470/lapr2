package lapr.project.utils;

import java.io.Serializable;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CustomDate implements Serializable {

    static final long serialVersionUID = 24;
    private int year;
    private int month;
    private int day;

    /**
     * Array with the maximum days in each month
     */
    private static int[] daysMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * Creates an object that contains a date
     *
     * @param day
     * @param month
     * @param year
     */
    public CustomDate(int day, int month, int year) {
        setDate(day, month, year);
    }

    /**
     * Sets a specific date
     *
     * @param day the day to set
     * @param month the month to set
     * @param year the year to set
     * @return returns the final object
     */
    public CustomDate setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        return CustomDate.this;
    }

    public static CustomDate getCurrentTime() {
        DateFormat df = new SimpleDateFormat("dd");
        DateFormat mf = new SimpleDateFormat("MM");
        DateFormat yf = new SimpleDateFormat("yyyy");
        Calendar calobj = Calendar.getInstance();
        int d = Integer.parseInt(df.format(calobj.getTime()));
        int m = Integer.parseInt(mf.format(calobj.getTime()));
        int y = Integer.parseInt(yf.format(calobj.getTime()));
        return new CustomDate(d, m, y);
    }

//    public static void main(String[] args) {
//       //getting current date and time using Date class
//       DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
//       Date dateobj = new Date();
//       System.out.println(df.format(dateobj));
//
//       /*getting current date time using calendar class 
//        * An Alternative of above*/
//       Calendar calobj = Calendar.getInstance();
//       System.out.println(df.format(calobj.getTime()));
//    }
}
