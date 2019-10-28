package com.colinhan.chainofresponsibility;

/**
 * 责任链模式：
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 * <p>
 * 例子：
 * 申请聚餐费用需要层层审批，不同级别的领导审批的额度不同，额度越高，需要的领导级别越高
 * 项目经理 < 部门经理 < 总经理
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ProjectManagerHandler();
        Handler h2 = new DepartmentManager();
        Handler h3 = new GeneralManagerHandler();

        h1.setNextHandler(h2);
        h2.setNextHandler(h3);

        String result = null;
        result = h1.handleFeeRequest("xiaoming", 300);
        System.out.println(result);
        result = h1.handleFeeRequest("xiaoming", 600);
        System.out.println(result);
        result = h1.handleFeeRequest("xiaoming", 1000);
        System.out.println(result);

        result = h1.handleFeeRequest("xiaozhang", 300);
        System.out.println(result);
        result = h1.handleFeeRequest("xiaozhang", 600);
        System.out.println(result);
        result = h1.handleFeeRequest("xiaozhang", 1000);
        System.out.println(result);

    }
}
