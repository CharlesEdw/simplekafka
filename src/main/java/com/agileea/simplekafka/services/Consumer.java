package com.agileea.simplekafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    
    @KafkaListener(topics ="partytopic", groupId="agileea")
    public void consumeFromTopic(String message) {
        System.out.println("Consumed message "+ message);

    }
}
