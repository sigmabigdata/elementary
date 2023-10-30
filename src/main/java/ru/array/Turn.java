package ru.array;

public class Turn {
    public static int[] back(int[] array) {

        for (int index = 1; index < array.length - index - 1; index++) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
            temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}
