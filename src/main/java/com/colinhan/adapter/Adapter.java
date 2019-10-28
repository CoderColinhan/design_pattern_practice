package com.colinhan.adapter;

public class Adapter implements Target {
    /**
     * 持有被适配的接口对象
     */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specialRequest();
    }
}
