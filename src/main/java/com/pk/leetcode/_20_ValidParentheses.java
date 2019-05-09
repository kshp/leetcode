package com.pk.leetcode;

import java.util.*;

public class _20_ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.length()==0)
            return true;
        if (s.length() % 2 !=0)
            return false;

        Deque<Character> stack = new ArrayDeque<>();
        Set<Character> openSet = new HashSet<>(Arrays.asList('(', '{', '['));
        Set<Character> closingSet = new HashSet<>(Arrays.asList(')', '}', ']'));

        for (Character c : s.toCharArray()){
            if (openSet.contains(c))
                stack.push(c);
            if (closingSet.contains(c)){
                if (stack.isEmpty())
                    return false;
                Character opening = stack.pop();
                if (!c.equals(getClosingFor(opening)))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    private Character getClosingFor (Character opening){
        switch(opening){
            case '(': return ')';
            case '{': return '}';
            case '[': return ']';
            default: return '0';
        }

    }
}
