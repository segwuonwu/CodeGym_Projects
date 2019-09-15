package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //write your code here
        int num[] = new int[20];
        int n = num.length;
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        maximum = num[0];
        minimum = num[n-1];
        for (int i = 0; i < n; i++) {
            if(num[i] > maximum){
                maximum = num[i];
            }

            if (num[i] < minimum)
                minimum = num[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}
