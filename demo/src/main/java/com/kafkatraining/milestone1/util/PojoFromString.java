package com.kafkatraining.milestone1.util;

import com.kafkatraining.milestone1.model.*;
import org.springframework.stereotype.Component;

@Component
public class PojoFromString {
    public Case getCaseFromString(String line) {
        Case casePojo = new Case();
        casePojo.setCaseNumber(line.substring(3, 19).trim());
        casePojo.setCaseType(line.substring(19, 35).trim());
        casePojo.setCaseCode(line.substring(35, 51).trim());
        casePojo.setCaseStartDate(line.substring(51, 67).trim());
        casePojo.setCaseEndDate(line.substring(67, 83).trim());
        casePojo.setCaseAuthType(line.substring(83, 99).trim());
        casePojo.setCaseStatus(line.substring(99).trim());
        return casePojo;
    }

    public Subscriber getSubscriberFromString(String line) {
        Subscriber subscriber = new Subscriber();
        subscriber.setCaseNumber(line.substring(3, 19).trim());
        subscriber.setMemId(line.substring(19, 35).trim());
        subscriber.setMemFirstName(line.substring(35, 51).trim());
        subscriber.setMemMiddleName(line.substring(51, 67).trim());
        subscriber.setMemLastName(line.substring(67, 83).trim());
        subscriber.setMemAdd1(line.substring(83, 99).trim());
        subscriber.setMemAdd2(line.substring(99, 115).trim());
        subscriber.setMemCity(line.substring(115, 131).trim());
        subscriber.setMemPin(line.substring(131).trim());
        return subscriber;
    }

    public Patient getPatientFromString(String line) {
        Patient patient = new Patient();
        patient.setCaseNumber(line.substring(3, 19).trim());
        patient.setPatId(line.substring(19, 35).trim());
        patient.setPatFirstName(line.substring(35, 51).trim());
        patient.setPatMiddleName(line.substring(51, 67).trim());
        patient.setPatLastName(line.substring(67, 83).trim());
        patient.setPatSex(line.substring(83, 99).trim());
        patient.setPatDob(line.substring(99, 115).trim());
        patient.setPatPlaneType(line.substring(115, 131).trim());
        patient.setPatPlanName(line.substring(131).trim());
        return patient;
    }

    public Service getServiceFromString(String line) {
        Service service = new Service();
        service.setCaseNumber(line.substring(3, 19).trim());
        service.setSvcId(line.substring(19, 35).trim());
        service.setSvcType(line.substring(35, 51).trim());
        service.setSvcCode(line.substring(51, 67).trim());
        service.setSvcFacId(line.substring(67, 83).trim());
        service.setSvcFacName(line.substring(83, 99).trim());
        service.setSvcPhyId(line.substring(99, 115).trim());
        service.setSvcPhyName(line.substring(115).trim());
        return service;
    }

    public AuthTopicValue cleanAuthTopic(AuthTopicValue authTopic) {
        authTopic.setService(null);
        authTopic.setCase(null);
        authTopic.setSubscriber(null);
        authTopic.setPatient(null);
        return authTopic;
    }
}
