package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // write your code here
        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] chars = list.stream().collect(Collectors.joining()).toCharArray();

        for(Character c : alphabet){
            charCount.put(c,0);
        }

        for(char c : chars){
            if (charCount.containsKey(c)) {
                // If char is present in charCountMap,
                // incrementing it's count by 1
                charCount.put(c, charCount.get(c) + 1);
            }
        }

        for (Map.Entry entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }

}
