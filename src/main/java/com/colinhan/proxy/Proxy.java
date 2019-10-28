package com.colinhan.proxy;

public class Proxy implements Subject {

    //被代理的对象
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void request() {
        //转调之前的一些处理

        //转调
        realSubject.request();

        //转调之后的一些处理
    }
}
