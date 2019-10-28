package com.colinhan.decrator;

/**
 * 装饰器模式
 * 动态地给一个对象增加一些额外的职责。就增加功能来说，装饰模式比生成子类更加灵活
 * <p>
 * 例子：
 * 奖金计算：
 * 奖金大致有个人当月奖金、个人累计奖金、个人业务奖金等；
 * 经理除了个人奖金外，还有团队累计奖金，团队盈利奖金等；
 * 并且奖金的计算方式可能会随时调整
 */
public class Client {
    public static void main(String[] args) {

        Component component1 = new ConcreteComponent();

        Decorator d1 = new MonthPrizeDecorator(component1);
        Decorator d2 = new SumPrizeDecorator(d1);
        Decorator d3 = new GroupPrizeDecorator(d2);

        double result1 = d1.calcPrize("xiaoming1", null, null);
        System.out.println(result1);
        double result2 = d2.calcPrize("xiaoming2", null, null);
        System.out.println(result2);
        double result3 = d3.calcPrize("xiaoming3", null, null);
        System.out.println(result3);
    }
}
