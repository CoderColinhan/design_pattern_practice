package com.colinhan.decrator;

import java.util.Date;

/**
 * 装饰器，计算累计奖金
 */
public class SumPrizeDecorator extends Decorator {
    public SumPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //获取前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        //然后计算累计奖金, 假设当月奖金是2000
        double prize = 2000;
        return money + prize;
    }
}
