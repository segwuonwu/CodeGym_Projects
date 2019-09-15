package com.codegym.task.task09.task0903;

/* 
Who called me?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println("In method 1, stack trace: " + stackTraceElements[2].getLineNumber());

        return stackTraceElements[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println("In method 2, stack trace: " + stackTraceElements[2].getLineNumber());

        return stackTraceElements[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println("In method 3, stack trace: " + stackTraceElements[2].getLineNumber());

        return stackTraceElements[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println("In method 4, stack trace: " + stackTraceElements[2].getLineNumber());

        return stackTraceElements[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println("In method 5, stack trace: " + stackTraceElements[2].getLineNumber());

        return stackTraceElements[2].getLineNumber();
    }
}
