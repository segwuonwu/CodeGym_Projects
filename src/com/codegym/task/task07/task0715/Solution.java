package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] s = {"Sam", "I", "Am"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
            list.add("Ham");
        }

        for(String w : list)
            System.out.println(w);
    }
}
