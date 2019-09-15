package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        double sum = 0;
        while (true) {
            double number = Double.parseDouble(br.readLine());

            if (number == -1)
                break;
            count++;
            sum += number;
        }
        System.out.println(sum/count);
    }
}

