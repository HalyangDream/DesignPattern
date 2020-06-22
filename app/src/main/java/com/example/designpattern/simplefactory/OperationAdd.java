package com.example.designpattern.simplefactory;

/**
 * 加法类
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double result = getNumberA() + getNumberB();
        return result;
    }
}
