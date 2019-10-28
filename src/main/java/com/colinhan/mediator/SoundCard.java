package com.colinhan.mediator;

public class SoundCard extends Collegue {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundData(String data) {
        System.out.println("正在输出声卡数据 " + data);
    }
}
