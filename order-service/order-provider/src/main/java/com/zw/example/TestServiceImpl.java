package com.zw.example;

@GpRemoteService
public class TestServiceImpl implements ITestService {
    public String sayHello() {
        return "sayHello";
    }
}
