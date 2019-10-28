package com.colinhan.prototype;

public class OrderBusiness {

    /**
     * 创建订单的方法
     * <p>
     * 如果订单的商品数量大于1000，就分拆订单
     *
     * @param order
     */
    public void saveOrder(OrderApi order) {
        while (order.getOrderProductNum() > 1000) {
            OrderApi newOrder = order.cloneOrder();
            newOrder.setOrderProductNum(1000);

            order.setOrderProductNum(order.getOrderProductNum() - 1000);

            //拆分后可以进行业务处理了
            System.out.println("拆分出来的新订单 " + newOrder.toString());
        }
        //原订单order的信息
        System.out.println("原订单order的信息 " + order.toString());
    }
}
