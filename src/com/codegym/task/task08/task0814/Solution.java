package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(30);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(11);
        set.add(40);
        set.add(21);
        set.add(22);
        set.add(15);
        set.add(70);
        set.add(9);
        set.add(10);
        set.add(33);
        set.add(7);
        set.add(19);
        set.add(8);
        set.add(18);
        set.add(100);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here
        Iterator<Integer> num = set.iterator();

        while(num.hasNext()){
            if(num.next()>10){
                num.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
        //System.out.println(createSet());

        //System.out.println(removeAllNumbersGreaterThan10(createSet()));

    }
}
