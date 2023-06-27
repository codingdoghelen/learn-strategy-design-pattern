package com.demo.strategy.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram_242 {
    public static void main(String[] args) {
        System.out.println(isAnagram_sorted("anagram", "nagaram"));
        System.out.println(isAnagram_sorted("rat", "car"));
        System.out.println(isAnagram_sorted("ab", "a"));

    }

    public static boolean isAnagram_sorted(String s, String t) {

        // Sorting approach Beats Time 61.51%; Memory 99.40%
        // ** Can use - 'a' to get the char index

        if (s.length() != t.length()) return false;

        int[] sCharArr = new int[26];
//        int[] tCharArr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sCharArr[s.charAt(i) - 'a']++;
            sCharArr[t.charAt(i) - 'a']--;
        }

        for (int i=0; i<  sCharArr.length;i++){
            if (sCharArr[i] < 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value < 0) return false;
        }
        return true;
    }
}
