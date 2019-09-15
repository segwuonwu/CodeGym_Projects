package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            list.add(s);
        }

        for (int i = 0; i < 13; i++) {
            String s = list.remove(4);
            list.add(0, s);
        }


        for(String w : list){
            System.out.println(w);
        }
    }
}
