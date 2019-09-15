package com.codegym.task.task09.task0908;

/* 
Exception while working with strings

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        try {
            String s = null;
            String m = s.toLowerCase();
            System.out.println(m);
        }
        catch (NullPointerException e) {
            //write your code here
            System.out.println("NullPointerException has been caught");
        }
    }
}
