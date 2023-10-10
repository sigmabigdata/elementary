package ru.math;
import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double differenceNumbers(double first, double second){
        return difference(first, second);
    }
    public static double divideNumbers(double first, double second){
        return divide(first, second);
    }
    public static void main(String[] args){
        System.out.println(differenceNumbers(3, 2) + divideNumbers(8, 2));
    }
}
