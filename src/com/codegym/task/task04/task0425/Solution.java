package com.codegym.task.task04.task0425;

/* 
Target locked!
Point (a,b) belongs to a quadrant if the following conditions are true:
for the first quadrant: a>0 and b>0;
for the second quadrant: a<0 and b>0;
for the third quadrant: a<0 and b<0;
for the fourth quadrant: a>0 and b<0.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String num = br.readLine();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());


        if(a>0 && b>0)
            System.out.println(1);
        else if(a<0 && b>0)
            System.out.println(2);
        else if(a<0 && b<0)
            System.out.println(3);
        else
            System.out.println(4);

        br.close();
    }
}
