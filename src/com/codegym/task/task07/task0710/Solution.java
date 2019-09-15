package com.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
To the top of the list

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String s = "";
        for (int i = 0; i < 10; i++) {
            s= br.readLine();
            list.add(0, s);
        }

        for(String w : list)
            System.out.println(w);
    }
}
