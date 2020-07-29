package com.huangda7.serviceprovider.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping(path = "/hello")
    public String sayHello(){
        logger.debug("debug--接口被调用");
        //默认是info级别，info级别的才会被调用
        logger.info("info--接口被调用");
        return "hello";
    }
}
