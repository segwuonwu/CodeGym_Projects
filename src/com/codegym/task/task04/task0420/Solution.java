package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());


        if ( (a >= b && a >= c) && b >= c )
            System.out.println(a+" "+b+" "+c);
        else if ((a >= b && a >= c) && c >= b)
            System.out.println(a+" "+c+" "+b);
        else if ( (b >= a && b >= c) && a >= c )
            System.out.println(b+" "+a+" "+c);
        else if ((b >= a && b >= c) && c >= a)
            System.out.println(b+" "+c+" "+a);
        else if ( (c >= b && c >= a) && b >= a )
            System.out.println(c+" "+b+" "+a);
        else if ((c >= b && c >= a) && a >= b)
            System.out.println(c+" "+a+" "+b);

        br.close();
    }
}
