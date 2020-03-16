package com.example.designpattern.observer;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.designpattern.databinding.ActivityObserverBinding;

/**
 * 发布订阅者
 * 即所谓的观察者
 * layout = activity_observer
 */
public class ObserverActivity extends AppCompatActivity implements Observer {

    private ActivityObserverBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityObserverBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Subject.getInstance().addObserver(this);
        binding.editNameBtn.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), EditActivity.class);
            startActivity(intent);
        });
    }


    /**
     * 被观察者发生变化时
     * 会触发这里
     */
    @Override
    public void update(String text) {
        binding.nameTv.setText(text);
    }
}
