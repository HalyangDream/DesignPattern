package com.example.designpattern.observer;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 发布订阅者
 * 即所谓的观察者
 */
public class ObserverActivity extends AppCompatActivity implements Observer {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Subject subject = new Subject();
        subject.setObserver(this);
        subject.change();
    }


    /**
     * 被观察者发生变化时
     * 会触发这里
     */
    @Override
    public void update() {

    }
}
