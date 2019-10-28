package com.colinhan.proxy;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 代理模式
 * 为其他对象提供一种代理以控制对这个对象的访问
 */
public class Client {

    public static void main(String[] args) {

        Collection<Subject> list = new ArrayList<Subject>();

        RealSubject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);

        list.add(proxy);

        for (Subject obj : list) {
            obj.request();
        }

    }
}
