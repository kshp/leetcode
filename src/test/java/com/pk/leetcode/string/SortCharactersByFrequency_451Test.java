package com.pk.leetcode.string;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SortCharactersByFrequency_451Test {

    private static String str1 = "tree";
    private static String result1 = "eert";

    @Test
    public void frequencySort() {
        assertThat(SortCharactersByFrequency_451.frequencySort(str1), is(equalTo(result1)) );
    }
}