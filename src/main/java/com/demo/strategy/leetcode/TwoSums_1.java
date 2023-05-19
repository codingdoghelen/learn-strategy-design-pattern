package com.demo.strategy.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums_1 {
    public static void main(String[] args) {
        System.out.println("test");

        var x = twoSums(new int[]{1, 2, 3}, 4);

        System.out.println(Arrays.toString(x)); // 0, 3
        System.out.println(Arrays.toString(twoSums(new int[]{2, 7, 11, 15}, 9))); // 0, 1
        System.out.println(Arrays.toString(twoSums(new int[]{3, 2, 4}, 6))); // 1, 2
        System.out.println(Arrays.toString(twoSums(new int[]{3, 3}, 6))); // 0, 1

    }

    private static int[] twoSums(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {

                int[] arr = new int[]{i, map.get(target - nums[i])};
                Arrays.sort(arr);
                return arr;
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }
}



//    private static int[] twoSums(int[] nums, int target) {
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//
//            map.put(nums[i], i);
////            System.out.println(map);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//
//            int x = target - nums[i];
//
////            System.out.println("nums " + i + " is " + nums[i]  + " and map is " +  map.get(x) );
//
//            if (map.values().contains(x)) {
//
//                int [] array = new int[]{i, map.get(x)};
//
//                Arrays.sort(array);
//
//                return array;
//
//            }
//
////            return new int[]{i, map.get(x)};
//
//        }
//        return new int[0];
//    }
//}


//    private static int[] twoSums(int[] nums, int target) {
//
////        nums = new int []{1,2,3};
////        target = 4;
//
//        HashSet<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < nums.length; i++) {
//
//            set.add(nums[i]);
//
//
//            int x = target - nums[i];
//            if (set.contains(x)) return new int[]{i, IntStream.range(0, nums.length)
//                    .filter(n -> nums[n] == x)
//                    .findFirst()
//                    .getAsInt()};
//
//
//        }
//
//
//        return new int[0];
//
//
//    }


//}
