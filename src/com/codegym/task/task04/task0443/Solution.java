package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int year = Integer.parseInt(br.readLine());
        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        System.out.println("My name is " + name + ".");
        System.out.println("I was born on " + month+"/"+day+"/"+year);

        br.close();
    }
}
