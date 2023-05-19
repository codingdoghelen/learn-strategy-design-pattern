package com.demo.strategy.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote_383 {
    public static void main(String[] args) {

//        System.out.println(canConstruct("a", "b")); // false
//        System.out.println(canConstruct("aa", "ab")); // false
        System.out.println(canConstruct("aa", "aab")); // true
        System.out.println(canConstruct("aab", "baa")); // true
        System.out.println(canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi")); // false


    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        // Can also use below for each loop but it creates another char object which increase the space complexity
//        for(char c : ransomNote.toCharArray()){
//            result.put(c,result.getOrDefault(c,0)+1);
//        }

        for (int i = 0; i < magazine.length(); i++) {
            char character = magazine.charAt(i);


//            if (map.containsKey(character)) {
//                map.put(character, map.get(character) + 1);
//            } else {
//                map.put(character, 1);
//            }

            // To get the number of hashmap value, use getOrDefault
            int currentCount = map.getOrDefault(character, 0);

//            if (map.containsKey(character)) {
                map.put(character, currentCount + 1);
//            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char character = ransomNote.charAt(i);

            if (!map.containsKey(character) || map.get(character) == 0) {
                return false;
            }
            int currentCount = map.getOrDefault(character, 0);

            map.put(character, currentCount - 1);

        }
        return true;

    }

}



