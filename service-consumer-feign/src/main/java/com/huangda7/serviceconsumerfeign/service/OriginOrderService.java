package com.huangda7.serviceconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SERVICE-PROVIDER")
@Component
public interface OriginOrderService {
    @GetMapping(value = "/orders")
    public String getOrderInformation();
}
