package com.colinhan.facadepattern;

/**
 * 外观对象
 */
public class Facade {
    public void test() {
        AMoudleApi a = new AMoudleApiImpl();
        BMoudleApi b = new BMoudleApiImpl();
        CMoudleApi c = new CMoudleApiImpl();

        a.testA();
        b.testB();
        c.testC();
    }
}
