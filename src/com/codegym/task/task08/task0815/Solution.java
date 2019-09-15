package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        map.put("Theo", "Igwala");
        map.put("Henry", "Igwala");
        map.put("Steph", "Igwala");
        map.put("Solomon", "Egwuonwu");
        map.put("Peter", "Egwuonwu");
        map.put("Simon", "Peter");
        map.put("John", "Henry");
        map.put("King", "Solomon");
        map.put("Steven", "King");
        map.put("Robert", "Jones");

        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here
        int count = 0;

        for(Map.Entry<String, String> fName : map.entrySet()){
            if(name.equals(fName.getValue())){
                count ++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //write your code here
        int count = 0;

        for(Map.Entry<String, String> fName : map.entrySet()){
            if(lastName.equals(fName.getKey())){
                count ++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
//        System.out.println(createMap());
//        System.out.println();
//        System.out.println(getSameFirstNameCount(createMap(), "Solomon"));
//        System.out.println(getSameLastNameCount(createMap(), "Igwala"));
    }
}
