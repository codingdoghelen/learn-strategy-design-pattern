package com.demo.strategy.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum_15 {

    public static void main(String[] args) {
//        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
//        System.out.println(threeSum(new int[]{3,0,-2,-1,1,2}));
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4}));

    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums); //-1, 0, 1, 2, -1, -4 // -4,-1,-1,0,1,2
        Set<List<Integer>> bigList = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            int left = i + 1;
            int right = nums.length - 1;


            while (left <= right && left != right) {
                int leftNumber = nums[left];
                int rightNumber = nums[right];

                int mid = (left + right) / 2;

                if (leftNumber + rightNumber + nums[i] == 0) {
                    System.out.println(Arrays.asList(nums[i], leftNumber, rightNumber));

                    bigList.add(Arrays.asList(nums[i], leftNumber, rightNumber));
                    left++;
                    right--;

                } else if (leftNumber + rightNumber + nums[i] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return bigList.stream().toList();
    }


//    public static List<List<Integer>> threeSum(int[] nums) {
//
//
//        Set<List<Integer>> bigList = new HashSet<>();
//
//
//        for (int j = 0; j < nums.length; j++) {
////            int i=0;
//
//            System.out.println(j);
//
//            for (int i = 0, m = 1; i < nums.length && m < nums.length; m++) {
//
//                if (j == i || i == m || j == m) {
//                    i++;
////                    continue;
//                } else {
////                ;
//
//                    System.out.println("j: " + j + " i: " + i + " m: " + m);
//
//                    System.out.println("j: " + nums[j]);
//
//                    System.out.println("i: " + nums[i]);
//
//                    System.out.println("m: " + nums[m]);
//
//                    if (nums[j] + nums[i] + nums[m] == 0) {
//                        System.out.println("YEAHHH");
//                        System.out.println(String.format("%s, %s, %s", nums[j], nums[i], nums[m]));
//
//                        List<Integer> list = Arrays.asList(nums[j], nums[i], nums[m]);
//
//                        Collections.sort(list);
//
//                        bigList.add(list);
//                    };
////                    i++;
//
////            j++;
//                }
////            i++;
////                i++;
//
//            }
//        }
//
//        System.out.println("*****");
//        System.out.println(bigList);
////
////        bigList = bigList.stream()
////                .distinct()
////                .collect(Collectors.toList());
//
//        return bigList.stream().toList();
//    }


}
