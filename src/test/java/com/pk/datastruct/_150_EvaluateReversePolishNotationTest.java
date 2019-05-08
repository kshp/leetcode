package com.pk.datastruct;

import org.junit.Test;

import static org.junit.Assert.*;

public class _150_EvaluateReversePolishNotationTest {

    private static final String [] t1 = {"2", "1", "+", "3", "*"};
    private static int result1 = 9;
    private static final String [] t2 = {"4", "13", "5", "/", "+"};
    private static int result2 = 6;
    private static final String [] t3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
    private static int result3 = 22;

    @Test
    public void evalRPN() {
        _150_EvaluateReversePolishNotation instance = new _150_EvaluateReversePolishNotation();
        assertEquals(result1, instance.evalRPN(t1));
        assertEquals(result2, instance.evalRPN(t2));
        assertEquals(result3, instance.evalRPN(t3));
    }
}