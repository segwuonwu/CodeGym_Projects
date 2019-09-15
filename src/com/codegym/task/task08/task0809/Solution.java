package com.codegym.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Time for 10,000 insertions
Requirements:
1. The program should display numbers on the screen.
2. The main method should call the getInsertTimeInMs method only twice.
3. The insert10000(List list) method must insert 10,000 items into the list.
4. The getInsertTimeInMs method should call the insert10000 method only once.
5. The getInsertTimeInMs method should return the time (in milliseconds) that it takes to perform 10,000 insertions on the list.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // write your code here
        Date curTime = new Date();
        insert10000(list);

        // write your code here
        Date newTime = new Date();
        long msDelay = newTime.getTime() - curTime.getTime();
        return msDelay;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
