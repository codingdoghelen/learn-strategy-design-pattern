package com.demo.strategy.leetcode;

import java.util.Locale;

public class ValidPalindrome_125 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindromeRecursion(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    public boolean isPalindromeFaster(String s) {

        // Use of Charater.isLetterOrDigit method
        // Faster: Use recursion

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            Character start = s.charAt(i);
            Character end = s.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindrome(String s) {
        // 2 pointers with regex
        // but very slow
        String copy = s.toLowerCase().replaceAll("\\p{Punct}", "").replaceAll("\\s+", "");

        int j = 0;
        for (int i = copy.length() - 1; i >= 0; i--, j++) {
            if (copy.charAt(j) != copy.charAt(i)) {
                return false;
            }
        }

        return true;
    }


}
