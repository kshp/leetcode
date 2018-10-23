package com.pk.leetcode.string;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MostCommonWord_819Test {

    private static String p1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
    private static String[] b1 = {"hit"};

    private static String p2 = "a.";
    private static String[] b2 = {};

    private static String p3 = "a, a, a, a, b,b,b,c, c";
    private static String[] b3 = {"a"};

    @Test
    public void mostCommonWord() {
        assertThat(MostCommonWord_819.mostCommonWord(p1, b1), is(equalTo("ball")));
        assertThat(MostCommonWord_819.mostCommonWord(p2, b2), is(equalTo("a")));
        assertThat(MostCommonWord_819.mostCommonWord(p3, b3), is(equalTo("b")));
    }

    @Test
    public void mostCommonWordTrie() {
        assertThat(MostCommonWord_819.mostCommonWordTrie(p1, b1), is(equalTo("ball")));
        assertThat(MostCommonWord_819.mostCommonWordTrie(p2, b2), is(equalTo("a")));
        assertThat(MostCommonWord_819.mostCommonWordTrie(p3, b3), is(equalTo("b")));
    }
}