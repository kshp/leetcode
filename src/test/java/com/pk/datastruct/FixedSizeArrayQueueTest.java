package com.pk.datastruct;

import org.junit.Test;

import static org.junit.Assert.*;

public class FixedSizeArrayQueueTest {

    @Test (expected = IllegalStateException.class)
    public void ensureCapacityFixedArrayQueue(){
        FixedSizeArrayQueue<Integer> queue = new FixedSizeArrayQueue<>(1);
        queue.enqueue(1);

        Integer one = queue.dequeue();
        assertEquals((Integer) 1, one);
        assertEquals(0, queue.size());

        queue.enqueue(2);
        assertEquals(1, queue.size());
        Integer two = queue.dequeue();
        assertEquals((Integer) 2, two);
        assertEquals(0, queue.size());

        queue.enqueue(1);
        queue.enqueue(1);
    }

    @Test
    public void testFixedArrayQueue(){
        FixedSizeArrayQueue<Integer> queue = new FixedSizeArrayQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(2, queue.size());

        Integer one = queue.dequeue();
        assertEquals((Integer) 1, one);
        assertEquals(1, queue.size());

        Integer two = queue.dequeue();
        assertEquals((Integer) 2, two);
        assertEquals(0, queue.size());

        queue.enqueue(4);
        assertEquals(1, queue.size());
        Integer four = queue.dequeue();
        assertEquals((Integer) 4, four);
        assertEquals(0, queue.size());

        Integer nullDequeue = queue.dequeue();
        assertNull(nullDequeue);
    }

}