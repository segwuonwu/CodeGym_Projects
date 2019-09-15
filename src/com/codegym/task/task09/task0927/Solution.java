package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        Map<String, Cat> map = new HashMap<>();
        map.put("kitty", new Cat("Kitty"));
        map.put("pussy", new Cat("Pussy"));
        map.put("Kit", new Cat("Kit"));
        map.put("cat", new Cat("Cat"));
        map.put("place", new Cat("Place"));
        map.put("stamp", new Cat("Stamp"));
        map.put("bank", new Cat("Bank"));
        map.put("paul", new Cat("Paul"));
        map.put("Pear", new Cat("Pear"));
        map.put("cup", new Cat("Cup"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here
        Set<Cat> set = new HashSet<>();
        for(Map.Entry<String, Cat> pair : map.entrySet()){
            set.add(pair.getValue());
        }

        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
