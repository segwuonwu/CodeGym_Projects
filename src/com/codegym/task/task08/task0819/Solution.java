package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        for (Cat cat: cats)
        {
            cats.remove(cat);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Set<Cat> set = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        Iterator<Cat> itr = cats.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

    // step 1
    public static class Cat{
//        String name;
//
//        public Cat(String name){
//            this.name = name;
//        }

        public Cat(){

        }
    }
}
