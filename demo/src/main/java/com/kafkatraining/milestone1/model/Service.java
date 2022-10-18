
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
    "SVC_CODE",
    "SVC_FAC_ID",
    "SVC_FAC_NAME",
    "SVC_ID",
    "SVC_PHY_ID",
    "SVC_PHY_NAME",
    "SVC_TYPE"
})
@Generated("jsonschema2pojo")
public class Service {

    @JsonProperty("CASE_NUMBER")
    private String caseNumber;
    @JsonProperty("SVC_CODE")
    private String svcCode;
    @JsonProperty("SVC_FAC_ID")
    private String svcFacId;
    @JsonProperty("SVC_FAC_NAME")
    private String svcFacName;
    @JsonProperty("SVC_ID")
    private String svcId;
    @JsonProperty("SVC_PHY_ID")
    private String svcPhyId;
    @JsonProperty("SVC_PHY_NAME")
    private String svcPhyName;
    @JsonProperty("SVC_TYPE")
    private String svcType;
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

    @JsonProperty("SVC_CODE")
    public String getSvcCode() {
        return svcCode;
    }

    @JsonProperty("SVC_CODE")
    public void setSvcCode(String svcCode) {
        this.svcCode = svcCode;
    }

    @JsonProperty("SVC_FAC_ID")
    public String getSvcFacId() {
        return svcFacId;
    }

    @JsonProperty("SVC_FAC_ID")
    public void setSvcFacId(String svcFacId) {
        this.svcFacId = svcFacId;
    }

    @JsonProperty("SVC_FAC_NAME")
    public String getSvcFacName() {
        return svcFacName;
    }

    @JsonProperty("SVC_FAC_NAME")
    public void setSvcFacName(String svcFacName) {
        this.svcFacName = svcFacName;
    }

    @JsonProperty("SVC_ID")
    public String getSvcId() {
        return svcId;
    }

    @JsonProperty("SVC_ID")
    public void setSvcId(String svcId) {
        this.svcId = svcId;
    }

    @JsonProperty("SVC_PHY_ID")
    public String getSvcPhyId() {
        return svcPhyId;
    }

    @JsonProperty("SVC_PHY_ID")
    public void setSvcPhyId(String svcPhyId) {
        this.svcPhyId = svcPhyId;
    }

    @JsonProperty("SVC_PHY_NAME")
    public String getSvcPhyName() {
        return svcPhyName;
    }

    @JsonProperty("SVC_PHY_NAME")
    public void setSvcPhyName(String svcPhyName) {
        this.svcPhyName = svcPhyName;
    }

    @JsonProperty("SVC_TYPE")
    public String getSvcType() {
        return svcType;
    }

    @JsonProperty("SVC_TYPE")
    public void setSvcType(String svcType) {
        this.svcType = svcType;
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
        sb.append(Service.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("caseNumber");
        sb.append('=');
        sb.append(((this.caseNumber == null)?"<null>":this.caseNumber));
        sb.append(',');
        sb.append("svcCode");
        sb.append('=');
        sb.append(((this.svcCode == null)?"<null>":this.svcCode));
        sb.append(',');
        sb.append("svcFacId");
        sb.append('=');
        sb.append(((this.svcFacId == null)?"<null>":this.svcFacId));
        sb.append(',');
        sb.append("svcFacName");
        sb.append('=');
        sb.append(((this.svcFacName == null)?"<null>":this.svcFacName));
        sb.append(',');
        sb.append("svcId");
        sb.append('=');
        sb.append(((this.svcId == null)?"<null>":this.svcId));
        sb.append(',');
        sb.append("svcPhyId");
        sb.append('=');
        sb.append(((this.svcPhyId == null)?"<null>":this.svcPhyId));
        sb.append(',');
        sb.append("svcPhyName");
        sb.append('=');
        sb.append(((this.svcPhyName == null)?"<null>":this.svcPhyName));
        sb.append(',');
        sb.append("svcType");
        sb.append('=');
        sb.append(((this.svcType == null)?"<null>":this.svcType));
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
        result = ((result* 31)+((this.svcId == null)? 0 :this.svcId.hashCode()));
        result = ((result* 31)+((this.svcPhyId == null)? 0 :this.svcPhyId.hashCode()));
        result = ((result* 31)+((this.caseNumber == null)? 0 :this.caseNumber.hashCode()));
        result = ((result* 31)+((this.svcCode == null)? 0 :this.svcCode.hashCode()));
        result = ((result* 31)+((this.svcPhyName == null)? 0 :this.svcPhyName.hashCode()));
        result = ((result* 31)+((this.svcType == null)? 0 :this.svcType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.svcFacName == null)? 0 :this.svcFacName.hashCode()));
        result = ((result* 31)+((this.svcFacId == null)? 0 :this.svcFacId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Service) == false) {
            return false;
        }
        Service rhs = ((Service) other);
        return ((((((((((this.svcId == rhs.svcId)||((this.svcId!= null)&&this.svcId.equals(rhs.svcId)))&&((this.svcPhyId == rhs.svcPhyId)||((this.svcPhyId!= null)&&this.svcPhyId.equals(rhs.svcPhyId))))&&((this.caseNumber == rhs.caseNumber)||((this.caseNumber!= null)&&this.caseNumber.equals(rhs.caseNumber))))&&((this.svcCode == rhs.svcCode)||((this.svcCode!= null)&&this.svcCode.equals(rhs.svcCode))))&&((this.svcPhyName == rhs.svcPhyName)||((this.svcPhyName!= null)&&this.svcPhyName.equals(rhs.svcPhyName))))&&((this.svcType == rhs.svcType)||((this.svcType!= null)&&this.svcType.equals(rhs.svcType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.svcFacName == rhs.svcFacName)||((this.svcFacName!= null)&&this.svcFacName.equals(rhs.svcFacName))))&&((this.svcFacId == rhs.svcFacId)||((this.svcFacId!= null)&&this.svcFacId.equals(rhs.svcFacId))));
    }

}
