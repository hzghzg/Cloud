package com.huangda7.serviceconsumer.controller;

import com.huangda7.serviceconsumer.common.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/orders")
    public ResponseEntity<String> getOrderInformation(){
        ResponseEntity<String> orderInformation = restTemplate.getForEntity("http://SERVICE-PROVIDER/orders", String.class);
        return orderInformation;
    }
}
