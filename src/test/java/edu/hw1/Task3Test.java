package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {
    @Test
    @DisplayName("BasicTest#1")
    public void Test1() {
        // given
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {0, 6};
        // when
        var result = Task3.isNestable(a1, a2);
        // then
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("BasicTest#2")
    public void Test2() {
        // given
        int[] a1 = {3, 1};
        int[] a2 = {4, 0};
        // when
        var result = Task3.isNestable(a1, a2);
        // then
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("BasicTest#3")
    public void Test3() {
        // given
        int[] a1 = {9, 9, 8};
        int[] a2 = {8, 9};
        // when
        var result = Task3.isNestable(a1, a2);
        // then
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("BasicTest#4")
    public void Test4() {
        // given
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {2, 3};
        // when
        var result = Task3.isNestable(a1, a2);
        // then
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Empty array")
    public void Test5() {
        // given
        int[] a1 = {1, 2};
        int[] a2 = {};
        // when
        var result = Task3.isNestable(a1, a2);
        // then
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Empty array")
    public void Test6() {
        // given
        int[] a1 = {1, 2};
        int[] a2 = {};
        // when
        var result = Task3.isNestable(a1, a2);
        // then
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Empty arrays")
    public void Test7() {
        // given
        int[] a1 = {};
        int[] a2 = {};
        // when
        var result = Task3.isNestable(a1, a2);
        // then
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Arrays are equal")
    public void Test8() {
        // given
        int[] a1 = {1, 2};
        int[] a2 = {1, 2};
        // when
        var result = Task3.isNestable(a1, a2);
        // then
        assertThat(result).isFalse();
    }
}
