package com.colinhan.abstractfactory;

public class AssembleEngineer {
    private AbstractProductA productA;
    private AbstractProductB productB;

    public void doAssemble(AbstractFactory factory) {
        this.productA = factory.createProductA();
        this.productB = factory.createProductB();

        this.productA.sayHello();
        this.productB.sayNice();

    }
}
