package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String, Integer> map = new HashMap<>();
        map.put("King", 1000);
        map.put("James", 500);
        map.put("Paul", 800);
        map.put("Peter", 450);
        map.put("John", 600);
        map.put("Mark", 300);
        map.put("Luke", 900);
        map.put("Mary", 10000);
        map.put("Phil", 550);
        map.put("Rob", 100);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        HashMap<String, Integer> copy = new HashMap<>(map);
        for(Map.Entry<String, Integer> item : copy.entrySet()){
            String key = item.getKey();
            int value = item.getValue();
            if(value < 500){
                map.remove(key, value);
            }
        }

    }

    public static void main(String[] args) {
//        HashMap<String, Integer> map = createMap();
//        System.out.println(map);
//        removeItemFromMap(map);
//        System.out.println(map);
    }
}