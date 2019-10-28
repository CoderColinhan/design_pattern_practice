package com.colinhan.Observer;

/**
 * 观察者模式：
 * 定义对象间的一种一对多的依赖关系。当一个对象的状态发生变化时，所有依赖于它的对象都得到通知并被自动更新
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();
        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("nice to meet you!");
    }
}
