package com.colinhan.mediator;

public class CPU extends Collegue {
    public CPU(Mediator mediator) {
        super(mediator);
    }

    private String dealedVideoData;
    private String dealedSoundData;

    public void dealInputData(String data) {
        String[] ss = data.split("的");
        this.dealedSoundData = ss[0];
        this.dealedVideoData = ss[1];
        this.getMediator().changed(this);
    }

    public String getDealedVideoData() {
        return dealedVideoData;
    }

    public void setDealedVideoData(String dealedVideoData) {
        this.dealedVideoData = dealedVideoData;
    }

    public String getDealedSoundData() {
        return dealedSoundData;
    }

    public void setDealedSoundData(String dealedSoundData) {
        this.dealedSoundData = dealedSoundData;
    }
}
