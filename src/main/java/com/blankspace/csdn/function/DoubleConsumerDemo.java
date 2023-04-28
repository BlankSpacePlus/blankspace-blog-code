package com.blankspace.csdn.function;

import java.util.function.DoubleConsumer;

public class DoubleConsumerDemo {
    public static void main(String[] args) {
        // 使用lambda表达式创建一个DoubleConsumer对象
        DoubleConsumer printSquare = (double value) -> System.out.println(value * value);
        // 使用DoubleConsumer对象执行操作
        printSquare.accept(5.0); // 输出：25.0
        printSquare.accept(2.5); // 输出：6.25
    }
}
