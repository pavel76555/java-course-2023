package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {
    @Test
    @DisplayName("BasicTest#1")
    public void Test1() {
        // given
        int x = 6621;
        // when
        var result = Task6.countK(x);
        // then
        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("BasicTest#2")
    public void Test2() {
        // given
        int x = 6554;
        // when
        var result = Task6.countK(x);
        // then
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("BasicTest#3")
    public void Test3() {
        // given
        int x = 1234;
        // when
        var result = Task6.countK(x);
        // then
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("Kaprekar's Constant")
    public void Test4() {
        // given
        int x = 6174;
        // when
        var result = Task6.countK(x);
        // then
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("Incorrect input")
    public void Test5() {
        // given
        int x = 1000;
        // when
        var result = Task6.countK(x);
        // then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("Incorrect input (Equal digits)")
    public void Test6() {
        // given
        int x = 8888;
        // when
        var result = Task6.countK(x);
        // then
        assertThat(result).isEqualTo(-1);
    }
}
