package com.codegym.task.task07.task0705;

import org.w3c.dom.ranges.Range;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        int n = a.length;
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        b = Arrays.copyOfRange(a, 0, n/2);
        c = Arrays.copyOfRange(a, n/2, n);

        for (int i = 0; i < 10; i++) {
            System.out.println(c[i]);

        }

    }
}
