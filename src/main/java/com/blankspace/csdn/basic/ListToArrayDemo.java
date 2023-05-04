package com.blankspace.csdn.basic;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        // 将列表转换为数组
        String[] fruitsArray = fruits.toArray(new String[fruits.size()]);
        // 打印数组元素
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }
    }
}
