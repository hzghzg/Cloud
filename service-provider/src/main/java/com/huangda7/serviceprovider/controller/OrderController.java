package com.huangda7.serviceprovider.controller;

import com.huangda7.serviceprovider.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public String getOrderInformation() {
        String orderInformation = orderService.getOrderInformation();
        return orderInformation;
    }

    @GetMapping("/hystrix/orders/{id}")
    @HystrixCommand(fallbackMethod = "getOrderByHystix")
    public String testHystrix(@PathVariable("id") String id) {
        String orderInformation = orderService.getEmptyOrderInformation(id);
        if (orderInformation == null) {
            throw new RuntimeException();
        }
        return orderInformation;
    }

    public String getOrderByHystix(@PathVariable("id") String id) {
        return "商品信息不存在！！！";
    }
}
