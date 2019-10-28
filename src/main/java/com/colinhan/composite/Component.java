package com.colinhan.composite;

/**
 * 抽象的组件对象，作为所有组件的父类，把所有对象统一起来，
 * 使用的时候，始终是在操作组件对象，而不对具体的子类进行区分
 */
public abstract class Component {
    /**
     * 输出组件自身的名称
     *
     * @param preStr
     */
    public abstract void printStruct(String preStr);

    /**
     * 缺省实现，因为叶子节点不能增加子节点
     *
     * @param child
     */
    public void addChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 缺省实现，因为叶子节点不能增加子节点
     *
     * @param child
     */
    public void removeChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 缺省实现，因为叶子节点不能增加子节点
     *
     * @param index
     */
    public Component getChildren(int index) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }


}
