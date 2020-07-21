package com.huangda7.serviceprovider.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public String getOrderInformation(){
        String orderInformation = "远程商品信息";
        return orderInformation;
    }

    public String getEmptyOrderInformation(String id) {
        return "1".equals(id) ? "商品1信息" : null;
    }
}
