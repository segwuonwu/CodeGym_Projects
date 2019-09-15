package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> odd3 = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(br.readLine());
            list.add(x);
        }

        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if(x % 3 == 0 && x % 2 == 0){
                odd3.add(x);
                even.add(x);
            }
            else if(x % 3 == 0)
                odd3.add(x);
            else if(x % 2 == 0)
                even.add(x);
            else
                odd.add(x);
        }

        printList(odd3);
        printList(even);
        printList(odd);
    }

    public static void printList(List<Integer> list) {
        //write your code here
        for(Integer x : list)
            System.out.println(x);
    }
}
