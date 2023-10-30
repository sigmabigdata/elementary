package ru.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivanov Ivan";
        names[1] = "Petrov Ivan";
        names[2] = "Sidorov Ivan";
        names[3] = "Popov Ivan";

        System.out.println("Длинна массива ages " + ages.length);
        System.out.println("Длинна массива surnames " + surnames.length);
        System.out.println("Длинна массива prices " + prices.length);
        System.out.println("Первый элемент массива names: " + names[0]);
        System.out.println("Второй элемент массива names: " + names[1]);
        System.out.println("Третий элемент массива names: " + names[2]);
        System.out.println("Четвертый элемент массива names: " + names[3]);
    }
}
