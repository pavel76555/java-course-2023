package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("BasicTest#1")
    public void Test1() {
        // given
        String time = "01:00";
        // when
        var result = Task1.minutesToSeconds(time);
        // then
        assertThat(result).isEqualTo(60);
    }

    @Test
    @DisplayName("BasicTest#2")
    public void Test2() {
        // given
        String time = "13:56";
        // when
        var result = Task1.minutesToSeconds(time);
        // then
        assertThat(result).isEqualTo(836);
    }

    @Test
    @DisplayName("BasicTest#3")
    public void Test3() {
        // given
        String time = "10:60";
        // when
        var result = Task1.minutesToSeconds(time);
        // then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("Empty string")
    public void Test4() {
        // given
        String time = "";
        // when
        var result = Task1.minutesToSeconds(time);
        // then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("Incorrect input string")
    public void Test5() {
        // given
        String time = "13::56";
        // when
        var result = Task1.minutesToSeconds(time);
        // then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("Negative number of seconds")
    public void Test6() {
        // given
        String time = "13:-56";
        // when
        var result = Task1.minutesToSeconds(time);
        // then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("No minutes")
    public void Test7() {
        // given
        String time = ":56";
        // when
        var result = Task1.minutesToSeconds(time);
        // then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("Negative number of minutes")
    public void Test8() {
        // given
        String time = "-1:56";
        // when
        var result = Task1.minutesToSeconds(time);
        // then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("Incorrect input string")
    public void Test9() {
        // given
        String time = "12:5A";
        // when
        var result = Task1.minutesToSeconds(time);
        // then
        assertThat(result).isEqualTo(-1);
    }
}
