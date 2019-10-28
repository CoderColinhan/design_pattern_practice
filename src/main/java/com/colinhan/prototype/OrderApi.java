package com.colinhan.prototype;

public interface OrderApi {
    int getOrderProductNum();

    void setOrderProductNum(int num);

    /**
     * 克隆方法
     *
     * @return 订单原型的新实例
     */
    OrderApi cloneOrder();

}
