package com.demo.strategy.leetcode;

public class ReverseString_344 {
    public static void main(String[] args) {
//        char[] chars = {'h', 'e', 'l', 'l', 'o'};
//        reverseString(chars);
        char[] chars2 = {'H','a','n','n','a','h'};
        reverseString(chars2);
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

//        System.out.println(s);
    }
}
