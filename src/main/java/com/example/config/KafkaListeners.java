package com.example.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListeners {

    @KafkaListener(topics = "First", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}