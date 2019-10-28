package com.colinhan.visitor;

/**
 * 具体的访问者，实现客户提出服务请求的功能
 */
public class ServiceRequestVisitor implements Visitor {
    public void visitEnterpriseCustomer(Customer customer) {
        System.out.println(customer.getName() + "企业提出服务请求");
    }

    public void visitPersonalCustomer(Customer customer) {
        System.out.println(customer.getName() + "个人提出服务请求");
    }
}
