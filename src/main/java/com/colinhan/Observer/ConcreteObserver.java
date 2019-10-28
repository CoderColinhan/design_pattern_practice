package com.colinhan.Observer;

public class ConcreteObserver implements Observer {

    private String info;

    public void update(Subject subject) {
        ConcreteSubject obj = (ConcreteSubject) subject;
        info = obj.getState();
        System.out.println("最新的信息 " + info);
    }
}
