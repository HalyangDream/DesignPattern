package com.example.designpattern.factory;

public class VideoLive implements LiveFactory.Live {

    private LiveConfig config;

    public VideoLive(LiveConfig config) {
        this.config = config;
    }

    @Override
    public void initConfig() {
        config.liveType = "Video";
        config.anchorNum = 1;
    }

    public String getLiveType() {
        return config.liveType;
    }

    public int getAnchorNum() {
        return config.anchorNum;
    }
}
