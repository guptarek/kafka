
package com.kafkatraining.milestone1.model;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AuthTopic
 * <p>
 * Sample schema to help you get started.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Cased",
    "Patient",
    "Service",
    "Subscriber"
})
@Generated("jsonschema2pojo")
public class AuthTopicValue {

    @JsonProperty("Cased")
    private Cased cased;
    @JsonProperty("Patient")
    private Patient patient;
    @JsonProperty("Service")
    private Service service;
    @JsonProperty("Subscriber")
    private Subscriber subscriber;

    @JsonProperty("Cased")
    public Cased getCased() {
        return cased;
    }

    @JsonProperty("Cased")
    public void setCased(Cased cased) {
        this.cased = cased;
    }

    @JsonProperty("Patient")
    public Patient getPatient() {
        return patient;
    }

    @JsonProperty("Patient")
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @JsonProperty("Service")
    public Service getService() {
        return service;
    }

    @JsonProperty("Service")
    public void setService(Service service) {
        this.service = service;
    }

    @JsonProperty("Subscriber")
    public Subscriber getSubscriber() {
        return subscriber;
    }

    @JsonProperty("Subscriber")
    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuthTopicValue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cased");
        sb.append('=');
        sb.append(((this.cased == null)?"<null>":this.cased));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        sb.append("subscriber");
        sb.append('=');
        sb.append(((this.subscriber == null)?"<null>":this.subscriber));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.subscriber == null)? 0 :this.subscriber.hashCode()));
        result = ((result* 31)+((this.cased == null)? 0 :this.cased.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthTopicValue) == false) {
            return false;
        }
        AuthTopicValue rhs = ((AuthTopicValue) other);
        return (((((this.subscriber == rhs.subscriber)||((this.subscriber!= null)&&this.subscriber.equals(rhs.subscriber)))&&((this.cased == rhs.cased)||((this.cased!= null)&&this.cased.equals(rhs.cased))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))));
    }

}
