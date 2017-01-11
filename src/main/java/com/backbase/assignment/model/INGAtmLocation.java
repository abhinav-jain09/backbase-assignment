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
public class INGAtmLocation {

    @JsonProperty("address")
    private Address address;
    @ApiModelProperty(position = 1, required = true, value = "Distance", readOnly = true, example= "0")
    @JsonProperty("distance")
    private Integer distance;
    @ApiModelProperty(position = 1, required = true, value = "Type of ATM", readOnly = true, example= "ING")
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}