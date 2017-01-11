package com.backbase.assignment.model;
import com.fasterxml.jackson.annotation.*;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GeoLocation {
	@ApiModelProperty(position = 1, required = true, value = "Latitude of the ATM location ", readOnly = true, example= "52.366725")
    @JsonProperty("lat")
    private String lat;
	@ApiModelProperty(position = 1, required = true, value = "Longitude of the ATM location", readOnly = true, example= "4.86975")
    @JsonProperty("lng")
    private String lng;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
}
