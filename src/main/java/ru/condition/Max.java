package ru.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first, second) > third ? max(first, second) : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, second, third) > fourth ? max(first, second, third) : fourth;
    }
    public static void main(String[] args) {
        int max = max(12, 9, 10, 11);
        System.out.println(max);
    }
}
