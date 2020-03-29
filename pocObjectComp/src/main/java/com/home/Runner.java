package com.home;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple ap = new Apple("Round1","123");

		Apple ap1 = new Apple("Round","123");
		
		;
		System.out.println(ap.getColour()+ "  "+ap.getPrice());
		System.out.println(ap.toString());
		
		System.out.println(ap.equals(ap1));
		
		
		

	}

}
