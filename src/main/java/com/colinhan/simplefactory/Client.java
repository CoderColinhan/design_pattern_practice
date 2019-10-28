package com.colinhan.simplefactory;

/**
 * 形式上： 把 new 动作转移到工厂类里，
 * 实质上： 体现面向接口、封装隔离
 */
public class Client {
    public static void main(String[] args) {
        Api api = Factory.createApi(1);
        api.operation("正在使用简单工厂");
    }
}
