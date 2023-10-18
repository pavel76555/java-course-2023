package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {
    @Test
    @DisplayName("BasicTest#1")
    public void Test1() {
        // given
        int n = 8;
        int shift = 1;
        // when
        var result = Task7.rotateRight(n, shift);
        // then
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("BasicTest#2")
    public void Test2() {
        // given
        int n = 16;
        int shift = 1;
        // when
        var result = Task7.rotateLeft(n, shift);
        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("BasicTest#3")
    public void Test3() {
        // given
        int n = 17;
        int shift = 2;
        // when
        var result = Task7.rotateLeft(n, shift);
        // then
        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("0b011..1 [32 bit] rcr 5")
    public void Test4() {
        // given
        int n = (1 << 31) - 1;
        int shift = 5;
        // when
        var result = Task7.rotateRight(n, shift);
        // then
        assertThat(result).isEqualTo((1 << 31) - 1);
    }

    @Test
    @DisplayName("0b1000 rcr 9")
    public void Test5() {
        // given
        int n = 8;
        int shift = 9;
        // when
        var result = Task7.rotateRight(n, shift);
        // then
        assertThat(result).isEqualTo(4);
    }
}
