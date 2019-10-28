package com.colinhan.decrator;

import java.util.Date;

/**
 * 如果没有通用的功能函数，抽象类也可以定义成接口
 */
public abstract class Component {
    /**
     * 计算某人在某段时间内的奖金
     *
     * @param user
     * @param begin
     * @param end
     * @return
     */
    abstract double calcPrize(String user, Date begin, Date end);
}
