package com.demo.strategy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray_448 {
    public static void main(String[] args) {
        System.out.println( findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1})   );
        System.out.println( findDisappearedNumbers(new int[]{1,1})   );
        System.out.println( findDisappearedNumbers(new int[]{2,2})   );


    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int length = nums.length;
        List<Integer> list = new ArrayList<>();
        int max = nums[0];

        for (int i = 0; i < length; i++) {

            max = Math.max(max, nums[i]);
        }

        int[] count = new int[length+1];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i] ]++;

        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                list.add(i);
            }
        }

        return list;
    }
}
