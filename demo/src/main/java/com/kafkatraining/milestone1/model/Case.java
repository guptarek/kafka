
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
    "CASE_AUTH_TYPE",
    "CASE_CODE",
    "CASE_END_DATE",
    "CASE_NUMBER",
    "CASE_START_DATE",
    "CASE_STATUS",
    "CASE_TYPE"
})
@Generated("jsonschema2pojo")
public class Case {

    @JsonProperty("CASE_AUTH_TYPE")
    private String caseAuthType;
    @JsonProperty("CASE_CODE")
    private String caseCode;
    @JsonProperty("CASE_END_DATE")
    private String caseEndDate;
    @JsonProperty("CASE_NUMBER")
    private String caseNumber;
    @JsonProperty("CASE_START_DATE")
    private String caseStartDate;
    @JsonProperty("CASE_STATUS")
    private String caseStatus;
    @JsonProperty("CASE_TYPE")
    private String caseType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("CASE_AUTH_TYPE")
    public String getCaseAuthType() {
        return caseAuthType;
    }

    @JsonProperty("CASE_AUTH_TYPE")
    public void setCaseAuthType(String caseAuthType) {
        this.caseAuthType = caseAuthType;
    }

    @JsonProperty("CASE_CODE")
    public String getCaseCode() {
        return caseCode;
    }

    @JsonProperty("CASE_CODE")
    public void setCaseCode(String caseCode) {
        this.caseCode = caseCode;
    }

    @JsonProperty("CASE_END_DATE")
    public String getCaseEndDate() {
        return caseEndDate;
    }

    @JsonProperty("CASE_END_DATE")
    public void setCaseEndDate(String caseEndDate) {
        this.caseEndDate = caseEndDate;
    }

    @JsonProperty("CASE_NUMBER")
    public String getCaseNumber() {
        return caseNumber;
    }

    @JsonProperty("CASE_NUMBER")
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    @JsonProperty("CASE_START_DATE")
    public String getCaseStartDate() {
        return caseStartDate;
    }

    @JsonProperty("CASE_START_DATE")
    public void setCaseStartDate(String caseStartDate) {
        this.caseStartDate = caseStartDate;
    }

    @JsonProperty("CASE_STATUS")
    public String getCaseStatus() {
        return caseStatus;
    }

    @JsonProperty("CASE_STATUS")
    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    @JsonProperty("CASE_TYPE")
    public String getCaseType() {
        return caseType;
    }

    @JsonProperty("CASE_TYPE")
    public void setCaseType(String caseType) {
        this.caseType = caseType;
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
        sb.append(Case.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("caseAuthType");
        sb.append('=');
        sb.append(((this.caseAuthType == null)?"<null>":this.caseAuthType));
        sb.append(',');
        sb.append("caseCode");
        sb.append('=');
        sb.append(((this.caseCode == null)?"<null>":this.caseCode));
        sb.append(',');
        sb.append("caseEndDate");
        sb.append('=');
        sb.append(((this.caseEndDate == null)?"<null>":this.caseEndDate));
        sb.append(',');
        sb.append("caseNumber");
        sb.append('=');
        sb.append(((this.caseNumber == null)?"<null>":this.caseNumber));
        sb.append(',');
        sb.append("caseStartDate");
        sb.append('=');
        sb.append(((this.caseStartDate == null)?"<null>":this.caseStartDate));
        sb.append(',');
        sb.append("caseStatus");
        sb.append('=');
        sb.append(((this.caseStatus == null)?"<null>":this.caseStatus));
        sb.append(',');
        sb.append("caseType");
        sb.append('=');
        sb.append(((this.caseType == null)?"<null>":this.caseType));
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
        result = ((result* 31)+((this.caseCode == null)? 0 :this.caseCode.hashCode()));
        result = ((result* 31)+((this.caseStartDate == null)? 0 :this.caseStartDate.hashCode()));
        result = ((result* 31)+((this.caseAuthType == null)? 0 :this.caseAuthType.hashCode()));
        result = ((result* 31)+((this.caseNumber == null)? 0 :this.caseNumber.hashCode()));
        result = ((result* 31)+((this.caseStatus == null)? 0 :this.caseStatus.hashCode()));
        result = ((result* 31)+((this.caseEndDate == null)? 0 :this.caseEndDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.caseType == null)? 0 :this.caseType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Case) == false) {
            return false;
        }
        Case rhs = ((Case) other);
        return (((((((((this.caseCode == rhs.caseCode)||((this.caseCode!= null)&&this.caseCode.equals(rhs.caseCode)))&&((this.caseStartDate == rhs.caseStartDate)||((this.caseStartDate!= null)&&this.caseStartDate.equals(rhs.caseStartDate))))&&((this.caseAuthType == rhs.caseAuthType)||((this.caseAuthType!= null)&&this.caseAuthType.equals(rhs.caseAuthType))))&&((this.caseNumber == rhs.caseNumber)||((this.caseNumber!= null)&&this.caseNumber.equals(rhs.caseNumber))))&&((this.caseStatus == rhs.caseStatus)||((this.caseStatus!= null)&&this.caseStatus.equals(rhs.caseStatus))))&&((this.caseEndDate == rhs.caseEndDate)||((this.caseEndDate!= null)&&this.caseEndDate.equals(rhs.caseEndDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.caseType == rhs.caseType)||((this.caseType!= null)&&this.caseType.equals(rhs.caseType))));
    }

}
