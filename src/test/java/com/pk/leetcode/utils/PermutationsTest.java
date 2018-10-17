package com.pk.leetcode.utils;

import org.junit.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class PermutationsTest {

    private static String[] words1 = {"foo", "bar"};

    @Test
    public void of() {
        Permutations.of(Arrays.asList(words1)).forEach(p -> {
            p.forEach(System.out::print);
            System.out.print(" ");
        });
        System.out.println();
        Set<String> collect = Permutations.of(Arrays.asList(words1)).map(stringStream -> stringStream.collect(Collectors.joining())).collect(Collectors.toSet());
        System.out.println(collect);
    }
}