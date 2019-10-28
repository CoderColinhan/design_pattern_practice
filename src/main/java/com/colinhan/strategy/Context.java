package com.colinhan.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double price) {
        return strategy.calculatePrice(price);
    }
}
