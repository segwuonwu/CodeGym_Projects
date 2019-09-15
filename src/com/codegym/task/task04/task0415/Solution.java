package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int x = a+b;
        int y = a+c;
        int z = b+c;

        if(x>c && y>b && z>a){
            System.out.println("The triangle is possible.");
        }
        else {
            System.out.println("The triangle is not possible.");
        }

    }
}