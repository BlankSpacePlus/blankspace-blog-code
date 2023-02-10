package com.blankspace.csdn.oop;

public class ParameterizedCollection<T> {

    private T[] data;

    private int size;

    public ParameterizedCollection() {
    }

    @SuppressWarnings("unchecked")
    public ParameterizedCollection(T[] data) {
        this.data = (T[])new Object[data.length];
        System.arraycopy(data, 0, this.data, 0, data.length);
    }

}
