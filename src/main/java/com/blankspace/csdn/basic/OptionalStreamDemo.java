package com.blankspace.csdn.basic;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalStreamDemo {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Viper", "Ruler", "Elk");
        Optional<String> startswl = names.filter(name -> name.startsWith("V")).findFirst();
        // 判断是否不为null
        startswl.ifPresent(System.out::println);
        // if值为null：打印“null”；if值不为null：打印原值
        System.out.println(startswl.orElse("null"));
        // if值不为null，执行Lambda表达式
        startswl.ifPresent(name -> {
            String s = name.toUpperCase();
            System.out.println(s);
        });
    }
}
