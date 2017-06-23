package lapr.project.utils;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
     * This method returns the date's day
     *
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * This method returns the date's month
     *
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * This method returns the date's month
     *
     * @return
     */
    public int getYear() {
        return year;
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
        if (0 < day && day <= daysMonth[month - 1]) {
            if (0 < month && month <= 12) {
                if (Integer.toString(year).length() == 4) {
                    this.day = day;
                    this.month = month;
                    this.year = year;
                    return CustomDate.this;
                }
            }
        }
        this.day = -1;
        return CustomDate.this;
    }

    /**
     * This method takes the local machine's time and creates a new Object with
     * it
     *
     * @return returns the CustomDate object
     */
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

    /**
     * This method checks if the current CustomDate object complies with the
     * submission Period for a set Event
     *
     * @param minPeriod the beginning of the submission period
     * @param maxPeriod the ending of the submission period
     * @return returns if the condition is true or false
     */
    public boolean checkSubmissionPeriod(CustomDate minPeriod, CustomDate maxPeriod) {

        return testIfDateIsAfter(minPeriod) && testIfDateIsBefore(maxPeriod);
    }

    public boolean testIfDateIsAfter(CustomDate minPeriod) {

        if (year >= minPeriod.getYear()) {

            if (year > minPeriod.getYear()) {
                return true;
            }

            if (year == minPeriod.getYear()) {

                if (month > minPeriod.getMonth()) {
                    return true;
                }

                if (month == minPeriod.getMonth()) {

                    if (day >= minPeriod.getDay()) {
                        return true;
                    }

                }

            }

        }
        return false;
    }

    public boolean testIfDateIsBefore(CustomDate maxPeriod) {

        if (year <= maxPeriod.getYear()) {

            if (year < maxPeriod.getYear()) {
                return true;
            }

            if (year == maxPeriod.getYear()) {

                if (month < maxPeriod.getMonth()) {
                    return true;
                }

                if (month == maxPeriod.getMonth()) {

                    if (day <= maxPeriod.getDay()) {
                        return true;
                    }

                }

            }

        }
        return false;
    }

}
