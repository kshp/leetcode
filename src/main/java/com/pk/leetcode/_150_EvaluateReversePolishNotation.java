package com.pk.leetcode;

import java.util.*;

public class _150_EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        Deque<String> stack = new ArrayDeque<>();

        for (String t : tokens){
            if (operators.contains(t)){
                Integer right = Integer.valueOf(stack.pop());
                Integer left = Integer.valueOf(stack.pop());
                stack.push(calc(left, right, t));
            }else
                stack.push(t);
        }

        return Integer.valueOf(stack.pop());
    }

    private String calc(Integer left, Integer right, String operator){
        switch(operator){
            case "+": return String.valueOf(left + right);
            case "-": return String.valueOf(left - right);
            case "*": return String.valueOf(left * right);
            case "/": return String.valueOf(left / right);
        }
        return "0";
    }
}
