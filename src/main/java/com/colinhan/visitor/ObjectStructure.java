package com.colinhan.visitor;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectStructure {

    /**
     * 要操作的客户集合
     */
    private Collection<Customer> col = new ArrayList<Customer>();

    public void handleRequest(Visitor visitor) {
        for (Customer item : col) {
            item.accept(visitor);
        }
    }

    public void add(Customer customer) {
        this.col.add(customer);
    }
}
