package edu.hw1;

public class Task7 {
    private Task7() {
    }

    private static final int MAX_POW = 31;

    public static int boundPow2(int x) {
        int result = 0;
        while (result < MAX_POW && x >= (1 << result)) {
            ++result;
        }

        return result;
    }

    public static int rotateRight(int n, int shift) {
        int cntDigitsIn2 = boundPow2(n);
        int fixShift = shift % cntDigitsIn2;

        return (n >>> fixShift) | ((n & ((1 << fixShift) - 1)) << (cntDigitsIn2 - fixShift));
    }

    public static int rotateLeft(int n, int shift) {
        int cntDigitsIn2 = boundPow2(n);
        int fixShift = shift % cntDigitsIn2;

        return rotateRight(n, cntDigitsIn2 - fixShift);
    }
}
