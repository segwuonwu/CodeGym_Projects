package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> list = new ArrayList<>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        while(N > 0){
            String s = reader.readLine();
            list.add(s);
            N--;
        }

        for (int i = 0; i < list.size(); i++) {
            if(i < M){
                String temp = list.remove(0);
                list.add(temp);
            }

        }

        for(String w : list)
            System.out.println(w);
    }
}
