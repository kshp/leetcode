package com.pk.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class _819_MostCommonWordTest {

    private static String p1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
    private static String[] b1 = {"hit"};

    private static String p2 = "a.";
    private static String[] b2 = {};

    private static String p3 = "a, a, a, a, b,b,b,c, c";
    private static String[] b3 = {"a"};

    @Test
    public void mostCommonWord() {
        assertThat(_819_MostCommonWord.mostCommonWord(p1, b1), is(equalTo("ball")));
        assertThat(_819_MostCommonWord.mostCommonWord(p2, b2), is(equalTo("a")));
        assertThat(_819_MostCommonWord.mostCommonWord(p3, b3), is(equalTo("b")));
    }

    @Test
    public void mostCommonWordTrie() {
        assertThat(_819_MostCommonWord.mostCommonWordTrie(p1, b1), is(equalTo("ball")));
        assertThat(_819_MostCommonWord.mostCommonWordTrie(p2, b2), is(equalTo("a")));
        assertThat(_819_MostCommonWord.mostCommonWordTrie(p3, b3), is(equalTo("b")));
    }
}