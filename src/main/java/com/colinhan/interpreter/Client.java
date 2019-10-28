package com.colinhan.interpreter;

/**
 * 解释器模式：
 * 给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示
 * 来解释语言中的句子。
 * <p>
 * 解释器模式的重要前提就是要定义一套语法规则，因为解释器模式就是按照这些规则来进行解析，并执行相应的功能
 * <p>
 * 这个模式中的概念：
 * 解析器：描述客户端调用要求的表达式，经过解析形成一个抽象语法树的程序，而不是指xml解析器
 * 解释器：解释抽象语法树，并执行每个节点对应的功能的程序。
 * <p>
 * 例子：
 * 维护系统自定义的配置文件，如何灵活地读取配置文件的内容
 * <p>
 * 使用解释器的客户端的工作会比较多，最主要的就是要组装抽象的语法树
 */
public class Client {

    public static void main(String[] args) throws Exception {
        getSingleElementValue();
        getSingleElementPropertyValue();
    }

    /**
     * 获取单个元素的值
     *
     * @throws Exception
     */
    public static void getSingleElementValue() throws Exception {
        Context c = new Context("D:\\workspace\\IdeaProjects\\design_pattern_practice\\src\\main\\java\\com\\colinhan\\interpreter\\interpreterTest.xml");
        ElementExpression root = new ElementExpression("root");
        ElementExpression aEle = new ElementExpression("a");
        ElementExpression bEle = new ElementExpression("b");
        ElementTerminalExpression cEle = new ElementTerminalExpression("c");

        //组装起来
        root.addEle(aEle);
        aEle.addEle(bEle);
        bEle.addEle(cEle);

        //调用
        String[] ss = root.interpret(c);
        System.out.println("c的值是 " + ss[0]);
    }

    /**
     * 获取单个元素的属性值
     *
     * @throws Exception
     */
    public static void getSingleElementPropertyValue() throws Exception {
        Context c = new Context("D:\\workspace\\IdeaProjects\\design_pattern_practice\\src\\main\\java\\com\\colinhan\\interpreter\\interpreterTest.xml");
        ElementExpression root = new ElementExpression("root");
        ElementExpression aEle = new ElementExpression("a");
        ElementExpression bEle = new ElementExpression("b");
        ElementExpression cEle = new ElementExpression("c");
        PropertyTerminalExpression prop = new PropertyTerminalExpression("name");

        //组装起来
        root.addEle(aEle);
        aEle.addEle(bEle);
        bEle.addEle(cEle);
        cEle.addEle(prop);

        //调用
        String[] ss = root.interpret(c);
        System.out.println("c的属性name值是 " + ss[0]);

        /**
         * 如果要使用同一个上下文，连续进行解析，需要重新初始化上下文对象
         * 比如，要连续的重新再获取一次属性name的值，当然你可以重新组合元素，
         * 重新解析，只要是在使用同一个上下文，就需要重新初始化上下文对象
         */
        c.reInit();
        String ss2[] = root.interpret(c);
        System.out.println("重新获取c的属性name值是 " + ss2[0]);
    }
}
