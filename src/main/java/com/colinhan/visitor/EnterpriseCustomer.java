package com.colinhan.visitor;

public class EnterpriseCustomer extends Customer {

    private String linkman;
    private String linkTelephone;
    private String linkAddress;

    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitEnterpriseCustomer(this);
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkTelephone() {
        return linkTelephone;
    }

    public void setLinkTelephone(String linkTelephone) {
        this.linkTelephone = linkTelephone;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }
}
