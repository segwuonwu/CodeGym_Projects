package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        /* write your code here */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String name = sc.next();

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String name = reader.readLine();
//        String num = reader.readLine();
//        int number = Integer.parseInt(num);
        System.out.println(name +" will take over the world in "+ number +" years. Mwa-ha-ha!");
        sc.close();
    }
}
