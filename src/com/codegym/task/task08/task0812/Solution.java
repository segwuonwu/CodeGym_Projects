package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }

        int count = 1;
        int max = 0;
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).equals(list.get(i-1))){
                count++;
            }
            else {
                count = 1;
            }
            if(max<count){
                max = count;
            }
        }
        System.out.println(max);
    }
}