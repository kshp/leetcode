package com.pk.leetcode.arrays.heap_bucketsort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SortCharactersByFrequency_451Test {

    private static String str1 = "tree";
    private static String result1 = "eert";

    @Test
    public void frequencySort() {
        assertThat(SortCharactersByFrequency_451.frequencySort(str1), is(equalTo(result1)) );
        assertThat(SortCharactersByFrequency_451.frequencySort4ms(str1), is(equalTo(result1)) );
    }
}