package com.kafkatraining.milestone1.service;

import com.kafkatraining.milestone1.model.AuthTopicKey;
import com.kafkatraining.milestone1.model.AuthTopicValue;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
//    @Value("${kafka.topic.name}")
//    private String topicName;

//    @KafkaListener(topics = "${kafka.topic.name}", groupId = "spring-boot-kafka-consumer-test-topic-2")
//    public void consume(final ConsumerRecord<AuthTopicKey, AuthTopicValue> consumerRecord) {
//        System.out.println("received: " + consumerRecord.key());
//    }
}
