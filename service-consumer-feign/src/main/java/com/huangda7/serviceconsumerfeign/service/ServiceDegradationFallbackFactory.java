package com.huangda7.serviceconsumerfeign.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ServiceDegradationFallbackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new OriginOrderService() {
            @Override
            public String getOrderInformation() {
                return "当前服务已经被关闭，服务发生降级！！！";
            }
        };
    }
}
