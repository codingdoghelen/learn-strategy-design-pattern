package com.demo.strategy.leetcode;

public class MergeStringsAlternately_1768 {

    public static void main(String[] args) {
//        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));

    }

    public static String mergeAlternately(String word1, String word2) {

        char [] mergedWord = new char [word1.length() + word2.length()];

        int pointer = 0;
        int i = 0;
        int j = 0;

        while (pointer <= mergedWord.length - 1) {
            if (i >= word1.length()) {
                mergedWord[pointer] = word2.charAt(j);
            } else if (j >= word2.length()) {
                mergedWord[pointer] = word1.charAt(i);
            } else {
                mergedWord[pointer] = word1.charAt(i);
                mergedWord[++pointer] = word2.charAt(j);
            }

            pointer++;
            i++;
            j++;
        }
        return String.valueOf(mergedWord);
    }
}
