import java.util.Arrays;

public class MaximumWealth_1672 {
    public static void main(String[] args) {

//        System.out.println(RunningSumOf1dArray_1480(new int[]{1,2,3,4})); // [1,3,6,10]
//        System.out.println(RunningSumOf1dArray_1480(new int[]{1,1,1,1,1})); // [1,2,3,4,5]
//        System.out.println(RunningSumOf1dArray_1480(new int[]{3,1,2,10,1})); // [3,4,6,16,17]


        System.out.println(maximumWealth(new int [][]{{1,2,3},{3,2,1}})); // 6 // Row: 2 Col: 3
        System.out.println(maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}})); // 10
        System.out.println(maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}}));

    }

    private static int maximumWealth(int[][] nums) {
        // 2-dimensional array
        // for-each loop
        // sum
        // max

        int richestAmount = 0;

        for (int[] row : nums) {
            int sum = 0;
            for (int num : row) {
                sum += num;
//                System.out.println(sum);
            }

            richestAmount = Math.max(sum, richestAmount);


        }

        return richestAmount;
    }


}
