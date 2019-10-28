package com.colinhan.proxy;

public class RealSubject implements Subject {
    public void request() {
        //具体的处理
        System.out.println("正在调用RealSubject");
    }
}
