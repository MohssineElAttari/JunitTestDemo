package com.test.service;

public class TestServiceImpl implements ITestService{
    @Override
    public int multiple(int a, int b) {
        return a*b;
    }
}
