package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int i = 1, mult=0;
        while(i<=10){
            int j = 1;
            while(j<=10){
                mult = i*j;
                System.out.print(mult+" ");
                j++;
            }
            i++;
            System.out.println();
        }



    }
}
