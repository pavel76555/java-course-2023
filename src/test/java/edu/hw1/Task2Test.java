package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    @DisplayName("BasicTest#1")
    public void Test1() {
        // given
        int x = 4666;
        // when
        var result = Task2.countDigits(x);
        // then
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("BasicTest#2")
    public void Test2() {
        // given
        int x = 544;
        // when
        var result = Task2.countDigits(x);
        // then
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("BasicTest#3")
    public void Test3() {
        // given
        int x = 0;
        // when
        var result = Task2.countDigits(x);
        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("Negative number")
    public void Test4() {
        // given
        int x = -134;
        // when
        var result = Task2.countDigits(x);
        // then
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("Contains zeroes")
    public void Test5() {
        // given
        int x = 12010;
        // when
        var result = Task2.countDigits(x);
        // then
        assertThat(result).isEqualTo(5);
    }
}
