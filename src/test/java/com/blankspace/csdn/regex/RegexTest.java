package com.blankspace.csdn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegexTest {

    @Test
    public void findTest() {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher("Attention is all you need");
        Assertions.assertTrue(matcher.find());
    }

    @Test
    public void groupTest() {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher("Attention is all you need");
        matcher.find();
        matcher.find();
        Assertions.assertEquals("is", matcher.group());
        Assertions.assertEquals(10, matcher.start());
        Assertions.assertEquals(12, matcher.end());
    }

    @Test
    public void lookingAtTest() {
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher("Attention is all you need");
        Assertions.assertFalse(matcher.lookingAt());
    }

    @Test
    public void matchesTest() {
        Pattern pattern = Pattern.compile("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])");
        Matcher matcher = pattern.matcher("127.0.0.1");
        Assertions.assertTrue(matcher.matches());
    }

}
