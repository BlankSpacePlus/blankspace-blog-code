package com.blankspace.csdn.basic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingModeDemo {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("123.456");
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        System.out.println(rounded);
        BigDecimal roundedDown = number.setScale(2, RoundingMode.DOWN);
        System.out.println(roundedDown);
    }
}
