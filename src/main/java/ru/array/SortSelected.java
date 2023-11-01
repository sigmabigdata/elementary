package ru.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length - 1);
            int index = FindLoop.indexInRange(data, min, 0, data.length - 1);
            data = SwitchArray.swap(data, data[index], data[i]);
        }
        return data;
    }
}
