package com.codegym.task.task03.task0325;

import java.io.*;

/* 
Financial expectations

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);

        System.out.println("I will earn $"+ n +" per hour");
    }
}
