package com.kafkatraining.milestone1.service;

import com.kafkatraining.milestone1.model.*;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.stereotype.Component;

@Component
public class KafkaStreamService {

    @Value("${kafka.topic.name}")
    private String topicName;

    @Value("${kafka.topic.case.name}")
    private String topicCase;

    @Value("${kafka.topic.subscriber.name}")
    private String topicSubscriber;

    @Value("${kafka.topic.patient.name}")
    private String topicPatient;

    @Value("${kafka.topic.service.name}")
    private String topicService;

    @Autowired
    public void process(StreamsBuilder streamsBuilder) {
        JsonSerializer<AuthTopicKey> serializerKey = new JsonSerializer<>();
        JsonDeserializer<AuthTopicKey> deserializerKey = new JsonDeserializer<>(AuthTopicKey.class);
        JsonSerializer<AuthTopicValue> serializerValue = new JsonSerializer<>();
        JsonDeserializer<AuthTopicValue> deserializerValue = new JsonDeserializer<>(AuthTopicValue.class);
        Serde<AuthTopicKey> keySerde = Serdes.serdeFrom(serializerKey, deserializerKey);
        Serde<AuthTopicValue> valueSerde = Serdes.serdeFrom(serializerValue, deserializerValue);

        Serde<Cased> caseValueSerd = Serdes.serdeFrom(new JsonSerializer<>(), new JsonDeserializer<>(Cased.class));
        Serde<Patient> patientValueSerd = Serdes.serdeFrom(new JsonSerializer<>(), new JsonDeserializer<>(Patient.class));
        Serde<Subscriber> subscriberValueSerd = Serdes.serdeFrom(new JsonSerializer<>(), new JsonDeserializer<>(Subscriber.class));
        Serde<Service> serviceValueSerd = Serdes.serdeFrom(new JsonSerializer<>(), new JsonDeserializer<>(Service.class));

        KStream<AuthTopicValue, AuthTopicValue> kStream = streamsBuilder.stream(topicName, Consumed.with(valueSerde, valueSerde));

        kStream.peek((key, value) -> System.out.println(value.toString()))
                .map((key, value) -> (new KeyValue<String, Cased>("Case", value.getCased())))
                .peek((key, value) -> System.out.println("Key: " + key + " value: " + value.toString()))
                .to(topicCase, Produced.with(Serdes.String(), caseValueSerd));

        kStream.peek((key, value) -> System.out.println(value.toString()))
                .map((key, value) -> (new KeyValue<String, Patient>("Patient", value.getPatient())))
                .peek((key, value) -> System.out.println("Key: " + key + " value: " + value.toString()))
                .to(topicPatient, Produced.with(Serdes.String(), patientValueSerd));

        kStream.peek((key, value) -> System.out.println(value.toString()))
                .map((key, value) -> (new KeyValue<String, Subscriber>("Subscriber", value.getSubscriber())))
                .peek((key, value) -> System.out.println("Key: " + key + " value: " + value.toString()))
                .to(topicSubscriber, Produced.with(Serdes.String(), subscriberValueSerd));

        kStream.peek((key, value) -> System.out.println(value.toString()))
                .map((key, value) -> (new KeyValue<String, Service>("Service", value.getService())))
                .peek((key, value) -> System.out.println("Key: " + key + " value: " + value.toString()))
                .to(topicService, Produced.with(Serdes.String(), serviceValueSerd));

//        kStream.peek((key,value)-> System.out.println(" After: Key: " + key + " value: " + value.toString()));
    }
}

