package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To5Then6() {
        int left = 6;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then6() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax9To5To4Then9() {
        int first = 9;
        int second = 5;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To3To2Then3() {
        int first = 1;
        int second = 3;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To4Then4() {
        int first = 1;
        int second = 2;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To4To5Then5() {
        int first = 1;
        int second = 2;
        int third = 4;
        int fourth = 5;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To2To4To1Then6() {
        int first = 6;
        int second = 2;
        int third = 4;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}
