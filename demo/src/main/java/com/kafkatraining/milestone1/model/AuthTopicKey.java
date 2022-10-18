
package com.kafkatraining.milestone1.model;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DateString
 * <p>
 * Sample schema to help you get started.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DateString"
})
@Generated("jsonschema2pojo")
public class AuthTopicKey {

    @JsonProperty("DateString")
    private String dateString;

    @JsonProperty("DateString")
    public String getDateString() {
        return dateString;
    }

    @JsonProperty("DateString")
    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuthTopicKey.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dateString");
        sb.append('=');
        sb.append(((this.dateString == null)?"<null>":this.dateString));
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
        result = ((result* 31)+((this.dateString == null)? 0 :this.dateString.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthTopicKey) == false) {
            return false;
        }
        AuthTopicKey rhs = ((AuthTopicKey) other);
        return ((this.dateString == rhs.dateString)||((this.dateString!= null)&&this.dateString.equals(rhs.dateString)));
    }

}
