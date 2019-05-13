package com.pk.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;


public class _344_ReverseStringTest {

    private Character[] arr1 = {'h', 'e', 'l', 'l', 'o'};
    private Character[] result1 = {'o', 'l', 'l', 'e', 'h'};
    private Character[] arr2 = {'H', 'a', 'n', 'n', 'a', 'h'};
    private Character[] result2 = {'h', 'a', 'n', 'n', 'a', 'H'};

    @Test
    public void reverseStringTest() {
        _344_ReverseString instance = new _344_ReverseString();
        instance.reverseString(arr1);
        assertTrue("Arrays not equal", Arrays.deepEquals(arr1, result1));
        instance.reverseString(arr2);
        assertTrue("Arrays not equal", Arrays.deepEquals(arr2, result2));
    }

    @Test
    public void reverseStringRecursivelyTest() {
        _344_ReverseString instance = new _344_ReverseString();
        instance.reverseStringRecursively(arr1);
        assertTrue("Arrays not equal", Arrays.deepEquals(arr1, result1));
        instance.reverseStringRecursively(arr2);
        assertTrue("Arrays not equal", Arrays.deepEquals(arr2, result2));
    }
}