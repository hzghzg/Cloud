package com.huangda7.registercentereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterCenterEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterEurekaApplication.class, args);
    }

}
