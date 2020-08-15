//package com.huangda7.serviceprovider.controller;
//
//import com.huangda7.serviceprovider.service.MessageProvider;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class MessageController {
//    @Autowired
//    private MessageProvider messageProvider;
//    @GetMapping(path = "/message")
//    public String sendMessage(){
//        String result = messageProvider.send();
//        return result;
//    }
//}
