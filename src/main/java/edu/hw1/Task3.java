package edu.hw1;

public class Task3 {
    private Task3() {
    }

    public static boolean isNestable(int[] a1, int[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return false;
        }

        int min1 = a1[0];
        int max1 = a1[0];
        for (int i = 1; i < a1.length; ++i) {
            if (a1[i] > max1) {
                max1 = a1[i];
            } else if (a1[i] < min1) {
                min1 = a1[i];
            }
        }

        int min2 = a2[0];
        int max2 = a2[0];
        for (int i = 1; i < a2.length; ++i) {
            if (a2[i] > max2) {
                max2 = a2[i];
            } else if (a2[i] < min1) {
                min2 = a2[i];
            }
        }

        return min1 > min2 && max1 < max2;
    }
}
