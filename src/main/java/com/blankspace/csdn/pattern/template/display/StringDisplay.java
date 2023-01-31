package com.blankspace.csdn.pattern.template.display;

public class StringDisplay extends AbstractDisplay {

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + this.string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < this.string.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

}
