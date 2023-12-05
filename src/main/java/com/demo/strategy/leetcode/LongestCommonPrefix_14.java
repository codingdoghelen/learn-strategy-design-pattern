package com.demo.strategy.leetcode;

import java.util.HashMap;

public class LongestCommonPrefix_14 {

    public static void main(String[] args) {
//        strs = ["flower","flow","flight"]
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        int counter = 0;
        int pointer = 0;

        String res = "";
        for (String str : strs) {

            for (char s : str.toCharArray()) {
                if ( s != str.charAt(pointer)) {
                    return res;
                }
                res.concat(String.valueOf(s));
                pointer++;

            }
        }

        return res;
    }

}
