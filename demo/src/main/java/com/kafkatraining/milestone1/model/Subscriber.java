
package com.kafkatraining.milestone1.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CASE_NUMBER",
    "MEM_ADD_1",
    "MEM_ADD_2",
    "MEM_CITY",
    "MEM_FIRST_NAME",
    "MEM_ID",
    "MEM_LAST_NAME",
    "MEM_MIDDLE_NAME",
    "MEM_PIN"
})
@Generated("jsonschema2pojo")
public class Subscriber {

    @JsonProperty("CASE_NUMBER")
    private String caseNumber;
    @JsonProperty("MEM_ADD_1")
    private String memAdd1;
    @JsonProperty("MEM_ADD_2")
    private String memAdd2;
    @JsonProperty("MEM_CITY")
    private String memCity;
    @JsonProperty("MEM_FIRST_NAME")
    private String memFirstName;
    @JsonProperty("MEM_ID")
    private String memId;
    @JsonProperty("MEM_LAST_NAME")
    private String memLastName;
    @JsonProperty("MEM_MIDDLE_NAME")
    private String memMiddleName;
    @JsonProperty("MEM_PIN")
    private String memPin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("CASE_NUMBER")
    public String getCaseNumber() {
        return caseNumber;
    }

    @JsonProperty("CASE_NUMBER")
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    @JsonProperty("MEM_ADD_1")
    public String getMemAdd1() {
        return memAdd1;
    }

    @JsonProperty("MEM_ADD_1")
    public void setMemAdd1(String memAdd1) {
        this.memAdd1 = memAdd1;
    }

    @JsonProperty("MEM_ADD_2")
    public String getMemAdd2() {
        return memAdd2;
    }

    @JsonProperty("MEM_ADD_2")
    public void setMemAdd2(String memAdd2) {
        this.memAdd2 = memAdd2;
    }

    @JsonProperty("MEM_CITY")
    public String getMemCity() {
        return memCity;
    }

    @JsonProperty("MEM_CITY")
    public void setMemCity(String memCity) {
        this.memCity = memCity;
    }

    @JsonProperty("MEM_FIRST_NAME")
    public String getMemFirstName() {
        return memFirstName;
    }

    @JsonProperty("MEM_FIRST_NAME")
    public void setMemFirstName(String memFirstName) {
        this.memFirstName = memFirstName;
    }

    @JsonProperty("MEM_ID")
    public String getMemId() {
        return memId;
    }

    @JsonProperty("MEM_ID")
    public void setMemId(String memId) {
        this.memId = memId;
    }

    @JsonProperty("MEM_LAST_NAME")
    public String getMemLastName() {
        return memLastName;
    }

    @JsonProperty("MEM_LAST_NAME")
    public void setMemLastName(String memLastName) {
        this.memLastName = memLastName;
    }

    @JsonProperty("MEM_MIDDLE_NAME")
    public String getMemMiddleName() {
        return memMiddleName;
    }

    @JsonProperty("MEM_MIDDLE_NAME")
    public void setMemMiddleName(String memMiddleName) {
        this.memMiddleName = memMiddleName;
    }

    @JsonProperty("MEM_PIN")
    public String getMemPin() {
        return memPin;
    }

    @JsonProperty("MEM_PIN")
    public void setMemPin(String memPin) {
        this.memPin = memPin;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Subscriber.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("caseNumber");
        sb.append('=');
        sb.append(((this.caseNumber == null)?"<null>":this.caseNumber));
        sb.append(',');
        sb.append("memAdd1");
        sb.append('=');
        sb.append(((this.memAdd1 == null)?"<null>":this.memAdd1));
        sb.append(',');
        sb.append("memAdd2");
        sb.append('=');
        sb.append(((this.memAdd2 == null)?"<null>":this.memAdd2));
        sb.append(',');
        sb.append("memCity");
        sb.append('=');
        sb.append(((this.memCity == null)?"<null>":this.memCity));
        sb.append(',');
        sb.append("memFirstName");
        sb.append('=');
        sb.append(((this.memFirstName == null)?"<null>":this.memFirstName));
        sb.append(',');
        sb.append("memId");
        sb.append('=');
        sb.append(((this.memId == null)?"<null>":this.memId));
        sb.append(',');
        sb.append("memLastName");
        sb.append('=');
        sb.append(((this.memLastName == null)?"<null>":this.memLastName));
        sb.append(',');
        sb.append("memMiddleName");
        sb.append('=');
        sb.append(((this.memMiddleName == null)?"<null>":this.memMiddleName));
        sb.append(',');
        sb.append("memPin");
        sb.append('=');
        sb.append(((this.memPin == null)?"<null>":this.memPin));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.memCity == null)? 0 :this.memCity.hashCode()));
        result = ((result* 31)+((this.memLastName == null)? 0 :this.memLastName.hashCode()));
        result = ((result* 31)+((this.memPin == null)? 0 :this.memPin.hashCode()));
        result = ((result* 31)+((this.caseNumber == null)? 0 :this.caseNumber.hashCode()));
        result = ((result* 31)+((this.memFirstName == null)? 0 :this.memFirstName.hashCode()));
        result = ((result* 31)+((this.memAdd2 == null)? 0 :this.memAdd2 .hashCode()));
        result = ((result* 31)+((this.memMiddleName == null)? 0 :this.memMiddleName.hashCode()));
        result = ((result* 31)+((this.memAdd1 == null)? 0 :this.memAdd1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.memId == null)? 0 :this.memId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Subscriber) == false) {
            return false;
        }
        Subscriber rhs = ((Subscriber) other);
        return (((((((((((this.memCity == rhs.memCity)||((this.memCity!= null)&&this.memCity.equals(rhs.memCity)))&&((this.memLastName == rhs.memLastName)||((this.memLastName!= null)&&this.memLastName.equals(rhs.memLastName))))&&((this.memPin == rhs.memPin)||((this.memPin!= null)&&this.memPin.equals(rhs.memPin))))&&((this.caseNumber == rhs.caseNumber)||((this.caseNumber!= null)&&this.caseNumber.equals(rhs.caseNumber))))&&((this.memFirstName == rhs.memFirstName)||((this.memFirstName!= null)&&this.memFirstName.equals(rhs.memFirstName))))&&((this.memAdd2 == rhs.memAdd2)||((this.memAdd2 != null)&&this.memAdd2 .equals(rhs.memAdd2))))&&((this.memMiddleName == rhs.memMiddleName)||((this.memMiddleName!= null)&&this.memMiddleName.equals(rhs.memMiddleName))))&&((this.memAdd1 == rhs.memAdd1)||((this.memAdd1 != null)&&this.memAdd1 .equals(rhs.memAdd1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.memId == rhs.memId)||((this.memId!= null)&&this.memId.equals(rhs.memId))));
    }

}
