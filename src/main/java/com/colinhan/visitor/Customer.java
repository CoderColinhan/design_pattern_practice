package com.colinhan.visitor;

public abstract class Customer {
    private String name;
    private String id;

    /**
     * 接受访问者的访问
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
