package com.colinhan.decrator;

import java.util.Date;

/**
 * 装饰器，计算当月的业务奖金
 */
public class MonthPrizeDecorator extends Decorator {
    public MonthPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //获取前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        //然后计算当月的业务奖金, 假设当月奖金是1000
        double prize = 1000;
        return money + prize;
    }
}
