package com.example.designpattern.factory;

public class VoiceLive implements LiveFactory.Live {



    private LiveConfig config;

    public VoiceLive(LiveConfig config) {
        this.config = config;
    }

    @Override
    public void initConfig() {
        config.liveType = "voice_live";
        config.anchorNum = 1;
    }

    public String getLiveType() {
        return config.liveType;
    }

    public int getAnchorNum() {
        return config.anchorNum;
    }
}
