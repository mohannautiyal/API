package com.home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class collectionsSort {
	
	
	public static void main(String[] args) {
		
		employee emp1 = new employee("Madan",123,"Tech");
		employee emp2 = new employee("Raj",124,"Ops");
		employee emp3 = new employee("Amit",153,"Tech");
		
		
		List<employee> emp = new ArrayList<employee>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		
		/*
		 * System.out.println(emp);
		 * 
		 * Collections.sort(emp);
		 * 
		 * System.out.println(emp);
		 */

		
		/*
		 * List<String> empName = new ArrayList<String>(); empName.add("Madan");
		 * empName.add("Raj"); empName.add("Sachin"); empName.add("Ashish");
		 */
		/*
		 * System.out.println(empName); Collections.sort(empName);
		 * System.out.println(empName);
		 */
        
        
        ListIterator<employee> itr=emp.listIterator();
        
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
       
       System.out.println("=====================================");
       
	 Collections.sort(emp); 
       ListIterator<employee> itr1=emp.listIterator();

       
       while(itr1.hasNext()) {
    	   System.out.println(itr1.next());
       }

	}

}
