package com.home;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections1 {

	public static void main(String[] args) {

   List<String> emp = new ArrayList<String>();
   emp.add("Madan");
   emp.add("Rishita");
   emp.add("Kavya");
   emp.add("Shaili");
   emp.add("Geet Ram");
   emp.add("Anandi");
   
   Iterator<String> itr = emp.iterator();
   
   while(itr.hasNext()) {
	   System.out.println(itr.next());
	   
   }

	
	
	}

}
