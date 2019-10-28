package com.colinhan.iterator.data;

/**
 * 工资数据模型
 */
public class DataModel {
    private String userName;
    private double salary;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return userName + " " + salary;
    }
}
