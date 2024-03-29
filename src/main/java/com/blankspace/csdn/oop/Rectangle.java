package com.blankspace.csdn.oop;

public class Rectangle extends Shape {

    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int getPerimeter() {
        return this.a + this.b;
    }

}
