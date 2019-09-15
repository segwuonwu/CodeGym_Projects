package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if(num < 0 && (num%2 == 0)){
            System.out.println("Negative even number");
        }
        else if(num > 0 && (num%2 == 0)){
            System.out.println("Positive even number");
        }
        else if(num < 0 && (num%2 != 0)){
            System.out.println("Negative odd number");
        }
        else if(num > 0 && (num%2 != 0)){
            System.out.println("Positive odd number");
        }
        else{
            System.out.println("Zero");
        }

        br.close();
    }
}
