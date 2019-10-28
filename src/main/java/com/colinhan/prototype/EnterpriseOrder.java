package com.colinhan.prototype;

public class EnterpriseOrder implements OrderApi {
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
        EnterpriseOrder order = new EnterpriseOrder();
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
        return "这是企业订单：" + customerName + productId + productNum;
    }
}
