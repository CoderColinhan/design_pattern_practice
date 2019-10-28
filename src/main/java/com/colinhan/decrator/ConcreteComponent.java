package com.colinhan.decrator;

import java.util.Date;

/**
 * 被装饰器对象
 */
public class ConcreteComponent extends Component {
    @Override
    double calcPrize(String user, Date begin, Date end) {
        //默认没有奖金
        return 0;
    }
}
