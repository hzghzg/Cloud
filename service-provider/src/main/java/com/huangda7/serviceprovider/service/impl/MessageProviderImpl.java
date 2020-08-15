//package com.huangda7.serviceprovider.service.impl;
//
//import com.huangda7.serviceprovider.service.MessageProvider;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.messaging.Source;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.support.MessageBuilder;
//
//@EnableBinding(Source.class)
//public class MessageProviderImpl implements MessageProvider {
//    @Autowired
//    private MessageChannel output;
//    @Override
//    public String send() {
//        output.send(MessageBuilder.withPayload("这是一条消息！").build());
//        return "消息发送完毕！";
//    }
//}
