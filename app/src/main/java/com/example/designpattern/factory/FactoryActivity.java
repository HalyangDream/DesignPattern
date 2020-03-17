package com.example.designpattern.factory;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.designpattern.databinding.ActivityFactoryBinding;

/**
 * 简单工厂模式
 * layout = activity_factory
 */
public class FactoryActivity extends AppCompatActivity {

    private ActivityFactoryBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFactoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        LiveFactory factory = new LiveFactory();
        binding.btn1.setOnClickListener(v -> {
            VideoLive videoLive = (VideoLive) factory.getLive(LiveFactory.LiveType.VIDEO);
            videoLive.initConfig();
            binding.liveTv.setText("直播类型:" + videoLive.getLiveType());
            binding.anchorTv.setText("主播人数:" + videoLive.getAnchorNum());
        });
        binding.btn2.setOnClickListener(v -> {
            VoiceLive voiceLive = (VoiceLive) factory.getLive(LiveFactory.LiveType.VOICE_LIVE);
            voiceLive.initConfig();
            binding.liveTv.setText("直播类型:" + voiceLive.getLiveType());
            binding.anchorTv.setText("主播人数:" + voiceLive.getAnchorNum());
        });
        binding.btn3.setOnClickListener(v -> {
            VoiceGroup voiceGroup = (VoiceGroup) factory.getLive(LiveFactory.LiveType.VOICE_GROUP);
            voiceGroup.initConfig();
            binding.liveTv.setText("直播类型:" + voiceGroup.getLiveType());
            binding.anchorTv.setText("主播人数:" + voiceGroup.getAnchorNum());
        });
    }
}
