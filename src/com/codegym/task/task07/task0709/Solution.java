package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            list.add(s);
        }

        int min = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if(min > list.get(i).length()){
                min = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(min == list.get(i).length())
                System.out.println(list.get(i));
        }
    }
}
