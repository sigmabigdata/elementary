package ru.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        if (left == right) {
            return left;
        }
        return result;
    }

    public static void main(String[] args) {
        int max = max(5, 5);
        System.out.println(max);
    }
}
