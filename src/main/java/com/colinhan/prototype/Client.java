package com.colinhan.prototype;

/**
 * 原型模式：
 * 用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象
 * <p>
 * 原型模式的功能：
 * 1。通过克隆来创建新的对象实例
 * 2. 为克隆出来的新的对象实例复制原型属性的值
 * <p>
 * 例子：
 * 如果一个订单的产品数量超过1000就要分拆订单；
 * 订单分为个人订单和企业订单；
 * 要创建一个通用的订单系统；
 * <p>
 * 因为要面向接口编程，导致在分拆订单的时候，不知道订单的具体类型（个人订单or企业订单），
 * 如果使用instanceof，会导致处理过程依赖具体的实现对象，并且入股扩展一个新的订单类型，就要修改已有代码，这不算是通用
 */
public class Client {
    public static void main(String[] args) {
        PersonalOrder order = new PersonalOrder();
        order.setOrderProductNum(3010);
        order.setProductId("123456");
        order.setCustomerName("Colinhan");

        OrderBusiness business = new OrderBusiness();
        business.saveOrder(order);
    }
}
