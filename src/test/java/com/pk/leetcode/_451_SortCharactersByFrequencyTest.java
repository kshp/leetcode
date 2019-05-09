package com.pk.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class _451_SortCharactersByFrequencyTest {

    private static String str1 = "tree";
    private static String result1 = "eert";

    @Test
    public void frequencySort() {
        assertThat(_451_SortCharactersByFrequency.frequencySort(str1), is(equalTo(result1)) );
        assertThat(_451_SortCharactersByFrequency.frequencySort4ms(str1), is(equalTo(result1)) );
    }
}