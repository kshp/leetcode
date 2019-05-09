package com.pk.leetcode;

public class _66_PlusOne {

    public static int[] plusOne(int[] digits) {
        if (digits.length==0)
            return digits;

        int i = digits.length - 1;
        digits[i] = digits[i] + 1;
        while (digits[i] == 10) {
            if (i == 0)
                return resize(digits);
            digits[i] = 0;
            i--;
            digits[i] = digits[i] + 1;
        }

        return digits;
    }

    private static int[] resize(int[] digits) {
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}
