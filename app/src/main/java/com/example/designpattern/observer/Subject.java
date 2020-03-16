package com.example.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * 就是这里一旦发现某些变化,通知观察者
 */
public class Subject {


    private static Subject instance = null;

    private List<Observer> observers;


    private Subject() {
        observers = new ArrayList<>();
    }


    public static Subject getInstance() {
        if (null == instance) {
            instance = new Subject();
        }
        return instance;
    }

    /**
     * 设置用于观察对象的传输信息用的
     *
     * @param server
     */
    public void addObserver(Observer server) {
        this.observers.add(server);
    }

    /**
     * 通知观察者
     *
     * @param text
     */
    public void notifyObserver(String text) {
        for (Observer observer : observers) {
            observer.update(text);
        }
    }
}
