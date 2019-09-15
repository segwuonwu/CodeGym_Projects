package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String s = br.readLine();
            list.add(s);
        }

        for (int i = 1, j = 1; i < list.size(); i++, j++) {
            if(list.get(i-1).length() <= list.get(j).length()){

                continue;
            }
            else {
                System.out.println(i);
                break;
            }

        }

    }
}

