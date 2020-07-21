package com.huangda7.serviceconsumerfeign.controller;

import com.huangda7.serviceconsumerfeign.common.ResponseUtil;
import com.huangda7.serviceconsumerfeign.service.OriginOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OriginOrderService originOrderService;

    @GetMapping(value = "/orders",produces = "application/json")
    public ResponseEntity getOrderInformation() {
        String orderInformation = originOrderService.getOrderInformation();
        return ResponseUtil.responseSuccess(orderInformation);
    }
}
