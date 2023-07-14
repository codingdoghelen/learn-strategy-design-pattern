package com.demo.strategy.leetcode;

import java.util.*;

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

        System.out.println(isValidSudokuOn3(board2));

    }

    public static boolean isValidSudoku(String[][] board) {


        Set<String> set = new HashSet();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                String number = board[row][column];

                if (number != ".") {
                    if (!set.add(number + " in row " + row) ||
                            !set.add(number + " in column " + column) ||
                            !set.add(number + " in box " + row / 3 + "," + column / 3)) return false;


                }

            }

        }

        return true;
    }


    // O(n^3)
    public static boolean isValidSudokuOn3(String[][] board) {

        // 3 for-loops ?
        // HashSet save the number

        Map<Integer, Set<String> > gridMap = new HashMap();

        for (int x = 0; x < 9; x++) {

            Set horizontalSet = new HashSet();
            Set verticalSet = new HashSet();

            for (int i = 0; i < board.length; i++) {
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

                if (!board[i][x].equals(".")) {

                    int m=(x/3) *3+i/3;

                    if (gridMap.containsKey(m)) {
                         if (!gridMap.get(m).add(board[i][x])) return false;
                    } else {
                        gridMap.computeIfAbsent(m, k-> new HashSet<>()).add(board[i][x]);


                    }
                }



//                if (x < 3 && i < 3 && !board[x][i].equals(".")) {
//                    if (gridSet1.contains(board[x][i])) return false;
//                    gridSet1.add(board[x][i]);
//
//                }
//
//                if (x < 3 && i >= 3 && i < 6 && !board[x][i].equals(".")) {
//                    if (gridSet2.contains(board[x][i])) return false;
//                    gridSet2.add(board[x][i]);
//
//                }
//
//                if (x < 3 && i >= 3 + 3 && i < 6 + 3 && !board[x][i].equals(".")) {
//                    if (gridSet3.contains(board[x][i])) return false;
//                    gridSet3.add(board[x][i]);
//
//                }
//
//                if (x >= 3 && x < 6 && i < 3 && !board[x][i].equals(".")) {
//                    if (gridSet4.contains(board[x][i])) return false;
//                    gridSet4.add(board[x][i]);
//
//                }
//
//
//                if (x >= 3 && x < 6 && i >= 3 && i < 6 && !board[x][i].equals(".")) {
//                    if (gridSet5.contains(board[x][i])) return false;
//                    gridSet5.add(board[x][i]);
//
//                }
//
//                if (x >= 3 && x < 6 && i >= 3 + 3 && i < 6 + 3 && !board[x][i].equals(".")) {
//                    if (gridSet6.contains(board[x][i])) return false;
//                    gridSet6.add(board[x][i]);
//
//                }
//
//
//                if (x >= 6 && x < 9 && i < 3 && !board[x][i].equals(".")) {
//                    if (gridSet7.contains(board[x][i])) return false;
//                    gridSet7.add(board[x][i]);
//
//                }
//
//
//                if (x >= 6 && x < 9 && i >= 3 && i < 6 && !board[x][i].equals(".")) {
//                    if (gridSet8.contains(board[x][i])) return false;
//                    gridSet8.add(board[x][i]);
//
//                }
//
//                if (x >= 6 && x < 9 && i >= 3 + 3 && i < 6 + 3 && !board[x][i].equals(".")) {
//                    if (gridSet9.contains(board[x][i])) return false;
//                    gridSet9.add(board[x][i]);
//
//                }


            }
//            System.out.println(gridMap);
        }

        return true;
    }
}
