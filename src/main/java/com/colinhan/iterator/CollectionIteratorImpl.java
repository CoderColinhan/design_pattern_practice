package com.colinhan.iterator;

public class CollectionIteratorImpl implements Iterator {

    private DataManager1 manage;
    private int index = -1;

    public CollectionIteratorImpl(DataManager1 manage) {
        this.manage = manage;
    }

    public void first() {
        index = 0;
    }

    public void next() {
        if (index < this.manage.getList().size()) {
            index++;
        }
    }

    public boolean isDone() {
        if (index == this.manage.getList().size()) {
            return true;
        }
        return false;
    }

    public Object currentItem() {
        return this.manage.getList().get(index);
    }
}
