package com.colinhan.strategy;

/**
 * 策略模式：
 * 定义一系列的算法，把他们一个个封装起来，并且使他们可相互替换。本模式使得算法可以独立于使用它的客户而变化
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new OldCustomerStrategy();
        Context context = new Context(strategy);
        double price = context.quote(1000);
        System.out.println("最终价格 " + price);
    }

}
