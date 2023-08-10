package com.demo.strategy.leetcode;

import java.util.*;

public class SubstringsOfSizeThreeWithDistinctCharacters_1876 {
    public static void main(String[] args) {
//        System.out.println(countGoodSubstrings2("xyzzaz"));
        System.out.println(countGoodSubstrings2("aababcabc"));

    }

    public static int countGoodSubstrings2(String s) {
        // Sliding window
        // left = 0; right = 0; n = 3;

        int left = 0;
        int counter = 0;

        if (s.length() < 3) {
            return 0;
        }


        while (left < s.length() - 2) {

            if (s.charAt(left) != s.charAt(left + 1) && s.charAt(left + 1) != s.charAt(left + 2)
                    && s.charAt(left + 2) != s.charAt(left)) {
                counter++;

            }
            left++;

        }
        return counter;

    }
    public static int countGoodSubstrings(String s) {
        // Sliding window
        // left = 0; right = 0; n = 3;

        // Set inside the loop
        // one for loop
        // one while loop

        int left = 0;
        int counter =0;

        if (s.length() <3){
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {

            Set<Character> set = new HashSet();
            while (left < s.length() && set.size() < 3) {
                if (!set.add(s.charAt(left))) {
                    break;

                } else {
                    left++;

                }

            }
            if (set.size() == 3)  counter++;
            left = i+1;

        }

        return counter;
    }

}
