package com.blankspace.csdn.pattern.strategy.sort;

public class InsertSortStrategy<T extends Comparable<T>> implements SortStrategy<T> {

    public void sort(T[] data) {
        int position, length = data.length;
        T temp;
        for (int i = 1; i < length; i++) {
            temp = data[i];
            for (position = i; position > 0 && temp.compareTo(data[position - 1]) < 0; position--) {
                data[position] = data[position - 1];
            }
            data[position] = temp;
        }
    }

}
