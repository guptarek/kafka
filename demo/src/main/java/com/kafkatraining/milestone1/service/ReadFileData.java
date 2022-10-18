package com.kafkatraining.milestone1.service;

import com.kafkatraining.milestone1.model.AuthTopicKey;
import com.kafkatraining.milestone1.model.AuthTopicValue;
import com.kafkatraining.milestone1.util.PojoFromString;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ReadFileData {
    private final PojoFromString pojoFromString;
    private final ProducerService producerService;

    @EventListener(ApplicationStartedEvent.class)
    public void readFileData() {
        File souceFolder = new File("src/main/resources/AuthTopicTextFiles");
        for (File sourceFile : Objects.requireNonNull(souceFolder.listFiles())) {
            String fileName = sourceFile.getName();
            try {
                FileReader fr = new FileReader(sourceFile);
                BufferedReader br = new BufferedReader(fr);
                String line;
                AuthTopicValue authTopic = new AuthTopicValue();
                while ((line = br.readLine()) != null) {
                    String recordType = line.trim();
                    if (line.length() < 3) continue;
                    switch (recordType.substring(0, 3)) {
                        case "SUB": {
                            authTopic.setSubscriber(pojoFromString.getSubscriberFromString(line));
                            break;
                        }
                        case "PAT": {
                            authTopic.setPatient(pojoFromString.getPatientFromString(line));
                            break;
                        }

                        case "CAS": {
                            authTopic.setCase(pojoFromString.getCaseFromString(line));
                            break;
                        }

                        case "SVC": {
                            authTopic.setService(pojoFromString.getServiceFromString(line));
                            break;
                        }

                        default:
                            System.out.println("No value Matched");
                            break;
                    }
                    if (authTopic.getCase() != null && authTopic.getPatient() != null && authTopic.getSubscriber() != null && authTopic.getService() != null) {
                        AuthTopicKey key = new AuthTopicKey();
                        key.setDateString(fileName);
                        producerService.send(key, authTopic);
                        pojoFromString.cleanAuthTopic(authTopic);
                    }
                }
                br.close();
                fr.close();
                System.out.println("******************** " + fileName + " read successfully");

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
