package edu.hw1;

import java.util.Objects;

public class Task1 {
    private Task1() {
    }

    private static final int SEC_IN_MIN = 60;

    public static int minutesToSeconds(String time) {
        Objects.requireNonNull(time);
        String[] timeStrings = time.split(":");
        if (timeStrings.length != 2) {
            return -1;
        }

        int m;
        int s;

        try {
            m = Integer.parseInt(timeStrings[0]);
            s = Integer.parseInt(timeStrings[1]);
        } catch (Exception e) {
            return -1;
        }

        if (m < 0 || s < 0 || s >= SEC_IN_MIN) {
            return -1;
        }

        return m * SEC_IN_MIN + s;
    }
}
