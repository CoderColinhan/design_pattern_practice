package com.colinhan.composite;

/**
 * 组合模式：
 * 将对象组合成树形结构以表示“部分--整体”的层次结构。
 * 组合模式使得用户对单个对象和组合对象的使用具有一致性。
 * <p>
 * 例子：展示树形结构（树形结构分为叶子节点和非叶子节点）
 */
public class Client {

    public static void main(String[] args) {
        Component school = new Composite("school");
        Component class1 = new Composite("class1");
        Component class2 = new Composite("class2");
        Component manager = new Leaf("manager");

        Component grade1 = new Leaf("grade1");
        Component grade2 = new Leaf("grade2");

        school.addChild(class1);
        school.addChild(class2);
        school.addChild(manager);
        class1.addChild(grade1);
        class1.addChild(grade2);

        school.printStruct("hello ");
    }

}
