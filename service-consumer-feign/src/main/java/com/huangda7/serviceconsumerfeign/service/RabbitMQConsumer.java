//package com.huangda7.serviceconsumerfeign.service;
//
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.cloud.stream.messaging.Sink;
//import org.springframework.messaging.Message;
//
//@EnableBinding(Sink.class)
//public class RabbitMQConsumer {
//
//    @StreamListener(Sink.INPUT)
//    public void receiveMessage(Message<String> message){
//        System.out.println(message.getPayload());
//    }
//}
