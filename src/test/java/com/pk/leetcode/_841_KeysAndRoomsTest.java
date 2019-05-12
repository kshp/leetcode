package com.pk.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class _841_KeysAndRoomsTest {

    private static final List<List<Integer>> input1;
    private static final List<List<Integer>> input2;

    static {
        input1 = new ArrayList<>(4);
        input1.add(Collections.singletonList(1));
        input1.add(Collections.singletonList(2));
        input1.add(Collections.singletonList(3));
        input1.add(new ArrayList<>());

        input2 = new ArrayList<>(4);
        input2.add(Arrays.asList(1, 3));
        input2.add(Arrays.asList(3, 0, 1));
        input2.add(Collections.singletonList(2));
        input2.add(Collections.singletonList(0));
        input2.add(new ArrayList<>());
    }

    @Test
    public void canVisitAllRooms() {
        _841_KeysAndRooms instance = new _841_KeysAndRooms();
        assertTrue(instance.canVisitAllRooms(input1));
        assertFalse(instance.canVisitAllRooms(input2));
    }
}