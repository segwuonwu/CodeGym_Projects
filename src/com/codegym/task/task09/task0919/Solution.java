package com.codegym.task.task09.task0919;

/* 
Dividing by zero

*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception was thrown");
            e.printStackTrace();
        }

    }

    public static void divideByZero(){
        int result = 5/0;
        System.out.println(result);
    }
}
