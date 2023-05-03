package com.blankspace.csdn.basic;

import java.math.BigInteger;
import java.util.Arrays;

public class ArrayTypeDemo {
    public static void main(String[] args) {
        long[] long_array = new long[10];
        int[] int_array = new int[10];
        short[] short_array = new short[10];
        byte[] byte_array = new byte[10];
        char[] char_array = new char[10];
        double[] double_array = new double[10];
        float[] float_array = new float[10];
        boolean[] boolean_array = new boolean[10];
        // 包装类的数组
        Integer[] integer_array = new Integer[10];
        Boolean[] boolean_b_array = new Boolean[10];
        // 某些引用类型的数组
        String[] string_array = new String[10];
        Arrays[] arrays_array = new Arrays[10];
        BigInteger[] bigInteger_array = new BigInteger[10];
        // 二维数组
        int[][] int_int_array = new int[10][10];
        // 三维数组
        int[][][] int_int_int_array = new int[10][10][10];
        System.out.println("long[]的类型是：" + long_array.getClass());
        System.out.println("int[]的类型是：" + int_array.getClass());
        System.out.println("short[]的类型是：" + short_array.getClass());
        System.out.println("byte[]的类型是：" + byte_array.getClass());
        System.out.println("char[]的类型是：" + char_array.getClass());
        System.out.println("double[]的类型是：" + double_array.getClass());
        System.out.println("float[]的类型是：" + float_array.getClass());
        System.out.println("boolean[]的类型是：" + boolean_array.getClass());
        System.out.println("Integer[]的类型是：" + integer_array.getClass());
        System.out.println("Boolean[]的类型是：" + boolean_b_array.getClass());
        System.out.println("String[]的类型是：" + string_array.getClass());
        System.out.println("Arrays[]的类型是：" + arrays_array.getClass());
        System.out.println("BigInteger[]的类型是：" + bigInteger_array.getClass());
        System.out.println("int[][]的类型是：" + int_int_array.getClass());
        System.out.println("int[][][]的类型是：" + int_int_int_array.getClass());
        // 父类
        System.out.println("int[]的父类：" + int_array.getClass().getSuperclass());
    }
}
