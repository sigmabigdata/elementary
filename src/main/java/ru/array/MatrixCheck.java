package ru.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            char el = 'X';
            if (board[row][i] != el) {
                result = false;
                break;
            }
        }
        return result;
    }
}
