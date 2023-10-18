package edu.hw1;

public class Task2 {
    private Task2() {
    }

    private static final int DEFAULT_BASE = 10;

    public static int countDigits(int x) {
        if (x == 0) {
            return 1;
        }

        int result = 0;
        int cur = x;
        while (cur != 0) {
            ++result;
            cur /= DEFAULT_BASE;
        }

        return result;
    }
}
