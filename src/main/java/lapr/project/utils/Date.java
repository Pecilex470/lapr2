package lapr.project.utils;

public class Date {
    
    private int year;
    private int month;
    private int day;
    
    /**
     * Array with the maximum days in each month
     */
    private static int[] daysMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    
    /**
     * Creates an object that contains a date
     * 
     * @param day
     * @param month
     * @param year 
     */
    public Date(int day, int month, int year) {
        setDate(day, month, year);
    }
    
    /**
     * Sets a specific date
     * @param day the day to set
     * @param month the month to set
     * @param year the year to set
     * @return returns the final object
     */
    public Date setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        return Date.this;
    }
    
    
}
