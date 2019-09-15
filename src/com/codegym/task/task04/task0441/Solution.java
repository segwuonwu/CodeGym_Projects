package com.codegym.task.task04.task0441;


/* 
Somehow average

*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if(a==b && b==c)
            System.out.println(a);
        else if(a==b)
            System.out.println(a);
        else if(a==c)
            System.out.println(a);
        else if(c==b)
            System.out.println(b);
        else if(a>b&&b<c){
            if(a<c){
                System.out.println(a);
            }
            else
                System.out.println(c);
        }
        else if(a>b&&b>c)
            System.out.println(b);
        else if(a<b&&b<c)
            System.out.println(b);
        else if(a<b&&b>c) {
            if (a > c) {
                System.out.println(a);
            } else
                System.out.println(c);
        }
        else
            System.out.println(a);

        br.close();
    }
}
