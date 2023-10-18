package edu.hw1;

import java.util.Arrays;

public class Task6 {
    private Task6() {
    }

    private static final int DEFAULT_BASE = 10;
    private static final int KAPREKAR_CONSTANT = 6174;
    private static final int N_DIGITS = 4;
    private static final int LOW_EDGE = 1000;

    // return -1 if incorrect input
    public static int countK(int x) {
        int cntDigits = Task2.countDigits(x);
        if (cntDigits != N_DIGITS || x <= LOW_EDGE) {
            return -1;
        }

        int cur = x;
        int result = 0;
        int[] sortedNum = new int[N_DIGITS];
        while (cur != KAPREKAR_CONSTANT) {
            for (int i = 0; i < N_DIGITS; ++i) {
                sortedNum[i] = cur % DEFAULT_BASE;
                cur /= DEFAULT_BASE;
            }

            Arrays.sort(sortedNum);
            if (sortedNum[0] == sortedNum[N_DIGITS - 1]) {
                return -1;
            }

            int bigNum = 0;
            int smallNum = 0;
            for (int i = 0; i < N_DIGITS; ++i) {
                bigNum *= DEFAULT_BASE;
                smallNum *= DEFAULT_BASE;

                bigNum += sortedNum[N_DIGITS - 1 - i];
                smallNum += sortedNum[i];
            }

            cur = bigNum - smallNum;
            ++result;
        }

        return result;
    }
}
