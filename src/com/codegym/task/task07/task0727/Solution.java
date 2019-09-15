package com.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changing functionality

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }

//        for (int i = 0; i < listUpperCase.size(); i++) {
//            System.out.println(listUpperCase.get(i));
//        }

        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            list2.add(s);
        }

        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i).length() % 2 == 0){
                for (int j = 0; j < 2; j++) {
                    System.out.print(list2.get(i) + " ");
                }
            }
            else if(list2.get(i).length() % 2 != 0){
                for (int j = 0; j < 3; j++) {
                    System.out.print(list2.get(i) + " ");
                }

            }
            System.out.println();
        }
    }
}
