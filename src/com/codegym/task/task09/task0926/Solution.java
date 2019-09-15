package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //write your code here
        ArrayList<int[]> list = new ArrayList<>();
        int[] a = new int[5];
        int[] b = new int[2];
        int[] c = new int[4];
        int[] d = new int[7];
        int[] e = new int[0];

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4; a[4] = 5;
        b[0] = 0; b[1] = 1;
        c[0] = 2; c[1] = 4; c[2] = 6; c[3] = 8;
        d[0] = 1; d[1] = 2; d[2] = 3; d[3] = 4; d[4] = 5; d[5] = 6; d[6] = 7;
       // e[0]=0;

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
