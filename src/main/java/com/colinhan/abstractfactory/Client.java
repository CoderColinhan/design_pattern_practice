package com.colinhan.abstractfactory;

/**
 * 抽象工厂的功能是“为一系列相关对象或者相互依赖的对象”创建一组接口，
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();

        AssembleEngineer engineer = new AssembleEngineer();
        engineer.doAssemble(factory);
    }
}
