package com.agileea.simplekafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class Producer {
    public static final String partytopic = "partytopic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishToTopic(String message) {
        System.out.println("Publishing to Topic "+partytopic);
        this.kafkaTemplate.send(partytopic, message);
    }
}
