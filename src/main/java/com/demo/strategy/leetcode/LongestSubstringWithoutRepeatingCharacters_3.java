package com.demo.strategy.leetcode;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Explanation: The answer is "abc", with the length of 3.
//        System.out.println(lengthOfLongestSubstring("bbbbb")); // Explanation: The answer is "abc", with the length of 3.
//        System.out.println(lengthOfLongestSubstring("pwwkew")); // Explanation: The answer is "abc", with the length of 3.
//        System.out.println(lengthOfLongestSubstring("aab")); // Explanation: The answer is "abc", with the length of 3.
        System.out.println(lengthOfLongestSubstring("ddddvdf")); // Explanation: The answer is "abc", with the length of 3.

    }

    public static int lengthOfLongestSubstring(String s) {
        // Sliding window
        // Dynamic programming
        // Math
        // Hash Table
        // Thoughts:
        // 1. Sliding window - left and right start at 0
        // 2. 1 For loop adding the str into the set
        // 3. 1 while loop checking if it is duplicated
        // 4. if duplicated that means the duplicated value is the left one
        // becoz each entered into the set is unique value,
        // if duplicated, it is the left one,
        // 5. so we need to left++
        // 6. return the sliding window [right-left + 1]

        HashSet<Character> set = new HashSet<>();

        int max = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (!set.add(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            max = Math.max(max, right - left + 1);
        }


        return max;

    }
}