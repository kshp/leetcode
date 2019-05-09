package com.pk.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _273_IntegerToEnglishWordsTest {

    private static Integer n1 = 123;
    private static String result1 = "One Hundred Twenty Three";

    private static Integer n2 = 12345;
    private static String result2 = "Twelve Thousand Three Hundred Forty Five";

    private static Integer n3 = 1234567;
    private static String result3 = "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven";

    private static Integer n4 = 1234567891;
    private static String result4 = "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One";

    @Test
    public void numberToWordsTest() {
        assertEquals(result1, _273_IntegerToEnglishWords.numberToWords(n1));
        assertEquals(result2, _273_IntegerToEnglishWords.numberToWords(n2));
        assertEquals(result3, _273_IntegerToEnglishWords.numberToWords(n3));
        assertEquals(result4, _273_IntegerToEnglishWords.numberToWords(n4));
    }
}