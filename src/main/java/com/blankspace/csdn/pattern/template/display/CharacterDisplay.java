package com.blankspace.csdn.pattern.template.display;

public class CharacterDisplay extends AbstractDisplay {

    private char character;

    public CharacterDisplay(char character) {
        this.character = character;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(this.character);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

}
