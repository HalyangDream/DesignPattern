package com.example.designpattern.simplefactory;

/**
 * 乘法类
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {
        double result = getNumberA() * getNumberB();
        return result;
    }
}
