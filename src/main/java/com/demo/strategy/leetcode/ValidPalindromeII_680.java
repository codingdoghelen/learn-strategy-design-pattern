package com.demo.strategy.leetcode;

import java.util.HashMap;

public class ValidPalindromeII_680 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));  //T
        System.out.println(validPalindrome("abca"));  // T
        System.out.println(validPalindrome("abc")); // F
        System.out.println(validPalindrome("cbbcc")); // true

        System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga")); // true
        System.out.println(validPalindrome("cxcaac")); // F

    }

    public static boolean validPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return validP(s, start + 1, end) || validP(s, start, end - 1);
            }
            start++;
            end--;

        }

        return true;
    }

    public static boolean validP(String string, int start, int end) {

        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;


    }
}