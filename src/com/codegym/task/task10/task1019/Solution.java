package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map = new HashMap<>();
        try {
            while (true) {
                Integer id = Integer.parseInt(reader.readLine());
                if (id.toString().isEmpty())
                    break;

                String name = reader.readLine();
                if(name.isEmpty() && !id.toString().isEmpty()){
                    map.put(name, id);
                }
                if (name.isEmpty()) {
                    break;
                }
                map.put(name, id);
            }
        }
        catch (Exception e){

        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){

            System.out.println(entry.getValue()+" "+entry.getKey());
        }

        //System.out.println("Id=" + id + " Name=" + name);
    }
}
