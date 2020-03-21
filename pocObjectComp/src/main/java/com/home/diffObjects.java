package com.home;

import java.util.ArrayList;
import java.util.List;

import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;
import org.javers.core.diff.changetype.ValueChange;

public class diffObjects {

	public static void main(String[] args) {


		  Javers javers = JaversBuilder.javers().build();
         
		
		employee emp1 = new employee("Madan",123,"Tech");
		employee emp2 = new employee("Rohan",113,"Tech");
		employee emp3 = new employee("Sohan",133,"Tech");
        List<employee> empl1 = new ArrayList<employee>();
        empl1.add(emp1);
        empl1.add(emp2);
        empl1.add(emp3);

		
		employee emp4 = new employee("Madan",123,"Tech");
		employee emp5 = new employee("Rohan",113,"Tech");
		employee emp6 = new employee("Sohan",133,"Tech");
        List<employee> empl2 = new ArrayList<employee>();
        empl2.add(emp4);
        empl2.add(emp6);

		
		
		//System.out.println(emp1.equals(emp2));

		/*
		 * Diff compare = javers.compare(emp3,emp4);
		 * 
		 * compare.getChanges().forEach(change -> System.out.println("- " + change));
		 */
        Diff diff = javers.compareCollections(empl1, empl2, employee.class);
        
        
        System.out.println(diff);


        
        

	}

	
	public void compare() {
		
	}
	
	
	
	
}
