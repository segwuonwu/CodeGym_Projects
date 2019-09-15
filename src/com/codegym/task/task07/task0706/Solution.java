package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];
        int odd = 0, even = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){

                even += arr[i];
            }
            else{
                odd += arr[i];
            }
        }

        if(even > odd){
            System.out.println("Even-numbered houses have more residents.");
        }
        else{
            System.out.println("Odd-numbered houses have more residents.");
        }

        br.close();
    }
}
