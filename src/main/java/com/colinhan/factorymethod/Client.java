package com.colinhan.factorymethod;

/**
 * 工厂方法模式的功能是让父类早不知道具体实现的情况下，完成自身的功能调用；
 * 而具体的实现延迟到子类类实现
 * <p>
 * 例如：在这个例子中，ExportOperate类完成导出数据功能，但是并没有确定导出的形式是文件还是数据库（只是留了一个抽象方法用于创建具体的形式），
 * 因此，在ExportOperate的两个子类中实现了抽象方法，用于创建具体的导出形式
 * 在客户端，直接选用具体的导出形式即可
 */
public class Client {
    public static void main(String[] args) {
        ExportOperate operate = new ExportDBOperate();
        operate.export("测试数据");
    }
}
