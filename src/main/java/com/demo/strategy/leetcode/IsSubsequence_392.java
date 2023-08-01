package com.demo.strategy.leetcode;

public class IsSubsequence_392 {
    public static void main(String[] args) {
//        System.out.println(isSubsequence("abc", "ahbgdc"));
//        System.out.println(isSubsequence("axc", "ahbgdc"));
//        System.out.println(isSubsequence("b", "c"));
//        System.out.println(isSubsequence("", "ahbgdc"));
//        System.out.println(isSubsequence("", ""));
        System.out.println(isSubsequence("acb", "ahbgdc"));

    }

    public static boolean isSubsequence(String s, String t) {
        // Two pointers
        // Need to care about order then use two pointers and while loop
        // while it run first condition, not match then j++
        // if match then i++
        // pattern when two pointers and order is important
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i += 1;
            }
            j+=1;
        }

        if (i != s.length()) {
            return false;

        }

        return true;

    }
}
