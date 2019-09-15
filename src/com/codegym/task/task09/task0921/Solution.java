package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //write your code here
        ArrayList<Integer> list = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while(true){
                int n = Integer.parseInt(br.readLine());
                list.add(n);
            }

        }
        catch(Exception e){
            for(Integer num : list){
                System.out.println(num);
            }
        }

    }
}
