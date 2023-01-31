package com.blankspace.csdn.pattern.template.display;

import org.junit.jupiter.api.Test;

public class DisplayTest {

    @Test
    public void displayTest() {
        AbstractDisplay characterDisplay = new CharacterDisplay('H');
        AbstractDisplay stringDisplay = new StringDisplay("Hello, World");
        characterDisplay.display();
        stringDisplay.display();
    }

}
