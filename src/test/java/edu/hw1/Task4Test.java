package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("BasicTest#1")
    public void Test1() {
        // given
        String s = "123456";
        // when
        var result = Task4.fixString(s);
        // then
        assertThat(result).isEqualTo("214365");
    }

    @Test
    @DisplayName("BasicTest#2")
    public void Test2() {
        // given
        String s = "hTsii  s aimex dpus rtni.g";
        // when
        var result = Task4.fixString(s);
        // then
        assertThat(result).isEqualTo("This is a mixed up string.");
    }

    @Test
    @DisplayName("BasicTest#3")
    public void Test3() {
        // given
        String s = "badce";
        // when
        var result = Task4.fixString(s);
        // then
        assertThat(result).isEqualTo("abcde");
    }

    @Test
    @DisplayName("Empty string")
    public void Test5() {
        // given
        String s = "";
        // when
        var result = Task4.fixString(s);
        // then
        assertThat(result).isEqualTo("");
    }

    @Test
    @DisplayName("String size 1")
    public void Test6() {
        // given
        String s = "#";
        // when
        var result = Task4.fixString(s);
        // then
        assertThat(result).isEqualTo("#");
    }
}
