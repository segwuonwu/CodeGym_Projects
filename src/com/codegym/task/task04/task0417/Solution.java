package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if(a == b && a == c){
            System.out.println(a+" "+b+" "+c);
        }
        else if(a == b){
            System.out.println(a+" "+b);
        }
        else if(a == c){
            System.out.println(a+" "+c);
        }
        else if(c==b && a!=c){
            System.out.println(b+" "+c);
        }


        br.close();
    }
}