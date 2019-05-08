package com.pk.datastruct;

import org.junit.Test;

import static org.junit.Assert.*;

public class _20_ValidParenthesesTest {

    private static final String s1 = "()[]{}";
    private static final String s2 = "(]";

    @Test
    public void isValid() {
        _20_ValidParentheses instance = new _20_ValidParentheses();
        assertTrue(instance.isValid(s1));
        assertFalse(instance.isValid(s2));
    }
}