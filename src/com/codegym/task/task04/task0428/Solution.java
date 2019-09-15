package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int count = 0;

        if(a>0&&b>0&&c>0) {
            count = 3;
            System.out.println(count);
        }
        else if(a>0&&b>0) {
            count = 2;
            System.out.println(count);
        }
        else if(a>0&&c>0) {
            count = 2;
            System.out.println(count);
        }
        else if(b>0&&c>0) {
            count = 2;
            System.out.println(count);
        }
        else if(a>0) {
            count = 1;
            System.out.println(count);
        }
        else if(b>0) {
            count = 1;
            System.out.println(count);
        }
        else if(c>0) {
            count = 1;
            System.out.println(count);
        }
        else
            System.out.println(count);

        br.close();

    }
}
