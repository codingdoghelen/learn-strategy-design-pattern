package com.demo.strategy.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII_219 {
    public static void main(String[] args) {
//        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
//        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
//
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        // Sliding window
        // Window Start / Window End
        int left = 0;
        for (int right = 0; right < nums.length; right++) {

            if (set.size() > k) {
                set.remove(nums[left]);
                left++;
            }


            if (set.contains(nums[right])) return true;

            set.add(nums[right]);
        }

        return false;
    }


//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//
//
//        for (int j = 0; j < nums.length; j++) {
//            int index = j;
//            Set<Integer> set = new HashSet<>();
//
//            while (index <= k + j && index < nums.length) {
//
//                if (set.contains(nums[index])) return true;
//
//                set.add(nums[index]);
//
//                index++;
//            }
//        }
//
//        return false;
//    }
}
