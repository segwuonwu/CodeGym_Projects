package com.codegym.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        list.add("fine");
        list.add("dog");
        list.add("cat");
        list.add("ball");
        list.add("car");

        int n = list.size();
        System.out.println(n);

        for(String word : list)
            System.out.println(word);
    }
}
