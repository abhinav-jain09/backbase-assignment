package com.backbase.assignment.controller;
import com.backbase.assignment.model.INGAtmLocation;
import com.backbase.assignment.service.IngAtmLocations;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "Ing Atm locator APIs")
@RestController
public class IngAtmLocatorController {
	  @Autowired
	    private IngAtmLocations ingAtmLocations;
	@CrossOrigin
	@ApiOperation(value = "This api returns all the atm of ING in Netherlands")
	@RequestMapping(value ="/locations",method = RequestMethod.GET, produces = "application/json")

	public List<INGAtmLocation> getIngAtmLocactionsByCity() throws Exception {
		List<INGAtmLocation> responseObject= ingAtmLocations.getAtmLocationsfromING();
	        return responseObject;
	}
	@CrossOrigin
	@ApiOperation(value = "This api returns atm with in a city	")
	@RequestMapping(value ="/locations/{city}", method = RequestMethod.GET, produces = "application/json")

	 List<INGAtmLocation> getATMLocationsfromINGByCity(@PathVariable("city") String city) throws Exception {
	
       return ingAtmLocations.getAtmLocationsfromINGByCity(city.toUpperCase());
	}
}
