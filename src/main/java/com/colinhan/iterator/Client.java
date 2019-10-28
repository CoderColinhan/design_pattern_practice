package com.colinhan.iterator;

/**
 * 迭代器模式：
 * 提供一种方法，顺序访问一个聚合对象中的各个元素，而不暴露该对象的内部表示
 * <p>
 * 例子：
 * 遍历两个不同的数据系统
 */
public class Client {
    public static void main(String[] args) {
        DataManager1 manager1 = new DataManager1();
        manager1.calculateData();

        DataManager2 manager2 = new DataManager2();
        manager2.calculateData();

        testIterator(manager1.createIterator());
        testIterator(manager2.createIterator());

    }

    public static void testIterator(Iterator iterator) {
        iterator.first();
        while (!iterator.isDone()) {
            Object object = iterator.currentItem();
            System.out.println(object);
            iterator.next();
        }
    }
}
