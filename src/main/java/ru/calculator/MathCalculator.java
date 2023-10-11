package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }

    public static double differenceNum(double first, double second){
        return divide(first, second) + difference(first, second);
    }

    public static double sumAll(double first, double second){
        return divide(first, second) + difference(first, second) + sum(first, second) + multiply(first, second);
    }
}


