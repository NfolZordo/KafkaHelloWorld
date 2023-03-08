package com.example.helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private final KafkaProducer kafkaProducer;

    @Autowired
    public MyController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/send")
    public String send() {
        kafkaProducer.sendMessage("my-topic", "Hello, Kafka!");
        return "Message sent";
    }
}
