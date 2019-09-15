package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String word = str.replaceAll("\\s+", "");

        ArrayList<Character> a = new ArrayList<>();

        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(!isVowel(c)){
                a.add(c);
            }
            else {
                System.out.print(c + " ");
            }
        }
        System.out.println();
        for(Character c : a){
            System.out.print(c + " ");
        }

        //Solution 2
//        char[] a = new char[word.length()];
//        for(int i = 0; i<word.length(); i++){
//            char c = word.charAt(i);
//            if(!isVowel(c)){
//                a[i] = c;
//            }
//            else {
//                System.out.print(c + " ");
//            }
//        }
//        System.out.println();
//
//        for(int i = 0; i<a.length; i++){
//            if(a[i] != 0){ //null or /u000
//                System.out.print(a[i]+" ");
//
//            }
//        }

        //Solution 3
//        StringBuilder sb = new StringBuilder();
//        for(char c : a){
//            if(c != '0'){
//                sb.append(c+" ");
//            }
//
//        }
//        System.out.print(sb.toString());
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}