package com.blankspace.csdn.oop;

class OverrideBaseClass {

    public void overrideMethod() {
        System.out.println("OverrideBaseClass's overrideMethod ");
    }

}

class OverrideSubClass1 extends OverrideBaseClass {

    @Override
    public void overrideMethod() {
        System.out.println("OverrideSubClass1's overrideMethod ");
    }

}

class OverrideSubClass2 extends OverrideBaseClass {

    @Override
    public void overrideMethod() {
        System.out.println("OverrideSubClass2's overrideMethod ");
    }

}

public class OverrideDemo {

    public static void main(String[] args) {
        OverrideBaseClass object1 = new OverrideSubClass1();
        OverrideBaseClass object2 = new OverrideSubClass2();
        object1.overrideMethod();
        object2.overrideMethod();
    }

}
