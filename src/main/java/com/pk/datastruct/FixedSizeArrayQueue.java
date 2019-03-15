package com.pk.datastruct;

public class FixedSizeArrayQueue<T> {

    private static final int DEFAULT_CAPACITY = 16;
    private int tailIndex;
    private Object[] storage;

    public FixedSizeArrayQueue() {
        this.tailIndex = 0;
        this.storage = new Object[DEFAULT_CAPACITY];
    }

    public FixedSizeArrayQueue(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("Invalid capacity");
        this.tailIndex = 0;
        this.storage = new Object[capacity];
    }

    public void enqueue(T element) {
        ensureCapacity();
        storage[tailIndex++] = element;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (tailIndex == 0)
            return null;

        Object element = storage[0];
        if (tailIndex > 1)
            System.arraycopy(storage, 1, storage, 0, tailIndex);
        storage[--tailIndex] = null;

        return (T) element;
    }

    public int size() {
        return tailIndex;
    }

    private void ensureCapacity() {
        if (tailIndex == storage.length)
            throw new IllegalStateException("Queue is full");
    }
}
