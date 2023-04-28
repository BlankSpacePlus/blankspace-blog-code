package com.blankspace.csdn.function;

import java.util.DoubleSummaryStatistics;

public class DoubleStatisticsDemo {
    public static void main(String[] args) {
        double[] data = { 2.5, 4.7, 6.3, 8.1, 3.9 };
        // 创建一个DoubleSummaryStatistics对象
        DoubleSummaryStatistics statistics = new DoubleSummaryStatistics();
        // 向DoubleSummaryStatistics对象添加数据
        for (double value : data) {
            statistics.accept(value);
        }
        // 获取统计信息
        double sum = statistics.getSum();
        double average = statistics.getAverage();
        double max = statistics.getMax();
        double min = statistics.getMin();
        long count = statistics.getCount();
        // 打印统计信息
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Count: " + count);
    }
}
