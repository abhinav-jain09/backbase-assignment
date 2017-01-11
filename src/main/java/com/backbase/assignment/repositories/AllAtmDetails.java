package com.backbase.assignment.repositories;

import com.backbase.assignment.model.INGAtmLocation;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class AllAtmDetails implements Processor  {


    @Autowired
    private RestTemplate restTemplate;

    public List<INGAtmLocation> fetchAllAtmDetails() throws Exception {
        String response = restTemplate.getForObject("https://www.ing.nl/api/locator/atms/", String.class);  
        String JsonAsString = response.substring(6, response.length());
        ObjectMapper objectMapper = new ObjectMapper();
        INGAtmLocation[] ingAtmLocations = objectMapper.readValue(JsonAsString, INGAtmLocation[].class);
        return Arrays.asList(ingAtmLocations);
    }

	@Override
	public void process(Exchange exchange) throws Exception {
	  

        System.out.println("I am inside processor " + exchange.getIn().getBody(String.class).toString());
		
	}

  
	
}
