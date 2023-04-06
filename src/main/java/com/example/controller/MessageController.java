package com.example.controller;

import com.example.config.KafkaProducer;
import com.example.modal.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping
    public void sendMessage(@RequestBody MessageRequest request) {
        kafkaProducer.sendMessage(request.message());
    }

}
