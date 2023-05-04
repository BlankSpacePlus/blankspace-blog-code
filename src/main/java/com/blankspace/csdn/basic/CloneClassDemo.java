package com.blankspace.csdn.basic;

public class CloneClassDemo implements Cloneable {
        private int value;

    public CloneClassDemo(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public CloneClassDemo clone() throws CloneNotSupportedException {
        return (CloneClassDemo) super.clone();
    }

    public static void main(String[] args) {
        try {
            CloneClassDemo obj1 = new CloneClassDemo(123);
            CloneClassDemo obj2 = obj1.clone();
            System.out.println(obj1 == obj2);
            System.out.println(obj1.getValue() == obj2.getValue());
            System.out.println(obj1.getClass() == obj2.getClass());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
