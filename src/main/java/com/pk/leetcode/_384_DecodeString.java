package com.pk.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class _384_DecodeString {

    public String decodeString(String s) {
        if (s == null || s.length() == 0)
            return s;

        Deque<Integer> multiplierStack = new LinkedList<>();
        Deque<StringBuilder> result = new LinkedList<>();

        result.push(new StringBuilder());

        int multiplier = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                multiplier = 10 * multiplier + c - '0';
            } else if (c == '[') {
                multiplierStack.push(multiplier);
                multiplier = 0;
                result.push(new StringBuilder());
            } else if (c == ']') {
                StringBuilder str = result.pop();
                Integer mult = multiplierStack.pop();
                StringBuilder multipliedStr = new StringBuilder();
                for (int i=0; i<mult;i++){
                    multipliedStr.append(str);
                }
                result.push(result.pop().append(multipliedStr));
            } else
                result.push(result.pop().append(c));
        }

        return result.pop().toString();
    }


}
