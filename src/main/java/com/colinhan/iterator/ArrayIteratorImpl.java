package com.colinhan.iterator;

public class ArrayIteratorImpl implements Iterator {

    private DataManager2 manager;
    private int index = -1;

    public ArrayIteratorImpl(DataManager2 manager) {
        this.manager = manager;
    }

    public void first() {
        index = 0;
    }

    public void next() {
        if (index < manager.getArray().length) {
            index++;
        }
    }

    public boolean isDone() {
        if (index == this.manager.getArray().length) {
            return true;
        }
        return false;
    }

    public Object currentItem() {
        return this.manager.getArray()[index];
    }
}
