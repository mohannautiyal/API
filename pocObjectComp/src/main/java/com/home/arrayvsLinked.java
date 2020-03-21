package com.home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class arrayvsLinked {
	
	public String test;
	
	public static void main(String[] args) {
		
	List<Integer> AL = new ArrayList<Integer>();
	
	AL.add(4);
	AL.add(6);
	AL.add(7);
	AL.add(1);
	
	AL.add(2, 3);
	Collections.sort(AL);

	System.out.println(AL);
		
	List<Integer> LL = new LinkedList<Integer>();

	LL.add(4);
	LL.add(6);
	LL.add(7);

	LL.add(1);
	LL.add(2, 3);
	System.out.println(LL);

		
		
		
	}
	
	
	public void Method1() {
		
		test = "";
	}

}
