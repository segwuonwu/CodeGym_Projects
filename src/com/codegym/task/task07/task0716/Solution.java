package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list.add("lol");
        list.add("book");
        list.add("rock");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i< list.size();){
            if(!(list.get(i).contains("r")) && !(list.get(i).contains("l"))) {
                list.get(i);
                i++;
            }
            else if(list.get(i).contains("r") && list.get(i).contains("l")) {
                list.get(i);
                i++;
            }
            else if(list.get(i).contains("r")) {
                list.remove(i);
            }
            else {
                list.get(i);
                arr.add(list.get(i));
                i++;
            }
        }
        for(String s: arr)
            list.add(s);
        return list;
    }
}