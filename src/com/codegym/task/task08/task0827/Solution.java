package com.codegym.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("FEBRUARY 1 2013"));
    }

    public static boolean isDateOdd(String str) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy");
        Date d = dateFormat.parse(str);
        Calendar cal = Calendar.getInstance();
        //cal.setLenient(false);
        cal.setTime(d);
        try {
            cal.getTime();
        }
        catch (Exception e) {
            System.out.println("Invalid date");
        }

        int n = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(n);
        if(n%2 == 0){
            return false;
        }
        else
          return true;
    }
}
