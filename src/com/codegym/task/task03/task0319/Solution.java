package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println(name + " will receive " + number1 + " in " + number2 + " years.");

        sc.close();
    }
}
