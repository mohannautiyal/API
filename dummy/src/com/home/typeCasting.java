package com.home;

public class typeCasting {

	public static void main(String[] args) {

		/*
		 * int x= 'a'; System.out.println(x);
		 * 
		 * byte y= (byte) 130; System.out.println(y);
		 */
 
 // Upcasting 		
	samsung s = new samsung();
	s.calling();
	s.newCall();
	s.ring();
	
	 mobile m = (mobile)s;
	 m.calling();
	 m.ring();
	 
	System.out.println("=============================");
	 
	 
	 
	 mobile m1 = new samsung();
	 m1.ring();
	 m1.calling();
	 
	 mobile mobile = new mobile();
	 samsung sumsung= new samsung();
   
		/*
		 * samsung s2 = (samsung)m2; s2.ring();
		 */
	
	
	if(mobile instanceof samsung) 
		System.out.println(" Mobile is instance of samsung");
	else
		System.out.println("No");
	
	
	if(sumsung instanceof mobile) 
		System.out.println(" Samsung is instance of mobile");
	else
		System.out.println("No");
	
	
	 ((mobile)sumsung).ring();
	 ((mobile)sumsung).calling();;

	 
		((samsung)mobile).ring();



	
	}
	

}
