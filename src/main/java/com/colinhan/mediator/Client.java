package com.colinhan.mediator;

/**
 * 中介者模式mediator
 * 用一个中介对象类封装一系列的对象交互。
 * 中介者使得各个对象不需要显示的相互引用，从而使其耦合松散，而且可以独立的改变它们之间的交互
 * <p>
 * 例子：电脑的各个组件之间的通信是通过主板为中介完成的
 * 更加具体的例子：使用电脑看电影
 * 1. 光驱读取光盘上的数据，然后通知主板数据读取完毕
 * 2. 主板得到光驱上的数据，把数据交给cpu进行处理
 * 3. cpu处理完成后，通知主板数据处理完成
 * 4. 主板得到cpu处理后的数据，分别把数据交给显卡和声卡去进行展示
 */
public class Client {

    public static void main(String[] args) {
        MainBoard mainBoard = new MainBoard();

        CDDriver cdDriver = new CDDriver(mainBoard);
        CPU cpu = new CPU(mainBoard);
        VedioCard vedioCard = new VedioCard(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);

        mainBoard.setCdDriver(cdDriver);
        mainBoard.setCpu(cpu);
        mainBoard.setVedioCard(vedioCard);
        mainBoard.setSoundCard(soundCard);

        cdDriver.readCD();
    }

}
