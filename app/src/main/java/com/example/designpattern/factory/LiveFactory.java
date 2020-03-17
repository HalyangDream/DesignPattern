package com.example.designpattern.factory;

/**
 * 工厂类
 */
public class LiveFactory {


    /**
     * 因为是工厂类,设备应该就是同一套
     * 假设SDK就是这个设备
     */
    private LiveConfig getConfig() {
        return new LiveConfig();
    }


    public Live getLive(int type) {
        LiveConfig config = getConfig();
        switch (type) {
            case LiveType.VIDEO:
                return new VideoLive(config);
            case LiveType.VOICE_GROUP:
                return new VoiceGroup(config);
            case LiveType.VOICE_LIVE:
                return new VoiceLive(config);
        }
        return null;
    }

    public interface Live {

        void initConfig();
    }


    public class LiveType {

        public static final int VIDEO = 0;
        public static final int VOICE_GROUP = 1;
        public static final int VOICE_LIVE = 2;

    }
}
