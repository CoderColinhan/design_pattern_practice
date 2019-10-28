package com.colinhan.singleton;

public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton singleton;

    /**
     * 构造方法私有化
     */
    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }

        return singleton;
    }
}
