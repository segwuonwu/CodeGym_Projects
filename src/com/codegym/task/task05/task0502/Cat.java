package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write your code here
        if(this.age > anotherCat.age  ||  this.weight > anotherCat.weight ||  this.strength > anotherCat.strength ){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.age = 10; cat1.weight = 10; cat1.strength = 10;
        cat2.age = 5; cat2.weight = 5; cat2.strength = 5;

        cat1.fight(cat2);
    }
}
