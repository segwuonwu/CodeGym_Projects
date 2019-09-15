package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //List of cities
        Map<String, String> map = new HashMap<>();
        while (true){
            String cities = reader.readLine();
            if (cities.isEmpty()) break;
            String family = reader.readLine();

            map.put(cities, family);
        }

        String city = reader.readLine();
        for(Map.Entry<String, String> pair: map.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            if(city.equalsIgnoreCase(key)){
                System.out.println(value);
            }
        }

        // List of addresses
//        List<String> addresses = new ArrayList<>();
//        while (true) {
//            String family = reader.readLine();
//            if (family.isEmpty()) break;
//
//            addresses.add(family);
//        }

        // Read the house number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < addresses.size()) {
//            String familyName = addresses.get(houseNumber);
//            System.out.println(familyName);
//        }
    }
}
