package com.blankspace.csdn.pattern.strategy.sort;

public class BubbleSortStrategy<T extends Comparable<T>> implements SortStrategy<T> {

    public void sort(T[] record) {
        int position, bound, length = record.length, exchange = length - 1;
        T temp;
        while (exchange != 0) {
            bound = exchange;
            exchange = 0;
            for (position = 0; position < bound; position++) {
                if (record[position].compareTo(record[position + 1]) > 0) {
                    temp = record[position];
                    record[position] = record[position + 1];
                    record[position + 1] = temp;
                    exchange = position;
                }
            }
        }
    }

}
