package com.example.designpattern.factory;

public class VoiceGroup implements LiveFactory.Live {


    private LiveConfig config;

    public VoiceGroup(LiveConfig config) {
        this.config = config;
    }

    @Override
    public void initConfig() {
        config.liveType = "voice_group";
        config.anchorNum = 10;
    }

    public String getLiveType() {
        return config.liveType;
    }

    public int getAnchorNum() {
        return config.anchorNum;
    }
}
