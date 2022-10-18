
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
    "Case",
    "Patient",
    "Service",
    "Subscriber"
})
@Generated("jsonschema2pojo")
public class AuthTopicValue {

    @JsonProperty("Case")
    private Case _case;
    @JsonProperty("Patient")
    private Patient patient;
    @JsonProperty("Service")
    private Service service;
    @JsonProperty("Subscriber")
    private Subscriber subscriber;

    @JsonProperty("Case")
    public Case getCase() {
        return _case;
    }

    @JsonProperty("Case")
    public void setCase(Case _case) {
        this._case = _case;
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
        sb.append("_case");
        sb.append('=');
        sb.append(((this._case == null)?"<null>":this._case));
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
        result = ((result* 31)+((this._case == null)? 0 :this._case.hashCode()));
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
        return (((((this.subscriber == rhs.subscriber)||((this.subscriber!= null)&&this.subscriber.equals(rhs.subscriber)))&&((this._case == rhs._case)||((this._case!= null)&&this._case.equals(rhs._case))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))));
    }

}
