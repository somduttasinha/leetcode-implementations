package com.somduttasinha.arrays;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public static boolean isValidSudoku(char[][] board) {
        // each row must contain digits 1-9 without repetition
        // each column must contain the digits 1-9 without repetition
        // each of the nine 3x3 sub boxes must contain the digits 1-9 without repetition
        //

        char[][] invertedBoard = invertBoard(board);

        char[][] boxesAsRows = convertBoxesToRows(board);

        for (int i = 0; i < 9; i++) {
            if (!(checkLine(board[i])))
                return false;

            if (!(checkLine(invertedBoard[i])))
                return false;

            if (!(checkLine(boxesAsRows[i])))
                return false;

        }

        return true;

    }

    private static char[][] convertBoxesToRows(char[][] board) {

        char[][] finalBoard = new char[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int rowNumber = convertCoordinatesToRowNumber(i, j);
                int positionInRow = getNumericalBoxPosition(i, j);
                finalBoard[rowNumber][positionInRow] = board[i][j];
            }
        }

        return finalBoard;
    }

    private static int getNumericalBoxPosition(int i, int j) {
        int x = i % 3;
        int y = j % 3;

        return (3 * x) + y;

    }

    private static int convertCoordinatesToRowNumber(int i, int j) {
        int[] boxOrigin = getBoxOriginCoordinates(i, j);
        int iOrigin = boxOrigin[0];
        int jOrigin = boxOrigin[1];
        int rowNumber = jOrigin + (iOrigin / 3);

        return rowNumber;
    }

    private static int[] getBoxOriginCoordinates(int i, int j) {
        int iFloor = i / 3;
        int jFloor = j / 3;
        int iOrigin = iFloor * 3;
        int jOrigin = jFloor * 3;
        return new int[] { iOrigin, jOrigin };
    }

    private static char[][] invertBoard(char[][] board) {

        char[][] invertedBoard = new char[9][9];

        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {

            char[] row = board[rowIndex];

            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {

                char c = row[columnIndex];

                invertedBoard[columnIndex][rowIndex] = c;
            }
        }

        return invertedBoard;

    }

    private static boolean checkLine(char[] line) {

        int acc = 0;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {

            char c = line[i];

            if (c != '.') {
                acc++;
                set.add(c);
            }
        }

        if (set.size() != acc)
            return false;

        return true;
    }

}
