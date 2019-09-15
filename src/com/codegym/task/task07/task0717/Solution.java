package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String > list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String s = br.readLine();
            list.add(s);
        }
        ArrayList<String> result = doubleValues(list);

        // Display result
        for(String w: result)
            System.out.println(w);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //write your code here
        ArrayList<String> arr = new ArrayList<>();
        for(String w : list)
            arr.add(w);


        for (int i = 0, j = 0; i < list.size()-1;) {
            if(list.get(i) == arr.get(j)){
                //j++;
                i++;
                list.add(i, arr.get(j));
                j++;
            }
            else
                i++;
        }

        int n = arr.size();
        list.add(list.size(), arr.get(n-1));

        return list;
    }
}
