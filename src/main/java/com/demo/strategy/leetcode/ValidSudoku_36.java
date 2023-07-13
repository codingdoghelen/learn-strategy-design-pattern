package com.demo.strategy.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku_36 {
    public static void main(String[] args) {

//        String[][] board = new String[9][9];

//        board = new String[][]{
//                {"8", "3", ".", ".", "7", ".", ".", ".", "."}
//                , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
//                , {".", "9", "8", ".", ".", ".", ".", "6", "."}
//                , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
//                , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
//                , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
//                , {".", "6", ".", ".", ".", ".", "2", "8", "."}
//                , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
//                , {".", ".", ".", ".", "8", ".", ".", "7", "9"}
//        };
        String[][] board2 = new String[9][9];

        board2 = new String[][]{
                {".", ".", ".", ".", "5", ".", ".", "1", "."},
                {".", "4", ".", "3", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", "3", ".", ".", "1"},
                {"8", ".", ".", ".", ".", ".", ".", "2", "."},
                {".", ".", "2", ".", "7", ".", ".", ".", "."},
                {".", "1", "5", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", "2", ".", ".", "."},
                {".", "2", ".", "9", ".", ".", ".", ".", "."},
                {".", ".", "4", ".", ".", ".", ".", ".", "."}};

//        {5 3 . . 7 . . . .}

        System.out.println(isValidSudoku(board2));

    }

    public static boolean isValidSudoku(String[][] board) {

        // 3 for-loops ?
        // Hashtable save the number
        // Check hashtable less than 2?

        for (int x = 0; x < 9; x++) {

            // Horizontal
            System.out.print(x + ": ");

//            System.out.println("horizontal");
            Set horizontalSet = new HashSet();
            Set verticalSet = new HashSet();
            Set gridSet1 = new HashSet();
            Set gridSet2 = new HashSet();
            Set gridSet3 = new HashSet();

            for (int i = 0; i < board.length; i++) {
//                System.out.println("horizontal");
                if (!board[x][i].equals(".")) {
                    System.out.print(board[x][i]);
                    if (horizontalSet.contains(board[x][i])) return false;
                    horizontalSet.add(board[x][i]);
                }
                if (!board[i][x].equals(".")) {
                    System.out.print(board[i][x]);
                    if (verticalSet.contains(board[i][x])) return false;
                    verticalSet.add(board[i][x]);
                }

                if (x < 3 & i < 3 && !board[x][i].equals(".")) {
                    System.out.print(board[x][i]);
                    if (gridSet1.contains(board[x][i])) return false;
                    gridSet1.add(board[x][i]);

                }

                if (x > 3 && x < 6 && i > 3 && i < 6 && !board[x][i].equals(".")) {
                    System.out.print(board[x][i]);
                    if (gridSet2.contains(board[x][i])) return false;
                    gridSet2.add(board[x][i]);

                }
                if (x > 6 && x < 9 && i > 6 && i < 9 && !board[x][i].equals(".")) {
                    System.out.print(board[x][i]);
                    if (gridSet3.contains(board[x][i])) return false;
                    gridSet3.add(board[x][i]);

                }


            }
        }
        return true;
    }
}
