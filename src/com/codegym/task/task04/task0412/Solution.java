package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int result = 0;
        if(num > 0){
            result = num + num;
            System.out.println(result);
        }
        else if(num < 0){
            result = num +1;
            System.out.println(result);
        }
        else {
            System.out.println(result);
        }

        br.close();
    }

}