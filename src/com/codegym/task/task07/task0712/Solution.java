package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String s = br.readLine();
            list.add(s);
        }

        int max = list.get(0).length();
        int n = list.size();
        int min = list.get(0).length();

        for (int i = 0; i < n; i++) {
            if(list.get(i).length() > max){
                max = list.get(i).length();
            }
            else if(min > list.get(i).length())
                min = list.get(i).length();
        }

//        for (int i = 0; i < n; i++) {
//            if(min > list.get(i).length())
//                min = list.get(i).length();
//        }

        for (int i = 0; i < n; i++) {
            if(max == list.get(i).length()){
                System.out.println(list.get(i));
                break;
            }
            else if(min == list.get(i).length()){
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
