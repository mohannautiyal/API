package com.home.api;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class apiTest {

	
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		
		// Rest API Call
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users";
		  
		  RequestSpecification rs = RestAssured.given();
		  Response resp = rs.get();
		  System.out.println(resp);
		  
		  
	// Response parsed into string	  
		 String respdata =resp.getBody().asString();
		  
	
	// Object Mapper class to convert into Java Object
		  ObjectMapper obj = new ObjectMapper();
	        
	       // obj.configure(SerializationConfig.UNWRAP_ROOT_VALUE, true);
	        
	       	        
		// Read Value method to convert json response to object
	     Employee [] em =  obj.readValue(respdata, Employee[].class);
	     ;
	      System.out.println(em[0].getName() + " "+em[1].getName());
		  
		  System.out.println(em[0].toString());
		  
		 
		
		/*
		 * conversion c = new conversion(); c.convertMethod();
		 */
		
	}

}
