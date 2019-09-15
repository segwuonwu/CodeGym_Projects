package com.codegym.task.task04.task0421;

/* 
Jen or Jen?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n1 = br.readLine();
        String n2 = br.readLine();

        if(n1.equals(n2)){
            System.out.println("The names are identical");
        }
        else if(n1.length() == n2.length()){
            System.out.println("The names are the same length");
        }
        br.close();
    }
}
