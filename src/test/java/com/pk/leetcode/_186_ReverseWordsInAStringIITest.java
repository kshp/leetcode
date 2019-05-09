package com.pk.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class _186_ReverseWordsInAStringIITest {

    private static Character[] arr1=  {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
    private static Character[] result1= {'b','l','u','e',' ','i','s',' ','s','k','y',' ','t','h','e'};
    
    @Test
    public void reverseWords() {
        _186_ReverseWordsInAStringII instance = new _186_ReverseWordsInAStringII();
        instance.reverseWords(arr1);
        assertTrue("Arrays not equal", Arrays.deepEquals(arr1, result1));
    }
}