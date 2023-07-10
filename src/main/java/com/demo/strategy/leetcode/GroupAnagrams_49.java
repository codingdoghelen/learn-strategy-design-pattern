package com.demo.strategy.leetcode;

import java.util.*;

import static org.apache.logging.log4j.util.Strings.concat;

public class GroupAnagrams_49 {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"})); // [0,1,9,16,100]

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
//        int [] charArr = new int[26];

        // for loop
//        for (String str : strs) {
//            for (int i=0;i<str.length();i++) {
////                charArr[str.charAt(i) - 'a']  ++;
//
//                HashMap<Character, Integer> map = new HashMap<>();
//                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0));
//
//
//            }
//        }


        Map<String, List<String>> map = new HashMap();
        for (String s : strs ) {
//            char[] c = s.toCharArray();
//            Arrays.sort(c);
            int[] hash = new int[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }

            String key = new String(Arrays.toString(hash));
            // key: [1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0]
            // value: "eat"
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);


        }
        return new ArrayList(map.values());
    }

}
