package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if(num > 0 && num < 10 && (num%2 == 0)){
            System.out.println("even single-digit number");
        }
        else if(num >= 10 && num < 100 && (num%2 == 0)){
            System.out.println("even two-digit number");
        }
        else if(num >= 100 && num < 1000 && (num%2 == 0)){
            System.out.println("even three-digit number");
        }
        else if(num > 0 && num < 10 && (num%2 != 0)){
            System.out.println("odd single-digit number");
        }
        else if(num >= 10 && num < 100 && (num%2 != 0)){
            System.out.println("odd two-digit number");
        }
        else if(num >= 100 && num < 1000 && (num%2 != 0)){
            System.out.println("odd three-digit number");
        }

        br.close();

    }
}
