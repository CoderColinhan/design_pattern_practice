package com.colinhan.visitor;

/**
 * 具体的访问者，实现对客户的偏好分析
 */
public class PredilectionAnalyzeVisitor implements Visitor {
    public void visitEnterpriseCustomer(Customer customer) {
        System.out.println(customer.getName() + "对企业进行产品偏好分析");
    }

    public void visitPersonalCustomer(Customer customer) {
        System.out.println(customer.getName() + "对个人进行产品偏好分析");
    }
}
