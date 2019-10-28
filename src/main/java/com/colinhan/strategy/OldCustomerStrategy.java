package com.colinhan.strategy;

public class OldCustomerStrategy implements Strategy {
    public double calculatePrice(double goodsPrice) {
        System.out.println("老用户8折");
        return goodsPrice * 0.8;
    }
}
