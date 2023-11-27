package ru.condition;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        return Math.max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return Math.max(max(first, second, third), fourth);
    }

    public static void main(String[] args) {
        int max = max(12, 9, 10, 11);
        System.out.println(max);
    }
}
