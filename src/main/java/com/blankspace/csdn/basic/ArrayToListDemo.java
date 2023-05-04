package com.blankspace.csdn.basic;

import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(array);
        // Exception in thread “main” java.lang.UnsupportedOperationException
        list.add(6);
    }
}
