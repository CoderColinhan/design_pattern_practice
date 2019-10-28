package com.colinhan.simplefactory;

public class ApiImpl implements Api {
    public void operation(String s) {
        System.out.println("ApiImpl 入参s= " + s);
    }
}
