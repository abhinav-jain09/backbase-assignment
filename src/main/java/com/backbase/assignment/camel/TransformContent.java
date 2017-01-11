package com.backbase.assignment.camel;

public class TransformContent  {
	
	public String transformContent (String body){
		
		String uppercaseString = body.toUpperCase();
		System.out.println("Inside tranformer" +body.toUpperCase());
		return uppercaseString;
	}

}
