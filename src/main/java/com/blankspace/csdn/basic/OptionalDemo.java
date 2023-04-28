package com.blankspace.csdn.basic;

import java.util.Optional;

public class OptionalDemo {
    public static Integer sum(Optional<Integer> var1, Optional<Integer> var2) {
        // Optional.isPresent - 判断值是否存在
        System.out.println("第一个参数值存在：" + var1.isPresent());
        System.out.println("第二个参数值存在：" + var2.isPresent());
        // Optional.orElse - 如果值存在，返回它，否则返回默认值
        Integer var3 = var1.orElse(Integer.parseInt("0"));
        // Optional.get - 获取值，值需要存在
        Integer var4 = var2.get();
        return var3 + var4;
    }

    public static void main(String[] args) {
        Integer var1 = null;
        Integer var2 = Integer.parseInt("1");
        // Optional.ofNullable() - 允许传递为null参数
        Optional<Integer> op1 = Optional.ofNullable(var1);
        // Optionanl.of() - 如果传参为null则爆NullPointerException
        Optional<Integer> op2 = Optional.of(var2);
        try {
            Optional<Integer> op3 = Optional.of(var1);
        } catch (NullPointerException npe) {
            System.out.println("空指针异常");
        }
        System.out.println(sum(op1, op2));
    }
}
