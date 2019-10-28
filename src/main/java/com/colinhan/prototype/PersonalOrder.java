package com.colinhan.prototype;

public class PersonalOrder implements OrderApi {

    private String customerName;
    private String productId;
    private int productNum;

    public int getOrderProductNum() {
        return productNum;
    }

    public void setOrderProductNum(int num) {
        productNum = num;
    }

    public OrderApi cloneOrder() {
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName(customerName);
        order.setProductId(productId);
        order.setOrderProductNum(productNum);
        return order;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    @Override
    public String toString() {
        return "这是个人订单：" + customerName + productId + productNum;
    }
}
