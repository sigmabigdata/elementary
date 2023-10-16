package ru.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double w = k * h;
        double s = w * h;
        return s;
    }
}
