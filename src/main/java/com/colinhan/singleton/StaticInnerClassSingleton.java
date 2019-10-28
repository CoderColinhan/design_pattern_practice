package com.colinhan.singleton;

public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.singleton;
    }

    public static class SingletonHolder {
        private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }
}
