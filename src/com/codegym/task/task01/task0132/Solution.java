package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        int n , result = 0;
        while (number>0){
            n = number%10;
            result += n;
            number /= 10;
        }

        return result;
    }
}