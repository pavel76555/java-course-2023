package edu.hw1;

public class Task8 {
    private Task8() {
    }

    private static final int BOARD_SIZE = 8;

    public static boolean isValidBoard(int[][] board) {
        if (board.length != BOARD_SIZE) {
            return false;
        }

        for (int i = 0; i < BOARD_SIZE; ++i) {
            if (board[i].length != BOARD_SIZE) {
                return false;
            }
        }

        return true;
    }

    public static boolean knightBoardCapture(int[][] board) throws IllegalArgumentException {
        if (!isValidBoard(board)) {
            throw new IllegalArgumentException();
        }

        @SuppressWarnings("MagicNumber")
        int[] di = {2, 2, 1, 1, -2, -2, -1, -1};
        @SuppressWarnings("MagicNumber")
        int[] dj = {1, -1, 2, -2, 1, -1, 2, -2};

        for (int i = 0; i < BOARD_SIZE; ++i) {
            for (int j = 0; j < BOARD_SIZE; ++j) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < di.length; ++k) {
                        int curI = i + di[k];
                        int curJ = j + dj[k];
                        if (curI >= 0 && curJ >= 0 && curI < BOARD_SIZE && curJ < BOARD_SIZE) {
                            if (board[curJ][curJ] == 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

}
