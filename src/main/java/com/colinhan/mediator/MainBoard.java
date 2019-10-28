package com.colinhan.mediator;

/**
 * 主板类，就是中介者
 */
public class MainBoard implements Mediator {
    /**
     * 终结者会持有所有对象
     */
    private CPU cpu;
    private CDDriver cdDriver;
    private VedioCard vedioCard;
    private SoundCard soundCard;

    public void changed(Collegue collegue) {
        if (collegue == cdDriver) {
            this.afterCdDriverReadData((CDDriver) collegue);
        } else if (collegue == cpu) {
            this.afterCPUDealData((CPU) collegue);
        }
    }

    //光驱获取数据后与其他对象交互
    private void afterCdDriverReadData(CDDriver cdDriver) {
        String data = cdDriver.getData();
        this.cpu.dealInputData(data);
    }

    //cpu处理数据后与其他对象交互
    private void afterCPUDealData(CPU cpu) {
        this.vedioCard.showData(cpu.getDealedVideoData());
        this.soundCard.soundData(cpu.getDealedSoundData());
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public CDDriver getCdDriver() {
        return cdDriver;
    }

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public VedioCard getVedioCard() {
        return vedioCard;
    }

    public void setVedioCard(VedioCard vedioCard) {
        this.vedioCard = vedioCard;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
}
