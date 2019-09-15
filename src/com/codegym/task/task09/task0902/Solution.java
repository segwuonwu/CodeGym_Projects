package com.codegym.task.task09.task0902;

/* 
Stack trace revisited

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println("In method 1, stack trace: " + stackTraceElements[2].getMethodName());

        return stackTraceElements[2].getMethodName();
    }

    public static String method2() {
        method3();
        //write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println("In method 2, stack trace: " + stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }

    public static String method3() {
        method4();
        //write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println("In method 3, stack trace: " + stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }

    public static String method4() {
        method5();
        //write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println("In method 4, stack trace: " + stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }

    public static String method5() {
        //write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println("In method 5, stack trace: " + stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }
}
