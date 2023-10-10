package ru.math;
import ru.math.*;
import ru.calculator.*;
import ru.condition.*;
import ru.converter.*;

public class MathFunction {

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }

    public static double difference (double first, double second){
        return first - second;
    }
    public static double divide(double first, double second){
        return first / second;
    }

}
