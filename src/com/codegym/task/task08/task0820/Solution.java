package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<>();

        //write your code here
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        HashSet<Dog> result = new HashSet<>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        Set<Object> pets = new HashSet<>();
        for(Object cat:cats){
            pets.add(cat);
        }
        for (Object dog: dogs){
            pets.add(dog);
        }
        //pets.add(cats);
        //pets.add(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        //pets.removeAll(cats);
        for (Object o : cats){
            pets.remove(o);
        }
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        for(Object o: pets){
            System.out.println(o);
        }
    }

    //write your code here
    public static class Cat{
        //String name;
        public Cat(){
           //this.name = name;
        }
    }

    public static class Dog{
        //String name;
        public Dog(){
            //this.name = name;
        }
    }
}
