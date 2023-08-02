package com.demo.strategy.leetcode;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
//        System.out.println(lengthOfLastWord("Hello World"));

//        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
//        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("a"));

    }

    public static int lengthOfLastWord(String s) {

        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (counter == 0 && s.charAt(i) == ' ') {
                continue;
            } else if (s.charAt(i) == ' ') {
                break;
            } else {
                counter++;
            }
        }
        return counter;
    }
}
