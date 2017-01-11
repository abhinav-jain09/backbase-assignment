package com.backbase.assignment.model;


import com.fasterxml.jackson.annotation.*;

import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Address {

	@ApiModelProperty(position = 1, required = true, value = "Street name ", readOnly = true, example= "Kinkerstraat")
    @JsonProperty("street")
    private String street;
	@ApiModelProperty(position = 1, required = true, value = "House number  ", readOnly = true, example= "130A")
    @JsonProperty("housenumber")
    private String housenumber;
	@ApiModelProperty(position = 1, required = true, value = "postal code  ", readOnly = true, example= "1053 EE")
    @JsonProperty("postalcode")
    private String postalcode;
	@ApiModelProperty(position = 1, required = true, value = "City  name ", readOnly = true, example= "AMSTERDAM")
    @JsonProperty("city")
    private String city;
    @JsonProperty("geoLocation")
    private GeoLocation geoLocation;
	@ApiModelProperty(position = 1, required = true, value = "Street name ", readOnly = true, example= "Kinkerstraat")
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}