package com.pk.leetcode.string;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;


public class ReverseString_344Test {

    private static Character[] arr1 = {'h', 'e', 'l', 'l', 'o'};
    private static Character[] result1 = {'o', 'l', 'l', 'e', 'h'};
    private static Character[] arr2 = {'H', 'a', 'n', 'n', 'a', 'h'};
    private static Character[] result2 = {'h', 'a', 'n', 'n', 'a', 'H'};

    @Test
    public void reverseStringTest() {
        ReverseString_344 instance = new ReverseString_344();
        instance.reverseString(arr1);
        assertTrue("Arrays not equal", Arrays.deepEquals(arr1, result1));
        instance.reverseString(arr2);
        assertTrue("Arrays not equal", Arrays.deepEquals(arr2, result2));
    }
}