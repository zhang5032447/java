package com.zw.example.rpc;

import com.zw.example.IOrderService;
import com.zw.example.ITestService;

public class App {
    public static void main(String[] args) {
        RpcProxyClient rpcProxyClient = new RpcProxyClient();
//        IOrderService orderService = rpcProxyClient.clientProxy(IOrderService.class, "localhost", 8080);
//        System.out.println(orderService.queryOrderList());

        ITestService iTestService = rpcProxyClient.clientProxy(ITestService.class);
        System.out.println(iTestService.sayHello());
    }
}
