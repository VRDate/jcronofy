package org.biacode.jcronofy.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User: Arthur Asatryan
 * Date: 10/4/16
 * Time: 6:14 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum TransparencyModel {
    @JsonProperty("opaque")
    OPAQUE("opaque"),
    @JsonProperty("transparent")
    TRANSPARENT("transparent"),
    @JsonProperty("unknown")
    UNKNOWN("unknown");

    String transparency;

    TransparencyModel(final String transparency) {
        this.transparency = transparency;
    }

    public String getTransparency() {
        return transparency;
    }
}
