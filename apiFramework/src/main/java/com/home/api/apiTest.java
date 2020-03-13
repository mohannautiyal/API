package com.home.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class apiTest {

	
	
	public static void main(String[] args) {
		
		List<Fruit> fr = new  ArrayList<Fruit>();
		
		Fruit f2 = new Fruit("Banana","NotRound",100);

		Fruit f1 = new Fruit("Apple","Round",124);
		Fruit f3 = new Fruit("Grapes","Round",150);
		fr.add(f1);

		fr.add(f2);
		fr.add(f3);
		
		List<Fruit> fr1 = new  ArrayList<Fruit>();
		Fruit f5 = new Fruit("Banana","NotRound",100);

		Fruit f4 = new Fruit("Apple","Round",124);
		Fruit f6 = new Fruit("Grapes","Round",150);

		fr1.add(f5);
		fr1.add(f4);
		fr1.add(f6);
		
		System.out.println(fr);
		System.out.println(fr1);
		;
		System.out.println(fr.equals(fr1));
		
		Collections.sort(fr, new nameComparator());;
		Collections.sort(fr1, new nameComparator());;
		System.out.println(fr.equals(fr1));
		System.out.println(fr);
		System.out.println(fr1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main1(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		
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
