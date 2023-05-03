package com.blankspace.csdn.basic;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        final int LIMIT = 10_000_000;
        String[] array0 = new String[LIMIT];
        Arrays.fill(array0, "orzorzorzorz");
        String[] array = new String[LIMIT];
        long time1 = System.currentTimeMillis();
        System.arraycopy(array0, 0, array, 0, LIMIT);
        long time2 = System.currentTimeMillis();
        array = Arrays.copyOf(array0, LIMIT);
        long time3 = System.currentTimeMillis();
        array = array0.clone();
        long time4 = System.currentTimeMillis();
        for (int i = 0; i < LIMIT; i++) {
            array[i] = array0[i];
        }
        long time5 = System.currentTimeMillis();
        System.out.println("方法一耗时：" + (time2-time1));
        System.out.println("方法二耗时：" + (time3-time2));
        System.out.println("方法三耗时：" + (time4-time3));
        System.out.println("方法四耗时：" + (time5-time4));
    }
}
