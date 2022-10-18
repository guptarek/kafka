
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
    "PAT_DOB",
    "PAT_FIRST_NAME",
    "PAT_ID",
    "PAT_LAST_NAME",
    "PAT_MIDDLE_NAME",
    "PAT_PLANE_TYPE",
    "PAT_PLAN_NAME",
    "PAT_SEX"
})
@Generated("jsonschema2pojo")
public class Patient {

    @JsonProperty("CASE_NUMBER")
    private String caseNumber;
    @JsonProperty("PAT_DOB")
    private String patDob;
    @JsonProperty("PAT_FIRST_NAME")
    private String patFirstName;
    @JsonProperty("PAT_ID")
    private String patId;
    @JsonProperty("PAT_LAST_NAME")
    private String patLastName;
    @JsonProperty("PAT_MIDDLE_NAME")
    private String patMiddleName;
    @JsonProperty("PAT_PLANE_TYPE")
    private String patPlaneType;
    @JsonProperty("PAT_PLAN_NAME")
    private String patPlanName;
    @JsonProperty("PAT_SEX")
    private String patSex;
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

    @JsonProperty("PAT_DOB")
    public String getPatDob() {
        return patDob;
    }

    @JsonProperty("PAT_DOB")
    public void setPatDob(String patDob) {
        this.patDob = patDob;
    }

    @JsonProperty("PAT_FIRST_NAME")
    public String getPatFirstName() {
        return patFirstName;
    }

    @JsonProperty("PAT_FIRST_NAME")
    public void setPatFirstName(String patFirstName) {
        this.patFirstName = patFirstName;
    }

    @JsonProperty("PAT_ID")
    public String getPatId() {
        return patId;
    }

    @JsonProperty("PAT_ID")
    public void setPatId(String patId) {
        this.patId = patId;
    }

    @JsonProperty("PAT_LAST_NAME")
    public String getPatLastName() {
        return patLastName;
    }

    @JsonProperty("PAT_LAST_NAME")
    public void setPatLastName(String patLastName) {
        this.patLastName = patLastName;
    }

    @JsonProperty("PAT_MIDDLE_NAME")
    public String getPatMiddleName() {
        return patMiddleName;
    }

    @JsonProperty("PAT_MIDDLE_NAME")
    public void setPatMiddleName(String patMiddleName) {
        this.patMiddleName = patMiddleName;
    }

    @JsonProperty("PAT_PLANE_TYPE")
    public String getPatPlaneType() {
        return patPlaneType;
    }

    @JsonProperty("PAT_PLANE_TYPE")
    public void setPatPlaneType(String patPlaneType) {
        this.patPlaneType = patPlaneType;
    }

    @JsonProperty("PAT_PLAN_NAME")
    public String getPatPlanName() {
        return patPlanName;
    }

    @JsonProperty("PAT_PLAN_NAME")
    public void setPatPlanName(String patPlanName) {
        this.patPlanName = patPlanName;
    }

    @JsonProperty("PAT_SEX")
    public String getPatSex() {
        return patSex;
    }

    @JsonProperty("PAT_SEX")
    public void setPatSex(String patSex) {
        this.patSex = patSex;
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
        sb.append(Patient.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("caseNumber");
        sb.append('=');
        sb.append(((this.caseNumber == null)?"<null>":this.caseNumber));
        sb.append(',');
        sb.append("patDob");
        sb.append('=');
        sb.append(((this.patDob == null)?"<null>":this.patDob));
        sb.append(',');
        sb.append("patFirstName");
        sb.append('=');
        sb.append(((this.patFirstName == null)?"<null>":this.patFirstName));
        sb.append(',');
        sb.append("patId");
        sb.append('=');
        sb.append(((this.patId == null)?"<null>":this.patId));
        sb.append(',');
        sb.append("patLastName");
        sb.append('=');
        sb.append(((this.patLastName == null)?"<null>":this.patLastName));
        sb.append(',');
        sb.append("patMiddleName");
        sb.append('=');
        sb.append(((this.patMiddleName == null)?"<null>":this.patMiddleName));
        sb.append(',');
        sb.append("patPlaneType");
        sb.append('=');
        sb.append(((this.patPlaneType == null)?"<null>":this.patPlaneType));
        sb.append(',');
        sb.append("patPlanName");
        sb.append('=');
        sb.append(((this.patPlanName == null)?"<null>":this.patPlanName));
        sb.append(',');
        sb.append("patSex");
        sb.append('=');
        sb.append(((this.patSex == null)?"<null>":this.patSex));
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
        result = ((result* 31)+((this.patPlaneType == null)? 0 :this.patPlaneType.hashCode()));
        result = ((result* 31)+((this.patMiddleName == null)? 0 :this.patMiddleName.hashCode()));
        result = ((result* 31)+((this.caseNumber == null)? 0 :this.caseNumber.hashCode()));
        result = ((result* 31)+((this.patId == null)? 0 :this.patId.hashCode()));
        result = ((result* 31)+((this.patSex == null)? 0 :this.patSex.hashCode()));
        result = ((result* 31)+((this.patLastName == null)? 0 :this.patLastName.hashCode()));
        result = ((result* 31)+((this.patPlanName == null)? 0 :this.patPlanName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.patFirstName == null)? 0 :this.patFirstName.hashCode()));
        result = ((result* 31)+((this.patDob == null)? 0 :this.patDob.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Patient) == false) {
            return false;
        }
        Patient rhs = ((Patient) other);
        return (((((((((((this.patPlaneType == rhs.patPlaneType)||((this.patPlaneType!= null)&&this.patPlaneType.equals(rhs.patPlaneType)))&&((this.patMiddleName == rhs.patMiddleName)||((this.patMiddleName!= null)&&this.patMiddleName.equals(rhs.patMiddleName))))&&((this.caseNumber == rhs.caseNumber)||((this.caseNumber!= null)&&this.caseNumber.equals(rhs.caseNumber))))&&((this.patId == rhs.patId)||((this.patId!= null)&&this.patId.equals(rhs.patId))))&&((this.patSex == rhs.patSex)||((this.patSex!= null)&&this.patSex.equals(rhs.patSex))))&&((this.patLastName == rhs.patLastName)||((this.patLastName!= null)&&this.patLastName.equals(rhs.patLastName))))&&((this.patPlanName == rhs.patPlanName)||((this.patPlanName!= null)&&this.patPlanName.equals(rhs.patPlanName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.patFirstName == rhs.patFirstName)||((this.patFirstName!= null)&&this.patFirstName.equals(rhs.patFirstName))))&&((this.patDob == rhs.patDob)||((this.patDob!= null)&&this.patDob.equals(rhs.patDob))));
    }

}
