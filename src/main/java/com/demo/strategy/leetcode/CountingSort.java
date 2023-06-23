package com.demo.strategy.leetcode;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] data = { 4, 2, 2, 8, 3, 3, 1 };
        int size = data.length;
        CountingSort cs = new CountingSort();
        cs.countingSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }

    public int[] countingSort(int[] array) {

        int[] output = new int[array.length];

        int max = 0;
        // 1. Find max
        for (int i =0; i<= array.length-1;i++){
//            int max = array[i];
            if (array[i] > max){
                max = array[i];
            }
        }

        // Make a count array
        int count[] = new int[max+1]; // Important

        // Count
        for (int i=0; i< array.length;i++){
            count[array[i]]++;
        }

        // Sum up all values
        for (int i=1; i< count.length;i++){
            count[i]+=count[i-1];
        }

        // From back to front, put the values and count -1
        for (int i=output.length-1; i>=0;i--){
            output[count[array[i]] - 1] =array[i];
            count[array[i]]--;
        }

        for (int i=0; i< array.length;i++) {
            array[i]=output[i] ;
        }
        return output;












    };
}



