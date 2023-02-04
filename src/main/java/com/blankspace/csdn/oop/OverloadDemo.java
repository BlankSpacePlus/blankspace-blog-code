package com.blankspace.csdn.oop;

public class OverloadDemo {

    public OverloadDemo() {
        System.out.println("OverloadDemo's Overload Constructor 1");
    }

    public OverloadDemo(String info) {
        System.out.println("OverloadDemo's Overload Constructor 2");
    }

    public void overloadMethod() {
        System.out.println("OverloadDemo's Overload Method 1");
    }

    public void overloadMethod(String info) {
        System.out.println("OverloadDemo's Overload Method 2");
    }

    public void overloadMethod(String ... infos) {
        System.out.println("OverloadDemo's Overload Method 3");
    }

}
