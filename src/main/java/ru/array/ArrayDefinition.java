package ru.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Длинна массива ages " + ages.length);
        System.out.println("Длинна массива surnames " + surnames.length);
        System.out.println("Длинна массива prices " + prices.length);
    }
}
