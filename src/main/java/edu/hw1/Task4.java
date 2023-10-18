package edu.hw1;

import java.util.Objects;

public class Task4 {
    private Task4() {
    }

    public static String fixString(String s) {
        Objects.requireNonNull(s);
        if (s.length() <= 1) {
            return s;
        }

        char[] result = new char[s.length()];
        for (int i = 1; i <= s.length(); i += 2) {
            if (i == s.length()) {
                result[i - 1] = s.charAt(i - 1);
            } else {
                result[i - 1] = s.charAt(i);
                result[i] = s.charAt(i - 1);
            }
        }

        return new String(result);
    }
}
