package com.codegym.task.task05.task0526;

/* 
Man and woman
name + " " + age + " " + address
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Man man1 = new Man("John", 20, "Auburn");
        Man man2 = new Man("Jake", 30, "Pullman");
        Woman w1 = new Woman("Steph", 15, "Seattle");
        Woman w2 = new Woman("Ann", 18, "Tacoma");

        System.out.println(man1.getName()+" "+man1.getAge()+" "+man1.getAddress());
        System.out.println(man2.getName()+" "+man2.getAge()+" "+man2.getAddress());
        System.out.println(w1.getName()+" "+w1.getAge()+" "+w1.getAddress());
        System.out.println(w2.getName()+" "+w2.getAge()+" "+w2.getAddress());

    }

    //write your code here
    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
