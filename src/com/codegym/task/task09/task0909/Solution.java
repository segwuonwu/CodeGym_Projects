package com.codegym.task.task09.task0909;

/* 
Exception when working with arrays

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        try {
            int[] m = new int[2];
            m[8] = 5;
            System.out.println(m);
        }
        catch (ArrayIndexOutOfBoundsException e){
        //write your code here
            System.out.println("ArrayIndexOutOfBoundsException has been caught");
        }
    }
}
