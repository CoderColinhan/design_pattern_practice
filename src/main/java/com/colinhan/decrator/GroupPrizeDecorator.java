package com.colinhan.decrator;

import java.util.Date;

/**
 * 装饰器， 计算团队奖金
 */
public class GroupPrizeDecorator extends Decorator {
    public GroupPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        //计算团队奖金, 假设团队奖金是3000
        double group = 3000;
        return money + group;
    }
}
