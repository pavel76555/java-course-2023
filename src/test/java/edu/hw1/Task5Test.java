package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    @Test
    @DisplayName("BasicTest#1")
    public void Test1() {
        // given
        int x = 11211230;
        // when
        var result = Task5.isPalindromeDescendant(x);
        // then
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("BasicTest#2")
    public void Test2() {
        // given
        int x = 13001120;
        // when
        var result = Task5.isPalindromeDescendant(x);
        // then
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("BasicTest#3")
    public void Test3() {
        // given
        int x = 23336014;
        // when
        var result = Task5.isPalindromeDescendant(x);
        // then
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("BasicTest#4")
    public void Test4() {
        // given
        int x = 11;
        // when
        var result = Task5.isPalindromeDescendant(x);
        // then
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("One digit number")
    public void Test5() {
        // given
        int x = 5;
        // when
        var result = Task5.isPalindromeDescendant(x);
        // then
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Odd digit number")
    public void Test6() {
        // given
        int x = 20000;
        // when
        var result = Task5.isPalindromeDescendant(x);
        // then
        assertThat(result).isFalse();
    }
}
