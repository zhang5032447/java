package com.zw.example;

@GpRemoteService
    public class OrderServiceImpl implements IOrderService {

    public String queryOrderList() {
        return "queryOrderList";
    }

    public String orderById(String id) {
        return "orderById";
    }
}
