package com.home;

public class consturctorRevision {

	public static void main(String[] args) {

		/*
		 * classParent p = new classParent(); p.setpName("parent"); p.setpNumber(1234);
		 * 
		 * p.show();
		 * 
		 * classChild c = new classChild(); c.setpName("child"); c.setpNumber(4567);
		 * c.show();
		 */
	//	classParent P = new classChild("Child", 1234);
		/*
		 * P.setpName("parentName");
		 * 
		 * P.show();
		 */
		classParent P1 = new classParent("Parent", 5678);
		
	//	System.out.println(P.getpName()+" "+  P.cvar);
		
		System.out.println(P1.getpName()+" "+  P1.cvar);
	}

}
