package com.blankspace.csdn.basic;

public class InitializationOrderDemo {
    private static class Parent {
        static {
            System.out.println("Parent static block");
        }

        {
            System.out.println("Parent instance block");
        }

        public Parent() {
            System.out.println("Parent constructor");
        }
    }

    private static class Child extends Parent {
        static {
            System.out.println("Child static block");
        }

        {
            System.out.println("Child instance block");
        }

        public Child() {
            System.out.println("Child constructor");
        }
    }

    public static void main(String[] args) {
        new Child();
    }
}
