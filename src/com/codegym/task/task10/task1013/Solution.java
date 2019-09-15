package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private int age;
        private String name ;
        private String gender;
        private String sleep;
        private String walk;
        private String speak;

        public Human(String name)
        {
            this.name = name;
        }

        public Human(int age)
        {
            this.age = age;
        }

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Human(String name, String gender){
            this.name = name;
            this.gender = gender;
        }

        public Human(String name, int age, String gender){
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public Human(String name, String sleep, String gender){
            this.name = name;
            this.sleep = sleep;
            this.gender = gender;
        }

        public Human(String name,int age, String sleep, String gender){
            this.name = name;
            this.age = age;
            this.sleep = sleep;
            this.gender = gender;
        }

        public Human(String name, String sleep, String gender, String walk){
            this.name = name;
            this.sleep = sleep;
            this.gender = gender;
            this.walk = walk;
        }

        public Human(String name, String sleep, String gender, String walk, String speak){
            this.name = name;
            this.sleep = sleep;
            this.gender = gender;
            this.walk = walk;
            this.speak = speak;
        }

        public Human(String name, String sleep, String gender, String walk, String speak, int age){
            this.name = name;
            this.sleep = sleep;
            this.gender = gender;
            this.walk = walk;
            this.speak = speak;
            this.age = age;
        }
    }
}
