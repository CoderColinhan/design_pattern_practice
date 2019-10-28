package com.colinhan.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象
 */
public class Subject {
    private List<Observer> list = new ArrayList<Observer>();

    /**
     * 注册一个观察者对象
     *
     * @param observer
     */
    public void attach(Observer observer) {
        list.add(observer);
    }

    /**
     * 删除一个观察者对象
     *
     * @param observer
     */
    public void delete(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知所有注册的观察者
     */
    public void notifyObservers() {
        for (Observer obj : list) {
            obj.update(this);
        }
    }
}
