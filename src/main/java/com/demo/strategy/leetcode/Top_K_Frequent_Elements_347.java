package com.demo.strategy.leetcode;

import java.util.*;

public class Top_K_Frequent_Elements_347 {

    public static void main(String[] args) {
//        System.out.println(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
        System.out.println(topKFrequent(new int[]{1,2}, 2));

    }

    public static int[] topKFrequent(int[] nums, int k) {
        // Bucket Sort
        // Create a hashmap to store key: nums.length; value: the nums of int tht occurs
        // Step 1: Count appearance of int
        // Step 2: Create a list of list order by the num of appearance
        // Step 3: 2 For-loop to put into result arrany
        // Total 4 for loops

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }


        // Create a bucket (map key: nums.length; value: an Array list
        Map<Integer, List<Integer>> bucketMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {

            if (bucketMap.containsKey(entry.getValue())) {
                bucketMap.get(entry.getValue()).add(entry.getKey());
            }

            bucketMap.put(entry.getValue(), new ArrayList<>(Arrays.asList(entry.getKey())));

        }

        List[] bucketList = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (bucketList[value] == null) {
                bucketList[value] = new ArrayList(Arrays.asList(key));
            } else {
                bucketList[value].add(key);
            }
        }



        int[] resultArray = new int[k];
        int j=0;
        for (int i = nums.length; i >=0 &&j<k; i--) {
            if (bucketList[i] !=null) {
                for (Object bucket:bucketList[i]) {
                    resultArray[j++] = (int) bucket;
                }
            }
        }
        return resultArray;
    }
}
