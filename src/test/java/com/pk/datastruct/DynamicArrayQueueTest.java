package com.pk.datastruct;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DynamicArrayQueueTest {

    @Test
    public void testArrayQueue() {
        DynamicArrayQueue<Integer> queue = new DynamicArrayQueue<>();
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

    @Test
    public void testResizeArrayQueue() {
        DynamicArrayQueue<Integer> queue = new DynamicArrayQueue<>(1);
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