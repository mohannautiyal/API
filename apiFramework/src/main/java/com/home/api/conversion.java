package com.home.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;

public class conversion {


	 ArrayList<emp> emplist = new ArrayList<emp>();
	
	public void convertMethod() throws JsonGenerationException, JsonMappingException, IOException {
		
		

        emp empObj = new emp();
        empObj.setEmpId("1234");
        empObj.setEmpName("Madan Nautiyal");
        empObj.setDesignation("Software Engineer");
        
        address add = new address();
        add.setCity("Gurgaon");
      //  add.setHouseNo("120");
       // add.setZipCode("122001");
        
        empObj.setAdd(add);
        
        emp empObj1 = new emp();
        empObj1.setEmpId("123");
        empObj1.setEmpName("Mohn Nautiyal");
        empObj1.setDesignation("Software Dev");
        
        address add1 = new address();
        add1.setCity("Delhi");
     //   add1.setHouseNo("372");
      //  add1.setZipCode("10001");
        
        empObj1.setAdd(add1);
        
        
        
        
        
        emplist.add(empObj);

        
        emplist.add(empObj1);
        
        
        ObjectMapper obj = new ObjectMapper();
        
       // obj.configure(SerializationConfig.UNWRAP_ROOT_VALUE, true);
        
        obj.writeValue(new File("test.json"),emplist);
        String jsonObj =obj.writeValueAsString(emplist);
        System.out.println(jsonObj);
        
	
     emp [] e1 =  obj.readValue(jsonObj, emp[].class);
     ;
      System.out.println(e1[0].getEmpName() + " "+e1[1].getEmpName()); 
  
       
       


	}
    
   
   	
   	 // System.out.println(rs.getString(1)+" " +rs.getString(2)+" " +rs.getString(3));
   	 

  
    
  
    
	
	
	
}
