package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 0;
        while (j < array.length) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            }
            if (array[i] + array[j] != target) {
                i++;
            }
            j++;
        }
        return new int[0];
    }
}


/*    public static int[] getIndexes(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }*/