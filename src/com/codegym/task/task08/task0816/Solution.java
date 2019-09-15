package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //write your code here
        map.put("Solomon", df.parse("JULY 27 1988"));
        map.put("Godday", df.parse("JANUARY 1 1867"));
        map.put("Mariam", df.parse("APRIL 5 1991"));
        map.put("Steph", df.parse("OCTOBER 1 2004"));
        map.put("Jake", df.parse("MAY 30 1999"));
        map.put("Tobe", df.parse("DECEMBER 9 1888"));
        map.put("Faith", df.parse("JULY 26 1992"));
        map.put("Gift", df.parse("JULY 26 1990"));
        map.put("Chris", df.parse("SEPTEMBER 15 2000"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //write your code here
        Calendar cal = Calendar.getInstance();

        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            cal.setTime(itr.next().getValue());
            int month = cal.get(Calendar.MONTH);
            if(month >= 5 && month <8){
                itr.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {

//        HashMap<String, Date> map = createMap();
//        System.out.println(map);
//        removeAllSummerPeople(map);
//        System.out.println(map);
    }
}
