package com.colinhan.mediator;

public class VedioCard extends Collegue {
    public VedioCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data) {
        System.out.println("正在输出显卡数据 " + data);
    }
}
