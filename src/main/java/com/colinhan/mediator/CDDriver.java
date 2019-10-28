package com.colinhan.mediator;

public class CDDriver extends Collegue {
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    private String data;

    public String getData() {
        return data;
    }

    public void readCD() {
        this.data = "中介者模式的测试数据";

        //通知中介者，状态已经发生变化
        this.getMediator().changed(this);
    }
}
