package com.backbase.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.backbase.assignment.model.INGAtmLocation;
import com.backbase.assignment.repositories.AllAtmDetails;
@Component
public class IngAtmLocations {
    @Autowired
    private AllAtmDetails atmDataPopulator;
	
	  public List<INGAtmLocation> getAtmLocationsfromING() throws Exception {

	        return atmDataPopulator.fetchAllAtmDetails();
	    }
	    public List<INGAtmLocation> getAtmLocationsfromINGByCity(String city) throws Exception {
	    	  List<INGAtmLocation> atmLocationsfromING = getAtmLocationsfromING();
	    	  List<INGAtmLocation> locations = new ArrayList<>();
	        locations= atmLocationsfromING.stream().filter(ingatm->ingatm.getAddress().getCity().equals(city)).collect(Collectors.toList());
	        return locations;
	    }

}
