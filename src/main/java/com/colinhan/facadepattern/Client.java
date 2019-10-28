package com.colinhan.facadepattern;

/**
 * 外观模式是为了减少外部与子系统内部多个模块的交互，松散耦合，让外部更加简单的使用子系统
 * 外观类是作为子系统对外的接口
 * 关键类 Facade
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.test();
    }
}
