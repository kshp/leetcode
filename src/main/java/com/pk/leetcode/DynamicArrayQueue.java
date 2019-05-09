package com.pk.leetcode;

public class DynamicArrayQueue<T> {

    private static final int INITIAL_CAPACITY = 16;
    private int headIndex;
    private Object[] storage;

    public DynamicArrayQueue() {
        this.headIndex = 0;
        this.storage = new Object[INITIAL_CAPACITY];
    }

    public DynamicArrayQueue(int initialCapacity) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Invalid initialCapacity");
        this.headIndex = 0;
        this.storage = new Object[initialCapacity];
    }

    public void enqueue(T element) {
        ensureCapacity();
        storage[headIndex++] = element;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (headIndex == 0)
            return null;

        Object o = storage[0];
        if (headIndex > 1)
            System.arraycopy(storage, 1, storage, 0, headIndex);
        storage[headIndex--] = null;

        return (T) o;
    }

    public int size() {
        return headIndex;
    }

    private void ensureCapacity() {
        if (headIndex == storage.length-1) {
            Object[] newStorage = new Object[storage.length + storage.length];
            System.arraycopy(storage, 0, newStorage, 0, headIndex);
            storage = newStorage;
        }
    }
}
