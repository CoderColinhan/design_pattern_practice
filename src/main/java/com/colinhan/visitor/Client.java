package com.colinhan.visitor;

/**
 * 访问者模式：
 * 表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作
 * <p>
 * （装饰模式基本上是在现有的基础上进行功能添加，实际上是对现有功能的加强或者改造，并不是在现有功能不改动的
 * 情况下，为对象添加新的功能）
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();

        Customer c1 = new EnterpriseCustomer();
        c1.setId("1");
        c1.setName("abc公司");

        Customer c2 = new PersonalCustomer();
        c2.setId("2");
        c2.setName("def公司");

        Customer c3 = new PersonalCustomer();
        c3.setId("3");
        c3.setName("zzz公司");

        os.add(c1);
        os.add(c2);
        os.add(c3);

        ServiceRequestVisitor sVisitor = new ServiceRequestVisitor();
        os.handleRequest(sVisitor);

        PredilectionAnalyzeVisitor pVisitor = new PredilectionAnalyzeVisitor();
        os.handleRequest(pVisitor);

    }
}
