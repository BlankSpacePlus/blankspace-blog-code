package com.blankspace.csdn.basic;

public class PerformanceTimer {

    public static void main(String[] args) {
        // 记录程序开始时间
        long startTime = System.currentTimeMillis();
        // 这里是要测试的代码块
        int sum = 0;
        for (int i = 1; i <= 10000000; i++) {
            sum += i;
        }
        // 记录程序结束时间
        long endTime = System.currentTimeMillis();
        // 计算代码块运行时间
        long duration = endTime - startTime;
        // 输出运行时间
        System.out.println("程序运行时间：" + duration + "毫秒");
    }

}
