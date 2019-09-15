package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Human grandFather = new Human("grandFather", true, 45, new ArrayList<>());
        Human grandFather1 = new Human("grandFather1", true, 45, new ArrayList<>());

        Human grandMother = new Human("grandMother", false, 40, new ArrayList<>());
        Human grandMother1 = new Human("grandMother1", false, 40, new ArrayList<>());

        Human father = new Human("Father", true, 35, new ArrayList<>());
        Human mother = new Human("Mother", false, 30, new ArrayList<>());

        Human child = new Human("child1", true, 12, new ArrayList<>());
        Human child1 = new Human("child2", false, 10, new ArrayList<>());
        Human child2 = new Human("child3", false, 8, new ArrayList<>());

        grandFather.children.add(father);
        grandMother.children.add(father);
        grandFather1.children.add(mother);
        grandMother1.children.add(mother);

        father.children.add(child);
        father.children.add(child1);
        father.children.add(child2);

        mother.children.add(child);
        mother.children.add(child1);
        mother.children.add(child2);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child);
        System.out.println(child1);
        System.out.println(child2);
    }

    public static class Human {
        //write your code here
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
