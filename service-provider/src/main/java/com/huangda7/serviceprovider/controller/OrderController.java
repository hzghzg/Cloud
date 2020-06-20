package com.huangda7.serviceprovider.controller;

import com.huangda7.serviceprovider.common.ResponseUtil;
import com.huangda7.serviceprovider.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    public void getOrderInformation() {
        String orderInformation = orderService.getOrderInformation();
        ResponseUtil.responseSuccess(orderInformation);
    }
}
