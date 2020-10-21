package com.zw.example.rpc;

import com.zw.example.IOrderService;
import com.zw.example.ITestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GpReference
    IOrderService orderService;

    @GpReference
    ITestService testService;

    @GetMapping("/test")
    public String test() {
        return orderService.queryOrderList();
    }

    @GetMapping("/get")
    public String get() {
        return testService.sayHello();
    }
}
