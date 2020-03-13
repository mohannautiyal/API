package com.home.api;

import java.util.Comparator;

public class nameComparator implements Comparator {

	public int compare(Object o1, Object o2) {
       Fruit f1 = ( Fruit)o1;
       Fruit f2 = ( Fruit)o2;
		
		
		return f1.name.compareTo(f2.name);
	}

}
