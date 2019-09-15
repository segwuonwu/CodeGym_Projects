package com.codegym.task.task07.task0724;

/* 
Family census
Create 9 different Human objects (4 objects without a father and mother and 5 objects with them).
*/

public class Solution {
    public static void main(String[] args) {
        // write your code here

        Human mathew = new Human("Mathew", true, 51);
        Human mark = new Human("Mark", true, 45);
        Human mary = new Human("Mary", false, 40);
        Human jane = new Human("Jane", false, 38);
        Human peter = new Human("Peter", true, 26, mark, jane);
        Human ann = new Human("Ann", false, 21, mathew, mary);
        Human faith = new Human("Faith", false, 25, mathew, mary);
        Human pet = new Human("Pet", true, 12, peter, ann);
        Human bella = new Human("Bella", false, 2, mark, mary);

        System.out.println(mathew.toString());
        System.out.println(mark.toString());
        System.out.println(mary.toString());
        System.out.println(jane.toString());
        System.out.println(peter.toString());
        System.out.println(ann.toString());
        System.out.println(faith.toString());
        System.out.println(pet.toString());
        System.out.println(bella.toString());
    }

    public static class Human {
        // write your code here
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}