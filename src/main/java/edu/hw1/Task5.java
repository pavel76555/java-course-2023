package edu.hw1;

public class Task5 {
    private Task5() {
    }

    private static final int DEFAULT_BASE = 10;

    public static int reverseNum(int x) {
        int result = 0;
        int cur = x;

        while (cur != 0) {
            result *= DEFAULT_BASE;
            result += cur % DEFAULT_BASE;
            cur /= DEFAULT_BASE;
        }

        return result;
    }

    public static boolean isPalindrome(int x) {
        return x == reverseNum(x);
    }

    public static int transformNum(int x) {
        int reverseNumber = reverseNum(x);
        int result = 0;

        while (reverseNumber != 0) {
            result *= DEFAULT_BASE;
            result += reverseNumber % DEFAULT_BASE;
            reverseNumber /= DEFAULT_BASE;
            result += reverseNumber % DEFAULT_BASE;
            reverseNumber /= DEFAULT_BASE;
        }

        return result;
    }

    public static boolean isPalindromeDescendant(int x) {
        if (isPalindrome(x)) {
            return true;
        }

        boolean result = false;
        int cur = transformNum(x);
        while (!result && cur >= DEFAULT_BASE) {
            result = isPalindrome(cur);
            cur = transformNum(cur);
        }

        return result;
    }
}
