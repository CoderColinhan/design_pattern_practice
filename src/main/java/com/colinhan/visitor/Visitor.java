package com.colinhan.visitor;

public interface Visitor {
    void visitEnterpriseCustomer(Customer customer);

    void visitPersonalCustomer(Customer customer);
}
