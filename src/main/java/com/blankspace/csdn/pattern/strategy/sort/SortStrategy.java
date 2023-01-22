package com.blankspace.csdn.pattern.strategy.sort;

public interface SortStrategy<T extends Comparable<T>> {

    void sort(T[] data);

}
