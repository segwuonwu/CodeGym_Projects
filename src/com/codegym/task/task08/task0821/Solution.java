package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        map.put("Theo", "Igwala");
        map.put("Henry", "Igwala");
        map.put("Steph", "Igwala");
        map.put("Egwuonwu", "Solomon");
        map.put("Egwuonwu", "Peter");
        map.put("Peter", "Simon");
        map.put("John", "Henry");
        map.put("King", "Solomon");
        map.put("Steven", "King");
        map.put("Robert", "Jones");

        return map;

    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
