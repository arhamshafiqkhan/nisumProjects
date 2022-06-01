package com.arham;

import java.util.Calendar;

public class LeapYear {

    public static boolean isLeapYearOther(int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);

        return calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
    public static boolean isLeapYear(int year) {

        return (year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0);

        /*

        // checks if it is a leap year
        if(year % 4 == 0) {
            // checks if the year is a century for example 1900, 2000
            if(year % 100 == 0) {
                // checks if the century year is a leap or not
                return year % 400 == 0;
            }
            return true;
        }
        return false;

         */
    }
}
