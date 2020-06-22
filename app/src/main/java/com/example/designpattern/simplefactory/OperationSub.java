package com.example.designpattern.simplefactory;

/**
 * 减法类
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        double result = getNumberA() - getNumberB();
        return result;
    }
}
