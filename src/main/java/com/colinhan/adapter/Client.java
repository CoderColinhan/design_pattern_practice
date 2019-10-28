package com.colinhan.adapter;

/**
 * 适配器模式
 * 1. 定义第二版的接口（因为要面向接口编程）
 * 2. 在第二版的实现类中，转调第一版已经实现的功能
 * <p>
 * 适配器模式使得 “原本由于接口不兼容而不能在一起工作的哪些类”可以一起工作
 */
public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
