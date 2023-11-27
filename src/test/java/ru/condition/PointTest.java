package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when321to052then4Dot35() {
        double expected = 4.35;
        ru.condition.Point a = new ru.condition.Point(3, 2, 1);
        ru.condition.Point b = new ru.condition.Point(0, 5, 2);
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when123to321then2Dot82() {
        double expected = 2.82;
        ru.condition.Point a = new ru.condition.Point(1, 2, 3);
        ru.condition.Point b = new ru.condition.Point(3, 2, 1);
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000to200then2() {
        double expected = 2;
        ru.condition.Point a = new ru.condition.Point(0, 0, 0);
        ru.condition.Point b = new ru.condition.Point(2, 0, 0);
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to20then2() {
        double expected = 2;
        ru.condition.Point a = new ru.condition.Point(0, 0);
        ru.condition.Point b = new ru.condition.Point(0, 2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to22then1() {
        double expected = 1;
        ru.condition.Point a = new ru.condition.Point(1, 2);
        ru.condition.Point b = new ru.condition.Point(2, 2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when21to21then0() {
        double expected = 0;
        ru.condition.Point a = new ru.condition.Point(2, 1);
        ru.condition.Point b = new ru.condition.Point(2, 1);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to21then1Dot41() {
        float expected = 1.41f;
        ru.condition.Point a = new ru.condition.Point(1, 2);
        ru.condition.Point b = new ru.condition.Point(2, 1);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}