package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(br.readLine());


        if (t%5.0 >=0&&t%5.0<3) {
            System.out.println("green");
        }
        else if(t%5.0>=3&&t%5.0<4) {
            System.out.println("yellow");
        }
        else
            System.out.println("red");

    }
}