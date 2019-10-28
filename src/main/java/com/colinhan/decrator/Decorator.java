package com.colinhan.decrator;

import java.util.Date;

public abstract class Decorator extends Component {

    /**
     * 持有被装饰的组件对象
     */
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //转调组件的方法
        return component.calcPrize(user, begin, end);
    }
}
