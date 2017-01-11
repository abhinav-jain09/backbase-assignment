package com.backbase.assignment.camel;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

import com.backbase.assignment.repositories.AllAtmDetails;

public class FirstRouteBuilder extends RouteBuilder {
private String city;
	public FirstRouteBuilder(String city){
		this.city = city ;
	}
	
	@Override
	public void configure() throws Exception {
	
from("http://localhost:8080/locations/").to("direct:getLocation").end();



	}

}
