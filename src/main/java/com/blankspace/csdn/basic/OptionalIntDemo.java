package com.blankspace.csdn.basic;

import java.util.OptionalInt;

public class OptionalIntDemo {
    public static void main(String[] args) {
        OptionalInt optionalInt1 = OptionalInt.of(10);
        OptionalInt optionalInt2 = OptionalInt.empty();
        // 使用isPresent()方法检查是否存在值
        System.out.println("optionalInt1 is present: " + optionalInt1.isPresent());
        System.out.println("optionalInt2 is present: " + optionalInt2.isPresent());
        // 使用getAsInt()方法获取值（注意要先检查是否存在值）
        if (optionalInt1.isPresent()) {
            int value = optionalInt1.getAsInt();
            System.out.println("optionalInt1 value: " + value);
        }
        // 使用orElse()方法获取值，如果不存在则返回默认值
        int defaultValue = 0;
        int value1 = optionalInt1.orElse(defaultValue);
        int value2 = optionalInt2.orElse(defaultValue);
        System.out.println("optionalInt1 value: " + value1);
        System.out.println("optionalInt2 value: " + value2);
        // 使用ifPresent()方法执行操作（只有存在值时才执行）
        optionalInt1.ifPresent(num -> System.out.println("optionalInt1 value: " + num));
        optionalInt2.ifPresent(num -> System.out.println("optionalInt2 value: " + num));
    }
}
