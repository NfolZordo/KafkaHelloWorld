package com.example.helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "${kafka.topic}")
    public void receive(String payload) {
        System.out.println("Отримано повідомлення: " + payload);
    }
}
