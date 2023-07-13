package com.demo.strategy.leetcode;

public class ValidSudoku_36 {
    public static void main(String[] args) {

        String[][] board = new String[9][9];

        board = new String[][]{
                {"5", "3", ".", ".", "7", ".", ".", ".", "."}
                , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
                , {".", "9", "8", ".", ".", ".", ".", "6", "."}
                , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
                , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
                , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
                , {".", "6", ".", ".", ".", ".", "2", "8", "."}
                , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
                , {".", ".", ".", ".", "8", ".", ".", "7", "9"}
        };

//        {5 3 . . 7 . . . .}

        System.out.println(isValidSudoku(board));

    }

    public static boolean isValidSudoku(String[][] board) {

        // 3 for-loops ?
        // Hashtable save the number
        // Check hashtable less than 2?

        // Horizontal
        for (int i = 0; i < board.length; i++) {
//            System.out.println(board.length);
//            System.out.print(board[0].toString());
//            for (int j = 0; j < board[i].length; j++) {
//
//
//                System.out.print(board[0][j]);
//
//            }
//            System.out.print(board[i][0]);
                System.out.print(board[0][i]);

        }

        // Vertical
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i][0]);
        }

        // Grid
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i][0]);
        }



        return true;
    }
}
