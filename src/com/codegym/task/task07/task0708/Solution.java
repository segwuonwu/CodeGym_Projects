package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            strings.add(s);
        }

        int max = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() > max){
                max = strings.get(i).length();
                //System.out.println(strings.get(i));
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if(max == strings.get(i).length())
                System.out.println(strings.get(i));
        }



    }


}
