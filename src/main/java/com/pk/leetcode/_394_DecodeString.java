package com.pk.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class _394_DecodeString {
    public String decodeString(String s) {
        if (s == null || s.length() == 0)
            return s;

        StringBuilder result = new StringBuilder();
        Deque<StringBuilder> digitsStack = new ArrayDeque<>();
        Deque<StringBuilder> strStack = new ArrayDeque<>();

        int index = 0;

        while (index < s.length()){
            if (Character.isDigit(s.charAt(index))){
                digitsStack.push(new StringBuilder());
                while (Character.isDigit(s.charAt(index))){
                    digitsStack.peek().append(s.charAt(index));
                    index++;
                }
            }else if ('[' == s.charAt(index)){
                strStack.push(result);
                result = new StringBuilder();
                index++;
            }else if (']' == s.charAt(index)){
                StringBuilder digit = digitsStack.pop();
                StringBuilder tmp = new StringBuilder();
                if (digit.length()>0)
                    for (int i=0; i<Integer.valueOf(digit.toString()); i++)
                        tmp.append(result.toString());
                result.setLength(0);
                String s1 = strStack.pop().toString();
                result.append(s1).append(tmp.toString());
                index++;
            }else{
                result.append(s.charAt(index));
                index++;
            }
        }

        return result.toString();
    }
}
