package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

*/

import java.io.*;

public class Solution {
    static void maxNum(int a, int b, int c, int d){
        int maxAb, maxCD, max;
        maxAb = max(a,b);
        maxCD = max(c,d);

        if(a==b && b==c && c==d) {
            System.out.println(a);
        }
        else if(maxAb > maxCD){
            System.out.println(maxAb);
        }
        else{
            System.out.println(maxCD);
        }
    }

    static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        maxNum(a,b,c,d);

        br.close();
    }
}
