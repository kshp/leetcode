package com.pk.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class _118_PascalsTriangleTest {

    private  List<List<Integer>> expected;

    @Before
    public void init(){
        expected = new ArrayList<>(4);
        expected.add(0, new ArrayList<>());
        expected.add(1, new ArrayList<>());
        expected.add(2, new ArrayList<>());
        expected.add(3, new ArrayList<>());
        expected.add(4, new ArrayList<>());
        expected.get(0).add(1);

        expected.get(1).add(1);
        expected.get(1).add(1);

        expected.get(2).add(1);
        expected.get(2).add(2);
        expected.get(2).add(1);

        expected.get(3).add(1);
        expected.get(3).add(3);
        expected.get(3).add(3);
        expected.get(3).add(1);

        expected.get(4).add(1);
        expected.get(4).add(4);
        expected.get(4).add(6);
        expected.get(4).add(4);
        expected.get(4).add(1);
    }

    @Test
    public void generate() {
        _118_PascalsTriangle instance = new _118_PascalsTriangle();
        List<List<Integer>> generated = instance.generate(5);
        assertEquals(generated, expected);
    }
}