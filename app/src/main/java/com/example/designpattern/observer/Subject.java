package com.example.designpattern.observer;

/**
 * 被观察者
 * 就是这里一旦发现某些变化,通知观察者
 */
public class Subject {

    private Observer observer;

    /**
     * 设置用于观察对象的传输信息用的
     *
     * @param server
     */
    public void setObserver(Observer server) {
        this.observer = server;
    }

    public void change() {
        if (observer != null) {
            observer.update();
        }
    }

}
