package com.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        map.put("Dog", "Run");
        map.put("Horse", "Run");
        map.put("Movie", "Watch");
        map.put("Food", "Eat");
        map.put("Game", "Play");
        map.put("Remote", "Control");
        map.put("Man", "Husband");
        map.put("Woman", "Wife");
        map.put("Boy", "Son");
        map.put("Girl", "Daughter");
        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here
        Map<String, String> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, String>> itr = copy.entrySet().iterator();
        int count = 0;

        while (itr.hasNext()){
            String s1 = itr.next().getValue();
            Iterator<Map.Entry<String, String>> itr2 = copy.entrySet().iterator();
            while (itr2.hasNext()){
                String s2 = itr2.next().getValue();
                if(s2.equals(s1)){
                    if(count >0) {
                        removeItemFromMapByValue(map, s2);
                        break;
                    }
                    count++;
                }
            }
            count = 0;
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
//
//        System.out.println(map);
//        removeFirstNameDuplicates(map);
//        System.out.println(map);
    }
}
